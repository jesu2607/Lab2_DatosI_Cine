/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus David
 */
public class Cartelera extends javax.swing.JFrame {

    /**
     * Creates new form Cartelera
     */
    public Cartelera() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);

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
        volver = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        sala1 = new javax.swing.JLabel();
        sala2 = new javax.swing.JLabel();

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
        back.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back Arrow_28px.png"))); // NOI18N
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setOpaque(true);
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        back.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        back.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setText("Salas Disponibles");
        back.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, 26));

        sala1.setBackground(new java.awt.Color(255, 255, 255));
        sala1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        sala1.setForeground(new java.awt.Color(153, 153, 153));
        sala1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1_85px.png"))); // NOI18N
        sala1.setText("Sala 1");
        sala1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sala1.setOpaque(true);
        sala1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sala1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sala1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sala1MouseExited(evt);
            }
        });
        back.add(sala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 100));

        sala2.setBackground(new java.awt.Color(255, 255, 255));
        sala2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        sala2.setForeground(new java.awt.Color(153, 153, 153));
        sala2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2_85px.png"))); // NOI18N
        sala2.setText("Sala 2");
        sala2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sala2.setOpaque(true);
        sala2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sala2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sala2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sala2MouseExited(evt);
            }
        });
        back.add(sala2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    public static String name;

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255, 51, 51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255, 255, 255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        if (LogIn.sw == true) {
            User u = new User();
            this.setVisible(false);
            u.setVisible(true);
        } else {
            Admin v = new Admin();
            this.setVisible(false);
            v.setVisible(true);
        }
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(231, 231, 231));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_volverMouseExited

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_topbarMouseDragged

    public static int x;
    public static int y;
    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void sala1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala1MouseClicked
        name = "Sala1";
        HorariosSala h = new HorariosSala();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_sala1MouseClicked

    private void sala1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala1MouseEntered
        sala1.setBackground(new Color(240, 240, 240));
        sala1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_sala1MouseEntered

    private void sala1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala1MouseExited
        sala1.setBackground(new Color(255, 255, 255));
        sala1.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_sala1MouseExited

    private void sala2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala2MouseClicked
        name = "Sala2";
        HorariosSala h = new HorariosSala();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_sala2MouseClicked

    private void sala2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala2MouseEntered
        sala2.setBackground(new Color(240, 240, 240));
        sala2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_sala2MouseEntered

    private void sala2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sala2MouseExited
        sala2.setBackground(new Color(255, 255, 255));
        sala2.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_sala2MouseExited

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
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartelera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel sala1;
    private javax.swing.JLabel sala2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topbar;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
