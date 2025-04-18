/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import direccionamiento.clase_direccionamiento_ip;

public class panel_redireccionamientoIp extends javax.swing.JPanel {

    public panel_redireccionamientoIp() {
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
            if (value < 0 || value > 24) {
                evt.consume(); // El valor está fuera del rango, consumir el evento
            }
        } catch (NumberFormatException ex) {
            evt.consume(); // No se puede convertir a un número válido, consumir el evento
        }
    }

    private void Calcular() {
        try {

            int ip1 = Integer.parseInt(txt_ip1.getText());
            int ip2 = Integer.parseInt(txt_ip2.getText());
            int ip3 = Integer.parseInt(txt_ip3.getText());
            int ip4 = Integer.parseInt(txt_ip4.getText());

            if (ip1 >= 0 && ip2 >= 0 && ip3 >= 0 && ip4 >= 0) {
                int prefijo = 0;
                //ver el prefijo
                String clasered = clase_direccionamiento_ip.obtenerClaseDeRed(ip1);

                if (!txt_prefijo.getText().equals("") || Integer.parseInt(txt_ip1.getText()) < 24) {
                    prefijo = Integer.parseInt(txt_prefijo.getText());
                } else {
                    switch (clasered) {
                        case "A":
                            prefijo = 8;
                            break;
                        case "B":
                            prefijo = 16;
                            break;
                        case "C":
                            prefijo = 24;
                            break;
                        default:
                            prefijo = 0;
                            break;
                    }
                }

                clase_direccionamiento_ip clase = new clase_direccionamiento_ip(ip1, ip2, ip3, ip4, prefijo);
                String resultado[] = clase.get_resultadoDecimal();

                limpiar();
                //mostrar 
                lb_ip_d.setText(resultado[0]);
                lb_mascara_d.setText(resultado[1]);
                lb_clase_d.setText(resultado[2]);
                lb_id_d.setText(resultado[3]);
                lb_gateway_d.setText(resultado[4]);
                lb_broascats_d.setText(resultado[5]);
                lb_limite_inferior_d.setText(resultado[6]);
                lb_limiteSuperior_d.setText(resultado[7]);
                lb_host_disponibles_d.setText(resultado[8]);

                //RESULTADOS BINARIOS
                String resultadoBinario[] = clase.get_resultadoBinario();
                lb_direccion_B.setText(resultadoBinario[0]);
                lb_mascara_B.setText(resultadoBinario[1]);
                lb_id_B.setText(resultadoBinario[2]);
                lb_gateway_B.setText(resultadoBinario[3]);
                lb_broascat_B.setText(resultadoBinario[4]);
                lb_limiteInferior_B.setText(resultadoBinario[5]);
                lb_limiteSuperior_B.setText(resultadoBinario[6]);
            } else {
                new alerta(null, true, "Completa la ip").setVisible(true);
               
               
            }

        } catch (Exception e) {
            limpiar();
        }
    }

    private void limpiar() {
        lb_ip_d.setText("0.0.0.0");
        lb_mascara_d.setText("0.0.0.0");
        lb_clase_d.setText("---");
        lb_id_d.setText("0.0.0.0");
        lb_gateway_d.setText("0.0.0.0");
        lb_broascats_d.setText("");
        lb_limite_inferior_d.setText("0.0.0.0");
        lb_direccion_B.setText("0.0.0.0");
        lb_host_disponibles_d.setText("0");

        lb_direccion_B.setText("0000000.0000000.00000000.0000000");
        lb_mascara_B.setText("0000000.0000000.00000000.0000000");
        lb_id_B.setText("0000000.0000000.00000000.0000000");
        lb_gateway_B.setText("0000000.0000000.00000000.0000000");
        lb_broascat_B.setText("0000000.0000000.00000000.0000000");
        lb_limiteInferior_B.setText("0000000.0000000.00000000.0000000");
        lb_limiteSuperior_B.setText("0000000.0000000.00000000.0000000");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lcodigo10 = new javax.swing.JLabel();
        lcodigo11 = new javax.swing.JLabel();
        lcodigo13 = new javax.swing.JLabel();
        lcodigo15 = new javax.swing.JLabel();
        lcodigo16 = new javax.swing.JLabel();
        lcodigo17 = new javax.swing.JLabel();
        lcodigo21 = new javax.swing.JLabel();
        txt_ip4 = new rojeru_san.RSMTextFull();
        txt_ip3 = new rojeru_san.RSMTextFull();
        lcodigo20 = new javax.swing.JLabel();
        lcodigo19 = new javax.swing.JLabel();
        txt_ip2 = new rojeru_san.RSMTextFull();
        lcodigo18 = new javax.swing.JLabel();
        txt_ip1 = new rojeru_san.RSMTextFull();
        btn_usuario3 = new rojerusan.RSMaterialButtonRound();
        lcodigo22 = new javax.swing.JLabel();
        txt_prefijo = new rojeru_san.RSMTextFull();
        rSScrollPane1 = new necesario.RSScrollPane();
        jPanel2 = new javax.swing.JPanel();
        titulos_ip = new javax.swing.JPanel();
        lcodigo32 = new javax.swing.JLabel();
        lcodigo33 = new javax.swing.JLabel();
        lcodigo12 = new javax.swing.JLabel();
        lcodigo34 = new javax.swing.JLabel();
        lcodigo35 = new javax.swing.JLabel();
        lcodigo36 = new javax.swing.JLabel();
        lcodigo14 = new javax.swing.JLabel();
        lcodigo38 = new javax.swing.JLabel();
        lcodigo37 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_host_disponibles_d = new javax.swing.JLabel();
        lb_ip_d = new javax.swing.JLabel();
        lb_mascara_d = new javax.swing.JLabel();
        lb_clase_d = new javax.swing.JLabel();
        lb_id_d = new javax.swing.JLabel();
        lb_gateway_d = new javax.swing.JLabel();
        lb_broascats_d = new javax.swing.JLabel();
        lb_limite_inferior_d = new javax.swing.JLabel();
        lb_limiteSuperior_d = new javax.swing.JLabel();
        jpanel_titulosB = new javax.swing.JPanel();
        lcodigo39 = new javax.swing.JLabel();
        lcodigo40 = new javax.swing.JLabel();
        lcodigo41 = new javax.swing.JLabel();
        lcodigo42 = new javax.swing.JLabel();
        lcodigo43 = new javax.swing.JLabel();
        lcodigo44 = new javax.swing.JLabel();
        lcodigo45 = new javax.swing.JLabel();
        pane_resultadosB = new javax.swing.JPanel();
        lb_direccion_B = new javax.swing.JLabel();
        lb_mascara_B = new javax.swing.JLabel();
        lb_id_B = new javax.swing.JLabel();
        lb_gateway_B = new javax.swing.JLabel();
        lb_broascat_B = new javax.swing.JLabel();
        lb_limiteInferior_B = new javax.swing.JLabel();
        lb_limiteSuperior_B = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(244, 248, 247));
        jPanel1.setLayout(null);

        lcodigo10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo10.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo10.setText("Direccion IP:");
        jPanel1.add(lcodigo10);
        lcodigo10.setBounds(10, 0, 160, 20);

        lcodigo11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo11.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo11.setText("Mascara:");
        jPanel1.add(lcodigo11);
        lcodigo11.setBounds(10, 20, 160, 20);

        lcodigo13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo13.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo13.setText("ID de Red:");
        jPanel1.add(lcodigo13);
        lcodigo13.setBounds(10, 40, 170, 20);

        lcodigo15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo15.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo15.setText("Gateway:");
        jPanel1.add(lcodigo15);
        lcodigo15.setBounds(10, 60, 170, 20);

        lcodigo16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo16.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo16.setText("Broadcast:");
        jPanel1.add(lcodigo16);
        lcodigo16.setBounds(10, 80, 170, 20);

        lcodigo17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo17.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo17.setText("Limite Inferior: ");
        jPanel1.add(lcodigo17);
        lcodigo17.setBounds(10, 100, 170, 20);

        lcodigo21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo21.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo21.setText("Limite Superior: ");
        jPanel1.add(lcodigo21);
        lcodigo21.setBounds(10, 120, 170, 20);

        setBackground(new java.awt.Color(244, 248, 247));

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

        lcodigo20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo20.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo20.setText(".");

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

        btn_usuario3.setBorder(null);
        btn_usuario3.setText("Calcular");
        btn_usuario3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_usuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario3ActionPerformed(evt);
            }
        });

        lcodigo22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo22.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo22.setText("/");

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prefijoKeyTyped(evt);
            }
        });

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        rSScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        rSScrollPane1.setColorBackground(new java.awt.Color(244, 248, 247));

        jPanel2.setBackground(new java.awt.Color(244, 248, 247));

        titulos_ip.setBackground(new java.awt.Color(244, 248, 247));
        titulos_ip.setLayout(null);

        lcodigo32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo32.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo32.setText("Direccion IP:");
        titulos_ip.add(lcodigo32);
        lcodigo32.setBounds(10, 10, 160, 20);

        lcodigo33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo33.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo33.setText("Mascara:");
        titulos_ip.add(lcodigo33);
        lcodigo33.setBounds(10, 30, 160, 20);

        lcodigo12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo12.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo12.setText("Clase de Red:");
        titulos_ip.add(lcodigo12);
        lcodigo12.setBounds(10, 50, 170, 20);

        lcodigo34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo34.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo34.setText("ID de Red:");
        titulos_ip.add(lcodigo34);
        lcodigo34.setBounds(10, 70, 170, 20);

        lcodigo35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo35.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo35.setText("Gateway:");
        titulos_ip.add(lcodigo35);
        lcodigo35.setBounds(10, 90, 170, 20);

        lcodigo36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo36.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo36.setText("Broadcast:");
        titulos_ip.add(lcodigo36);
        lcodigo36.setBounds(10, 110, 170, 20);

        lcodigo14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo14.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo14.setText("Nº de host Disponibles:");
        titulos_ip.add(lcodigo14);
        lcodigo14.setBounds(10, 170, 170, 20);

        lcodigo38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo38.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo38.setText("Limite Superior: ");
        titulos_ip.add(lcodigo38);
        lcodigo38.setBounds(10, 150, 170, 20);

        lcodigo37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo37.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo37.setText("Limite Inferior: ");
        titulos_ip.add(lcodigo37);
        lcodigo37.setBounds(10, 130, 170, 20);

        jPanel3.setBackground(new java.awt.Color(244, 248, 247));
        jPanel3.setLayout(null);

        lb_host_disponibles_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_host_disponibles_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_host_disponibles_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_host_disponibles_d.setText("0");
        jPanel3.add(lb_host_disponibles_d);
        lb_host_disponibles_d.setBounds(10, 170, 170, 20);

        lb_ip_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_ip_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_ip_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_ip_d.setText("0.0.0.0");
        jPanel3.add(lb_ip_d);
        lb_ip_d.setBounds(10, 10, 170, 20);

        lb_mascara_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_mascara_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_mascara_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_mascara_d.setText("0.0.0.0");
        jPanel3.add(lb_mascara_d);
        lb_mascara_d.setBounds(10, 30, 170, 20);

        lb_clase_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_clase_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_clase_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_clase_d.setText("--");
        jPanel3.add(lb_clase_d);
        lb_clase_d.setBounds(10, 50, 170, 20);

        lb_id_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_id_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_id_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_id_d.setText("0.0.0.0");
        jPanel3.add(lb_id_d);
        lb_id_d.setBounds(10, 70, 170, 20);

        lb_gateway_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_gateway_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_gateway_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_gateway_d.setText("0.0.0.0");
        jPanel3.add(lb_gateway_d);
        lb_gateway_d.setBounds(10, 90, 170, 20);

        lb_broascats_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_broascats_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_broascats_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_broascats_d.setText("0.0.0.0");
        jPanel3.add(lb_broascats_d);
        lb_broascats_d.setBounds(10, 110, 170, 20);

        lb_limite_inferior_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_limite_inferior_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_limite_inferior_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_limite_inferior_d.setText("0.0.0.0");
        jPanel3.add(lb_limite_inferior_d);
        lb_limite_inferior_d.setBounds(10, 130, 170, 20);

        lb_limiteSuperior_d.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_limiteSuperior_d.setForeground(new java.awt.Color(46, 78, 114));
        lb_limiteSuperior_d.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_limiteSuperior_d.setText("0.0.0.0");
        jPanel3.add(lb_limiteSuperior_d);
        lb_limiteSuperior_d.setBounds(10, 150, 170, 20);

        jpanel_titulosB.setBackground(new java.awt.Color(244, 248, 247));
        jpanel_titulosB.setLayout(null);

        lcodigo39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo39.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo39.setText("Direccion IP:");
        jpanel_titulosB.add(lcodigo39);
        lcodigo39.setBounds(10, 10, 160, 20);

        lcodigo40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo40.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo40.setText("Mascara:");
        jpanel_titulosB.add(lcodigo40);
        lcodigo40.setBounds(10, 30, 160, 20);

        lcodigo41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo41.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo41.setText("ID de Red:");
        jpanel_titulosB.add(lcodigo41);
        lcodigo41.setBounds(10, 50, 140, 20);

        lcodigo42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo42.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo42.setText("Gateway:");
        jpanel_titulosB.add(lcodigo42);
        lcodigo42.setBounds(10, 70, 140, 20);

        lcodigo43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo43.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo43.setText("Broadcast:");
        jpanel_titulosB.add(lcodigo43);
        lcodigo43.setBounds(10, 90, 140, 20);

        lcodigo44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo44.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo44.setText("Limite Superior: ");
        jpanel_titulosB.add(lcodigo44);
        lcodigo44.setBounds(10, 130, 140, 20);

        lcodigo45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo45.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo45.setText("Limite Inferior: ");
        jpanel_titulosB.add(lcodigo45);
        lcodigo45.setBounds(10, 110, 140, 20);

        pane_resultadosB.setBackground(new java.awt.Color(244, 248, 247));
        pane_resultadosB.setLayout(null);

        lb_direccion_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_direccion_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_direccion_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_direccion_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_direccion_B);
        lb_direccion_B.setBounds(0, 10, 275, 20);

        lb_mascara_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_mascara_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_mascara_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_mascara_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_mascara_B);
        lb_mascara_B.setBounds(0, 30, 294, 20);

        lb_id_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_id_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_id_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_id_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_id_B);
        lb_id_B.setBounds(0, 130, 294, 20);

        lb_gateway_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_gateway_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_gateway_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_gateway_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_gateway_B);
        lb_gateway_B.setBounds(0, 50, 294, 20);

        lb_broascat_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_broascat_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_broascat_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_broascat_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_broascat_B);
        lb_broascat_B.setBounds(0, 70, 294, 20);

        lb_limiteInferior_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_limiteInferior_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_limiteInferior_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_limiteInferior_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_limiteInferior_B);
        lb_limiteInferior_B.setBounds(0, 90, 294, 20);

        lb_limiteSuperior_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_limiteSuperior_B.setForeground(new java.awt.Color(46, 78, 114));
        lb_limiteSuperior_B.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_limiteSuperior_B.setText("00000000.0000000.00000000.00000000");
        pane_resultadosB.add(lb_limiteSuperior_B);
        lb_limiteSuperior_B.setBounds(0, 110, 294, 20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titulos_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpanel_titulosB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pane_resultadosB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(titulos_ip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpanel_titulosB, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pane_resultadosB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        rSScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(btn_usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_prefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_prefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btn_usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        validaRango_decimal(evt, txt_ip4);
    }//GEN-LAST:event_txt_ip4KeyTyped

    private void txt_ip3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip3FocusGained

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
        validaRango_decimal(evt, txt_ip3);
    }//GEN-LAST:event_txt_ip3KeyTyped

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
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip2KeyPressed

    private void txt_ip2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyReleased

    }//GEN-LAST:event_txt_ip2KeyReleased

    private void txt_ip2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyTyped
        // TODO add your handling code here:
        validaRango_decimal(evt, txt_ip2);
    }//GEN-LAST:event_txt_ip2KeyTyped

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

    }//GEN-LAST:event_txt_ip1KeyPressed

    private void txt_ip1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_ip1KeyReleased

    private void txt_ip1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyTyped

        validaRango_decimal(evt, txt_ip1);
    }//GEN-LAST:event_txt_ip1KeyTyped

    private void btn_usuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario3ActionPerformed
        Calcular();
    }//GEN-LAST:event_btn_usuario3ActionPerformed

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
        validaRango_prefijo(evt, txt_prefijo);
    }//GEN-LAST:event_txt_prefijoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRound btn_usuario3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpanel_titulosB;
    public javax.swing.JLabel lb_broascat_B;
    public javax.swing.JLabel lb_broascats_d;
    public javax.swing.JLabel lb_clase_d;
    public javax.swing.JLabel lb_direccion_B;
    public javax.swing.JLabel lb_gateway_B;
    public javax.swing.JLabel lb_gateway_d;
    public javax.swing.JLabel lb_host_disponibles_d;
    public javax.swing.JLabel lb_id_B;
    public javax.swing.JLabel lb_id_d;
    public javax.swing.JLabel lb_ip_d;
    public javax.swing.JLabel lb_limiteInferior_B;
    public javax.swing.JLabel lb_limiteSuperior_B;
    public javax.swing.JLabel lb_limiteSuperior_d;
    public javax.swing.JLabel lb_limite_inferior_d;
    public javax.swing.JLabel lb_mascara_B;
    public javax.swing.JLabel lb_mascara_d;
    private javax.swing.JLabel lcodigo10;
    private javax.swing.JLabel lcodigo11;
    private javax.swing.JLabel lcodigo12;
    private javax.swing.JLabel lcodigo13;
    private javax.swing.JLabel lcodigo14;
    private javax.swing.JLabel lcodigo15;
    private javax.swing.JLabel lcodigo16;
    private javax.swing.JLabel lcodigo17;
    private javax.swing.JLabel lcodigo18;
    private javax.swing.JLabel lcodigo19;
    private javax.swing.JLabel lcodigo20;
    private javax.swing.JLabel lcodigo21;
    private javax.swing.JLabel lcodigo22;
    private javax.swing.JLabel lcodigo32;
    private javax.swing.JLabel lcodigo33;
    private javax.swing.JLabel lcodigo34;
    private javax.swing.JLabel lcodigo35;
    private javax.swing.JLabel lcodigo36;
    private javax.swing.JLabel lcodigo37;
    private javax.swing.JLabel lcodigo38;
    private javax.swing.JLabel lcodigo39;
    private javax.swing.JLabel lcodigo40;
    private javax.swing.JLabel lcodigo41;
    private javax.swing.JLabel lcodigo42;
    private javax.swing.JLabel lcodigo43;
    private javax.swing.JLabel lcodigo44;
    private javax.swing.JLabel lcodigo45;
    private javax.swing.JPanel pane_resultadosB;
    private necesario.RSScrollPane rSScrollPane1;
    private javax.swing.JPanel titulos_ip;
    public rojeru_san.RSMTextFull txt_ip1;
    public rojeru_san.RSMTextFull txt_ip2;
    public rojeru_san.RSMTextFull txt_ip3;
    public rojeru_san.RSMTextFull txt_ip4;
    public rojeru_san.RSMTextFull txt_prefijo;
    // End of variables declaration//GEN-END:variables
}
