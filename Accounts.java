/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.system.management;

import com.mysql.fabric.xmlrpc.base.Data;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author wawad
 */
public class Accounts extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    public Accounts() {
        initComponents();
        SelectMed();
    }
 Connection coni,coni1;
    PreparedStatement pst,pst1;
    ResultSet  rs,rs1;
    Statement St;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IdTxt = new javax.swing.JTextField();
        NameTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        PassTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        GenderList = new javax.swing.JComboBox<>();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        AcountsTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        items = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        selling1 = new javax.swing.JLabel();
        Accounts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(173, 102, 9));

        jLabel2.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seller management");
        jLabel2.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("X ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID*");

        jLabel5.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username*");

        jLabel6.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age*");

        jLabel7.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone*");

        jLabel9.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password*");

        jLabel10.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender*");

        IdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTxtActionPerformed(evt);
            }
        });

        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
            }
        });

        AgeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTxtActionPerformed(evt);
            }
        });

        GenderList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        UpdateBtn.setFont(new java.awt.Font("Duncaster Regular", 0, 24)); // NOI18N
        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/exchange.png"))); // NOI18N
        UpdateBtn.setText("update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Duncaster Regular", 0, 24)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/add.png"))); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        RemoveBtn.setFont(new java.awt.Font("Duncaster Regular", 0, 24)); // NOI18N
        RemoveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/delete.png"))); // NOI18N
        RemoveBtn.setText("remove");
        RemoveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveBtnMouseClicked(evt);
            }
        });
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        AcountsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USERNAME", "GENDER", "PHONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AcountsTbl.setRowHeight(29);
        AcountsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcountsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AcountsTbl);

        jLabel1.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        jLabel1.setText("Seller list");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("X ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(58, 58, 58)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(NameTxt))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AddBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(UpdateBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(RemoveBtn))
                                .addComponent(PassTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)
                        .addGap(53, 53, 53)))
                .addComponent(jLabel3))
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn)
                    .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        items.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        items.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/products (1).png"))); // NOI18N
        items.setText("ITEMS");
        items.setToolTipText("");
        items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        selling1.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        selling1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/coffee-machine (1).png"))); // NOI18N
        selling1.setText("SELLING");
        selling1.setToolTipText("");
        selling1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selling1MouseClicked(evt);
            }
        });

        Accounts.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        Accounts.setText("Accounts");
        Accounts.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(items)
                            .addComponent(logout)
                            .addComponent(selling1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Accounts, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Accounts)
                .addGap(40, 40, 40)
                .addComponent(items)
                .addGap(18, 18, 18)
                .addComponent(selling1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       int Reponse = JOptionPane.showConfirmDialog(this, "Do you really want to logout ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        
new Login().setVisible(true);
        this.dispose();
        }     
  
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsMouseClicked
new Items().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_itemsMouseClicked

    private void selling1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selling1MouseClicked
    new Selling().setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_selling1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
int Reponse = JOptionPane.showConfirmDialog(this, "Do you want to close the program ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        
            System.exit(0);        // TODO add your handling code here:

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void AgeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTxtActionPerformed

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed

    private void IdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTxtActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AcountsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcountsTblMouseClicked
DefaultTableModel model = (DefaultTableModel)AcountsTbl.getModel();
        int Index = AcountsTbl.getSelectedRow();
        IdTxt.setText(model.getValueAt(Index, 0).toString());
        String Id = model.getValueAt(Index, 0).toString();
        NameTxt.setText(model.getValueAt(Index, 1).toString());
        PhoneTxt.setText(model.getValueAt(Index, 2).toString());
        GenderList.setSelectedItem(model.getValueAt(Index, 3).toString());
        try {
        coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
        St =coni.createStatement();
        String Querry = "Select SellerAge, SellerPassword from sellertbl where SellerID = "+Id;
        rs= St.executeQuery(Querry);
        while (rs.next()) {            
            String MyAge=rs.getString("SellerAge");
            String Mypass=rs.getString("SellerPassword");
            AgeTxt.setText(MyAge);
            PassTxt.setText(Mypass);
            
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AcountsTblMouseClicked
public void SelectMed()
    {
        try {
            coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
            St =coni.createStatement();
            rs= St.executeQuery("Select SellerID, SellerUsername, Sellerphone, SellerGender from sellertbl");
            AcountsTbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
   
    
    
    
    
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
            
            //Fdate = MedFab.getDate();
            String SellerId = IdTxt.getText();
            String SellerName = NameTxt.getText();
            String SellerAge = AgeTxt.getText();
            String SellerPhone = PhoneTxt.getText();
            String SellerPass = PassTxt.getText();
            
        try {
            if (SellerId==null||SellerName.isEmpty()||SellerAge.isEmpty()||SellerPhone.isEmpty()||SellerPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Complete all medicine infomations !!");
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
           //Con = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmadb","wawadz2000","159874236");
            PreparedStatement Add = coni.prepareStatement("insert into sellertbl values(?,?,?,?,?,?)");
            Add.setInt(1, Integer.valueOf(SellerId));
            Add.setString(2, SellerName);
            Add.setInt(3,Integer.valueOf(SellerAge));
            Add.setInt(4, Integer.valueOf(SellerPhone));
            Add.setString(5, SellerPass);
           // Add.setDate(5, MyFabDate);
           // Add.setDate(6, MyExpDate);
            Add.setString(6, GenderList.getSelectedItem().toString());
            int row = Add.executeUpdate();
            AcountsTbl.updateUI();
            JOptionPane.showMessageDialog(this, "Seller has been added seccufuly !");
            
            
             coni.close();
            SelectMed();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex);
        }
        
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked

if (IdTxt.getText().isEmpty()||NameTxt.getText().isEmpty()||AgeTxt.getText().isEmpty()||PhoneTxt.getText().isEmpty()||PassTxt.getText().isEmpty()) 
        {
            
            JOptionPane.showMessageDialog(this, "Missing informations, Admin Code is required !!");
        }
else 
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
                
           
           
                String UpdateQuerry = "Update sellertbl set SellerUsername = '"+NameTxt.getText()
                        +"',SellerAge = "+AgeTxt.getText()
                        +",SellerPhone = '"+PhoneTxt.getText()
                        +"'"+",SellerPassword = '"+PassTxt.getText()
                        +"'"+ ",SellerGender = '"+GenderList.getSelectedItem().toString()
                        +"'"+" Where SellerID = "+IdTxt.getText();
             //   System.out.println(UpdateQuerry);
                Statement Update = coni.createStatement();
                Update.executeUpdate(UpdateQuerry);
                JOptionPane.showMessageDialog(this, "Seller has been updated seccufuly !");
                SelectMed();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex);
            }




        }         // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void RemoveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveBtnMouseClicked
        if (IdTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Seller to be deleted !");
        } else {
            try {
                coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
                String Id = IdTxt.getText();
                String Querry = "Delete from sellertbl where SellerID="+Id;
                Statement Remove = coni.createStatement();
                Remove.executeUpdate(Querry);
                SelectMed();
                JOptionPane.showMessageDialog(this, " Seller deleted seccussfully !");
            } catch (SQLException ex) {
                ex.printStackTrace();
               JOptionPane.showMessageDialog(this, ex);

            }
            
            
            
            
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBtnMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
int Reponse = JOptionPane.showConfirmDialog(this, "Do you want to close the program ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        
            System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked
int Key;
    
    
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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accounts().setVisible(true);
                
            }
            
        });
    }

   /* void ShowData()
    {                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            coni=DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root", "");
            String Querry="select * from billtbl";
            Statement show = coni.createStatement();
            rs=show.executeQuery(Querry);
            SellsTbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        
        
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accounts;
    private javax.swing.JTable AcountsTbl;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JComboBox<String> GenderList;
    private javax.swing.JTextField IdTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel selling1;
    // End of variables declaration//GEN-END:variables
}
