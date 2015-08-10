/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Coordinador;

import Usuario.Perfil;
import Usuario.TipoUsuario;

/**
 *
 * @author Xiomara
 */
public class Coordinador extends Perfil {

    public Coordinador(String nombre, String apellido, String cedula, String fecha_nac, String email, TipoUsuario tipo){
        super(nombre, apellido, cedula, fecha_nac, email, tipo);
    }


    
    public void GenerarPlanilla(){}
    public void VisualizarPlazas(){}
    public void PublicarConcurso(){}
    public void EnviarSolicitud(){}
    public void EvaluarDocumento(){}
    public void CompletarPërfilAspirante(){}
    public void AplicarConcurso(){}
    public void NotificarGanador(){}
    
        
    
}
