
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static Connection  con=null;
    public static Connection  getConnection(){
      try{
         if( con == null ){
            String driver="oracle.jdbc.driver.OracleDriver"; //el driver varia segun la DB que usemos
            String url="jdbc:oracle:thin:@MSP-PM-04-01.aws.smartcloud.cl:1521:XE";
            String pwd="usuario01";
            String usr="usuario01";
            Class.forName(driver);
            con = DriverManager.getConnection(url,usr,pwd);
            System.out.println("Conectionesfull");
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.printStackTrace();
     }
     return con;
   }
    
    }
