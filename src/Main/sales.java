
package Main;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class sales extends javax.swing.JFrame {

    public sales() {
        initComponents();
        Border nextborder=BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(25,10,0));
        titlepanel.setBorder(nextborder);
           Border buttonBorder=BorderFactory.createMatteBorder(3, 3, 3, 3,new Color(255,255,255));
        txtadd.setBorder(buttonBorder);
        txtremove.setBorder(buttonBorder);
        txtedit.setBorder(buttonBorder);
        filltablebyproperty();
         filltableclients();
         filltablesalelist();
       txtproperty.setRowHeight(40);
        txtproperty.setSelectionBackground(new Color(27,120,77));
        txtclient.setRowHeight(40);
        txtclient.setSelectionBackground(new Color(235,125,22));
           txtsale.setSelectionBackground(new Color(20,120,12));
        txtproperty.getColumnModel().getColumn(2).setPreferredWidth(140);
    }
      public void filltablebyproperty(){
        p_property property=new p_property();
        ArrayList<p_property>propertylist=property.propertieslist();
        String[] colname={"Id","Owner","price"};
       
        Object[][] row=new Object[propertylist.size()][3]; 
        for(int i=0;i<propertylist.size();i++){
            row[i][0]=propertylist.get(i).getId();
            row[i][1]=propertylist.get(i).getOwnerid();
            row[i][2]=propertylist.get(i).getPrice();
        }
        
        DefaultTableModel model=new DefaultTableModel(row,colname);
        txtproperty.setModel(model);
        txtproperty.getColumnModel().getColumn(0).setPreferredWidth(40);
    }
      
      public void filltableclients(){
        
        p_clients clients=new p_clients();
        
        ArrayList<p_clients>clientlist=clients.clientlist();
        
        String[] colname={"Id","First Name","Last Name"};
        
        Object[][] row=new Object[clientlist.size()][3];
        
        for(int i=0;i<clientlist.size();i++){
            row[i][0]=clientlist.get(i).getid();
            row[i][1]=clientlist.get(i).getfname();
            row[i][2]=clientlist.get(i).getlname();
        }
        DefaultTableModel model=new DefaultTableModel(row,colname);
        txtclient.setModel(model);
        txtclient.setRowHeight(40);
        txtclient.setSelectionBackground(new Color(27,150,77));
        txtclient.getColumnModel().getColumn(0).setPreferredWidth(40);
      }
        public void filltablesalelist(){
        
        p_sale sales=new p_sale();
        
        ArrayList<p_sale>saleslist=sales.salelist();
        
        String[] colname={"Id","ProperId","ClientId","Price","Date"};
        
        Object[][] row=new Object[saleslist.size()][5];
        
        for(int i=0;i<saleslist.size();i++){
            row[i][0]=saleslist.get(i).getId();
            row[i][1]=saleslist.get(i).getPropertyid();
            row[i][2]=saleslist.get(i).getClientid();
            row[i][3]=saleslist.get(i).getFinalprice();
            row[i][4]=saleslist.get(i).getSellingDate();
        }
        DefaultTableModel model=new DefaultTableModel(row,colname);
        txtsale.setModel(model);
        txtsale.setRowHeight(40);
        txtsale.setSelectionBackground(new Color(27,150,77));
        txtsale.getColumnModel().getColumn(3).setPreferredWidth(140);
        txtsale.getColumnModel().getColumn(4).setPreferredWidth(140);
        txtsale.getColumnModel().getColumn(1).setPreferredWidth(100);
        txtsale.getColumnModel().getColumn(2).setPreferredWidth(100);
        txtsale.getColumnModel().getColumn(0).setPreferredWidth(40);
      }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpropertyid = new javax.swing.JTextField();
        txtadd = new javax.swing.JButton();
        txtremove = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtproperty = new javax.swing.JTable();
        txtclientid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfinal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtclient = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtsale = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        refreash_sale = new javax.swing.JButton();
        refreash_property = new javax.swing.JButton();
        refreash_client = new javax.swing.JButton();
        txtpropertyadd = new javax.swing.JButton();
        txtclientadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        titlepanel.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales");

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Property ID:");

        txtid.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N

        txtpropertyid.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N

        txtadd.setBackground(new java.awt.Color(0, 0, 255));
        txtadd.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtadd.setForeground(new java.awt.Color(255, 255, 255));
        txtadd.setText("ADD");
        txtadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        txtremove.setBackground(new java.awt.Color(153, 0, 0));
        txtremove.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtremove.setForeground(new java.awt.Color(255, 255, 255));
        txtremove.setText("Removie");
        txtremove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremoveActionPerformed(evt);
            }
        });

        txtedit.setBackground(new java.awt.Color(0, 204, 0));
        txtedit.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtedit.setForeground(new java.awt.Color(255, 255, 255));
        txtedit.setText("Edit");
        txtedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });

        txtproperty.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        txtproperty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        txtproperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpropertyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtproperty);

        txtclientid.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Client ID:");

        txtfinal.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Final Price:");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sale Date:");

        txtdate.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Property List:");

        txtclient.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        txtclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        txtclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtclientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtclient);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Client List:");

        txtsale.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        txtsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        txtsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsaleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(txtsale);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sale List:");

        refreash_sale.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        refreash_sale.setText("Refresh");
        refreash_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreash_saleActionPerformed(evt);
            }
        });

        refreash_property.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        refreash_property.setText("Refresh");
        refreash_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreash_propertyActionPerformed(evt);
            }
        });

        refreash_client.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        refreash_client.setText("Refresh");
        refreash_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreash_clientActionPerformed(evt);
            }
        });

        txtpropertyadd.setBackground(new java.awt.Color(0, 102, 153));
        txtpropertyadd.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        txtpropertyadd.setForeground(new java.awt.Color(255, 255, 255));
        txtpropertyadd.setText("Add New property");
        txtpropertyadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtpropertyadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpropertyaddActionPerformed(evt);
            }
        });

        txtclientadd.setBackground(new java.awt.Color(102, 102, 102));
        txtclientadd.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtclientadd.setForeground(new java.awt.Color(255, 255, 255));
        txtclientadd.setText("Add New Client");
        txtclientadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtclientadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtclientid, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtpropertyid, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtremove, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtedit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(refreash_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(refreash_client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtclientadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(refreash_property, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpropertyadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpropertyid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtclientid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtedit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtremove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreash_property)
                            .addComponent(refreash_sale)
                            .addComponent(refreash_client))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtclientadd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpropertyadd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        //int id=Integer.valueOf(txtid.getText());
      try{
        int propertyid=Integer.valueOf(txtpropertyid.getText());
      int clientid=Integer.valueOf(txtclientid.getText());
    String price=txtfinal.getText();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    String sellingDate=dateFormat.format(txtdate.getDate());
    p_sale sale=new p_sale(0,propertyid,clientid,price,sellingDate);
    if(new p_sale().AddNewsale(sale)){
        JOptionPane.showMessageDialog(null, "new Sale are being added ", "Add sale", 1);
        //filltablesalelist();
    }else{
        JOptionPane.showMessageDialog(null, "new Sale aren't added ", "Add sale", 2);
         }
      }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()+"error occured", "Add sale", 2);
      }
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremoveActionPerformed
        // TODO add your handling code here:
               int id=Integer.valueOf(txtid.getText());
    try{
    if(new p_sale().deletesale(id)){
        JOptionPane.showMessageDialog(null, "Sale  information are Deleted", "Delete sale", 1);
       // filltablesalelist();
    }else{
        JOptionPane.showMessageDialog(null, " Sale information aren't Deleted", "Delete sale", 2);
         }
    }catch(Exception ex){
         JOptionPane.showMessageDialog(null, " Invalid id", "Error Occured", 2);
    }
       
    }//GEN-LAST:event_txtremoveActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
         try{ 
        int id=Integer.valueOf(txtid.getText());
      int propertyid=Integer.valueOf(txtpropertyid.getText());
      int clientid=Integer.valueOf(txtclientid.getText());
    String price=txtfinal.getText();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    String sellingDate=dateFormat.format(txtdate.getDate());
    p_sale sale=new p_sale(id,propertyid,clientid,price,sellingDate);
    if(new p_sale().editsale(sale)){
        JOptionPane.showMessageDialog(null, "Sale update information are added ", "Edit sale", 1);
       // filltablesalelist();
    }else{
        JOptionPane.showMessageDialog(null, " Sale information aren't updated", "Edit sale", 2);
         }
         }catch(Exception Ex){
            JOptionPane.showMessageDialog(null, " innvalid Occurance \n please write Correct information", "Error", 2); 
         }
     
    }//GEN-LAST:event_txteditActionPerformed

    private void txtpropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpropertyMouseClicked
        // TODO add your handling code here:
        int selectrowindex=txtproperty.getSelectedRow();
        //txtid.setText(txtproperty.getValueAt(selectrowindex,0).toString());
        txtpropertyid.setText(txtproperty.getValueAt(selectrowindex,0).toString());
       
        txtfinal.setText(txtproperty.getValueAt(selectrowindex,2).toString());
       
    }//GEN-LAST:event_txtpropertyMouseClicked

    private void txtclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtclientMouseClicked
        // TODO add your handling code here:
        int selectrowindex=txtclient.getSelectedRow();
       
         txtclientid.setText(txtclient.getValueAt(selectrowindex,0).toString());
    }//GEN-LAST:event_txtclientMouseClicked

    private void txtsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsaleMouseClicked
        
        try {
             int selectrowindex=txtsale.getSelectedRow();
        txtid.setText(txtsale.getValueAt(selectrowindex,0).toString());
        txtpropertyid.setText(txtsale.getValueAt(selectrowindex,1).toString());
        txtclientid.setText(txtsale.getValueAt(selectrowindex,2).toString());
        txtfinal.setText(txtsale.getValueAt(selectrowindex,3).toString());
     Date saledate;
            saledate = new SimpleDateFormat("yyyy-MM-dd").parse(txtsale.getValueAt(selectrowindex, 4).toString());
             txtdate.setDate(saledate);
        } catch (ParseException ex) {
            Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_txtsaleMouseClicked

    private void txtpropertyaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpropertyaddActionPerformed
                     property propertyapp=new property();
                    propertyapp.setVisible(true);
                    propertyapp.pack();
                    propertyapp.setLocationRelativeTo(null);
                    propertyapp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_txtpropertyaddActionPerformed

    private void txtclientaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientaddActionPerformed
        // TODO add your handling code here:
        ClientsTy propertyapp=new ClientsTy();
                    propertyapp.setVisible(true);
                    propertyapp.pack();
                    propertyapp.setLocationRelativeTo(null);
                    propertyapp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_txtclientaddActionPerformed

    private void refreash_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreash_saleActionPerformed
      filltablesalelist();
    }//GEN-LAST:event_refreash_saleActionPerformed

    private void refreash_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreash_clientActionPerformed
        // TODO add your handling code here:
        filltableclients();
    }//GEN-LAST:event_refreash_clientActionPerformed

    private void refreash_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreash_propertyActionPerformed
        // TODO add your handling code here:
        filltablebyproperty();
    }//GEN-LAST:event_refreash_propertyActionPerformed

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
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton refreash_client;
    private javax.swing.JButton refreash_property;
    private javax.swing.JButton refreash_sale;
    private javax.swing.JPanel titlepanel;
    private javax.swing.JButton txtadd;
    private javax.swing.JTable txtclient;
    private javax.swing.JButton txtclientadd;
    private javax.swing.JTextField txtclientid;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JButton txtedit;
    private javax.swing.JTextField txtfinal;
    private javax.swing.JTextField txtid;
    private javax.swing.JTable txtproperty;
    private javax.swing.JButton txtpropertyadd;
    private javax.swing.JTextField txtpropertyid;
    private javax.swing.JButton txtremove;
    private javax.swing.JTable txtsale;
    // End of variables declaration//GEN-END:variables
}
