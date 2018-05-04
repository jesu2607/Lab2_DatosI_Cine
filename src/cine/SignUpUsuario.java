/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Jesus David
 */
public class SignUpUsuario extends javax.swing.JFrame {

    /**
     * Creates new form SignUpUsuario
     */
    public SignUpUsuario() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
        error.setVisible(false);
        error1.setVisible(false);
        error2.setVisible(false);
        error3.setVisible(false);
        error4.setVisible(false);
        error5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        volver = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        namesep = new javax.swing.JSeparator();
        nametxt = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        teltxt = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        usersep = new javax.swing.JSeparator();
        usertxt = new javax.swing.JTextField();
        passw = new javax.swing.JLabel();
        txtpassw = new javax.swing.JPasswordField();
        passwsep = new javax.swing.JSeparator();
        confirm = new javax.swing.JLabel();
        confirmtxt = new javax.swing.JPasswordField();
        confirmsep = new javax.swing.JSeparator();
        telsep = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        crearcuenta = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        document = new javax.swing.JLabel();
        docsep = new javax.swing.JSeparator();
        error1 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        doctxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        background.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        background.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

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
        background.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        namesep.setBackground(new java.awt.Color(102, 102, 255));
        namesep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(namesep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, -1));

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
        background.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, 20));

        name.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 255));
        name.setText("Nombre:");
        background.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        telefono.setForeground(new java.awt.Color(204, 204, 204));
        telefono.setText("Teléfono:");
        background.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        error2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setText("Limite alcanzado");
        background.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        teltxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        teltxt.setBorder(null);
        teltxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teltxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teltxtFocusLost(evt);
            }
        });
        teltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teltxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teltxtKeyTyped(evt);
            }
        });
        background.add(teltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 20));

        error.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("Solo se permiten numeros en este campo");
        background.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        user.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setText("Usuario:");
        background.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        usersep.setBackground(new java.awt.Color(204, 204, 204));
        usersep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(usersep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, 10));

        usertxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        usertxt.setBorder(null);
        usertxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usertxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usertxtFocusLost(evt);
            }
        });
        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usertxtKeyReleased(evt);
            }
        });
        background.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, 20));

        passw.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        passw.setForeground(new java.awt.Color(204, 204, 204));
        passw.setText("Escriba una contraseña:");
        background.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txtpassw.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        txtpassw.setBorder(null);
        txtpassw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswFocusLost(evt);
            }
        });
        txtpassw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswKeyTyped(evt);
            }
        });
        background.add(txtpassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 180, 20));

        passwsep.setBackground(new java.awt.Color(204, 204, 204));
        passwsep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(passwsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 10));

        confirm.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        confirm.setForeground(new java.awt.Color(204, 204, 204));
        confirm.setText("Confirme la contraseña:");
        background.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        confirmtxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        confirmtxt.setBorder(null);
        confirmtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmtxtFocusLost(evt);
            }
        });
        confirmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmtxtActionPerformed(evt);
            }
        });
        background.add(confirmtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 180, 20));

        confirmsep.setBackground(new java.awt.Color(204, 204, 204));
        confirmsep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(confirmsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 180, 10));

        telsep.setBackground(new java.awt.Color(204, 204, 204));
        telsep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(telsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 10));

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setText("Crear Cuenta: Usuario");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 240, 26));

        error3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error3.setForeground(new java.awt.Color(255, 0, 0));
        error3.setText("Contraseña muy corta (6 caracteres min.)");
        background.add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        crearcuenta.setBackground(new java.awt.Color(255, 255, 255));
        crearcuenta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        crearcuenta.setForeground(new java.awt.Color(102, 102, 255));
        crearcuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearcuenta.setText("Crear Cuenta");
        crearcuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        crearcuenta.setOpaque(true);
        crearcuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearcuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearcuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearcuentaMouseExited(evt);
            }
        });
        background.add(crearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 100, 30));

        error4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error4.setForeground(new java.awt.Color(255, 0, 0));
        error4.setText("Usuario no disponible");
        background.add(error4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        document.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        document.setForeground(new java.awt.Color(204, 204, 204));
        document.setText("Documento");
        background.add(document, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        docsep.setBackground(new java.awt.Color(204, 204, 204));
        docsep.setForeground(new java.awt.Color(255, 255, 255));
        background.add(docsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 180, 10));

        error1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setText("Solo se permiten numeros en este campo");
        background.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        error5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        error5.setForeground(new java.awt.Color(255, 0, 0));
        error5.setText("Limite alcanzado");
        background.add(error5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        doctxt.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        doctxt.setBorder(null);
        doctxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                doctxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                doctxtFocusLost(evt);
            }
        });
        doctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doctxtKeyTyped(evt);
            }
        });
        background.add(doctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255, 51, 51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    public static int x;
    public static int y;

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
        namesep.setBackground(new Color(102, 102, 255));
        name.setForeground(new Color(102, 102, 255));

    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusLost
        namesep.setBackground(new Color(204, 204, 204));
        name.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_nametxtFocusLost

    private void teltxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teltxtFocusGained

        telefono.setForeground(new Color(102, 102, 255));
        telsep.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_teltxtFocusGained

    private void teltxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teltxtFocusLost
        telsep.setBackground(new Color(204, 204, 204));
        telefono.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_teltxtFocusLost

    private void teltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teltxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
            error.setVisible(true);
            telsep.setBackground(new Color(255, 0, 0));
        } else {
            telsep.setBackground(new Color(204, 204, 204));
            error.setVisible(false);
        }
        if (teltxt.getText().length() > 12) {
            error2.setVisible(true);
            getToolkit().beep();
            evt.consume();
        } else {
            error2.setVisible(false);
        }
    }//GEN-LAST:event_teltxtKeyTyped

    private void usertxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usertxtFocusGained
        usersep.setBackground(new Color(102, 102, 255));
        user.setForeground(new Color(102, 102, 255));
    }//GEN-LAST:event_usertxtFocusGained

    private void usertxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usertxtFocusLost
        usersep.setBackground(new Color(204, 204, 204));
        user.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_usertxtFocusLost

    private void txtpasswFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswFocusGained
        passwsep.setBackground(new Color(102, 102, 255));
        passw.setForeground(new Color(102, 102, 255));
    }//GEN-LAST:event_txtpasswFocusGained

    private void txtpasswFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswFocusLost
        passwsep.setBackground(new Color(204, 204, 204));
        passw.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_txtpasswFocusLost

    private void confirmtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmtxtFocusGained
        confirmsep.setBackground(new Color(102, 102, 255));
        confirm.setForeground(new Color(102, 102, 255));
    }//GEN-LAST:event_confirmtxtFocusGained

    private void confirmtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmtxtFocusLost
        confirmsep.setBackground(new Color(204, 204, 204));
        confirm.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_confirmtxtFocusLost

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        LogInUsuario u = new LogInUsuario();
        this.setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(231, 231, 231));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_volverMouseExited

    private void txtpasswKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswKeyTyped

        if (txtpassw.getText().length() > 0 && txtpassw.getText().length() < 5) {
            error3.setVisible(true);
            passwsep.setBackground(new Color(255, 0, 0));
        } else {
            error3.setVisible(false);
            passwsep.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtpasswKeyTyped

    private void crearcuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearcuentaMouseEntered
        crearcuenta.setBackground(new Color(102, 102, 255));
        crearcuenta.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_crearcuentaMouseEntered

    private void crearcuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearcuentaMouseExited
        crearcuenta.setBackground(new Color(255, 255, 255));
        crearcuenta.setForeground(new Color(102, 102, 255));
    }//GEN-LAST:event_crearcuentaMouseExited

    private void crearcuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearcuentaMouseClicked
        if ((nametxt.getText().length() != 0) && (teltxt.getText().length() != 0) && (txtpassw.getText().length() != 0) && (confirmtxt.getText().length() != 0) && (usertxt.getText().length() != 0)) {
            if (txtpassw.getText().equals(confirmtxt.getText())) {
                if ((txtpassw.getText().length() > 5) && (confirmtxt.getText().length() > 5)) {
                    File archivo = new File("usuarios.txt");
                    if (error4.isShowing() == true) {
                        usertxt.grabFocus();
                    } else {
                        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new FileWriter(archivo, true));) {
                            Object name = nametxt.getText();
                            Object telefono = teltxt.getText();
                            Object usuario = usertxt.getText();
                            Object password = txtpassw.getText();
                            Object document = doctxt.getText();
                            bw.write(name + "," + telefono + "," + document + "," + usuario + "," + password);
                            bw.newLine();
                            nametxt.setText("");
                            teltxt.setText("");
                            txtpassw.setText("");
                            confirmtxt.setText("");
                            usertxt.setText("");
                            doctxt.setText("");
                            JOptionPane.showMessageDialog(null, "Usuario creado satisfactoriamente", "Hi", JOptionPane.INFORMATION_MESSAGE);
                            nametxt.grabFocus();
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas deben ser de al menos 6 caracteres", "Aviso", JOptionPane.QUESTION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales", "Aviso", JOptionPane.QUESTION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No deben haber campos vacios", "Aviso", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_crearcuentaMouseClicked

    private void usertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyReleased
        File archivo = new File("usuarios.txt");

        if (FileHandle.existsonfile(archivo, 2, usertxt.getText()) == true) {
            error4.setVisible(true);
            usersep.setBackground(new Color(255, 0, 0));
        } else {
            error4.setVisible(false);
            usersep.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_usertxtKeyReleased

    private void teltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teltxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_teltxtKeyReleased

    private void doctxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_doctxtFocusGained
        docsep.setBackground(new Color(102, 102, 255));
        document.setForeground(new Color(102, 102, 255));
                                      
    }//GEN-LAST:event_doctxtFocusGained

    private void doctxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_doctxtFocusLost
        docsep.setBackground(new Color(204, 204, 204));
        document.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_doctxtFocusLost

    private void doctxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
            error1.setVisible(true);
            docsep.setBackground(new Color(255, 0, 0));
        } else {
            docsep.setBackground(new Color(204, 204, 204));
            error1.setVisible(false);
        }
        if (doctxt.getText().length() > 12) {
            error5.setVisible(true);
            getToolkit().beep();
            evt.consume();
        } else {
            error5.setVisible(false);
        }
    }//GEN-LAST:event_doctxtKeyTyped

    private void confirmtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmtxtActionPerformed
        crearcuentaMouseClicked(null);
    }//GEN-LAST:event_confirmtxtActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel confirm;
    private javax.swing.JSeparator confirmsep;
    private javax.swing.JPasswordField confirmtxt;
    private javax.swing.JLabel crearcuenta;
    private javax.swing.JSeparator docsep;
    private javax.swing.JTextField doctxt;
    private javax.swing.JLabel document;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel name;
    private javax.swing.JSeparator namesep;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel passw;
    private javax.swing.JSeparator passwsep;
    private javax.swing.JLabel telefono;
    private javax.swing.JSeparator telsep;
    private javax.swing.JTextField teltxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topbar;
    private javax.swing.JPasswordField txtpassw;
    private javax.swing.JLabel user;
    private javax.swing.JSeparator usersep;
    private javax.swing.JTextField usertxt;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
