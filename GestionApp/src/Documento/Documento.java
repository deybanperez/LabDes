/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documento;

/**
 *
 * @author Xiomara
 */
public class Documento {
    private String emisor;
    private String destinatario;
    private TipoDocumento tipo;

    public Documento(String emisor, String destinatario, TipoDocumento tipo) {
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.tipo = tipo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
}
