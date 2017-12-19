
package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Empleado;


public class Controlador {
    
       public void modificar(Empleado empleado, int rut) throws SQLException
    {
        String sentencia = "update empleado set id='"+empleado.getId()+"' where rut ="+rut;
        String sentencia1 = "update empleado set rut='"+empleado.getRut()+"' where rut ="+rut;
        String sentencia2 = "update empleado set fechaIngreso='"+empleado.getFechaIngreso()+"' where rut ="+rut;
        String sentencia3 = "update empleado set fechaCumpleanos='"+empleado.getFechaCumpleanos()+"' where rut ="+rut;
        String sentencia4 = "update empleado set direccion='"+empleado.getDireccion()+"' where rut ="+rut;
        String sentencia5 = "update empleado set nombre='"+empleado.getNombre()+"' where rut ="+rut;
        
        Connection conexion = Conexion.getConnection();
        Statement statement = conexion.createStatement();
        statement.executeUpdate(sentencia);
        statement.executeUpdate(sentencia1);
        statement.executeUpdate(sentencia2);
        statement.executeUpdate(sentencia3);
        statement.executeUpdate(sentencia4);
        statement.executeUpdate(sentencia5);
    }
       
       public void agregar(){
       }
    
}
