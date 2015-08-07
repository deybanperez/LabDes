/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Preparador;

import Usuario.Perfil;
import Usuario.TipoUsuario;

/**
 *
 * @author Xiomara
 */
public class Preparador extends Perfil{
   
    private TipoPreparador tipo;

    public Preparador(String nombre, String apellido, String cedula, String fecha_nac, String email, TipoUsuario tipo) {
        super(nombre, apellido, cedula, fecha_nac, email, tipo);
    }

    
    public void Renunciar(String CodMateria){}
}
