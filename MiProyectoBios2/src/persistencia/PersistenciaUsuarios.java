package persistencia;

import excepciones.ExcepcionCerrarConexion;
import excepciones.ExcepcionConectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Usuario;


public class PersistenciaUsuarios {

    private static final String CONSULTA = "SELECT * FROM adn.usuarios WHERE usuario=? and clave=?;";

    public static String consultar(Usuario usuario) throws ExcepcionConectar, ExcepcionCerrarConexion {
        String nombreUsuario = "";
        Connection con = PersistenciaConexion.Conectar();
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
            PersistenciaConexion.cerrarConexion();
        }
        return nombreUsuario;
    }

}
