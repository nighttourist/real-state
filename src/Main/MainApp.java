/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 *
 * @author Asus
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        appico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmain.png")));
        Border logoBorder=BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black);
        appico.setBorder(logoBorder);
        Border appBorder=BorderFactory.createMatteBorder(0, 0, 3, 0,Color.black);
        appname.setBorder(appBorder);
        Border menuBorder=BorderFactory.createMatteBorder(0, 0, 2, 0,Color.yellow);
        property.setBorder(menuBorder);
        propertyt.setBorder(menuBorder);
        propertyi.setBorder(menuBorder);
        owner.setBorder(menuBorder);
        client.setBorder(menuBorder);
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //property.setBorder(menuBorder);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        appico = new javax.swing.JLabel();
        appname = new javax.swing.JLabel();
        propertyt = new javax.swing.JLabel();
        owner = new javax.swing.JLabel();
        property = new javax.swing.JLabel();
        propertyi = new javax.swing.JLabel();
        client = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        appico.setBackground(new java.awt.Color(0, 153, 153));
        appico.setOpaque(true);

        appname.setFont(new java.awt.Font("French Script MT", 3, 48)); // NOI18N
        appname.setForeground(new java.awt.Color(159, 2, 112));
        appname.setText("Real R State");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        propertyt.setBackground(new java.awt.Color(102, 102, 102));
        propertyt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        propertyt.setForeground(new java.awt.Color(204, 255, 255));
        propertyt.setText("         Property-Type");
        propertyt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        propertyt.setOpaque(true);
        propertyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertytMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertytMouseExited(evt);
            }
        });

        owner.setBackground(new java.awt.Color(102, 102, 102));
        owner.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        owner.setForeground(new java.awt.Color(204, 255, 255));
        owner.setText("         Owner");
        owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        owner.setOpaque(true);
        owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ownerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ownerMouseExited(evt);
            }
        });

        property.setBackground(new java.awt.Color(102, 102, 102));
        property.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        property.setForeground(new java.awt.Color(204, 255, 255));
        property.setText("         Property");
        property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        property.setOpaque(true);
        property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertyMouseExited(evt);
            }
        });

        propertyi.setBackground(new java.awt.Color(102, 102, 102));
        propertyi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        propertyi.setForeground(new java.awt.Color(204, 255, 255));
        propertyi.setText("         Property-Images");
        propertyi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        propertyi.setOpaque(true);
        propertyi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertyiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertyiMouseExited(evt);
            }
        });

        client.setBackground(new java.awt.Color(102, 102, 102));
        client.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        client.setForeground(new java.awt.Color(204, 255, 255));
        client.setText("         Client");
        client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client.setOpaque(true);
        client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propertyi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propertyt, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propertyt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(propertyi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void propertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyMouseEntered
        // TODO add your handling code here:
        property.setBackground(Color.white);
        property.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_propertyMouseEntered

    private void propertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyMouseExited
        property.setBackground(new Color(102,102,102));
        property.setForeground(Color.white);
    }//GEN-LAST:event_propertyMouseExited

    private void propertytMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertytMouseExited
        // TODO add your handling code here:
         propertyt.setBackground(new Color(102,102,102));
        propertyt.setForeground(Color.white);
    }//GEN-LAST:event_propertytMouseExited

    private void propertytMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertytMouseEntered
        // TODO add your handling code here:
        propertyt.setBackground(Color.white);
        propertyt.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_propertytMouseEntered

    private void propertyiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyiMouseEntered
        // TODO add your handling code here:
        propertyi.setBackground(Color.white);
        propertyi.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_propertyiMouseEntered

    private void propertyiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertyiMouseExited
        // TODO add your handling code here:
         propertyi.setBackground(new Color(102,102,102));
        propertyi.setForeground(Color.white);
    }//GEN-LAST:event_propertyiMouseExited

    private void ownerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerMouseEntered
        // TODO add your handling code here:
        owner.setBackground(Color.white);
        owner.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_ownerMouseEntered

    private void ownerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerMouseExited
        // TODO add your handling code here:
         owner.setBackground(new Color(102,102,102));
        owner.setForeground(Color.white);
    }//GEN-LAST:event_ownerMouseExited

    private void clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseEntered
        // TODO add your handling code here:
        client.setBackground(Color.white);
        client.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_clientMouseEntered

    private void clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseExited
        // TODO add your handling code here:
         client.setBackground(new Color(102,102,102));
        client.setForeground(Color.white);
    }//GEN-LAST:event_clientMouseExited

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appico;
    private javax.swing.JLabel appname;
    private javax.swing.JLabel client;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel owner;
    private javax.swing.JLabel property;
    private javax.swing.JLabel propertyi;
    private javax.swing.JLabel propertyt;
    // End of variables declaration//GEN-END:variables
}