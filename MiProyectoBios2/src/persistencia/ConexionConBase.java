package persistencia;

import excepciones.CerrarConexionExcepcion;
import excepciones.ConectarExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionConBase {
    
    private static Connection conexion;
    
    public static Connection Conectar() throws ConectarExcepcion {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            
        } catch (SQLException ex) {
            throw new ConectarExcepcion("No se pudo establecer conexion con la base de datos");
            
        }
        return conexion;
    }
    
    public static void cerrarConexion() throws CerrarConexionExcepcion{
        try {
            conexion.close();
        } catch (SQLException ex) {
            throw new CerrarConexionExcepcion("No se pudo cerrar la conexiòn a la base de datos");
        }
    }

}
