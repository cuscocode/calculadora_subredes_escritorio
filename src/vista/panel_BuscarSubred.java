/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import subredes.validacion;
import subredes.resolucion_pertenece_3;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import subredes.resolucion_pertenece_3;

/**
 *
 * @author hack
 */
public class panel_BuscarSubred extends javax.swing.JPanel {

    /**
     * Creates new form panel_BuscarSubred
     */
    public panel_BuscarSubred() {
        initComponents();
    }

    private void validaRango_decimal(java.awt.event.KeyEvent evt, JTextField txt) {
        char c = evt.getKeyChar();
        if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

        // Obtener el texto actual en el JTextField
        String currentText = txt.getText();

        try {
            // Concatenar el carácter ingresado al texto actual y convertirlo a un número
            int value = Integer.parseInt(currentText + c);

            // Verificar si el valor está en el rango de 0 a 255
            if (value < 0 || value > 255) {
                evt.consume(); // El valor está fuera del rango, consumir el evento
            }
        } catch (NumberFormatException ex) {
            evt.consume(); // No se puede convertir a un número válido, consumir el evento
        }
    }

    private void validaRango_prefijo(java.awt.event.KeyEvent evt, JTextField txt) {
        char c = evt.getKeyChar();
        if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }

        // Obtener el texto actual en el JTextField
        String currentText = txt.getText();

