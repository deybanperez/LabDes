/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materia;

/**
 *
 * @author Xiomara
 */
public class Materia {
    
    private String Nombre;
    private String CodMateria;
    private int NumPlazas;
    private int CantSecciones;
    private int CantPreparadores;

    public Materia(String Nombre, String CodMateria, int NumPlazas, int CantSecciones, int CantPreparadores) {
        this.Nombre = Nombre;
        this.CodMateria = CodMateria;
        this.NumPlazas = NumPlazas;
        this.CantSecciones = CantSecciones;
        this.CantPreparadores = CantPreparadores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodMateria() {
        return CodMateria;
    }

    public void setCodMateria(String CodMateria) {
        this.CodMateria = CodMateria;
    }

    public int getNumPlazas() {
        return NumPlazas;
    }

    public void setNumPlazas(int NumPlazas) {
        this.NumPlazas = NumPlazas;
    }

    public int getCantSecciones() {
        return CantSecciones;
    }

    public void setCantSecciones(int CantSecciones) {
        this.CantSecciones = CantSecciones;
    }

    public int getCantPreparadores() {
        return CantPreparadores;
    }

    public void setCantPreparadores(int CantPreparadores) {
        this.CantPreparadores = CantPreparadores;
    }
            
    
}
