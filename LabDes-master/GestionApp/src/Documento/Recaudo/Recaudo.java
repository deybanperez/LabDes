/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documento.Recaudo;

import Documento.Documento;
import Documento.TipoDocumento;

/**
 *
 * @author Xiomara
 */
public class Recaudo extends Documento{
    private String informacion;
    private String fechaEntrega;

    public Recaudo(String emisor, String destinatario, TipoDocumento tipo,String informacion, String fechaEntrega) {
        super(emisor, destinatario, tipo);
        this.informacion = informacion;
        this.fechaEntrega = fechaEntrega;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