        try {
            // Concatenar el carácter ingresado al texto actual y convertirlo a un número
            int value = Integer.parseInt(currentText + c);

            // Verificar si el valor está en el rango de 0 a 255
            if (value < 0 || value > 32) {
                evt.consume(); // El valor está fuera del rango, consumir el evento
            }
        } catch (NumberFormatException ex) {
            evt.consume(); // No se puede convertir a un número válido, consumir el evento
        }
    }

    //obtener la subred al que pertence
    private void Calcular() {
        txt_resultado.setText("");
        try {

            if (txt_ip1.getText().length() > 0 && txt_ip2.getText().length() > 0 && txt_ip3.getText().length() > 0
                    && txt_ip4.getText().length() > 0 && txt_prefijo.getText().length() > 0) {

                int ip_1 = Integer.parseInt(txt_ip1.getText().toString());
                int ip_2 = Integer.parseInt(txt_ip2.getText().toString());
                int ip_3 = Integer.parseInt(txt_ip3.getText().toString());
                int ip_4 = Integer.parseInt(txt_ip4.getText().toString());
                int prefijo = Integer.parseInt(txt_prefijo.getText().toString());

                String validaciones_prefijo[] = validacion.validar_prefijo(ip_1, prefijo);
                if (validaciones_prefijo[0].equals("true")) {

                    txt_resultado.setText(resolucion_pertenece_3.subred_al_que_pertenece(ip_1, ip_2, ip_3, ip_4, prefijo));

                } else {
                    if (!validaciones_prefijo[1].equals("")) {
                        JOptionPane.showMessageDialog(null, validaciones_prefijo[1]);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "complete los campos");
            }

        } catch (Exception e) {
            System.out.println("ocurrio un error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre_negocio2 = new javax.swing.JLabel();
        lbl_nombre_negocio3 = new javax.swing.JLabel();
        lcodigo33 = new javax.swing.JLabel();
        txt_prefijo = new rojeru_san.RSMTextFull();
        lcodigo20 = new javax.swing.JLabel();
        txt_ip2 = new rojeru_san.RSMTextFull();
        txt_ip3 = new rojeru_san.RSMTextFull();
        lcodigo21 = new javax.swing.JLabel();
        txt_ip1 = new rojeru_san.RSMTextFull();
        txt_ip4 = new rojeru_san.RSMTextFull();
        lcodigo22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        btn_usuario3 = new rojerusan.RSMaterialButtonRound();

        setBackground(new java.awt.Color(244, 248, 247));
        setLayout(null);

        lbl_nombre_negocio2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_nombre_negocio2.setForeground(new java.awt.Color(46, 78, 114));
        lbl_nombre_negocio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_negocio2.setText("Calcular la Subred al que pertenece ");
        add(lbl_nombre_negocio2);
        lbl_nombre_negocio2.setBounds(320, 30, 370, 30);

        lbl_nombre_negocio3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_nombre_negocio3.setForeground(new java.awt.Color(46, 78, 114));
        lbl_nombre_negocio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_negocio3.setText("una determinada ip");
        add(lbl_nombre_negocio3);
        lbl_nombre_negocio3.setBounds(310, 60, 370, 30);

        lcodigo33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo33.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo33.setText("Prefijo de la mascara Modificada:");
        add(lcodigo33);
        lcodigo33.setBounds(210, 170, 240, 20);

        txt_prefijo.setBackground(new java.awt.Color(46, 78, 114));
        txt_prefijo.setForeground(new java.awt.Color(46, 78, 114));
        txt_prefijo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_prefijo.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_prefijo.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_prefijo.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_prefijo.setColorTransparente(true);
        txt_prefijo.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_prefijo.setPlaceholder("24");
        txt_prefijo.setSoloNumeros(true);
        txt_prefijo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_prefijoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_prefijoFocusLost(evt);
            }
        });
        txt_prefijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prefijoActionPerformed(evt);
            }
        });
        txt_prefijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyReleased(evt);
            }
        });
        add(txt_prefijo);
        txt_prefijo.setBounds(450, 150, 140, 42);

        lcodigo20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo20.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigo20.setText(".");
        add(lcodigo20);
        lcodigo20.setBounds(270, 110, 20, 30);

        txt_ip2.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip2.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip2.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip2.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip2.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip2.setColorTransparente(true);
        txt_ip2.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip2.setPlaceholder("192");
        txt_ip2.setSoloNumeros(true);
        txt_ip2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip2FocusLost(evt);
            }
        });
        txt_ip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip2ActionPerformed(evt);
            }
        });
        txt_ip2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip2KeyReleased(evt);
            }
        });
        add(txt_ip2);
        txt_ip2.setBounds(290, 100, 130, 42);

        txt_ip3.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip3.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip3.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip3.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip3.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip3.setColorTransparente(true);
        txt_ip3.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip3.setPlaceholder("0");
        txt_ip3.setSoloNumeros(true);
        txt_ip3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip3FocusLost(evt);
            }
        });
        txt_ip3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip3ActionPerformed(evt);
            }
        });
        txt_ip3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip3KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip3KeyReleased(evt);
            }
        });
        add(txt_ip3);
        txt_ip3.setBounds(440, 100, 90, 42);

        lcodigo21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo21.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigo21.setText(".");
        add(lcodigo21);
        lcodigo21.setBounds(530, 120, 20, 30);

        txt_ip1.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip1.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip1.setToolTipText("");
        txt_ip1.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip1.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip1.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip1.setColorTransparente(true);
        txt_ip1.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip1.setPlaceholder("192");
        txt_ip1.setSoloNumeros(true);
        txt_ip1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip1FocusLost(evt);
            }
        });
        txt_ip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip1ActionPerformed(evt);
            }
        });
        txt_ip1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip1KeyReleased(evt);
            }
        });
        add(txt_ip1);
        txt_ip1.setBounds(150, 100, 120, 42);

        txt_ip4.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip4.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip4.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip4.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip4.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip4.setColorTransparente(true);
        txt_ip4.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip4.setPlaceholder("192");
        txt_ip4.setSoloNumeros(true);
        txt_ip4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip4FocusLost(evt);
            }
        });
        txt_ip4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip4ActionPerformed(evt);
            }
        });
        txt_ip4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip4KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip4KeyReleased(evt);
            }
        });
        add(txt_ip4);
        txt_ip4.setBounds(550, 100, 130, 42);

        lcodigo22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo22.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigo22.setText(".");
        add(lcodigo22);
        lcodigo22.setBounds(420, 120, 20, 30);

        txt_resultado.setEditable(false);
        txt_resultado.setBackground(new java.awt.Color(244, 248, 247));
        txt_resultado.setColumns(20);
        txt_resultado.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(46, 78, 114));
        txt_resultado.setRows(4);
        txt_resultado.setTabSize(0);
        txt_resultado.setText("\n");
        txt_resultado.setWrapStyleWord(true);
        txt_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(46, 78, 114))); // NOI18N
        txt_resultado.setFocusTraversalPolicyProvider(true);
        jScrollPane1.setViewportView(txt_resultado);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 260, 570, 130);

        btn_usuario3.setBorder(null);
        btn_usuario3.setText("Calcular");
        btn_usuario3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_usuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario3ActionPerformed(evt);
            }
        });
        add(btn_usuario3);
        btn_usuario3.setBounds(260, 200, 300, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_prefijoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoFocusGained

    private void txt_prefijoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoFocusLost

    private void txt_prefijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prefijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoActionPerformed

    private void txt_prefijoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoKeyPressed

    private void txt_prefijoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoKeyReleased

    private void txt_prefijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoKeyTyped
        // TODO add your handling code here:
        //validaRango_prefijo(evt, txt_prefijoMascara);
    }//GEN-LAST:event_txt_prefijoKeyTyped

    private void txt_ip2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2FocusGained

    private void txt_ip2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2FocusLost

    private void txt_ip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2ActionPerformed

    private void txt_ip2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyPressed

    }//GEN-LAST:event_txt_ip2KeyPressed

    private void txt_ip2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2KeyReleased

    private void txt_ip2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyTyped

        validaRango_decimal(evt, txt_ip2);
    }//GEN-LAST:event_txt_ip2KeyTyped

    private void txt_ip3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3FocusGained

    private void txt_ip3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3FocusLost

    private void txt_ip3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3ActionPerformed

    private void txt_ip3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3KeyPressed

    private void txt_ip3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3KeyReleased

    private void txt_ip3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3KeyTyped

    private void txt_ip1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1FocusGained

    private void txt_ip1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1FocusLost

    private void txt_ip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1ActionPerformed

    private void txt_ip1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1KeyPressed

    private void txt_ip1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1KeyReleased

    private void txt_ip1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1KeyTyped

    private void txt_ip4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4FocusGained

    private void txt_ip4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4FocusLost

    private void txt_ip4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4ActionPerformed

    private void txt_ip4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4KeyPressed

    private void txt_ip4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4KeyReleased

    private void txt_ip4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4KeyTyped

    private void btn_usuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario3ActionPerformed
        //Calcular();
        Calcular();
    }//GEN-LAST:event_btn_usuario3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRound btn_usuario3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nombre_negocio2;
    private javax.swing.JLabel lbl_nombre_negocio3;
    private javax.swing.JLabel lcodigo20;
    private javax.swing.JLabel lcodigo21;
    private javax.swing.JLabel lcodigo22;
    private javax.swing.JLabel lcodigo33;
    public rojeru_san.RSMTextFull txt_ip1;
    public rojeru_san.RSMTextFull txt_ip2;
    public rojeru_san.RSMTextFull txt_ip3;
    public rojeru_san.RSMTextFull txt_ip4;
    public rojeru_san.RSMTextFull txt_prefijo;
    private javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables
}
