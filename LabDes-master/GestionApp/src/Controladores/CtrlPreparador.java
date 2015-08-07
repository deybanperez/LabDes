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
public class CtrlPreparador {

    private static CtrlPreparador uniqueInstance = null;
    private IPrincipal IPpal;
    private IJefeDepartamento vistaJefeDepartamento;
    private IAsignarPlazas vistaAsignarPlazas;
    private ISecretariaEscuela vistaSecretariaEscuela;
    private ISecretariaDepartamento vistaSecretariaDepartamento;
    private IPreparador vistaPreparador;
    private IDirectorEscuela vistaDirectorEscuela;
    private ICoordinador vistaCoordinador;
    private IAspirante vistaAspirante;
    
    private CtrlPreparador() throws SQLException{
        
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
    
    public static CtrlPreparador instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlPreparador();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc){
    
    
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1: //Interfaz Principal
                
                vistaPreparador.setLocationRelativeTo(null);
                vistaPreparador.setVisible(true);
                IPpal.setVisible(false);

            break;
        }
    }    
    
      
}
