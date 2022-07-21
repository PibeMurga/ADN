
package persistencia;

import excepciones.CerrarConexionExcepcion;
import excepciones.ConectarExcepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Afiliado;
import logica.Usuario;


public class AfiliadosPersistencia {
    
    private static final String CONSULTA="SELECT * FROM mydb.afiliados;";
    
    public static ResultSet listar() throws ConectarExcepcion, CerrarConexionExcepcion {
        ResultSet rs=null;
        Connection con = ConexionConBase.Conectar();
        try {
            PreparedStatement ps = con.prepareStatement(CONSULTA);
            rs = ps.executeQuery();
        } catch (SQLException ex) {

        } finally {
            //ConexionConBase.cerrarConexion();
        }
        return rs;
    }
    
    
}
