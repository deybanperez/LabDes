/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BD.CtrlBD;
import Main.IPrincipal;
import Usuario.Aspirante.IAspirante;
import Usuario.Aspirante.IAspirar;
import Usuario.Aspirante.IConsignar;
import Usuario.Aspirante.ILlenarPlanilla;
import Usuario.Aspirante.IMisConcursos;
import Usuario.Coordinador.ICoordinador;
import Usuario.DirectorEscuela.IDirectorEscuela;
import Usuario.JefeDepartamento.IAsignarPlazas;
import Usuario.JefeDepartamento.IJefeDepartamento;
import Usuario.Preparador.IPreparador;
import Usuario.SecretariaDepartamento.ISecretariaDepartamento;
import Usuario.SecretariaEscuela.ISecretariaEscuela;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Xiomara
 */
public class CtrlAspirante 
{
    private static CtrlAspirante uniqueInstance = null;
    public ILlenarPlanilla ILlenarPlanilla;
    public IMisConcursos IMisConcursos;
    public IConsignar IConsignar;
    public IAspirar IAspirar;
    public ArrayList<String> ids_concurso;
    public ArrayList<String> ids_materia;
    public ArrayList<String> ids_coordinador;
    public int selected;
    private CtrlAspirante() throws SQLException{
        uniqueInstance = this;
        ILlenarPlanilla = new ILlenarPlanilla();
        IMisConcursos = new IMisConcursos();
        IConsignar= new IConsignar();
        IAspirar= new IAspirar();
    }
    
    public static CtrlAspirante instance() throws SQLException{//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlAspirante();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc) throws SQLException, IOException{
    
    try{
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1: //Interfaz Principal
                
                CtrlPrincipal.instance().vistaAspirante.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaAspirante.setVisible(true);
                CtrlPrincipal.instance().IPpal.setVisible(false);

            break;

            case 2://Regresar
                CtrlPrincipal.instance().vistaAspirante.setLocationRelativeTo(null);
                CtrlPrincipal.instance().vistaAspirante.setVisible(true);
                ILlenarPlanilla.setVisible(false);
                IMisConcursos.setVisible(false);
                IConsignar.setVisible(false);
                IAspirar.setVisible(false);
            break;
                
            case 3: //Click LlenarPlanilla IAspirante
               String fecha = CtrlPrincipal.instance().sesionAspirante.getFecha_nac();
               ILlenarPlanilla.setLabel_names(CtrlPrincipal.instance().sesionAspirante.getNombre() + " " + CtrlPrincipal.instance().sesionAspirante.getApellido());
               ILlenarPlanilla.setLabel_ci(CtrlPrincipal.instance().sesionAspirante.getCedula());
               ILlenarPlanilla.setLabel_fechanac(fecha);
               ILlenarPlanilla.setLabel_edad(String.valueOf(calcularEdad(fecha.replace('/', '-'))));
               ILlenarPlanilla.setLocationRelativeTo(null);
               ILlenarPlanilla.setVisible(true);
               CtrlPrincipal.instance().vistaAspirante.setVisible(false);
               
            break;
                
            case 4:
                
            PdfReader pdfReader;
        try {
            pdfReader = new PdfReader("src/Planillas/SolicitudEmpleo.pdf");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PdfStamper stamper;
            String path = "src/Usuario/Aspirante/Documentos_"+CtrlPrincipal.instance().sesionAspirante.getCedula();
            File dir = new File(path);
            dir.mkdirs();
            stamper = new PdfStamper(pdfReader, new FileOutputStream(path+"/Solicitud_Empleo.pdf"));
            //Se obtienen los campos del formulario
            AcroFields fdfDoc = stamper.getAcroFields();

            //Se llenan los campos del formulario
            fdfDoc.setField("APELLIDOS Y NOMBRES", ILlenarPlanilla.getLabel_names());
            fdfDoc.setField("CI", ILlenarPlanilla.getLabel_ci());
            fdfDoc.setField("LUGAR DE NACIMIENTO", ILlenarPlanilla.getLabel_lugarnacimiento());
            fdfDoc.setField("FECHA DE NAC", ILlenarPlanilla.getLabel_fechanac());
            fdfDoc.setField("EDAD", ILlenarPlanilla.getLabel_edad());
            fdfDoc.setField("NACIONALIDAD", ILlenarPlanilla.getLabel_nacionalidad());
            //String[] radiostates = fdfDoc.getAppearanceStates("Sexo");
            fdfDoc.setField("Sexo", ILlenarPlanilla.getBox_Sexo());
            stamper.close();
            JOptionPane.showMessageDialog(null, "Solicitud de empleo generada exitosamente!");
            
            if (Desktop.isDesktopSupported()) {
           
                File myFile = new File(path+"/Solicitud_Empleo.pdf");
                 Desktop.getDesktop().open(myFile);
            }
            
            CtrlPrincipal.instance().vistaAspirante.setVisible(true);
            ILlenarPlanilla.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "El archivo Solicitud_Empleo.pdf ya se encuentra abierto,"
                    + "debe cerrarlo si desea generar una nueva planilla de solicitud de empleo");
        }catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");

        }

            
            break;
            
