/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Main.IPrincipal;
import Usuario.Aspirante.IAspirante;
import Usuario.Coordinador.ICoordinador;
import Usuario.Coordinador.IPlazasAsignadas;
import Usuario.Coordinador.IPublicarConcurso;
import Usuario.DirectorEscuela.IDirectorEscuela;
import Usuario.JefeDepartamento.IAsignarPlazas;
import Usuario.JefeDepartamento.IJefeDepartamento;
import Usuario.Preparador.IPreparador;
import Usuario.SecretariaDepartamento.ISecretariaDepartamento;
import Usuario.SecretariaEscuela.ISecretariaEscuela;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Xiomara
 */
public class CtrlCoordinador {

    private static CtrlCoordinador uniqueInstance = null;
    public String fecha_inicio;
    
    private CtrlCoordinador() throws SQLException{
        uniqueInstance = this;
    }
    
    public static CtrlCoordinador instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlCoordinador();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc) throws SQLException
    {
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1: //Interfaz Principal
                
                CtrlPrincipal.instance().IPpal.setVisible(false);
                CtrlPrincipal.instance().vistaCoordinador = new ICoordinador();
                CtrlPrincipal.instance().vistaCoordinador.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaCoordinador.setVisible(true);
            break;
                
            case 2:
                CtrlPrincipal.instance().vistaCoordinador.setVisible(false);
                CtrlPrincipal.instance().vistaPlazasAsignadasCoordinador = new IPlazasAsignadas();
                CtrlPrincipal.instance().vistaPlazasAsignadasCoordinador.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaPlazasAsignadasCoordinador.setVisible(true);
            break;
                
            case 3: //Regersar desde plazas asignadas a la vista principal
                CtrlPrincipal.instance().vistaPlazasAsignadasCoordinador.setVisible(false);
                CtrlPrincipal.instance().vistaCoordinador.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaCoordinador.setVisible(true);
                break;
                
            case 4:
                CtrlPrincipal.instance().vistaCoordinador.setVisible(false);
                CtrlPrincipal.instance().vistaPublicarConcurso = new IPublicarConcurso();
                CtrlPrincipal.instance().vistaPublicarConcurso.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaPublicarConcurso.setVisible(true);
                break;
                
            case 5:
                 CtrlPrincipal.instance().vistaPublicarConcurso.setVisible(false);
                 CtrlPrincipal.instance().vistaCoordinador = new ICoordinador();
                 CtrlPrincipal.instance().vistaCoordinador.setLocationRelativeTo(null);
                 CtrlPrincipal.instance().vistaCoordinador.setVisible(true);
                break;
                
            case 6:
                
                if(CtrlPrincipal.instance().vistaPublicarConcurso.EmptyFields())
                {
                    if(CtrlPrincipal.instance().VerificarLongitudFechas(CtrlPrincipal.instance().vistaPublicarConcurso.getFechaInicio(),CtrlPrincipal.instance().vistaPublicarConcurso.getFechafin()))
                    {
                        if(CtrlPrincipal.instance().verificarFecha(CtrlPrincipal.instance().vistaPublicarConcurso.getFechaInicio(), CtrlPrincipal.instance().vistaPublicarConcurso.getFechafin()))
                        {
                            CtrlPrincipal.instance().ctrlBD.SetQuery ("SELECT COUNT(*) FROM CONCURSO WHERE ID_MATERIA='"+CtrlPrincipal.instance().vistaPublicarConcurso.getIDMateria()+"' AND SEMESTRE='"+CtrlPrincipal.instance().vistaPublicarConcurso.getSemestre()+"'");
                            
                            ResultSet auxRset = CtrlPrincipal.instance().ctrlBD.GetQuery();
                            
                            if(auxRset.next())
                            {
                                if(Integer.parseInt(auxRset.getString(1)) == 0)
                                {
                                    if(CtrlPrincipal.instance().ctrlBD.SetQuery("INSERT INTO CONCURSO VALUES (concurso_seq.NEXTVAL,'Abierto',"+CtrlPrincipal.instance().vistaPublicarConcurso.getIDMateria()+",'"+CtrlPrincipal.instance().vistaPublicarConcurso.getSemestre()+"',"+CtrlPrincipal.instance().sesionCoordinador.getCedula()+",'"+CtrlPrincipal.instance().vistaPublicarConcurso.getFechaInicio()+"','"+CtrlPrincipal.instance().vistaPublicarConcurso.getFechafin()+"')"))
                                         JOptionPane.showMessageDialog(null,"Concurso públicado exitosamente");
                                    else
                                        JOptionPane.showMessageDialog(null,"No se pudo publicar el concurso");
                                }else
                                    JOptionPane.showMessageDialog(null,"Ya existe un concurso abierto para esta materia");
                            }
                        }else
                            JOptionPane.showMessageDialog(null,"Formato de fechas incorrecto");
                    }else
                        JOptionPane.showMessageDialog(null,"Formato de fechas incorrecto");
                }else
                    JOptionPane.showMessageDialog(null,"Los campos deben ser llenados");
                break;
                
            case 100: //Cerrar sesion desde la interafz principal
                CtrlPrincipal.instance().vistaCoordinador.setVisible(false);
                CtrlPrincipal.instance().IPpal.setLocationRelativeTo(null);
                CtrlPrincipal.instance().IPpal.setVisible(true);
                break;
                
            case 101: //Cerrar Sesion desde las plazas asignadas
                CtrlPrincipal.instance().vistaPlazasAsignadasCoordinador.setVisible(false);
                CtrlPrincipal.instance().IPpal.setLocationRelativeTo(null);
                CtrlPrincipal.instance().IPpal.setVisible(true);
                break;
                
            case 102:
                CtrlPrincipal.instance().vistaPublicarConcurso.setVisible(false);
                CtrlPrincipal.instance().IPpal.setLocationRelativeTo(null);
                CtrlPrincipal.instance().IPpal.setVisible(true);

        }
    }    

}
