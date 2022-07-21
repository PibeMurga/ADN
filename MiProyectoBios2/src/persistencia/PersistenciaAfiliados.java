package persistencia;

import excepciones.ExcepcionCerrarConexion;
import excepciones.ExcepcionConectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Afiliado;
import logica.Usuario;

public class PersistenciaAfiliados {

    private static final String CONSULTA = "SELECT * FROM adn.afiliados;";
    private static final String CONSULTA_CEDULA = "SELECT * FROM adn.afiliados WHERE cedula=?;";

    public static ResultSet listar() throws ExcepcionConectar, ExcepcionCerrarConexion {
        ResultSet rs = null;
        Connection con = PersistenciaConexion.Conectar();
        try {
            PreparedStatement ps = con.prepareStatement(CONSULTA);
            rs = ps.executeQuery();
        } catch (SQLException ex) {

        } finally {
            //ConexionConBase.cerrarConexion();
        }
        return rs;
    }

    public static Afiliado consultaCedula(Afiliado afiliado) throws ExcepcionConectar, ExcepcionCerrarConexion {
        ResultSet rs = null;

        Connection con = PersistenciaConexion.Conectar();
        try {
            PreparedStatement ps = con.prepareStatement(CONSULTA_CEDULA);
            ps.setString(1, afiliado.getCedula());
            rs = ps.executeQuery();

            while (rs.next()) {
                afiliado.setCedula(rs.getString("cedula"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDireccion(rs.getString("direccion"));
                afiliado.setTelefono(rs.getString("telefono"));
                afiliado.setNacionalidad(rs.getString("nacionalidad"));
                afiliado.setEmail(rs.getString("email"));
                afiliado.setNacimiento(rs.getDate("nacimiento"));
            }
        } catch (SQLException ex) {

        } finally {
            //ConexionConBase.cerrarConexion();
        }
        return afiliado;
    }

}
