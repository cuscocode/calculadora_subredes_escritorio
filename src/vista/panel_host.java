package vista;

import host.encontrar_host_n;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;
import javax.swing.UIManager;
import host.host_pertenece;
import direccionamiento.clase_direccionamiento_ip;

public class panel_host extends javax.swing.JPanel {

    public panel_host() {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Personaliza la apariencia de las pestañas
        UIManager.put("TabbedPane.selected", new ColorUIResource(new Color(98, 202, 201))); // Color de fondo de la pestaña activa
        //UIManager.put("TabbedPane.selectedForeground", new ColorUIResource(new Color(255,255,255))); // Color del texto de la pestaña activa

        //UIManager.put("TabbedPane.unselectedBackground", new ColorUIResource(Color.GRAY)); // Color de fondo de las pestañas inactivas
        //UIManager.put("TabbedPane.unselectedForeground", new ColorUIResource(Color.blue)); // Color del texto de las pestañas inactivas
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

    /* obtener la ip de n hos*/
    private void calcularObtenerN() {
        lb_resultado_ipdeHost.setText("...");
        try {
            int ip1 = Integer.parseInt(txt_ip11.getText());
            int ip2 = Integer.parseInt(txt_ip22.getText());
            int ip3 = Integer.parseInt(txt_ip33.getText());
            int ip4 = Integer.parseInt(txt_ip44.getText());
            int prefijo = Integer.parseInt(txt_prefijo22.getText());
            int host_encontrar = Integer.parseInt(txt_hostEncontrar.getText());

            int nro_maquinas = (int) Math.pow(2, (32 - prefijo) - 2);

            if (host_encontrar <= nro_maquinas) {
                encontrar_host_n clase = new encontrar_host_n(ip1, ip2, ip3, ip4, prefijo, host_encontrar);

                lb_resultado_ipdeHost.setText("el host n°: " + clase.get_hostN_encontrar() + " de la red orignal: " + clase.get_red_original() + "\n"
                        + " tiene como direccion ip:  " + clase.get_hostIp_encontrado());
            } else {
                lb_resultado_ipdeHost.setText("el n° de host a econtrar deber ser menor o igual a: " + nro_maquinas);
            }
        } catch (Exception e) {

        }


        /*
        encontrar_host_n claseHosEncontrar = new encontrar_host_n(ip1, ip2, ip3, ip4, prefijo, nhostEncontrar);
        String ipOriginal = claseHosEncontrar.get_hostN_encontrar();
        String RedOriginal = claseHosEncontrar.get_red_original();
        String host = claseHosEncontrar.get_hostIp_encontrado();*/
    }

    private void calcularObtenerNhost() {
        lb_resultado.setText("...");
        try {
            int ip1 = Integer.parseInt(txt_ip1.getText());
            int ip2 = Integer.parseInt(txt_ip2.getText());
            int ip3 = Integer.parseInt(txt_ip3.getText());
            int ip4 = Integer.parseInt(txt_ip4.getText());
            int prefijo = Integer.parseInt(txt_prefijoMascara.getText());

            if (ip1 > 0 && ip1 <= 223) {

                if (clase_direccionamiento_ip.obtenerClaseDeRed(ip1).equals("A")) {
                    if (prefijo >= 8) {
                        host_pertenece clase = new host_pertenece(ip1, ip2, ip3, ip4, prefijo);

                        lb_resultado.setText("la ip: " + clase.get_ipes() + " pertenece al host N°: " + clase.get_host() + " de la red: " + clase.get_id_red());
                    } else {
                        lb_resultado.setText("el prefijo de la mascara para la red de clase A debe ser mayor o igual a 8");
                    }

                }

                if (clase_direccionamiento_ip.obtenerClaseDeRed(ip1).equals("B")) {
                    if (prefijo >= 16) {
                        host_pertenece clase = new host_pertenece(ip1, ip2, ip3, ip4, prefijo);

                        lb_resultado.setText("la ip: " + clase.get_ipes() + " pertenece al host N°: " + clase.get_host() + " de la red: " + clase.get_id_red());
                    } else {
                        lb_resultado.setText("el prefijo de la mascara para la red de clase B debe ser mayor o igual a 16");
                    }

                }

                if (clase_direccionamiento_ip.obtenerClaseDeRed(ip1).equals("C")) {
                    if (prefijo >= 24) {
                        host_pertenece clase = new host_pertenece(ip1, ip2, ip3, ip4, prefijo);
                        lb_resultado.setText("la ip: " + clase.get_ipes() + " pertenece al host N°: " + clase.get_host() + " de la red: " + clase.get_id_red());
                    } else {
                        lb_resultado.setText("el prefijo de la mascara la red de clase C debe ser mayor o igual a 24");
                    }

                }

            } else {
                lb_resultado.setText("solo se aceptan redes de clase A,B y C");

            }

            System.out.println(prefijo);
        } catch (Exception e) {
            System.out.println("ocurrio un error: \n" + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_ventana = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lcodigo32 = new javax.swing.JLabel();
        txt_ip4 = new rojeru_san.RSMTextFull();
        txt_ip3 = new rojeru_san.RSMTextFull();
        lcodigo20 = new javax.swing.JLabel();
        lcodigo19 = new javax.swing.JLabel();
        txt_ip2 = new rojeru_san.RSMTextFull();
        lcodigo18 = new javax.swing.JLabel();
        txt_ip1 = new rojeru_san.RSMTextFull();
        lcodigo33 = new javax.swing.JLabel();
        txt_prefijoMascara = new rojeru_san.RSMTextFull();
        btn_usuario3 = new rojerusan.RSMaterialButtonRound();
        lb_resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lcodigo35 = new javax.swing.JLabel();
        txt_ip11 = new rojeru_san.RSMTextFull();
        lcodigo21 = new javax.swing.JLabel();
        txt_ip22 = new rojeru_san.RSMTextFull();
        lcodigo22 = new javax.swing.JLabel();
        txt_ip33 = new rojeru_san.RSMTextFull();
        lcodigo23 = new javax.swing.JLabel();
        txt_ip44 = new rojeru_san.RSMTextFull();
        lcodigo36 = new javax.swing.JLabel();
        txt_hostEncontrar = new rojeru_san.RSMTextFull();
        btn_usuario4 = new rojerusan.RSMaterialButtonRound();
        lb_resultado_ipdeHost = new javax.swing.JLabel();
        lcodigo24 = new javax.swing.JLabel();
        txt_prefijo22 = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(244, 248, 247));

        tab_ventana.setBackground(new java.awt.Color(244, 248, 247));
        tab_ventana.setForeground(new java.awt.Color(46, 78, 114));
        tab_ventana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(244, 248, 247));

        lcodigo32.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lcodigo32.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigo32.setText("Obtener el número de host de un equipo dado su dirección IP.");

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

        lcodigo33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo33.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo33.setText("Prefijo de la Mascara:");

        txt_prefijoMascara.setBackground(new java.awt.Color(46, 78, 114));
        txt_prefijoMascara.setForeground(new java.awt.Color(46, 78, 114));
        txt_prefijoMascara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_prefijoMascara.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_prefijoMascara.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_prefijoMascara.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_prefijoMascara.setColorTransparente(true);
        txt_prefijoMascara.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_prefijoMascara.setPlaceholder("24");
        txt_prefijoMascara.setSoloNumeros(true);
        txt_prefijoMascara.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_prefijoMascaraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_prefijoMascaraFocusLost(evt);
            }
        });
        txt_prefijoMascara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prefijoMascaraActionPerformed(evt);
            }
        });
        txt_prefijoMascara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prefijoMascaraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prefijoMascaraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prefijoMascaraKeyTyped(evt);
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

        lb_resultado.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_resultado.setForeground(new java.awt.Color(46, 78, 114));
        lb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_resultado.setText("....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lcodigo33, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_prefijoMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcodigo18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcodigo19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcodigo20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lcodigo32, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcodigo32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prefijoMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        tab_ventana.addTab("Obtener N° De Host De IP", jPanel1);

        jPanel2.setBackground(new java.awt.Color(244, 248, 247));

        lcodigo35.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lcodigo35.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigo35.setText("Obtener la direccion IP de Nº  de un Host determinado");

        txt_ip11.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip11.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip11.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip11.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip11.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip11.setColorTransparente(true);
        txt_ip11.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip11.setPlaceholder("192");
        txt_ip11.setSoloNumeros(true);
        txt_ip11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip11FocusLost(evt);
            }
        });
        txt_ip11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip11ActionPerformed(evt);
            }
        });
        txt_ip11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip11KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip11KeyTyped(evt);
            }
        });

        lcodigo21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo21.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo21.setText(".");

        txt_ip22.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip22.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip22.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip22.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip22.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip22.setColorTransparente(true);
        txt_ip22.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip22.setPlaceholder("168");
        txt_ip22.setSoloNumeros(true);
        txt_ip22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip22FocusLost(evt);
            }
        });
        txt_ip22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip22ActionPerformed(evt);
            }
        });
        txt_ip22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip22KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip22KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip22KeyTyped(evt);
            }
        });

        lcodigo22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo22.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo22.setText(".");

        txt_ip33.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip33.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip33.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip33.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip33.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip33.setColorTransparente(true);
        txt_ip33.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip33.setPlaceholder("0");
        txt_ip33.setSoloNumeros(true);
        txt_ip33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip33FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip33FocusLost(evt);
            }
        });
        txt_ip33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip33ActionPerformed(evt);
            }
        });
        txt_ip33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip33KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip33KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip33KeyTyped(evt);
            }
        });

        lcodigo23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo23.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo23.setText(".");

        txt_ip44.setBackground(new java.awt.Color(46, 78, 114));
        txt_ip44.setForeground(new java.awt.Color(46, 78, 114));
        txt_ip44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ip44.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_ip44.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_ip44.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_ip44.setColorTransparente(true);
        txt_ip44.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_ip44.setPlaceholder("1");
        txt_ip44.setSoloNumeros(true);
        txt_ip44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ip44FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ip44FocusLost(evt);
            }
        });
        txt_ip44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ip44ActionPerformed(evt);
            }
        });
        txt_ip44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ip44KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip44KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip44KeyTyped(evt);
            }
        });

        lcodigo36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo36.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo36.setText("Nº de Host a Encontrar:");

        txt_hostEncontrar.setBackground(new java.awt.Color(46, 78, 114));
        txt_hostEncontrar.setForeground(new java.awt.Color(46, 78, 114));
        txt_hostEncontrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_hostEncontrar.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_hostEncontrar.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_hostEncontrar.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_hostEncontrar.setColorTransparente(true);
        txt_hostEncontrar.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_hostEncontrar.setPlaceholder("24");
        txt_hostEncontrar.setSoloNumeros(true);
        txt_hostEncontrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_hostEncontrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_hostEncontrarFocusLost(evt);
            }
        });
        txt_hostEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hostEncontrarActionPerformed(evt);
            }
        });
        txt_hostEncontrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_hostEncontrarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_hostEncontrarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hostEncontrarKeyTyped(evt);
            }
        });

        btn_usuario4.setBorder(null);
        btn_usuario4.setText("Calcular");
        btn_usuario4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btn_usuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario4ActionPerformed(evt);
            }
        });

        lb_resultado_ipdeHost.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_resultado_ipdeHost.setForeground(new java.awt.Color(46, 78, 114));
        lb_resultado_ipdeHost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_resultado_ipdeHost.setText("...");

        lcodigo24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcodigo24.setForeground(new java.awt.Color(46, 78, 114));
        lcodigo24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lcodigo24.setText("/");

        txt_prefijo22.setBackground(new java.awt.Color(46, 78, 114));
        txt_prefijo22.setForeground(new java.awt.Color(46, 78, 114));
        txt_prefijo22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_prefijo22.setBordeColorFocus(new java.awt.Color(46, 78, 114));
        txt_prefijo22.setBotonColor(new java.awt.Color(70, 187, 151));
        txt_prefijo22.setCaretColor(new java.awt.Color(70, 187, 151));
        txt_prefijo22.setColorTransparente(true);
        txt_prefijo22.setFont(new java.awt.Font("Roboto Bold", 1, 15)); // NOI18N
        txt_prefijo22.setPlaceholder("24");
        txt_prefijo22.setSoloNumeros(true);
        txt_prefijo22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_prefijo22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_prefijo22FocusLost(evt);
            }
        });
        txt_prefijo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prefijo22ActionPerformed(evt);
            }
        });
        txt_prefijo22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prefijo22KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prefijo22KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prefijo22KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btn_usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lcodigo36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_hostEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_resultado_ipdeHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_ip11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcodigo21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ip22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ip33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcodigo23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcodigo24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_prefijo22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lcodigo35, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lcodigo35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_ip44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ip33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ip22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ip11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcodigo24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_prefijo22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hostEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lb_resultado_ipdeHost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        tab_ventana.addTab("Obtener IP De N°", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_ventana)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab_ventana, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txt_prefijoMascaraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoMascaraFocusGained

    private void txt_prefijoMascaraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoMascaraFocusLost

    private void txt_prefijoMascaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoMascaraActionPerformed

    private void txt_prefijoMascaraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoMascaraKeyPressed

    private void txt_prefijoMascaraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijoMascaraKeyReleased

    private void txt_prefijoMascaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijoMascaraKeyTyped
        // TODO add your handling code here:
        //validaRango_prefijo(evt, txt_prefijoMascara);
    }//GEN-LAST:event_txt_prefijoMascaraKeyTyped

    private void btn_usuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario3ActionPerformed
        //Calcular();
        calcularObtenerNhost();
    }//GEN-LAST:event_btn_usuario3ActionPerformed

    private void txt_ip11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11FocusGained

    private void txt_ip11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip11FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11FocusLost

    private void txt_ip11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11ActionPerformed

    private void txt_ip11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11KeyPressed

    private void txt_ip11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11KeyReleased

    private void txt_ip11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip11KeyTyped

    private void txt_ip22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22FocusGained

    private void txt_ip22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip22FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22FocusLost

    private void txt_ip22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22ActionPerformed

    private void txt_ip22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22KeyPressed

    private void txt_ip22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip22KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22KeyReleased

    private void txt_ip22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip22KeyTyped

    private void txt_ip33FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip33FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33FocusGained

    private void txt_ip33FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip33FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33FocusLost

    private void txt_ip33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33ActionPerformed

    private void txt_ip33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip33KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33KeyPressed

    private void txt_ip33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip33KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33KeyReleased

    private void txt_ip33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip33KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip33KeyTyped

    private void txt_ip44FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip44FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44FocusGained

    private void txt_ip44FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ip44FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44FocusLost

    private void txt_ip44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ip44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44ActionPerformed

    private void txt_ip44KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip44KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44KeyPressed

    private void txt_ip44KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip44KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44KeyReleased

    private void txt_ip44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip44KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ip44KeyTyped

    private void txt_hostEncontrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_hostEncontrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarFocusGained

    private void txt_hostEncontrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_hostEncontrarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarFocusLost

    private void txt_hostEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hostEncontrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarActionPerformed

    private void txt_hostEncontrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hostEncontrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarKeyPressed

    private void txt_hostEncontrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hostEncontrarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarKeyReleased

    private void txt_hostEncontrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hostEncontrarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hostEncontrarKeyTyped

    private void btn_usuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario4ActionPerformed
        // TODO add your handling code here:
        calcularObtenerN();
    }//GEN-LAST:event_btn_usuario4ActionPerformed

    private void txt_prefijo22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijo22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22FocusGained

    private void txt_prefijo22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_prefijo22FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22FocusLost

    private void txt_prefijo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prefijo22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22ActionPerformed

    private void txt_prefijo22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijo22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22KeyPressed

    private void txt_prefijo22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijo22KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22KeyReleased

    private void txt_prefijo22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prefijo22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prefijo22KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRound btn_usuario3;
    private rojerusan.RSMaterialButtonRound btn_usuario4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_resultado_ipdeHost;
    private javax.swing.JLabel lcodigo18;
    private javax.swing.JLabel lcodigo19;
    private javax.swing.JLabel lcodigo20;
    private javax.swing.JLabel lcodigo21;
    private javax.swing.JLabel lcodigo22;
    private javax.swing.JLabel lcodigo23;
    private javax.swing.JLabel lcodigo24;
    private javax.swing.JLabel lcodigo32;
    private javax.swing.JLabel lcodigo33;
    private javax.swing.JLabel lcodigo35;
    private javax.swing.JLabel lcodigo36;
    private javax.swing.JTabbedPane tab_ventana;
    public rojeru_san.RSMTextFull txt_hostEncontrar;
    public rojeru_san.RSMTextFull txt_ip1;
    public rojeru_san.RSMTextFull txt_ip11;
    public rojeru_san.RSMTextFull txt_ip2;
    public rojeru_san.RSMTextFull txt_ip22;
    public rojeru_san.RSMTextFull txt_ip3;
    public rojeru_san.RSMTextFull txt_ip33;
    public rojeru_san.RSMTextFull txt_ip4;
    public rojeru_san.RSMTextFull txt_ip44;
    public rojeru_san.RSMTextFull txt_prefijo22;
    public rojeru_san.RSMTextFull txt_prefijoMascara;
    // End of variables declaration//GEN-END:variables
}
