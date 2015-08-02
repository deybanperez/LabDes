/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Xiomara
 */
public class CtrlCoordinador {

    private static CtrlCoordinador uniqueInstance = null;
    
    private CtrlCoordinador(){
        uniqueInstance = this;

    }
    
    public static CtrlCoordinador instance(){//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlCoordinador();
        }
        return uniqueInstance;
    }
    
  
    
    public void selectOption(int opc){
    
    
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1:

            break;
        }
    }    
    
  

}
