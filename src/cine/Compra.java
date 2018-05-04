/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Jesus David
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("src/imagenes/payment-gateway-credit-card-psds-40.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(creditcards.getWidth(), creditcards.getHeight(), Image.SCALE_SMOOTH));
        creditcards.setText(null);
        creditcards.setIcon(icono);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        pagar = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        namesep = new javax.swing.JSeparator();
        nametxt = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        codsep = new javax.swing.JSeparator();
        securetxt = new javax.swing.JTextField();
        creditcards = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete_25px.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        back.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 40));

        pagar.setBackground(new java.awt.Color(255, 255, 255));
        pagar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        pagar.setForeground(new java.awt.Color(0, 153, 153));
        pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagar.setText("Pagar");
        pagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        pagar.setOpaque(true);
        pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagarMouseExited(evt);
            }
        });
        back.add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 70, 30));

        topbar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbarMouseDragged(evt);
            }
        });
        topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbarMousePressed(evt);
            }
        });
        back.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        namesep.setBackground(new java.awt.Color(0, 153, 153));
        namesep.setForeground(new java.awt.Color(255, 255, 255));
        back.add(namesep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, -1));

        nametxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        nametxt.setBorder(null);
        nametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametxtFocusLost(evt);
            }
        });
        back.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 20));

        name.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(0, 153, 153));
        name.setText("Número de Tarjeta");
        back.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, -1));

        code.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        code.setForeground(new java.awt.Color(204, 204, 204));
        code.setText("Código de seguridad");
        back.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, -1));

        codsep.setBackground(new java.awt.Color(204, 204, 204));
        codsep.setForeground(new java.awt.Color(255, 255, 255));
        back.add(codsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, -1));

        securetxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        securetxt.setBorder(null);
        securetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                securetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                securetxtFocusLost(evt);
            }
        });
        back.add(securetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 60, 20));
        back.add(creditcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 180, 40));

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setText("Compra de Boletos");
        back.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 26));
        back.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 40));

        precio.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        precio.setText("Total: ");
        back.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    public static int x;
    public static int y;

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255, 51, 51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255, 255, 255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_topbarMouseDragged

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void nametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusGained
        namesep.setBackground(new Color(0, 153, 153));
        name.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusLost
        namesep.setBackground(new Color(204, 204, 204));
        name.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_nametxtFocusLost

    private void securetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securetxtFocusGained
        codsep.setBackground(new Color(0, 153, 153));
        code.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_securetxtFocusGained

    private void securetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securetxtFocusLost
        codsep.setBackground(new Color(204, 204, 204));
        code.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_securetxtFocusLost

    private void pagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarMouseClicked
        if(securetxt.getText().length()!=0 && nametxt.getText().length()!=0){
            Sala a= new Sala();
            a.save();
            Sala.cont=0;
        }
    }//GEN-LAST:event_pagarMouseClicked

    private void pagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarMouseEntered
        pagar.setForeground(Color.WHITE);
        pagar.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_pagarMouseEntered

    private void pagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarMouseExited
        pagar.setForeground(new Color(0,102,255));
        pagar.setBackground(Color.WHITE);
    }//GEN-LAST:event_pagarMouseExited

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel code;
    private javax.swing.JSeparator codsep;
    private javax.swing.JLabel creditcards;
    private javax.swing.JLabel name;
    private javax.swing.JSeparator namesep;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel pagar;
    private javax.swing.JLabel precio;
    public static javax.swing.JLabel price;
    private javax.swing.JTextField securetxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topbar;
    // End of variables declaration//GEN-END:variables
}
