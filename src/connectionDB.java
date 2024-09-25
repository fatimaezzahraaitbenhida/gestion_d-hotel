import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connectionDB {
    public static Connection getConnection(){
        Connection connection =  null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","toor");
        }
        catch(SQLException ex){
            ex.printStackTrace(); // Afficher les détails de l'exception pour le débogage
    JOptionPane.showMessageDialog(null, "Connexion faible : " + ex.getMessage()); }
        return connection;
    }

    static int executerMiseAJr(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
