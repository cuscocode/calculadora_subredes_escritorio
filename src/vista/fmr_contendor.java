package vista;

import java.awt.Color;
import javax.swing.JPanel;

public class fmr_contendor extends javax.swing.JFrame {

    JPanel redireccionamiento_ip = new panel_redireccionamientoIp();
    JPanel subredes = new panel_subredes();
    JPanel host = new panel_host();
    JPanel conversor = new panel_conversor();
    JPanel ayuda = new panel_ayuda();

    int x, y;

    public fmr_contendor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(244, 248, 247));
        panel_padre.setBackground(new Color(244, 248, 247));

        //mostrar el primer panel
        panel_contenedor.add(redireccionamiento_ip);
        pack();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_padre = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();
        rSButton6 = new rojeru_san.RSButton();
        lbl_nombre_negocio2 = new javax.swing.JLabel();
        btnclose = new rojerusan.RSPanelImage();
        btnmin1 = new rojerusan.RSPanelImage();
        panel_contenedor = new javax.swing.JPanel();
        lblurl2 = new javax.swing.JLabel();
        lblurl1 = new javax.swing.JLabel();
        lblurl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panel_padre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_padre.setLayout(null);

        menu.setBackground(new java.awt.Color(46, 79, 114));
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/direccion-ip2.png"))); // NOI18N
        rSButton2.setText("Direccion IP");
        rSButton2.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });

        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hacerca de.png"))); // NOI18N
        rSButton3.setText("Host");
        rSButton3.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });

        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/network.png"))); // NOI18N
        rSButton4.setText("Subredes");
        rSButton4.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });

        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/binario.png"))); // NOI18N
        rSButton5.setText("Conversor");
        rSButton5.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });

        rSButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hacerca de.png"))); // NOI18N
        rSButton6.setText("Ayuda");
        rSButton6.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        rSButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_padre.add(menu);
        menu.setBounds(0, 0, 150, 460);

        lbl_nombre_negocio2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_nombre_negocio2.setForeground(new java.awt.Color(46, 79, 114));
        lbl_nombre_negocio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_negocio2.setText("CALCULADORA DE SUBREDES V1.0.0");
        panel_padre.add(lbl_nombre_negocio2);
        lbl_nombre_negocio2.setBounds(150, 0, 500, 30);

        btnclose.setToolTipText("Cerrar");
        btnclose.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnclose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btncloseMouseMoved(evt);
            }
        });
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncloseMouseExited(evt);
            }
        });
        panel_padre.add(btnclose);
        btnclose.setBounds(930, 10, 20, 20);

        btnmin1.setToolTipText("Minimizar");
        btnmin1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minR.png"))); // NOI18N
        btnmin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnmin1MouseMoved(evt);
            }
        });
        btnmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmin1MouseExited(evt);
            }
        });
        panel_padre.add(btnmin1);
        btnmin1.setBounds(900, 10, 20, 20);

        panel_contenedor.setBackground(new java.awt.Color(244, 248, 247));
        panel_contenedor.setLayout(new java.awt.CardLayout());
        panel_padre.add(panel_contenedor);
        panel_contenedor.setBounds(150, 40, 810, 390);

        lblurl2.setBackground(new java.awt.Color(255, 255, 255));
        lblurl2.setForeground(new java.awt.Color(46, 78, 114));
        lblurl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblurl2.setText("tel:+51940500006");
        lblurl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblurl2.setName(""); // NOI18N
        panel_padre.add(lblurl2);
        lblurl2.setBounds(820, 440, 140, 20);

        lblurl1.setBackground(new java.awt.Color(255, 255, 255));
        lblurl1.setForeground(new java.awt.Color(46, 78, 114));
        lblurl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblurl1.setText("Universidad Tecnologica de los Andes - cusco");
        lblurl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblurl1.setName(""); // NOI18N
        panel_padre.add(lblurl1);
        lblurl1.setBounds(170, 440, 260, 20);

        lblurl3.setBackground(new java.awt.Color(255, 255, 255));
        lblurl3.setForeground(new java.awt.Color(46, 78, 114));
        lblurl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblurl3.setText("Raul Gabriel Hacho Cutipa");
        lblurl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblurl3.setName(""); // NOI18N
        panel_padre.add(lblurl3);
        lblurl3.setBounds(500, 440, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_padre, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseMoved
        // TODO add your handling code here:
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btncloseMouseMoved

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        System.exit(-1);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseMouseExited

    private void btnmin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmin1MouseMoved

    private void btnmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnmin1MouseClicked

    private void btnmin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmin1MouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
        panel_contenedor.add(redireccionamiento_ip);
        pack();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        // TODO add your handling code here:
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
        panel_contenedor.add(subredes);
        pack();
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        // TODO add your handling code here:
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
        panel_contenedor.add(host);
        pack();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        // TODO add your handling code here:
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
         panel_contenedor.add(conversor);
        pack();
    }//GEN-LAST:event_rSButton5ActionPerformed

    private void rSButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton6ActionPerformed
        // TODO add your handling code here:
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
        panel_contenedor.add(ayuda);
        pack();
    }//GEN-LAST:event_rSButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(fmr_contendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmr_contendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmr_contendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmr_contendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmr_contendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSPanelImage btnclose;
    private rojerusan.RSPanelImage btnmin1;
    private javax.swing.JLabel lbl_nombre_negocio2;
    private javax.swing.JLabel lblurl1;
    private javax.swing.JLabel lblurl2;
    private javax.swing.JLabel lblurl3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_padre;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton6;
    // End of variables declaration//GEN-END:variables
}
