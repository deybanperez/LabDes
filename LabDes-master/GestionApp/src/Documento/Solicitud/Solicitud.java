/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documento.Solicitud;

import Documento.Documento;
import Documento.TipoDocumento;

/**
 *
 * @author Xiomara
 */
public class Solicitud extends Documento{
    private String CodSolicitud;
    private String tipoSolicitud;
    private String contenido;

    public Solicitud(String emisor, String destinatario, TipoDocumento tipo,String CodSolicitud, String tipoSolcitud, String contenido) {
        super(emisor, destinatario, tipo);
        this.CodSolicitud = CodSolicitud;
        this.tipoSolicitud = tipoSolicitud;
        this.contenido = contenido;
    }

    public String getCodSolicitud() {
        return CodSolicitud;
    }

    public void setCodSolicitud(String CodSolicitud) {
        this.CodSolicitud = CodSolicitud;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



      
    
}
