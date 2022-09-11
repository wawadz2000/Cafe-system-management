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
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    public Selling() {
        initComponents();
        GetSeller();
        FilterData();
        
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
        QtyTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CatList = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemTbl = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        PriceTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        NameTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Rstotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SellerList = new javax.swing.JComboBox<>();
        selling = new javax.swing.JLabel();
        items = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Accounts1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(173, 102, 9));

        jLabel2.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sell products");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seller");

        jLabel5.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name*");
        jLabel5.setToolTipText("required");

        jLabel6.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity*");
        jLabel6.setToolTipText("required");

        CatList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CatList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CatListItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Items list");
        jLabel7.setToolTipText("");

        ItemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "CATEGORY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemTbl.setRowHeight(29);
        ItemTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemTbl);

        AddBtn.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/coffee-machine.png"))); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        PriceTxt.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Unity Price*");
        jLabel9.setToolTipText("required");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTbl.setRowHeight(29);
        jScrollPane2.setViewportView(BillTbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bill");
        jLabel8.setToolTipText("");

        PrintBtn.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        PrintBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/printer.png"))); // NOI18N
        PrintBtn.setText("Print");
        PrintBtn.setToolTipText("print the bill");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        NameTxt.setEditable(false);
        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total : ");
        jLabel10.setToolTipText("");

        Rstotal.setFont(new java.awt.Font("Duncaster Regular", 0, 14)); // NOI18N
        Rstotal.setForeground(new java.awt.Color(255, 255, 255));
        Rstotal.setToolTipText("");
        Rstotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("X ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(PrintBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(CatList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(QtyTxt))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceTxt)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SellerList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rstotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rstotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(SellerList))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CatList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        selling.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        selling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/bill (1).png"))); // NOI18N
        selling.setText("bills");
        selling.setToolTipText("");
        selling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellingMouseClicked(evt);
            }
        });

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

        Account.setFont(new java.awt.Font("Duncaster Regular", 0, 36)); // NOI18N
        Account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/user (1).png"))); // NOI18N
        Account.setText("Accounts");
        Account.setToolTipText("");
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
        });

        Accounts1.setFont(new java.awt.Font("Duncaster Regular", 0, 18)); // NOI18N
        Accounts1.setText("Selling");
        Accounts1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(items)
                    .addComponent(logout)
                    .addComponent(selling)
                    .addComponent(Account)
                    .addComponent(Accounts1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Accounts1)
                .addGap(83, 83, 83)
                .addComponent(items)
                .addGap(18, 18, 18)
                .addComponent(selling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void CatListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CatListItemStateChanged
        FilterData();        // TODO add your handling code here:
    }//GEN-LAST:event_CatListItemStateChanged

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed
int Key;
    private void ItemTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTblMouseClicked
DefaultTableModel model = (DefaultTableModel) ItemTbl.getModel();
    int Index = ItemTbl.getSelectedRow();
    Key = Integer.valueOf(model.getValueAt(Index, 0).toString());
    NameTxt.setText(model.getValueAt(Index, 1).toString());
    PriceTxt.setText(model.getValueAt(Index, 3).toString());
    //SellerTxt.setText("user 1");
  //  CatList.setSelectedItem(model.getValueAt(Index,2));
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemTblMouseClicked
int RsTot=0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if (QtyTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please, Complete the required fields !");
        }
        else
        {
            
            int Total = Integer.valueOf(PriceTxt.getText())*Integer.valueOf(QtyTxt.getText());
             RsTot= RsTot+Total;
             Rstotal.setText(""+RsTot+" DA");
        DefaultTableModel  model = (DefaultTableModel) BillTbl.getModel();
        String Id = Integer.toString(model.getRowCount())+1;
        model.addRow(new Object[]{
        Id ,
        NameTxt.getText(),
        PriceTxt.getText(),
        QtyTxt.getText(),
        Total
        });
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked
    int BillNum;
        
    void CoutBill()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            coni=DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root", "");
            String querry = "select Max(ProdID) from producttbl";
            Statement count = coni.createStatement();
            rs1 = count.executeQuery(querry);
            rs1.next();
            BillNum=rs1.getInt(1)+1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    void GetSeller()
{
    try {
        coni = DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root","");
        St =coni.createStatement();
        String Querry = "Select * from sellertbl";
        rs= St.executeQuery(Querry);
        while (rs.next()) {            
            String Mycomp=rs.getString("SellerUsername");
            SellerList.addItem(Mycomp);
            
            
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }



}
    void InsertBill()
{
           
               String ProdName = NameTxt.getText().toString();
                int ProdPrice = Integer.valueOf(PriceTxt.getText());
                String ProdCat = CatList.getSelectedItem().toString();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                        try {
                Class.forName("com.mysql.jdbc.Driver");
                coni=DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root", "");
                pst = coni.prepareStatement("insert into billtbl values (?,?,?,?)");
                System.out.println(pst);
                pst.setInt(1, BillNum);
                pst.setString(2,SellerList.getSelectedItem().toString());
                pst.setString(3,now.toString());
                pst.setInt(4,RsTot);
                int row = pst.executeUpdate();
              JOptionPane.showMessageDialog(this, "bill added succefully");
                coni.close();
                CoutBill();
            }
            // TODO add your handling code here:
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
                
            } catch (SQLException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }
        
        
        





}
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        if (BillTbl.getRowCount() == 0) {
         
            JOptionPane.showMessageDialog(this, "please add items !!");
        }
        else
        {
        
            try {
                InsertBill();
                BillTbl.print();
                
                
                
            } catch (Exception e) {
              //  JOptionPane.showMessageDialog(this, e);

            }
        
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       int Reponse = JOptionPane.showConfirmDialog(this, "Do you really want to logout ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        new Login().setVisible(true);
        this.dispose();
                  // TODO add your handling code here:

        }        // TODO add your handling code here:

          // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsMouseClicked
               new Items().setVisible(true);
        this.dispose();
  


        // TODO add your handling code here:
    }//GEN-LAST:event_itemsMouseClicked

    private void sellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellingMouseClicked
new Bill().setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_sellingMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
int Reponse = JOptionPane.showConfirmDialog(this, "Do you want to close the program ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        
            System.exit(0);        // TODO add your handling code here:

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        new Login().setVisible(true);
        this.dispose(); 

        // TODO add your handling code here:
    }//GEN-LAST:event_AccountMouseClicked

    void FilterData()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            coni=DriverManager.getConnection("jdbc:mysql://localhost/coffeedb", "root", "");
            String Querry="select * from producttbl where ProdCat= '"+CatList.getSelectedItem().toString()+"'";
            System.out.println(Querry);
            Statement filter = coni.createStatement();
            rs = filter.executeQuery(Querry);
            ItemTbl.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
         
    }
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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Accounts1;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable BillTbl;
    private javax.swing.JComboBox<String> CatList;
    private javax.swing.JTable ItemTbl;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PriceTxt;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QtyTxt;
    private javax.swing.JLabel Rstotal;
    private javax.swing.JComboBox<String> SellerList;
    private javax.swing.JLabel items;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel selling;
    // End of variables declaration//GEN-END:variables
}
