import java.sql.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
        
           Border borderPanel = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white);
        panelRegister.setBorder(borderPanel);
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblClose.setBorder(borderLabel);
        lblMinimize.setBorder(borderLabel);
        Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        txtName.setBorder(borderTextField);
        txtUsername.setBorder(borderTextField);
        txtPassword.setBorder(borderTextField);
        txtConfirmPassword.setBorder(borderTextField);
        txtPhone.setBorder(borderTextField);
        txtMail.setBorder(borderTextField);
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        panelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtype = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jTextField7.setText("jTextField2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(0, 153, 153));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("S'INSCRIRE");
        panelRegister.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 650, 40));

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setPreferredSize(new java.awt.Dimension(20, 20));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        panelRegister.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, -1));

        lblMinimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setPreferredSize(new java.awt.Dimension(20, 20));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        panelRegister.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("S'INSCRIRE");
        panelRegister.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 650, 40));

        getContentPane().add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nom_utilisateur");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Mot_de_passe");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Confirmer mdp");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Téléphone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        txtype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtype.setForeground(new java.awt.Color(51, 51, 51));
        txtype.setText("Type");
        getContentPane().add(txtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 153, 153));
        btnRegister.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Enregistrer");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 180, 30));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, -1));

        lblLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        lblLogin.setText(">>Déjà tu as un Compte ! Se Connecter");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 240, 40));

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbMale.setText("Masculin");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbFemale.setText("Féminin");
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, -1));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 170, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, -1));

        type.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Utilisateur" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Sex");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(checkEmptyFields() ){
            JOptionPane.showMessageDialog(null, "Vérifier que tous les champs sont remplis ", "Missing data ",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String name =txtName.getText();
            String username =txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String confirmpassword = String.valueOf(txtConfirmPassword.getPassword());
            String phone =txtPhone.getText();
            String mail =txtMail.getText();
             String t = type.getSelectedItem().toString();
            String gender = "Masculin";
            if(rbFemale.isSelected())
                gender = "Féminin";
            if(!matchingPasswords(password,confirmpassword)){
                JOptionPane.showMessageDialog(null, "Les deux mot de passe ne sont pas compatibles", "Passwords",JOptionPane.ERROR_MESSAGE);
            }
            else{
             PreparedStatement ps; // Correction de la déclaration
String query = "INSERT INTO users.users(username,name,password,phone,mail,gender,type) VALUES (?,?,?,?,?,?,?)";
try {
    ps = connectionDB.getConnection().prepareStatement(query);
    ps.setString(1, username);
    ps.setString(2, name);
    ps.setString(3, password);
    ps.setString(4, phone);
    ps.setString(5, mail);
    ps.setString(6, gender);
     ps.setString(7, t);
    if(!checkUser()){
       if (ps.executeUpdate() != 0) {
        JOptionPane.showMessageDialog(null, "Votre compte a été créé", "Success", JOptionPane.PLAIN_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Création du compte erronée", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Connexion à la Base de Données erronée", "Error", JOptionPane.ERROR_MESSAGE);
}
            }
                
        }
    }//GEN-LAST:event_btnRegisterActionPerformed
private boolean checkEmptyFields() {
    if (txtName.getText().equals("") || txtUsername.getText().equals("") || String.valueOf(txtPassword.getPassword()).equals("")
            || String.valueOf(txtConfirmPassword.getPassword()).equals("") || txtPhone.getText().equals("") || txtMail.getText().equals("")) {
        return true;
    } else {
        return false;
    }
}
private boolean matchingPasswords(String p1,String p2){
    if(p1.equals(p2))
        return true;
    else
        return false;
}
private boolean checkUser(){
    PreparedStatement ps;
    ResultSet rs;
    boolean userExist = false;
    String query = "SELECT name ,username FROM users.users WHERE username = ?";
    try{
        ps = connectionDB.getConnection().prepareStatement(query);
       
        ps.setString(1, txtUsername.getText());
        rs = ps.executeQuery();
        if (rs.next()){
            userExist= true;
           JOptionPane.showMessageDialog(null, "Le nom de l utilisateur deja existe", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    catch(Exception ex){
      JOptionPane.showMessageDialog(null, "Pas de connextion a la base de donnee", "ERROR",JOptionPane.ERROR_MESSAGE);  
    }
    return userExist;
}
    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
            btnRegister.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
          btnRegister.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        login login = new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
       char key = evt.getKeyChar();
       if(!Character.isDigit(key)){
           evt.consume();
       }
    }//GEN-LAST:event_txtPhoneKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 register register= new register();
                new register().setVisible(true);
                 register.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtype;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
