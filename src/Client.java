import java.sql.*;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Client extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
ResultSet rs;
  DefaultTableModel model;
    public Client() {
        initComponents();
         this.setLocationRelativeTo(null);
         Table();
    }
public void Connect (){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "toor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtrechercher = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMATION CLIENTS");

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nom du client ");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Téléphone ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Adresse ");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maroc", "France", "Allemagne", "Espagne", "Bellgique", "Canada", "Autres ..." }));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUPPRIMER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MODIFER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("AJOUTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RECHERCHER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtrechercher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtrechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrechercherActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Retour en Arrière");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

        jButton6.setBackground(new java.awt.Color(102, 0, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("EXPORT EXCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 768, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 904, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("specify a file save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection==JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            try{
                FileWriter fw= new FileWriter(fileToSave);
                BufferedWriter bw= new BufferedWriter(fw);
                for(int i=0;i<jTable1.getRowCount();i++){
                    for(int j=0;j<jTable1.getColumnCount();j++){
                        bw.write(jTable1.getValueAt(i,j).toString());
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Enregistrement reçue ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            }catch(IOException ex){
                JOptionPane.showMessageDialog(this, "succes","error message",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.MAGENTA);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.MAGENTA);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Client.super.dispose();
        menu men= new menu ();
        men.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void txtrechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrechercherActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if (jTable1.getSelectedColumn() == -1) {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner une colonne pour la recherche.", "Sélection requise", JOptionPane.WARNING_MESSAGE);
    } else {
        String query = "SELECT * FROM users.client WHERE nom LIKE ?";
        try {
            Connect();
            pst = con.prepareStatement(query);
            pst.setString(1, "%" + txtrechercher.getText() + "%"); // Ajout du caractère joker % à la fin du texte recherché
            rs = pst.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columns = metaData.getColumnCount();
            DefaultTableModel model = new DefaultTableModel();

            // Ajout des colonnes au modèle de tableau
            for (int i = 1; i <= columns; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Ajout des données du ResultSet au modèle de tableau
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Appliquer le modèle à la JTable
            jTable1.setModel(model);

            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (checkEmptyFields()) {
        JOptionPane.showMessageDialog(null, "Vérifiez que tous les champs sont remplis", "Données manquantes", JOptionPane.ERROR_MESSAGE);
    } else {
        String nom = txtName.getText();
        String telephone = txtPhone.getText();
        String adresse = txtAddress.getSelectedItem().toString();

        if (clientExists(nom, telephone, adresse)) {
            JOptionPane.showMessageDialog(null, "Ce client existe déjà", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (clientExistsByPhone(telephone)) {
            JOptionPane.showMessageDialog(null, "Ce numéro de téléphone est déjà utilisé par un autre client", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection conn = connectionDB.getConnection();
                String query = "INSERT INTO users.client (nom, telephone, adresse) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, nom);
                ps.setString(2, telephone);
                ps.setString(3, adresse);

                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Client ajouté", "Succès", JOptionPane.PLAIN_MESSAGE);
                    Table();
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout du client", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur de connexion à la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed
private boolean clientExists(String nom, String telephone, String adresse) {
    boolean exists = false;
    try {
        Connection conn = connectionDB.getConnection();
        String query = "SELECT * FROM users.client WHERE nom = ? AND telephone = ? AND adresse = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nom);
        ps.setString(2, telephone);
        ps.setString(3, adresse);

        ResultSet rs = ps.executeQuery();
        exists = rs.next(); // Si une ligne est retournée, le client existe déjà
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return exists;
}

private boolean clientExistsByPhone(String telephone) {
    boolean exists = false;
    try {
        Connection conn = connectionDB.getConnection();
        String query = "SELECT telephone FROM users.client WHERE telephone = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, telephone);

        ResultSet rs = ps.executeQuery();
        exists = rs.next(); // Si une ligne est retournée, le numéro de téléphone est déjà utilisé par un autre client
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return exists;
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
        Connect();
        
        // Récupérer la ligne sélectionnée dans la JTable
        int selectedRow = jTable1.getSelectedRow();
        
        // Vérifier si une ligne est sélectionnée
        if (selectedRow != -1) {
            // Récupérer l'ID client depuis la première colonne (colonne 0) de la JTable
            int idClientToUpdate = Integer.parseInt(jTable1.getModel().getValueAt(selectedRow, 0).toString());
            
            // Récupérer les nouvelles valeurs depuis vos champs de texte ou autres composants
            String newNom = txtName.getText();
            String newPhone = txtPhone.getText();
            String newAddress = txtAddress.getSelectedItem().toString();
            
            // Préparer la requête de mise à jour avec les nouvelles valeurs
            String query = "UPDATE users.client SET nom=?, telephone=?, adresse=? WHERE idclient=?";
            pst = con.prepareStatement(query);
            pst.setString(1, newNom);
            pst.setString(2, newPhone);
            pst.setString(3, newAddress);
            pst.setInt(4, idClientToUpdate);
            
            // Exécuter la requête de mise à jour
            pst.executeUpdate();
            
            // Fermer la connexion et afficher un message de succès
            con.close();
            JOptionPane.showMessageDialog(null, "Client modifié avec succès");
            
            // Mettre à jour la ligne modifiée dans la JTable
            updateRowInTable(selectedRow, new Object[]{idClientToUpdate, newNom, newPhone, newAddress}); 
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un client à modifier");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed
private void updateRowInTable(int row, Object[] newData) {
    for (int i = 0; i < newData.length; i++) {
        jTable1.getModel().setValueAt(newData[i], row, i);
    }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        Connect();
        
        // Récupérer la ligne sélectionnée dans la JTable
        int selectedRow = jTable1.getSelectedRow();
        
        // Vérifier si une ligne est sélectionnée
        if (selectedRow != -1) {
            // Récupérer l'ID client depuis la première colonne (colonne 0) de la JTable
            int idClientToDelete = Integer.parseInt(jTable1.getModel().getValueAt(selectedRow, 0).toString());
            
            PreparedStatement pst = con.prepareStatement("DELETE FROM client WHERE idclient = ?");
            pst.setInt(1, idClientToDelete);

            int rowsAffected = pst.executeUpdate();
            con.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Client supprimé");
                Table();
            } else {
                JOptionPane.showMessageDialog(null, "Aucun client correspondant trouvé pour suppression");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un client à supprimer");
        }
    } catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        txtName.setText(model.getValueAt(i, 1).toString());
        txtPhone.setText(model.getValueAt(i, 2).toString());
        txtAddress.setSelectedItem(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable1MouseReleased

                                 

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {                                  
        char key = evt.getKeyChar();
        if(!Character.isDigit(key)){
            evt.consume();
        }
    }                                 

    
// Méthode pour obtenir le dernier ID client
private int getLatestClientId() throws SQLException {
    int latestClientId = 0;
    
    // Établir la connexion à la base de données
    Connect();

    // Créer une requête pour obtenir le dernier ID client
    String query = "SELECT MAX(idclient) FROM users.client";

    // Créer un objet Statement
    Statement statement = con.createStatement();

    // Exécuter la requête et obtenir le résultat
    ResultSet resultSet = statement.executeQuery(query);

    // Récupérer le dernier ID client
    if (resultSet.next()) {
        latestClientId = resultSet.getInt(1);
    }

    // Fermer les ressources
    resultSet.close();
    statement.close();
    con.close();

    return latestClientId;
}
  public void Table() {
    String[] columns = {"ID", "Nom", "Téléphone", "Adresse"};
    DefaultTableModel model = new DefaultTableModel(null, columns);
    
    try {
        Connect();
        Statement st = con.createStatement();
        rs = st.executeQuery("SELECT idclient, nom, telephone, adresse FROM users.client");
        
        while (rs.next()) {
            String[] rowData = {
                rs.getString("idclient"),
                rs.getString("nom"),
                rs.getString("telephone"),
                rs.getString("adresse")
            };
            model.addRow(rowData);
        }
        
        jTable1.setModel(model);
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

 private boolean checkEmptyFields() {
   String n = txtName.getText().trim();
        String p = txtPhone.getText().trim();
    String a = txtAddress.getSelectedItem().toString().trim();
    return n.isEmpty() || p.isEmpty()|| a.isEmpty();
}

     /* @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   Client Client= new Client();
                new Client().setVisible(true);
                 Client.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JComboBox<String> txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtrechercher;
    // End of variables declaration//GEN-END:variables

    private int getIdToUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
