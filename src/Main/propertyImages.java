/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class propertyImages extends javax.swing.JFrame {

    /**
     * Creates new form propertyImages
     */
    
     p_type type=new p_type();
     HashMap<String,Integer>map=type.getTypesMap();
     String property_image_path="";
     int propertyid=0;
      
    public propertyImages() {
        initComponents();
          Border titleBorder=BorderFactory.createMatteBorder(0, 0, 3, 0,new Color(255,255,255
         ));
        titlepanel.setBorder(titleBorder);
        bindcombo();
        filltablebyshowproperty();
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(27,150,77));
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
    }
       public void bindcombo(){
      for(String s:map.keySet()){
         txtcombo.addItem(s);
      }  
    }
       
          public void filltablebyshowproperty(){
        p_property property=new p_property();
        ArrayList<p_property>propertylist=property.propertieslist();
        String[] colname={"Id","Address"};
       
        Object[][] row=new Object[propertylist.size()][2]; 
        for(int i=0;i<propertylist.size();i++){
            row[i][0]=propertylist.get(i).getId();
            row[i][1]=propertylist.get(i).getAddress();
        }
        
        DefaultTableModel model=new DefaultTableModel(row,colname);
        jTable1.setModel(model);
    }
          
            public void filltype(){
        HashMap<byte[],Integer>imageslist=new  p_property().propertieimagelist(propertyid);
        DefaultListModel listmodel = new DefaultListModel() ;
        int i=0;
        
        for(Integer id:imageslist.values())
        {
            listmodel.add(i, id);
            i++;
        }
        jList1.setModel(listmodel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbrowse = new javax.swing.JButton();
        txtshow = new javax.swing.JButton();
        txtadd = new javax.swing.JButton();
        txtremove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtcombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtimages = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        titlepanel.setBackground(new java.awt.Color(153, 0, 0));
        titlepanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Images");

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbrowse.setBackground(new java.awt.Color(0, 0, 255));
        txtbrowse.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtbrowse.setForeground(new java.awt.Color(255, 255, 255));
        txtbrowse.setText("Browse");
        txtbrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrowseActionPerformed(evt);
            }
        });

        txtshow.setBackground(new java.awt.Color(153, 0, 0));
        txtshow.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtshow.setForeground(new java.awt.Color(255, 255, 255));
        txtshow.setText("Show this property images");
        txtshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtshowActionPerformed(evt);
            }
        });

        txtadd.setBackground(new java.awt.Color(204, 204, 0));
        txtadd.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtadd.setForeground(new java.awt.Color(255, 255, 255));
        txtadd.setText("Add");
        txtadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        txtremove.setBackground(new java.awt.Color(0, 204, 0));
        txtremove.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtremove.setForeground(new java.awt.Color(255, 255, 255));
        txtremove.setText("Remove");
        txtremove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremoveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select A Type:");

        jTable1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jList1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 22)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        txtcombo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomboActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Images:");

        txtimages.setBackground(new java.awt.Color(204, 255, 255));
        txtimages.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>*this table contains properties id and adress<br>"
            + "click on the button to show image</html>");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>*this List contains Images id<br> of the selected property. <br>(select the property from the table)</html>");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>*select an item from the list to display<br>"+
            " or browse an image from your computer</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtshow, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(txtremove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtimages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtadd, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtbrowse))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtcombo)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtshow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtimages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtadd)
                            .addComponent(txtremove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(78, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents
      public ImageIcon resizeImage(String path,byte[] byteimage){
          
          ImageIcon pic;
          if(byteimage!=null)
              pic =new ImageIcon(byteimage);
          else 
              pic =new ImageIcon(path);
          
          Image img=pic.getImage().getScaledInstance(txtimages.getWidth(),txtimages.getHeight(), Image.SCALE_SMOOTH);
          ImageIcon image=new ImageIcon(img);
          return image;
      }
    private void txtbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrowseActionPerformed
      JFileChooser fileChooser=new JFileChooser();
       fileChooser.setDialogTitle("select the property Image");
       
       fileChooser.setCurrentDirectory(new File("C:\\"));
       
       FileNameExtensionFilter filefilter= new FileNameExtensionFilter("Images",".jpg",".png",".jpeg");
       fileChooser.addChoosableFileFilter(filefilter);
       
       int filestate=fileChooser.showSaveDialog(null);
       if(filestate==JFileChooser.APPROVE_OPTION){
           String path=fileChooser.getSelectedFile().getAbsolutePath();
           txtimages.setIcon(resizeImage(path,null));
           property_image_path=path;
       }

    }//GEN-LAST:event_txtbrowseActionPerformed

    private void txtshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtshowActionPerformed
             try{     
                  int index=jTable1.getSelectedRow();
                    int id=Integer.valueOf(jTable1.getValueAt(index,0).toString());
                    if(jList1.getModel().getSize()>0){
                    property_image_show image_showapp=new property_image_show(id);
                    image_showapp.setVisible(true);
                    image_showapp.pack();
                    image_showapp.setLocationRelativeTo(null);
                    image_showapp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "property has empty image", "No image", 2);
                    }
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Select property From the table \nFirst", "property Not Selected", 2);
             }
     

    }//GEN-LAST:event_txtshowActionPerformed

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        
        p_property property=new p_property();
        if(propertyid!=0){
      if(property.addimage(propertyid, property_image_path)){
          JOptionPane.showMessageDialog(null, "Image added to the property", "Add Image", 1);
      }
      else {
          JOptionPane.showMessageDialog(null, "Image Failed to add the property", "Add Image", 2);
      }
        }else{
             JOptionPane.showMessageDialog(null, "Select property From the table \nFirst", "property Not Selected", 2);
        }
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremoveActionPerformed
        
     try{
         String selectedItem=String.valueOf(jList1.getSelectedValue());
      Integer imageId=Integer.valueOf(selectedItem);
      int yes_no=JOptionPane.showConfirmDialog(null, "Do You Want to Delete This Image", "Delete Image", JOptionPane.YES_NO_OPTION);

        if(yes_no==JOptionPane.YES_OPTION)
                    {
                        if(new p_property().removeimageid(imageId))
                        {
                            JOptionPane.showMessageDialog(null, "Delete Image Sucessfully ", "Delete Image", 1);
                            txtimages.setIcon(null);
                            filltype();
                          }
                            else{
                              JOptionPane.showMessageDialog(null, "Operation Failed ,Image not delated", "Delete Image", 2);
                            }
                    } 
     }
     catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex.getMessage()+"Image not selected or this property hus no images ", "Delete Image", 2);
     }
    }//GEN-LAST:event_txtremoveActionPerformed

    private void txtcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomboActionPerformed
        // TODO add your handling code here:
        int typeid=map.get(txtcombo.getSelectedItem().toString());
        p_property property=new p_property();
        ArrayList<p_property>propertylist=property.propertieslistbytype(typeid);
        String[] colname={"Id","Address"};
       
        Object[][] row=new Object[propertylist.size()][2]; 
        for(int i=0;i<propertylist.size();i++){
            row[i][0]=propertylist.get(i).getId();
            row[i][1]=propertylist.get(i).getAddress();
        }
        
        DefaultTableModel model=new DefaultTableModel(row,colname);
        jTable1.setModel(model);
    }//GEN-LAST:event_txtcomboActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowindex=jTable1.getSelectedRow();
        propertyid=Integer.valueOf(jTable1.getValueAt(rowindex, 0).toString());
        filltype();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        try{
        String selectedItem=String.valueOf(jList1.getSelectedValue());
        Integer imageId=Integer.valueOf(selectedItem);
        byte[] image=new p_property().getimagelistbyid(imageId);
       txtimages.setIcon( resizeImage("",image));
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(propertyImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(propertyImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(propertyImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(propertyImages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new propertyImages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel titlepanel;
    private javax.swing.JButton txtadd;
    private javax.swing.JButton txtbrowse;
    private javax.swing.JComboBox<String> txtcombo;
    private javax.swing.JLabel txtimages;
    private javax.swing.JButton txtremove;
    private javax.swing.JButton txtshow;
    // End of variables declaration//GEN-END:variables
}
