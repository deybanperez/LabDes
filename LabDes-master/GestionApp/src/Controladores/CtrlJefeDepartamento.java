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
import oracle.net.aso.i;

/**
 *
 * @author Xiomara
 */
public class CtrlJefeDepartamento {

    private static CtrlJefeDepartamento uniqueInstance = null;
    
    private CtrlJefeDepartamento() throws SQLException
    {
        uniqueInstance = this;
    }
    
    public static CtrlJefeDepartamento instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlJefeDepartamento();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc) throws SQLException{
    
    
        switch(opc)
        {
            case 0:
                System.exit(0);
                break;
            
            case 1: //Selección ventana principal
                
                CtrlPrincipal.instance().vistaJefeDepartamento.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaJefeDepartamento.setVisible(true);
                CtrlPrincipal.instance().IPpal.setVisible(false);

                break;
                
            case 2: //Vista principal (Plazas asignadas)
                
                CtrlPrincipal.instance().vistaJefeDepartamento.setVisible(false);
                CtrlPrincipal.instance().vistaAsignarPlazas.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaAsignarPlazas.setVisible(true);
                break;
                
            case 3: //Cancelar o enviar Transicion Asignar plazas -> Notificaciones
                
                CtrlPrincipal.instance().vistaAsignarPlazas.setVisible(false);
                CtrlPrincipal.instance().vistaJefeDepartamento = new IJefeDepartamento();
                CtrlPrincipal.instance().vistaJefeDepartamento.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaJefeDepartamento.setVisible(true);
                break;
                
            case 4:
                
                int j=0,id_materia,prepa1,prepa2;
                String sem;
                
                id_materia = CtrlPrincipal.instance().vistaAsignarPlazas.getIDMateria();
                sem = CtrlPrincipal.instance().vistaAsignarPlazas.getSemestre(); 
                prepa1 = CtrlPrincipal.instance().vistaAsignarPlazas.getCantidadPreparadoresI(); 
                prepa2 = CtrlPrincipal.instance().vistaAsignarPlazas.getCantidadPreparadoresII();
                
                
                if( (prepa2 != -1) && (prepa1 != -1) )
                {
                    
                    if( (prepa2 >=0 ) && (prepa1 >= 0))
                    {
                        if(CtrlPrincipal.instance().ctrlBD.SetQuery("UPDATE MATERIA_SEMESTRE SET CANT_PLAZAS_PI="+prepa1+", CANT_PLAZAS_PII="+prepa2+" WHERE ID_MATERIA="+id_materia+" AND SEMESTRE='"+sem+"'"))
                        {
                            if(CtrlPrincipal.instance().ctrlBD.SetQuery("COMMIT"))
                                System.out.println("Update realizado");

                        }

                        CtrlPrincipal.instance().vistaAsignarPlazas.setVisible(false);
                        CtrlPrincipal.instance().vistaAsignarPlazas = new IAsignarPlazas();
                        CtrlPrincipal.instance().vistaAsignarPlazas.setLocationRelativeTo(null);
                        CtrlPrincipal.instance().vistaAsignarPlazas.setVisible(true);
                    
                    }
                }else
                {
                    CtrlPrincipal.instance().vistaErrorJefe.setLocationRelativeTo(null);
                    CtrlPrincipal.instance().vistaErrorJefe.setVisible(true);
                }
                
                break;
                
            case 5:
                
                CtrlPrincipal.instance().vistaErrorJefe.setVisible(false);
                
                break;
                
            case 100:
                
                CtrlPrincipal.instance().vistaAsignarPlazas.setVisible(false);
                CtrlPrincipal.instance().IPpal.setLocationRelativeTo(null);
                CtrlPrincipal.instance().IPpal.setVisible(true);
                break;
                
            case 101:
                
                CtrlPrincipal.instance().vistaJefeDepartamento.setVisible(false);
                CtrlPrincipal.instance().IPpal.setLocationRelativeTo(null);
                CtrlPrincipal.instance().IPpal.setVisible(true);
                break;
        }
    }
    
   
}
