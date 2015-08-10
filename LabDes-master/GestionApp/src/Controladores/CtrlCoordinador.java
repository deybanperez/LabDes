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
import Usuario.DirectorEscuela.IDirectorEscuela;
import Usuario.JefeDepartamento.IAsignarPlazas;
import Usuario.JefeDepartamento.IJefeDepartamento;
import Usuario.Preparador.IPreparador;
import Usuario.SecretariaDepartamento.ISecretariaDepartamento;
import Usuario.SecretariaEscuela.ISecretariaEscuela;
import java.sql.SQLException;

/**
 *
 * @author Xiomara
 */
public class CtrlCoordinador {

    private static CtrlCoordinador uniqueInstance = null;
    
    private CtrlCoordinador() throws SQLException{
        uniqueInstance = this;
    }
    
    public static CtrlCoordinador instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlCoordinador();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc) throws SQLException{
    
    
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
                
            case 2: //Desplegar la interfaz de plazas asignadas desde la ventana principal
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
        }
    }    
    
  

}