            case 5:
         //PdfReader pdfReader2;
                /*String dir = CtrlPrincipal.instance().vistaAspirante.getFile().getCurrentDirectory().getAbsolutePath();
                System.err.println(dir+"/"+CtrlPrincipal.instance().vistaAspirante.getArch_subido().getText());
                try{ 
                //definiendo la ruta en la propiedad file
                Runtime.getRuntime().exec("cmd /c start "+dir+"/"+CtrlPrincipal.instance().vistaAspirante.getArch_subido().getText());

                }catch(IOException e){
                   e.printStackTrace();
                } */
        
                
                String path = IConsignar.getFile().getCurrentDirectory().getAbsolutePath();
                //String path = "src/Usuario/Aspirante/Documentos_"+CtrlPrincipal.instance().sesionAspirante.getCedula();
                File dir = new File(path);
                FileOutputStream file_output;
                dir.mkdirs();
                file_output=new FileOutputStream("src/Usuario/Aspirante/Documentos_"+CtrlPrincipal.instance().sesionAspirante.getCedula()+"/"+IConsignar.getArch_subido().getText());
                JOptionPane.showMessageDialog(null, "Archivo guradado exitosamente!");


                
                /*if (Desktop.isDesktopSupported()) {

                    File myFile = new File(path+"/"+CtrlPrincipal.instance().vistaAspirante.getArch_subido().getText());
                    Desktop.getDesktop().open(myFile);
                }*/



            case 6:
               
                IMisConcursos.setLocationRelativeTo(null);
                IMisConcursos.setVisible(true);
                CtrlPrincipal.instance().vistaAspirante.setVisible(false);
                break;
                   


               
            case 7:    
                IConsignar.setLocationRelativeTo(null);
                IConsignar.setVisible(true);
                CtrlPrincipal.instance().vistaAspirante.setVisible(false);
                break;
                
            case 8:
                IAspirar.setLocationRelativeTo(null);
                IAspirar.setVisible(true);
                CtrlPrincipal.instance().vistaAspirante.setVisible(false);
            break;
            case 9:
                          
                
                String id_asp = CtrlPrincipal.instance().sesionAspirante.getCedula();
                String id_conc = this.ids_concurso.get(selected);
                String semestre = IAspirar.getLabel_Semestre();
                String id_coord = this.ids_coordinador.get(selected);;
                String id_mat =this.ids_materia.get(selected);;
                String nota = "-1";
                CtrlPrincipal.instance().ctrlBD.SetQuery(""
                        + "INSERT INTO ASPIRACIONES VALUES ("
                        + "aspiraciones_seq.NEXTVAL,"
                        +id_asp+","
                        +id_conc+","
                        + "'Pendiente',"
                        + "'"+semestre+"',"
                        + id_coord + ","
                        + id_mat + ","
                        + nota
                        + ")");
                JOptionPane.showMessageDialog(null, "Usted ha sido agregado al concurso");
                IAspirar.setLocationRelativeTo(null);
                IAspirar.setVisible(false);
                CtrlPrincipal.instance().vistaAspirante.actualizarMisConcursos();
                CtrlPrincipal.instance().vistaAspirante.setVisible(true);
            break;                
                   
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");

          }
    }
    
    
    public static int calcularEdad(String nDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        String cDate = dateFormat.format(date);
        int cday=Integer.parseInt(cDate.substring(0,2));
        int cmonth=Integer.parseInt(cDate.substring(3,5)); 
        int cyear=Integer.parseInt("1"+cDate.substring(6,8));
        int nday=Integer.parseInt(nDate.substring(0,2));
        int nmonth=Integer.parseInt(nDate.substring(3,5)); 
        int nyear=Integer.parseInt(nDate.substring(6,8));
        int edad=0;
        if(nyear<cyear){
            edad+=cyear-nyear-1;
            if(nmonth<cmonth){
             edad++;
            }else{ 
                if(nmonth==cmonth){
                    if(nday<=cday){
                        edad++;
                    }
                }
            }
        }
        return edad;
    }

}
