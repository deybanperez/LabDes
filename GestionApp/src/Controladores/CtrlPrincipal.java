/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BD.CtrlBD;
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
    private IPrincipal IPpal;
    private IJefeDepartamento vistaJefeDepartamento;
    private IAsignarPlazas vistaAsignarPlazas;
    private ISecretariaEscuela vistaSecretariaEscuela;
    private ISecretariaDepartamento vistaSecretariaDepartamento;
    private IPreparador vistaPreparador;
    private IDirectorEscuela vistaDirectorEscuela;
    private ICoordinador vistaCoordinador;
    private IAspirante vistaAspirante;
    
    private CtrlPrincipal() throws SQLException{
        
        uniqueInstance = this;
        IPpal = new IPrincipal(); 
        vistaAsignarPlazas = new IAsignarPlazas();
        vistaJefeDepartamento = new IJefeDepartamento();
        vistaSecretariaEscuela = new ISecretariaEscuela();
        vistaSecretariaDepartamento = new ISecretariaDepartamento();
        vistaPreparador = new IPreparador();
        vistaDirectorEscuela = new IDirectorEscuela();
        vistaCoordinador = new ICoordinador();
        vistaAspirante = new IAspirante();
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
                String passwd;
                String user;
                CtrlBD ctrlBD = new CtrlBD();
                ctrlBD.Open();
                ResultSet auxRset;
                String tipoUsuario;
                  
                passwd = IPpal.getPasswordField();
                user = IPpal.getUserName();
                
                //if(ctrlBD.SetQuery("SELECT PASSWORD FROM USUARIO WHERE USERNAME='"+user+"';"))
                if(ctrlBD.SetQuery("SELECT PASSWORD, TIPO FROM USUARIO WHERE CEDULA ='"+user+"'"))
                {
                    auxRset=ctrlBD.GetQuery();
                    
                    if(auxRset.next())
                    {
                        
                        if(passwd.equals(auxRset.getString(1)))
                        {
                            //System.out.println(passwd);
                            tipoUsuario = auxRset.getString(2);
                            
                            switch(tipoUsuario){
                                case "ADMINISTRADOR":
                                    System.out.println("Soy el admin");
                                    break;
                                case "ASPIRANTE":
                                    vistaAspirante.setLocationRelativeTo(null);
                                    vistaAspirante.setVisible(true);
                                    IPpal.setVisible(false);
                                                                        
                                break;
                                case "COORDINADOR":
                                    vistaCoordinador.setLocationRelativeTo(null);
                                    vistaCoordinador.setVisible(true);
                                    IPpal.setVisible(false);
                                    
                                 break;
                                case "DIRECTORESCUELA":
                                    vistaDirectorEscuela.setLocationRelativeTo(null);
                                    vistaDirectorEscuela.setVisible(true);
                                    IPpal.setVisible(false);
                                break;
                                case "JEFE":
                                    vistaJefeDepartamento.setLocationRelativeTo(null);
                                    vistaJefeDepartamento.setVisible(true);
                                    IPpal.setVisible(false);
                                break;
                                case "PREPARADOR":
                                    vistaPreparador.setLocationRelativeTo(null);
                                    vistaPreparador.setVisible(true);
                                    IPpal.setVisible(false);
                                break;
                                case "SECRETARIADEPARTAMENTO":
                                    vistaSecretariaDepartamento.setLocationRelativeTo(null);
                                    vistaSecretariaDepartamento.setVisible(true);
                                    IPpal.setVisible(false);
                                break;
                                case "SECRETARIAESCUELA":
                                    vistaSecretariaEscuela.setLocationRelativeTo(null);
                                    vistaSecretariaEscuela.setVisible(true);
                                    IPpal.setVisible(false);
                                break;
                                default:
                                    System.out.println("tipo de usuario no valido");
                                break;
                            }
                            
                            
                        }else
                            System.out.println("Contraseña incorrecta");

                    }else
                    {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                }else{
                    System.out.println("Error en la consulta");
                }
                        
            break;
                
            //Acá inicia todo el manejo del Jefe de Departamento    
            case 10: //Vista principal (Plazas asignadas)
                
                vistaJefeDepartamento.setVisible(false);
                vistaAsignarPlazas.setLocationRelativeTo(null);
                vistaAsignarPlazas.setVisible(true);
                
                break;
                
            case 11: //Cancelar o enviar Transicion Asignar plazas -> Notificaciones

                vistaAsignarPlazas.setVisible(false);
                vistaJefeDepartamento = new IJefeDepartamento();
                vistaJefeDepartamento.setLocationRelativeTo(null);
                vistaJefeDepartamento.setVisible(true);
                break;
                
            case 12: //Acciones Asignar plazas (Boton)
                ctrlBD = new CtrlBD();
                ctrlBD.Open();
                int j=0,id_materia,prepa1,prepa2;
                String sem;
                id_materia = vistaAsignarPlazas.getIDMateria();
                sem = vistaAsignarPlazas.getSemestre(); 
                prepa1 = vistaAsignarPlazas.getCantidadPreparadoresI(); 
                prepa2 = vistaAsignarPlazas.getCantidadPreparadoresII();
    
                if(ctrlBD.SetQuery("UPDATE MATERIA_SEMESTRE SET CANT_PLAZAS_PI="+prepa1+", CANT_PLAZAS_PII="+prepa2+" WHERE ID_MATERIA="+id_materia+" AND SEMESTRE='"+sem+"'"))
                {
                    if(ctrlBD.SetQuery("COMMIT"))
                        System.out.println("Update realizado");

                }
                
                vistaAsignarPlazas = new IAsignarPlazas();
                
                 selectOption(11);
                
                
                break;
                
                
             case 28: //App->Salir (Asignar Plazas)
                
                vistaAsignarPlazas.setVisible(false);
                IPpal.setLocationRelativeTo(null);
                IPpal.setVisible(true);
                break;   
                
            case 29: //App->Salir (Jefe Departamento)
                
                vistaJefeDepartamento.setVisible(false);
                IPpal.setLocationRelativeTo(null);
                IPpal.setVisible(true);
                break;            
        }
    }
}



















