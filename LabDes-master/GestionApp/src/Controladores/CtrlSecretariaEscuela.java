/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Main.IPrincipal;
import Usuario.Aspirante.IAspirante;
import Usuario.Coordinador.ICoordinador;
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
public class CtrlSecretariaEscuela {

    private static CtrlSecretariaEscuela uniqueInstance = null;
    
    private CtrlSecretariaEscuela() throws SQLException
    {
        uniqueInstance = this;
    }
    
    public static CtrlSecretariaEscuela instance() throws SQLException
    {//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlSecretariaEscuela();
        }
        return uniqueInstance;
    }
    
    public void selectOption(int opc) throws SQLException{
    
    
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1: //Interfaz principal
                
                CtrlPrincipal.instance().vistaSecretariaEscuela.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaSecretariaEscuela.setVisible(true);
                CtrlPrincipal.instance().IPpal.setVisible(false);

            break;
        }
    }    
    
      
}
