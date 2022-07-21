
package persistencia;

import excepciones.ConectarExcepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PruebasPersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        Connection c = ConexionConBase.Conectar();
            System.out.println("ñaaaaaaaaa");
        PreparedStatement ps=c.prepareStatement("SELECT * FROM mydb.usuarios;");
        ResultSet rs= ps.executeQuery();
            System.out.println("ñalkjñfakj");
            System.out.println(rs.getString(1));
        }catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
}
