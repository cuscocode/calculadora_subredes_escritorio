/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conversor.clase_binario_y_decimal;
import javax.swing.JTextField;

/**
 *
 * @author hack
 */
public class panel_conversor extends javax.swing.JPanel {

    clase_binario_y_decimal claseConversor = new clase_binario_y_decimal();

    public panel_conversor() {
        initComponents();

        //Alinear
        txt_ip1.setHorizontalAlignment(JTextField.CENTER);
        txt_ip2.setHorizontalAlignment(JTextField.CENTER);
        txt_ip3.setHorizontalAlignment(JTextField.CENTER);
        txt_ip4.setHorizontalAlignment(JTextField.CENTER);
    }

    private String convertirArreglo_a_cadena(int[] arreglo) {
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }

        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lcodigo18 = new javax.swing.JLabel();
        txt_ip1 = new rojeru_san.RSMTextFull();
        lcodigo19 = new javax.swing.JLabel();
        txt_ip2 = new rojeru_san.RSMTextFull();
        lcodigo20 = new javax.swing.JLabel();
        txt_ip3 = new rojeru_san.RSMTextFull();
        txt_ip4 = new rojeru_san.RSMTextFull();
        lbl_nombre_negocio2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_1 = new javax.swing.JLabel();
        lb_cliente_estado = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();
        lb_cliente_estado3 = new javax.swing.JLabel();
        lb_cliente_estado4 = new javax.swing.JLabel();
        lb_3 = new javax.swing.JLabel();
        lb_4 = new javax.swing.JLabel();
        lbl_nombre_negocio3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_b1 = new javax.swing.JLabel();
        lb_cliente_estado1 = new javax.swing.JLabel();
        lb_cliente_estado2 = new javax.swing.JLabel();
        lb_b2 = new javax.swing.JLabel();
        lb_cliente_estado5 = new javax.swing.JLabel();
        lb_b3 = new javax.swing.JLabel();
        lb_b4 = new javax.swing.JLabel();
        lcodigo22 = new javax.swing.JLabel();
        txt_bi1 = new rojeru_san.RSMTextFull();
        txt_bi2 = new rojeru_san.RSMTextFull();
        lcodigo23 = new javax.swing.JLabel();
        lcodigo24 = new javax.swing.JLabel();
        txt_bi3 = new rojeru_san.RSMTextFull();
        txt_bi4 = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(244, 248, 247));

        lcodigo18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo18.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo18.setText(".");

        txt_ip1.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip1.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip1.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip1.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip1.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip1.setColorTransparente(true);
        txt_ip1.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip1.setPlaceholder("192");
        txt_ip1.setSoloNumeros(true);
        txt_ip1.addFocusListener(new java.awt.event.FocusAdapter() {
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip1KeyTyped(evt);
            }
        });

        lcodigo19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo19.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo19.setText(".");

        txt_ip2.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip2.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip2.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip2.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip2.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip2.setColorTransparente(true);
        txt_ip2.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip2.setPlaceholder("168");
        txt_ip2.setSoloNumeros(true);
        txt_ip2.addFocusListener(new java.awt.event.FocusAdapter() {
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip2KeyTyped(evt);
            }
        });

        lcodigo20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo20.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo20.setText(".");

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip3KeyTyped(evt);
            }
        });

        txt_ip4.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip4.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip4.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip4.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip4.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip4.setColorTransparente(true);
        txt_ip4.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip4.setPlaceholder("1");
        txt_ip4.setSoloNumeros(true);
        txt_ip4.addFocusListener(new java.awt.event.FocusAdapter() {
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip4KeyTyped(evt);
            }
        });

        lbl_nombre_negocio2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_nombre_negocio2.setForeground(new java.awt.Color(46, 78, 114));
        lbl_nombre_negocio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_negocio2.setText("Convertir IP de Decimal a Binario");

        jPanel1.setBackground(new java.awt.Color(244, 248, 247));

        lb_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_1.setForeground(new java.awt.Color(46, 78, 114));
        lb_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_1.setText("00000000");

        lb_cliente_estado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado.setText(".");

        lb_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_2.setForeground(new java.awt.Color(46, 78, 114));
        lb_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_2.setText("00000000");

        lb_cliente_estado3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado3.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado3.setText(".");

        lb_cliente_estado4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado4.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado4.setText(".");

        lb_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_3.setForeground(new java.awt.Color(46, 78, 114));
        lb_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_3.setText("00000000");

        lb_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_4.setForeground(new java.awt.Color(46, 78, 114));
        lb_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_4.setText("00000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        lbl_nombre_negocio3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_nombre_negocio3.setForeground(new java.awt.Color(46, 78, 114));
        lbl_nombre_negocio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_negocio3.setText("Convertir IP de Binario a Decimal");

        jPanel2.setBackground(new java.awt.Color(244, 248, 247));

        lb_b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_b1.setForeground(new java.awt.Color(46, 78, 114));
        lb_b1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_b1.setText("0");

        lb_cliente_estado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado1.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado1.setText(".");

        lb_cliente_estado2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado2.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado2.setText(".");

        lb_b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_b2.setForeground(new java.awt.Color(46, 78, 114));
        lb_b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_b2.setText("0");

        lb_cliente_estado5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cliente_estado5.setForeground(new java.awt.Color(46, 78, 114));
        lb_cliente_estado5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_cliente_estado5.setText(".");

        lb_b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_b3.setForeground(new java.awt.Color(46, 78, 114));
        lb_b3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_b3.setText("0");

        lb_b4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_b4.setForeground(new java.awt.Color(46, 78, 114));
        lb_b4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_b4.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado2)
                .addGap(18, 18, 18)
                .addComponent(lb_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cliente_estado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_b4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_b4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cliente_estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        lcodigo22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo22.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo22.setText(".");

        txt_bi1.setBackground(new java.awt.Color(46, 78, 114));
        txt_bi1.setForeground(new java.awt.Color(46, 78, 114));
        txt_bi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bi1.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_bi1.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_bi1.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_bi1.setColorTransparente(true);
        txt_bi1.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_bi1.setPlaceholder("00000000");
        txt_bi1.setSoloNumeros(true);
        txt_bi1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bi1FocusLost(evt);
            }
        });
        txt_bi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bi1ActionPerformed(evt);
            }
        });
        txt_bi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bi1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bi1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bi1KeyTyped(evt);
            }
        });

        txt_bi2.setBackground(new java.awt.Color(46, 78, 114));
        txt_bi2.setForeground(new java.awt.Color(46, 78, 114));
        txt_bi2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bi2.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_bi2.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_bi2.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_bi2.setColorTransparente(true);
        txt_bi2.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_bi2.setPlaceholder("00000000");
        txt_bi2.setSoloNumeros(true);
        txt_bi2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bi2FocusLost(evt);
            }
        });
        txt_bi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bi2ActionPerformed(evt);
            }
        });
        txt_bi2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bi2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bi2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bi2KeyTyped(evt);
            }
        });

        lcodigo23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo23.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo23.setText(".");

        lcodigo24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo24.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo24.setText(".");

        txt_bi3.setBackground(new java.awt.Color(46, 78, 114));
        txt_bi3.setForeground(new java.awt.Color(46, 78, 114));
        txt_bi3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bi3.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_bi3.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_bi3.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_bi3.setColorTransparente(true);
        txt_bi3.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_bi3.setPlaceholder("00000000");
        txt_bi3.setSoloNumeros(true);
        txt_bi3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bi3FocusLost(evt);
            }
        });
        txt_bi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bi3ActionPerformed(evt);
            }
        });
        txt_bi3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bi3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bi3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bi3KeyTyped(evt);
            }
        });

        txt_bi4.setBackground(new java.awt.Color(46, 78, 114));
        txt_bi4.setForeground(new java.awt.Color(46, 78, 114));
        txt_bi4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bi4.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_bi4.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_bi4.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_bi4.setColorTransparente(true);
        txt_bi4.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_bi4.setPlaceholder("00000000");
        txt_bi4.setSoloNumeros(true);
        txt_bi4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bi4FocusLost(evt);
            }
        });
        txt_bi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bi4ActionPerformed(evt);
            }
        });
        txt_bi4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bi4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bi4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bi4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl_nombre_negocio2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lcodigo18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcodigo19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcodigo20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nombre_negocio3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_bi1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_bi2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lcodigo23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_bi3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lcodigo24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_bi4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombre_negocio2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nombre_negocio3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bi1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bi2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bi3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txt_bi4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ip1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1FocusLost

    private void txt_ip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip1ActionPerformed

    private void txt_ip1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyPressed
        try {
            if (txt_ip1.getText().equals("")) {
                lb_1.setText("00000000");
            }
            int arreglo[] = claseConversor.get_arreglo_decimal_a_binario(Integer.parseInt(txt_ip1.getText()));
            lb_1.setText(convertirArreglo_a_cadena(arreglo));
        } catch (Exception e) {
            lb_1.setText("00000000");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_ip1KeyPressed

    private void txt_ip1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyTyped

    }//GEN-LAST:event_txt_ip1KeyTyped

    private void txt_ip2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2FocusLost

    private void txt_ip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2ActionPerformed

    private void txt_ip2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2KeyPressed

    private void txt_ip2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2KeyTyped

    private void txt_ip3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3FocusLost

    private void txt_ip3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3ActionPerformed

    private void txt_ip3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3KeyPressed

    private void txt_ip3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip3KeyTyped

    private void txt_ip4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4FocusLost

    private void txt_ip4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4ActionPerformed

    private void txt_ip4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4KeyPressed

    private void txt_ip4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip4KeyTyped

    private void txt_ip1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_ip1KeyReleased

    private void txt_ip2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_ip2.getText().equals("")) {
                lb_1.setText("00000000");
            }
            int arreglo[] = claseConversor.get_arreglo_decimal_a_binario(Integer.parseInt(txt_ip2.getText()));
            lb_2.setText(convertirArreglo_a_cadena(arreglo));
        } catch (Exception e) {
            lb_2.setText("00000000");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_ip2KeyReleased

    private void txt_ip3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_ip3.getText().equals("")) {
                lb_3.setText("00000000");
            }
            int arreglo[] = claseConversor.get_arreglo_decimal_a_binario(Integer.parseInt(txt_ip3.getText()));
            lb_3.setText(convertirArreglo_a_cadena(arreglo));
        } catch (Exception e) {
            lb_3.setText("00000000");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_ip3KeyReleased

    private void txt_ip4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_ip4.getText().equals("")) {
                lb_4.setText("00000000");
            }
            int arreglo[] = claseConversor.get_arreglo_decimal_a_binario(Integer.parseInt(txt_ip4.getText()));
            lb_4.setText(convertirArreglo_a_cadena(arreglo));
        } catch (Exception e) {
            lb_4.setText("00000000");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_ip4KeyReleased

    private void txt_bi1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bi1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi1FocusLost

    private void txt_bi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi1ActionPerformed

    private void txt_bi1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_bi1KeyPressed

    private void txt_bi1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi1KeyReleased

        try {
            if (txt_bi1.getText().equals("")) {
                lb_1.setText("0");
            }
            long resultado = claseConversor.convertirBinarioADecimalManual(txt_bi1.getText());
            lb_b1.setText(resultado + "");
        } catch (Exception e) {
            lb_b1.setText("0");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_bi1KeyReleased

    private void txt_bi1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi1KeyTyped

    private void txt_bi2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bi2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi2FocusLost

    private void txt_bi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi2ActionPerformed

    private void txt_bi2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi2KeyPressed

    private void txt_bi2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi2KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_bi2.getText().equals("")) {
                lb_2.setText("0");
            }
            long resultado = claseConversor.convertirBinarioADecimalManual(txt_bi2.getText());
            lb_b2.setText(resultado + "");
        } catch (Exception e) {
            lb_b2.setText("0");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_bi2KeyReleased

    private void txt_bi2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi2KeyTyped

    private void txt_bi3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bi3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi3FocusLost

    private void txt_bi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi3ActionPerformed

    private void txt_bi3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi3KeyPressed

    private void txt_bi3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi3KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_bi3.getText().equals("")) {
                lb_3.setText("0");
            }
            long resultado = claseConversor.convertirBinarioADecimalManual(txt_bi3.getText());
            lb_b1.setText(resultado + "");
        } catch (Exception e) {
            lb_b3.setText("0");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_bi3KeyReleased

    private void txt_bi3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi3KeyTyped

    private void txt_bi4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bi4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi4FocusLost

    private void txt_bi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi4ActionPerformed

    private void txt_bi4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi4KeyPressed

    private void txt_bi4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi4KeyReleased
        // TODO add your handling code here:
        try {
            if (txt_bi4.getText().equals("")) {
                lb_4.setText("0");
            }
            long resultado = claseConversor.convertirBinarioADecimalManual(txt_bi4.getText());
            lb_b4.setText(resultado + "");
        } catch (Exception e) {
            lb_b4.setText("0");
            System.out.println("ocurrio un error:" + e);
        }
    }//GEN-LAST:event_txt_bi4KeyReleased

    private void txt_bi4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bi4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bi4KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lb_1;
    public javax.swing.JLabel lb_2;
    public javax.swing.JLabel lb_3;
    public javax.swing.JLabel lb_4;
    public javax.swing.JLabel lb_b1;
    public javax.swing.JLabel lb_b2;
    public javax.swing.JLabel lb_b3;
    public javax.swing.JLabel lb_b4;
    public javax.swing.JLabel lb_cliente_estado;
    public javax.swing.JLabel lb_cliente_estado1;
    public javax.swing.JLabel lb_cliente_estado2;
    public javax.swing.JLabel lb_cliente_estado3;
    public javax.swing.JLabel lb_cliente_estado4;
    public javax.swing.JLabel lb_cliente_estado5;
    private javax.swing.JLabel lbl_nombre_negocio2;
    private javax.swing.JLabel lbl_nombre_negocio3;
    private javax.swing.JLabel lcodigo18;
    private javax.swing.JLabel lcodigo19;
    private javax.swing.JLabel lcodigo20;
    private javax.swing.JLabel lcodigo22;
    private javax.swing.JLabel lcodigo23;
    private javax.swing.JLabel lcodigo24;
    public rojeru_san.RSMTextFull txt_bi1;
    public rojeru_san.RSMTextFull txt_bi2;
    public rojeru_san.RSMTextFull txt_bi3;
    public rojeru_san.RSMTextFull txt_bi4;
    public rojeru_san.RSMTextFull txt_ip1;
    public rojeru_san.RSMTextFull txt_ip2;
    public rojeru_san.RSMTextFull txt_ip3;
    public rojeru_san.RSMTextFull txt_ip4;
    // End of variables declaration//GEN-END:variables
}
