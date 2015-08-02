/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Aspirante;

import Usuario.Perfil;
import Usuario.TipoUsuario;

/**
 *
 * @author Xiomara
 */
public class Aspirante extends Perfil{
    private int creditos_aprobados;
    private float eficiencia;

    public Aspirante(String nombre, String apellido, String cedula, String fecha_nac, String email, TipoUsuario tipo) {
        super(nombre, apellido, cedula, fecha_nac, email, tipo);
    }



    public int getCreditos_aprobados() {
        return creditos_aprobados;
    }

    public void setCreditos_aprobados(int creditos_aprobados) {
        this.creditos_aprobados = creditos_aprobados;
    }

    public float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(float eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
    public void LlenarPlanilla(){}
    public void ConsignarRecaudos(){}
    public void AceptarPlaza(String CodMateria){}
    public void RechazarPlaza(String CodMateria){}
    
    
    
    
}
