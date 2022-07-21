package persistencia;

import excepciones.ExcepcionCerrarConexion;
import excepciones.ExcepcionConectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class PersistenciaConexion {
    
    private static Connection conexion;
    
    public static Connection Conectar() throws ExcepcionConectar {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adn", "root", "password");
            
        } catch (SQLException ex) {
            throw new ExcepcionConectar("No se pudo establecer conexion con la base de datos");
            
        }
        return conexion;
    }
    
    public static void cerrarConexion() throws ExcepcionCerrarConexion{
        try {
            conexion.close();
        } catch (SQLException ex) {
            throw new ExcepcionCerrarConexion("No se pudo cerrar la conexiòn a la base de datos");
        }
    }

}
