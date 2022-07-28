package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class zPruebas {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            i -= 1;
        }
        
        
//        try {
//            Connection c = PersistenciaConexion.Conectar();
//            PreparedStatement ps = c.prepareStatement("SELECT * FROM adn.afiliados;");
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//                
//            }
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//            e.printStackTrace();
//        }
    }

}
