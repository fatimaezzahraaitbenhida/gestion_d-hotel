import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reservations extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
ResultSet rs;
    public Reservations() {
         
        initComponents();
        this.setLocationRelativeTo(null);
        Connect();
        remplircomboxclient();
        remplircomboxchambre();
        TableReservations();
        getIdFromClientComboBox();
        getRoomNumberFromRoomComboBox() ;
        }
    public void remplircomboxclient(){
    String sql="select * from users.client"; // Assurez-vous que la table 'client' existe dans la base de données 'users'
    try{
        pst = con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            txtclient.addItem(rs.getString("idclient"));
        }
        System.out.println("Requête exécutée avec succès !");
    }catch(Exception e){
        e.printStackTrace();
    }
}
        public void remplircomboxchambre(){
    String sql="select * from users.chambre"; // Assurez-vous que la table 'client' existe dans la base de données 'users'
    try{
        pst = con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            txtchambre.addItem(rs.getString("numchambre"));
        }
        System.out.println("Requête exécutée avec succès !");
    }catch(Exception e){
        e.printStackTrace();
    }
}
public void Connect (){
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "toor");
        System.out.println("Connexion réussie à la base de données !");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtrechercher = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtchambre = new javax.swing.JComboBox<>();
        txtclient = new javax.swing.JComboBox<>();
        txtdatee = new javax.swing.JFormattedTextField();
        txtdates = new javax.swing.JFormattedTextField();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMATION RÉSERVATIONS");

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
        jLabel2.setText("Client ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Chambres ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Date Entrée et Sortie ");

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUPPRIMER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MODIFER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
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

        txtchambre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchambreActionPerformed(evt);
            }
        });

        txtclient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientActionPerformed(evt);
            }
        });

        try {
            txtdatee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            txtdates.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdates.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtdatee, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtdates, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel4)
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtclient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jLabel1))
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdatee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtclient, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
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

        setBounds(0, 0, 704, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int selectedColumn = jTable1.getSelectedColumn();
    if (selectedColumn == -1) {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner une colonne.", "Sélection requise", JOptionPane.WARNING_MESSAGE);
        return; // Arrête le processus si aucune colonne n'est sélectionnée
    }
        try {
        Connect(); 
        String query = "UPDATE users.reservation SET dateEntree=?, dateSortie=?, idClient=?, numChambre=? WHERE idReservation=?";
        PreparedStatement pst = con.prepareStatement(query);

        String newDateEntree = txtdatee.getText();
        String newDateSortie = txtdates.getText();
        int newIdClient = Integer.parseInt(txtclient.getSelectedItem().toString());
        int newNumChambre = Integer.parseInt(txtchambre.getSelectedItem().toString());
        
        int selectedRow = jTable1.getSelectedRow();
        int reservationIdToUpdate = Integer.parseInt(jTable1.getModel().getValueAt(selectedRow, 0).toString());

        // Vérification de la date de sortie antérieure à la date d'entrée
        if (newDateSortie.compareTo(newDateEntree) <= 0) {
            JOptionPane.showMessageDialog(null, "La date de sortie doit être postérieure à la date d'entrée", "Erreur de date", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Vérification que le numéro de chambre n'est pas associé à un client pour la même période
        if (reservationExistsForUpdate(newDateEntree, newDateSortie, newNumChambre, newIdClient, reservationIdToUpdate)) {
            JOptionPane.showMessageDialog(null, "Ce numéro de chambre est déjà réservé pour cette période", "Erreur de réservation", JOptionPane.ERROR_MESSAGE);
            return;
        }

        pst.setString(1, newDateEntree);
        pst.setString(2, newDateSortie);
        pst.setInt(3, newIdClient);
        pst.setInt(4, newNumChambre);
        pst.setInt(5, reservationIdToUpdate);

        pst.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null, "Réservation modifiée avec succès");
        updateReservationTable();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed
private void updateReservationTable() {
    try {
        Connect(); // Assurez-vous que votre connexion à la base de données est établie

        String query = "SELECT * FROM users.reservation";
        pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        // Vous devez remplacer jTable2 avec votre propre référence à votre tableau de réservations
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Nettoyer le tableau avant de le remplir à nouveau

        while (rs.next()) {
            // Récupérer les données de la base de données
            int idReservation = rs.getInt("idReservation");
            String dateEntree = rs.getString("dateEntree");
            String dateSortie = rs.getString("dateSortie");
            int idClient = rs.getInt("idClient");
            int numChambre = rs.getInt("numChambre");

            // Ajouter les données récupérées au tableau
            Object[] row = {idReservation, dateEntree, dateSortie, idClient, numChambre};
            model.addRow(row);
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private boolean reservationExistsForUpdate(String dateEntree, String dateSortie, int numChambre, int idClient, int reservationId) {
    boolean exists = false;
    try {
        Connect();
        String query = "SELECT * FROM users.reservation WHERE numchambre = ? " +
                       "AND ((dateEntree < ? AND dateSortie > ?) " +
                       "OR (dateEntree < ? AND dateSortie > ?) " +
                       "OR (dateEntree >= ? AND dateSortie <= ?)) " +
                       "AND dateSortie > dateEntree " +
                       "AND idClient != ? " +
                       "AND idReservation != ?"; // Exclure la réservation actuelle lors de la recherche

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, numChambre);
        pst.setString(2, dateSortie);
        pst.setString(3, dateEntree);
        pst.setString(4, dateEntree);
        pst.setString(5, dateSortie);
        pst.setString(6, dateEntree);
        pst.setString(7, dateSortie);
        pst.setInt(8, idClient);
        pst.setInt(9, reservationId);

        ResultSet rs = pst.executeQuery();
        exists = rs.next();

        rs.close();
        pst.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return exists;
}

    private void txtrechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrechercherActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Reservations.super.dispose();
        menu men= new menu ();
        men.setVisible(true);
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void txtchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchambreActionPerformed

    private void txtclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientActionPerformed
private int getIdFromClientComboBox() {
    int idClient = 0;
    String selectedClient = txtclient.getSelectedItem().toString();
    try {
        idClient = Integer.parseInt(selectedClient);
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    return idClient;
}

private int getRoomNumberFromRoomComboBox() {
    int numChambre = 0;
    String selectedRoom = txtchambre.getSelectedItem().toString();
    try {
        numChambre = Integer.parseInt(selectedRoom);
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    return numChambre;
}

public void TableReservations() {
    String[] columns = {"ID", "Date Entrée", "Date Sortie", "Idclient", "Numero chambre"}; // Colonnes de la table reservation
    DefaultTableModel model = new DefaultTableModel(null, columns);
    
    try {
        Connect();
        Statement st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM users.reservation");
        
        while (rs.next()) {
            String[] rowData = {
                rs.getString("idreservation"),
                rs.getString("dateEntree"),
                rs.getString("dateSortie"),
                rs.getString("idclient"),
                rs.getString("numchambre")
            };
            model.addRow(rowData);
        }
        
        jTable1.setModel(model); // Appliquez le modèle à votre JTable
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if (checkEmptyFields()) {
        JOptionPane.showMessageDialog(null, "Vérifiez que tous les champs sont remplis", "Données manquantes", JOptionPane.ERROR_MESSAGE);
    } else {
        String dateEntree = txtdatee.getText();
        String dateSortie = txtdates.getText();
        int idClient = getIdFromClientComboBox();
        int numChambre = getRoomNumberFromRoomComboBox();

        if (dateSortie.compareTo(dateEntree) <= 0) {
            JOptionPane.showMessageDialog(null, "La date de sortie doit être postérieure à la date d'entrée", "Erreur de date", JOptionPane.ERROR_MESSAGE);
        } else if (reservationExists(dateEntree, dateSortie, numChambre)) {
            JOptionPane.showMessageDialog(null, "Cette chambre est déjà réservée pour cette période", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            // Effectuer l'insertion car la réservation n'existe pas encore
            PreparedStatement ps;
            String query = "INSERT INTO users.reservation (dateEntree, dateSortie, idclient, numchambre) VALUES (?, ?, ?, ?)";
            try {
                ps = connectionDB.getConnection().prepareStatement(query);
                ps.setString(1, dateEntree);
                ps.setString(2, dateSortie);
                ps.setInt(3, idClient);
                ps.setInt(4, numChambre);

                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Réservation ajoutée", "Succès", JOptionPane.PLAIN_MESSAGE);
                    TableReservations(); // Mettre à jour votre table ici
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout de la réservation", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erreur de connexion à la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed
private boolean reservationExists(String dateEntree, String dateSortie, int numChambre) {
      boolean exists = false;
    try {
        Connection conn = connectionDB.getConnection();
        String query = "SELECT * FROM users.reservation WHERE ((dateEntree <= ? AND dateSortie >= ?) OR (dateEntree >= ? AND dateEntree <= ?)) AND numchambre = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, dateEntree);
        ps.setString(2, dateEntree);
        ps.setString(3, dateEntree);
        ps.setString(4, dateSortie);
        ps.setInt(5, numChambre);

        ResultSet rs = ps.executeQuery();
        exists = rs.next(); // Si une ligne est retournée, une réservation existe déjà pour cette chambre dans la période spécifiée
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return exists;
}

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
    int selectedRow = jTable1.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    String dateEntree = model.getValueAt(selectedRow, 1).toString(); // Remplacez 1 par l'index de votre colonne dateEntree
    String dateSortie = model.getValueAt(selectedRow, 2).toString(); // Remplacez 2 par l'index de votre colonne dateSortie
    String idClient = model.getValueAt(selectedRow, 3).toString(); // Remplacez 3 par l'index de votre colonne idClient
    String numChambre = model.getValueAt(selectedRow, 4).toString(); // Remplacez 4 par l'index de votre colonne numChambre
    txtdatee.setText(dateEntree);
    txtdates.setText(dateSortie);
    txtclient.setSelectedItem(idClient);
    txtchambre.setSelectedItem(numChambre);
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String query = "SELECT * FROM users.reservation WHERE dateEntree LIKE ? OR dateSortie LIKE ? ORDER BY dateEntree DESC, dateSortie DESC"; // Ajout de ORDER BY pour trier du plus récent au plus ancien
    try {
        Connect();
        pst = con.prepareStatement(query);
        pst.setString(1, "%" + txtrechercher.getText() + "%");
        pst.setString(2, "%" + txtrechercher.getText() + "%");
        rs = pst.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int columns = metaData.getColumnCount();
        DefaultTableModel model = new DefaultTableModel();

        for (int i = 1; i <= columns; i++) {
            model.addColumn(metaData.getColumnName(i));
        }

        while (rs.next()) {
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        jTable1.setModel(model);

        con.close();
    } catch(Exception e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int selectedColumn = jTable1.getSelectedColumn();
    if (selectedColumn == -1) {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner une colonne.", "Sélection requise", JOptionPane.WARNING_MESSAGE);
        return; // Arrête le processus si aucune colonne n'est sélectionnée
    }
        try {
        Connect();

        String dateEntree = txtdatee.getText();
        String dateSortie = txtdates.getText();
        int idClient = getIdFromClientComboBox();
        int numChambre = getRoomNumberFromRoomComboBox();

        PreparedStatement pst = con.prepareStatement("DELETE FROM users.reservation WHERE dateEntree = ? AND dateSortie = ? AND idClient = ? AND numChambre = ?");
        pst.setString(1, dateEntree);
        pst.setString(2, dateSortie);
        pst.setInt(3, idClient);
        pst.setInt(4, numChambre);

        int rowsAffected = pst.executeUpdate();
        con.close();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Réservation supprimée");
            updateReservationTable(); // Mettre à jour la table de réservations après la suppression
        } else {
            JOptionPane.showMessageDialog(null, "Aucune réservation correspondante trouvée", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.MAGENTA);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.MAGENTA);
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
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.MAGENTA);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblMinimize.setBorder(borderLabel);
        lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

private boolean checkEmptyFields() {
    String dateEntree = txtdatee.getText().trim(); // Récupérez la date d'entrée depuis votre champ
    String dateSortie = txtdates.getText().trim(); // Récupérez la date de sortie depuis votre champ
    int idClient = getIdFromClientComboBox(); // Récupérez l'ID du client sélectionné depuis votre JComboBox
    int numChambre = getRoomNumberFromRoomComboBox(); // Récupérez le numéro de la chambre depuis votre JComboBox

return dateEntree.isEmpty() || dateSortie.isEmpty() || idClient == 0 || numChambre == 0;
}


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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Reservations Reservations= new Reservations();
                new Reservations().setVisible(true);
                 Reservations.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JComboBox<String> txtchambre;
    private javax.swing.JComboBox<String> txtclient;
    private javax.swing.JFormattedTextField txtdatee;
    private javax.swing.JFormattedTextField txtdates;
    private javax.swing.JTextField txtrechercher;
    // End of variables declaration//GEN-END:variables
}
