package persistencia;

import excepciones.ExcepcionConectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class zPruebas {

    public static void main(String[] args) {

        try {
            Connection c = PersistenciaConexion.Conectar();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM adn.usuarios;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

}
