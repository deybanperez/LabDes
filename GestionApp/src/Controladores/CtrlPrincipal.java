/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BD.CtrlBD;
import Main.IPrincipal;

/**
 *
 * @author Xiomara
 */
public class CtrlPrincipal {
    private static CtrlPrincipal uniqueInstance = null;
    private IPrincipal IPpal;
    
    private CtrlPrincipal(){
        uniqueInstance = this;
        IPpal = new IPrincipal(); 
    }
    
    public static CtrlPrincipal instance(){//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlPrincipal();
        }
        return uniqueInstance;
    }
    
    
    
    public static void main (String[] args){
        instance().selectOption(1);
    }
    
    
    public void selectOption(int opc){
    
    
        switch(opc){
            case 0:
                System.exit(0);
            break;
            
            case 1://Inicio de la app
                IPpal.setLocationRelativeTo(null);
                IPpal.setVisible(true);
            break;
                
            case 2://click btn-login
            
            break;
        }
    }
}



















