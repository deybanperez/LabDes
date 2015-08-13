/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BD.CtrlBD;
import Main.IPrincipal;
import Usuario.Aspirante.Aspirante;
import Usuario.Aspirante.IAspirante;
import java.sql.ResultSet;
import java.sql.SQLException;
import Usuario.Coordinador.*;
import Usuario.DirectorEscuela.*;
import Usuario.JefeDepartamento.*;
import Usuario.Preparador.*;
import Usuario.SecretariaDepartamento.*;
import Usuario.SecretariaEscuela.*;
import Usuario.TipoUsuario;
import java.sql.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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
    public Coordinador sesionCoordinador;
    public Aspirante sesionAspirante;
    public IPlazasAsignadas vistaPlazasAsignadasCoordinador;
    public Usuario.Coordinador.IPublicarConcurso vistaPublicarConcurso;
    public Usuario.Coordinador.IModificarEstadoConcurso vistaModificarEstadoConcurso;
    
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
                
                String passwd, tipoUsuario;
                String nombre, apellido, cedula, email,fecha_nac;

                int user;
                ResultSet auxRset;
                  
                passwd = IPpal.getPasswordField();
                user = IPpal.getUserName();
                
                if((user != -2) && (passwd != null) )
                {
                    if(user != -1)
                    {
                        if(ctrlBD.SetQuery("SELECT PASSWORD, TIPO_USUARIO FROM USUARIO WHERE CEDULA ='"+user+"'"))
                        {
                            auxRset=ctrlBD.GetQuery();

                            if(auxRset.next())
                            {  
                                if(passwd.equals(auxRset.getString(1)))
                                {
                                    tipoUsuario = auxRset.getString(2);
                                    if(tipoUsuario!=null)
                                    {    
                                        switch(tipoUsuario)
                                        {
                                            case "ADMINISTRADOR":
                                                System.out.println("Soy el admin");
                                                break;
                                            case "ASPIRANTE":

                                                ctrlBD.SetQuery("SELECT * FROM USUARIO WHERE CEDULA ='"+user+"'");
                                                auxRset=ctrlBD.GetQuery();

                                                int x = auxRset.getFetchSize();
                                                if(auxRset.next())
                                                {
                                                    nombre = auxRset.getString(3);
                                                    apellido = auxRset.getString(4);
                                                    cedula = auxRset.getString(1);
                                                    fecha_nac = auxRset.getString(5);
                                                    email = auxRset.getString(7);
                                                    this.sesionAspirante = new Aspirante(nombre, apellido, cedula, fecha_nac, email,TipoUsuario.ASPIRANTE);
                                                    CtrlAspirante.instance().selectOption(1);
                                                }
                                          
                                                                                
                                                break;
                                            case "COORDINADOR":

                                                ctrlBD.SetQuery("SELECT * FROM USUARIO WHERE CEDULA ='"+user+"'");
                                                auxRset=ctrlBD.GetQuery();
                                                if(auxRset.next())

                                                {
                                                    nombre = auxRset.getString(3);
                                                    apellido = auxRset.getString(4);
                                                    cedula = auxRset.getString(1);
                                                    email = auxRset.getString(7);
                                                    sesionCoordinador = new Coordinador(nombre, apellido, cedula, null, email,TipoUsuario.COORDINADOR);
                                                    CtrlCoordinador.instance().selectOption(1);
                                                }

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
                                    }

                                }else
                                    JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos");
                            }else
                                JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos");
                        }else{
                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "El tipo de dato cédula debe ser numérico");
                }else
                    JOptionPane.showMessageDialog(null, "Se deben llenar los campos");
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
                
                //Aca comienza todo el manejo de coordinador
            case 40:
                CtrlCoordinador.instance().selectOption(2);
                break;
                
            case 41:
                CtrlCoordinador.instance().selectOption(3);
                break;
                
            case 42:
                CtrlCoordinador.instance().selectOption(4);
                break;
                
            case 43:
                CtrlCoordinador.instance().selectOption(5);
                break;
                
            case 44:
                CtrlCoordinador.instance().selectOption(6);
                break;
                
            case 45:
                CtrlCoordinador.instance().selectOption(7);
                break;
                
            case 46:
                CtrlCoordinador.instance().selectOption(8);
                break;
                
            case 47:
                CtrlCoordinador.instance().selectOption(9);
                break;
            case 67:
                CtrlCoordinador.instance().selectOption(102);
                break;
            case 68:
                CtrlCoordinador.instance().selectOption(100);
                break;
                
            case 69:
                CtrlCoordinador.instance().selectOption(101);
                break;
                
           //Aca comienza todo el manejo de aspirante     
            case 70:
                break;
                
            //Aca comienza todo el manejo de secretaria escuela
            case 100:
                break;
                
            //Aca comienza todo el manejo de secretaria departamento
            case 130:
                break;
                
            //Aca comienza todo el manejo de director de la escuela
            case 160:
                break;
                
            //Aca comienza todo el manejo de preparador
            case 190:
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
    
    public boolean verificarFecha (String FI, String FF)
    {
        String[] cmp1,cmp2;
        
        for (int i=0; i<3;i++)
        {
            cmp1= FI.split("/");
            cmp2=FF.split("/");
            if (Integer.parseInt(cmp1[i].toString())<Integer.parseInt(cmp2[i].toString()))
                return true;
        }
        
        return false;
    }
    
    public boolean VerificarLongitudFechas(String fechaInicio, String fechafin)
    {
        if( (fechaInicio.length() == 10) && (fechafin.length() == 10) )
        {
            Pattern pat = Pattern.compile("\\d\\d/\\d\\d/\\d\\d\\d\\d");
            Matcher mat1 = pat.matcher(fechaInicio);
            Matcher mat2 = pat.matcher(fechafin);
            
            if(mat1.matches() && mat2.matches())
                return true;
        }
        
        return false;
    }
}



















