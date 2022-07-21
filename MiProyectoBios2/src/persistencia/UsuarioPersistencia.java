package persistencia;

import excepciones.CerrarConexionExcepcion;
import excepciones.ConectarExcepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Usuario;

/**
 *
 * @author Juan Diego
 */
public class UsuarioPersistencia {

    private static final String CONSULTA = "SELECT * FROM mydb.usuarios WHERE usuario=? and clave=?;";

    public static String consultar(Usuario usuario) throws ConectarExcepcion, CerrarConexionExcepcion {
        String nombreUsuario = "";
        Connection con = ConexionConBase.Conectar();
        try {
            PreparedStatement ps = con.prepareStatement(CONSULTA);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getClave());
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                nombreUsuario = resultado.getString("nombre");
            }
        } catch (SQLException ex) {

        } finally {
            ConexionConBase.cerrarConexion();
        }
        return nombreUsuario;
    }

}
