
package logica;

import excepciones.ExcepcionCerrarConexion;
import excepciones.ExcepcionConectar;
import java.sql.ResultSet;
import persistencia.PersistenciaAfiliados;
import persistencia.PersistenciaUsuarios;


public class FachadaLogica {
    
    public static String consultarUsuario (Usuario usuario) throws ExcepcionConectar, ExcepcionCerrarConexion{
        return PersistenciaUsuarios.consultar(usuario);
    }
    
    public static ResultSet listadoAfiliados() throws ExcepcionConectar, ExcepcionCerrarConexion{
        return PersistenciaAfiliados.listar();
    }
    
    public static Afiliado consultaAfiliadoPorCedula(Afiliado afiliado) throws ExcepcionConectar, ExcepcionCerrarConexion{
        return PersistenciaAfiliados.consultaCedula(afiliado);
    }
    
}
