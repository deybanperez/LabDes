/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd.f.Class;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Elvis Coa
 */
public class BDController {
    private Connection con;
    private Statement stmt;
    private ResultSet rset;
    
    public BDController (){
        this.con=null;
        this.stmt=null;
        this.rset=null;
    }
    
    public void Open(){
     try {
            try {  
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //Conectar con la BD
                this.con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","TRANS","TRANS123" );                
            } catch( ClassNotFoundException e ) { 
                e.printStackTrace();  
            }
	/**** ExcepciÃ³n que se dispara si falla la conexiÃ³n *****/
        } catch ( SQLException e) { 
            e.printStackTrace();  
        }
    }
              
    public void Close(){
        try {
            /**** ExcepciÃ³n que se dispara si falla la conexiÃ³n *****/ 
            this.stmt.close();
            this.con.close();
	/**** ExcepciÃ³n que se dispara si falla la conexiÃ³n *****/
        } catch ( SQLException e) { 
            e.printStackTrace();  
        }		
    }
    
    public boolean SetQuery(String sqlQuery){
        try {
            this.stmt= this.con.createStatement();                  
                this.rset = this.stmt.executeQuery(sqlQuery);               
                return true;        
        } catch ( SQLException e) { 
            e.printStackTrace();  
        }
                return false;                
    }    
    
    public ResultSet GetQuery (){
        return this.rset;        
    }
}
