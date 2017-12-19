
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import modelo.Empleado;


public class Controlador {
    
    private static ArrayList<Empleado> empleados = null;
    //CONSTRUCTOR
    private Controlador()
    {
        if(empleados == null)
        {
            empleados = new ArrayList<Empleado>();
            
            String sentencia = "SELECT id, rut, fecha_ingreso, fecha_cumpleanos, direccion, nombre FROM EMPLEADO"; 
            try {
                Connection conexion = Conexion.getConnection();
                Statement statement = conexion.createStatement();
                ResultSet resultado = statement.executeQuery(sentencia);

                while (resultado.next()){

                    int codigo =Integer.parseInt(resultado.getString("codigo"));
                    int id = resultado.getInt("codigo");
                    int rut = resultado.getInt("rut");
                    String fechaIngreso = resultado.getString("fecha_ingreso");
                    String fechaCumpleanos = resultado.getString("fecha_cumpleanos");
                    String direccion = resultado.getString("direccion");
                    String nombre = resultado.getString("nombre");

                    empleados.add(new Empleado(id, rut, fechaIngreso, fechaCumpleanos, direccion, nombre));
                }
            } 
            catch (SQLException ex) {
                 JOptionPane.showMessageDialog(new JDialog(), "Error al iniciar controlador.");
            }
        }
    }
    
    
    //MODIFICAR
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
    
    //AGREGAR
    public void agregar(Empleado empleado){
        empleados.add(empleado);
        try
        {
            Connection conexion = Conexion.getConnection();
            Statement statement = conexion.createStatement();
            String consulta = "insert into EMPLEADO (id, rut, fecha_ingreso, fecha_cumpleanos, direccion, nombre ) values("+empleado.getId()+","+empleado.getRut()+",'"+empleado.getFechaIngreso()+"','"+empleado.getFechaCumpleanos()+"','"+empleado.getDireccion()+"','"+empleado.getNombre()+"')";
            statement.executeUpdate(consulta);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(new JDialog(), "Error al agregar.");
        }
    
    }
    public void eliminar (){
        
        
    }
    
    
    
}
