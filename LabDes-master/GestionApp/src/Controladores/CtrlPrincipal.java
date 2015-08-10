/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BD.CtrlBD;
import Main.IErrorCedulaPrincipal;
import Main.IErrorLlenarCampos;
import Main.IErrorUsuarioContraseña;
import Main.IPrincipal;
import Usuario.Aspirante.IAspirante;
import java.sql.ResultSet;
import java.sql.SQLException;
import Usuario.Coordinador.*;
import Usuario.DirectorEscuela.*;
import Usuario.JefeDepartamento.*;
import Usuario.Preparador.*;
import Usuario.SecretariaDepartamento.*;
import Usuario.SecretariaEscuela.*;

/**
 *
 * @author Xiomara
 */
public class CtrlPrincipal
{ 
    private static CtrlPrincipal uniqueInstance = null;
    public IPrincipal IPpal;
    public IJefeDepartamento vistaJefeDepartamento;
    public IAsignarPlazas vistaAsignarPlazas;
    public ISecretariaEscuela vistaSecretariaEscuela;
    public ISecretariaDepartamento vistaSecretariaDepartamento;
    public IPreparador vistaPreparador;
    public IDirectorEscuela vistaDirectorEscuela;
    public ICoordinador vistaCoordinador;
    public IAspirante vistaAspirante;
    public CtrlBD ctrlBD = new CtrlBD();
    public IError vistaErrorJefe;
    public IErrorCedulaPrincipal vistaErrorCedulaPrincipal;
    private IErrorUsuarioContraseña vistaErrorUsuarioContraseñaPrincipal;
    private IErrorLlenarCampos vistaErrorLlenarCampos;
    
    private CtrlPrincipal() throws SQLException{
        
        uniqueInstance = this;
        ctrlBD = new CtrlBD();
        ctrlBD.Open();
        IPpal = new IPrincipal(); 
        vistaAsignarPlazas = new IAsignarPlazas();
        vistaJefeDepartamento = new IJefeDepartamento();
        vistaSecretariaEscuela = new ISecretariaEscuela();
        vistaSecretariaDepartamento = new ISecretariaDepartamento();
        vistaPreparador = new IPreparador();
        vistaDirectorEscuela = new IDirectorEscuela();
        vistaCoordinador = new ICoordinador();
        vistaAspirante = new IAspirante();
        vistaErrorJefe = new IError();
        vistaErrorCedulaPrincipal = new IErrorCedulaPrincipal();
        vistaErrorUsuarioContraseñaPrincipal = new IErrorUsuarioContraseña();
        vistaErrorLlenarCampos = new IErrorLlenarCampos(); 
    }
    
    public static CtrlPrincipal instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlPrincipal();
        }
        return uniqueInstance;
    }
    
    
    
    public static void main (String[] args) throws SQLException{
        instance().selectOption(1);
    }
    
    
    public void selectOption(int opc) throws SQLException{
    
    
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1://Inicio de la app
                IPpal.setLocationRelativeTo(null);
                IPpal.setVisible(true);
            break;
                
            case 2://click btn-login
                String passwd, tipoUsuario;
                int user;
                ResultSet auxRset;
                  
                passwd = IPpal.getPasswordField();
                user = IPpal.getUserName();
                
                if((user != -2) && (passwd != null) )
                {
                    if(user != -1)
                    {
                        if(ctrlBD.SetQuery("SELECT PASSWORD, TIPO FROM USUARIO WHERE CEDULA ='"+user+"'"))
                        {
                            auxRset=ctrlBD.GetQuery();

                            if(auxRset.next())
                            {  
                                if(passwd.equals(auxRset.getString(1)))
                                {
                                    tipoUsuario = auxRset.getString(2);

                                    switch(tipoUsuario){
                                        case "ADMINISTRADOR":
                                            System.out.println("Soy el admin");
                                            break;
                                        case "ASPIRANTE":
                                            CtrlAspirante.instance().selectOption(1);                                
                                            break;
                                        case "COORDINADOR":
                                            CtrlCoordinador.instance().selectOption(1);
                                             break;
                                        case "DIRECTORESCUELA":
                                            CtrlDirectorEscuela.instance().selectOption(1);
                                        break;
                                        case "JEFE":
                                            CtrlJefeDepartamento.instance().selectOption(1);
                                            break;
                                        case "PREPARADOR":
                                            CtrlPreparador.instance().selectOption(1);
                                            break;
                                        case "SECRETARIADEPARTAMENTO":
                                            CtrlSecretariaDepartamento.instance().selectOption(1);
                                        break;
                                        case "SECRETARIAESCUELA":
                                            CtrlSecretariaEscuela.instance().selectOption(1);
                                            break;
                                        default:
                                            System.out.println("tipo de usuario no valido");
                                            break;
                                    }
                                }else
                                    this.selectOption(5);
                            }else
                                this.selectOption(5);
                        }
                    }else
                        this.selectOption(8);
                }else
                    this.selectOption(6);
            break;
                
            case 3: //Volver a la iinterfaz principal (boton aceptar (IfazErrorCedula - > Pantalla principal))
                vistaErrorCedulaPrincipal.setVisible(false);
                break;
                
            case 4: //Volver a la iinterfaz principal (boton aceptar (IfazErrorUsuarioContraseña - > Pantalla principal))
                
                vistaErrorUsuarioContraseñaPrincipal.setVisible(false);
                break;
                
            case 5: //Desplegar la interfaz de ErrorUsuarioContraseña
                
                vistaErrorUsuarioContraseñaPrincipal.setLocationRelativeTo(null);
                vistaErrorUsuarioContraseñaPrincipal.setVisible(true);
                
                break;
                
            case 6: //Desplegar interfaz de ErrorLlenarCampos principal
                vistaErrorLlenarCampos.setLocationRelativeTo(null);
                vistaErrorLlenarCampos.setVisible(true);
                break;
            
            case 7: //Cerrar ventana de notificacion de llenar campos
                vistaErrorLlenarCampos.setVisible(false);
                break;
                
            case 8: //Desplegar interzas de error en el tipo de dato en el campo cédula
                vistaErrorCedulaPrincipal.setLocationRelativeTo(null);
                vistaErrorCedulaPrincipal.setVisible(true);
                break;
                
            //Acá inicia todo el manejo del Jefe de Departamento    
            case 10: //Vista principal (Plazas asignadas)
                
                CtrlJefeDepartamento.instance().selectOption(2);
                break;
                
            case 11: //Cancelar o enviar Transicion Asignar plazas -> Notificaciones

                CtrlJefeDepartamento.instance().selectOption(3);
                break;
                
            case 12: //Acciones Asignar plazas (Boton)
                
                CtrlJefeDepartamento.instance().selectOption(4);
                break;
                
            case 13: //Botón aceptar en el error de numero negativo
                
                CtrlJefeDepartamento.instance().selectOption(5);
                break;
                
                
             case 28: //App->Salir (Asignar Plazas)
                
                CtrlJefeDepartamento.instance().selectOption(100);
                break;
                
            case 29: //App->Salir (Jefe Departamento)
                
                CtrlJefeDepartamento.instance().selectOption(101);
                break;            
        }
    }
    
    public boolean isNumber(String text)
    {
        
        for(int i = 0; i < text.length(); i++)
        {
            
            if(!Character.isDigit(text.charAt(i)))
                return false;
        }
        return true;
    }
}



















