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
public class CtrlSecretariaDepartamento {

    private static CtrlSecretariaDepartamento uniqueInstance = null;
    
    private CtrlSecretariaDepartamento(){
        uniqueInstance = this;

    }
    
    public static CtrlSecretariaDepartamento instance(){//Al referirse a este controlador, invocarlo por este metodo
        if (uniqueInstance==null) {
            uniqueInstance = new CtrlSecretariaDepartamento();
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
