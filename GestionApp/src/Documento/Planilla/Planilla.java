/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documento.Planilla;

import Documento.Documento;
import Documento.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author Xiomara
 */
public class Planilla extends Documento{
    private String formato;
    private ArrayList<String> campos; 

    public Planilla(String emisor, String destinatario, TipoDocumento tipo,String formato, ArrayList<String> campos) {
        super(emisor, destinatario, tipo);
        this.formato = formato;
        this.campos = campos;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public ArrayList<String> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<String> campos) {
        this.campos = campos;
    }
    
}
