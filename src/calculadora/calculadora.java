
package calculadora;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem= new ScriptEngineManager();
    ScriptEngine se= sem.getEngineByName("JavaScript");
    public calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @Override
    public Image getIconImage(){
    Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagene/descarga.jpg"));
    return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        modoDark = new javax.swing.JButton();
        salir = new javax.swing.JTextField();
        minimizar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_min = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcen = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_sum = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 61, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 36, 323, 34));

        txtResultado.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtResultado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 320, 51));

        modoDark.setBackground(new java.awt.Color(244, 253, 251));
        modoDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/darkmode_1.png"))); // NOI18N
        modoDark.setBorder(null);
        modoDark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modoDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoDarkActionPerformed(evt);
            }
        });
        jPanel1.add(modoDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 0, -1, -1));

        salir.setBackground(new java.awt.Color(244, 253, 251));
        salir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 51, 51));
        salir.setText("●");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusable(false);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 25));

        minimizar.setBackground(new java.awt.Color(244, 253, 251));
        minimizar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 0));
        minimizar.setText("●");
        minimizar.setBorder(null);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.setFocusable(false);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 0, -1, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_min.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_min.setForeground(new java.awt.Color(55, 61, 71));
        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_min.setText("-");
        btn_min.setFocusPainted(false);
        btn_min.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_min.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_min.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minActionPerformed(evt);
            }
        });
        jPanel2.add(btn_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btn_c.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 61, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_exp.setFont(new java.awt.Font("Arial Narrow", 1, 15)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(55, 61, 71));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_exp.setText("CE");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porcen.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        btn_porcen.setForeground(new java.awt.Color(55, 61, 71));
        btn_porcen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_porcen.setText("mod");
        btn_porcen.setFocusPainted(false);
        btn_porcen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_porcen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_porcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcenActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_div.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_div.setForeground(new java.awt.Color(55, 61, 71));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_div.setText("÷");
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_igual.setFont(new java.awt.Font("Arial Narrow", 1, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn_sum.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_sum.setForeground(new java.awt.Color(55, 61, 71));
        btn_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_sum.setText("+");
        btn_sum.setFocusPainted(false);
        btn_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_8.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 61, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_8.setText("8");
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn_mult.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(55, 61, 71));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_mult.setText("X");
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_9.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 61, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_punto.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(55, 61, 71));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        btn_7.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 61, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 61, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn_1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 61, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_0.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 61, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_5.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 61, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn_6.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 61, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn_2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 61, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn_3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 61, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/descarga (2) (1).jpg"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton1.jpg"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagene/boton2.jpg"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        addNumber(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        addNumber("5"); 
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_porcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcenActionPerformed
        // TODO add your handling code here:
        addNumber("%");
    }//GEN-LAST:event_btn_porcenActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        // TODO add your handling code here:
        addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        // TODO add your handling code here:
        addNumber("*");
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
        // TODO add your handling code here:
        addNumber("-");
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumActionPerformed
        // TODO add your handling code here:
        addNumber("+");
    }//GEN-LAST:event_btn_sumActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
            String resultado=se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
            //txtOperacion.setText("Error");
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    boolean modoOscuro= false;
    private void modoDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoDarkActionPerformed
        if(!modoOscuro){
            jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        txtOperacion.setForeground(Color.decode("#0db387"));
        txtResultado.setForeground(Color.decode("#0db387"));
        ColorBtn1(btn_sum);
        ColorBtn1(btn_min);
        ColorBtn1(btn_exp);
        ColorBtn1(btn_div);
        ColorBtn1(btn_porcen);
        ColorBtn1(btn_c);
        ColorBtn1(btn_mult);
        ColorBtn2(btn_1);
        ColorBtn2(btn_2);
        ColorBtn2(btn_3);
        ColorBtn2(btn_4);
        ColorBtn2(btn_5);
        ColorBtn2(btn_6);
        ColorBtn2(btn_7);
        ColorBtn2(btn_8);
        ColorBtn2(btn_9);
        ColorBtn2(btn_0);
        ColorBtn2(btn_punto);
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagene/btn3_dark.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagene/btn3_dark.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagene/btn3_pressed_dark.png")));
        btn_igual.setForeground(Color.decode("#212b41"));
        modoOscuro=true;
        modoDark.setIcon(new ImageIcon(getClass().getResource("/imagene/darkmode_2.png")));
        salir.setBackground(Color.decode("#212b41"));
        minimizar.setBackground(Color.decode("#212b41"));
        }
        else{
            calculadora frame = new calculadora();
            this.dispose();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_modoDarkActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizarActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
    public void ColorBtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagene/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagene/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagene/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#0db387"));
    }
    public void ColorBtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagene/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagene/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagene/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_min;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_porcen;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_sum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField minimizar;
    private javax.swing.JButton modoDark;
    private javax.swing.JTextField salir;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
