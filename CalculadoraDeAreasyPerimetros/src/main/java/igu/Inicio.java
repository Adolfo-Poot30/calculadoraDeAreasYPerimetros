package igu;

import java.awt.Image;
import javax.swing.*;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        setTitle("Figuras");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jComboBoxFiguras = new javax.swing.JComboBox<>();
        ImageIcon imagenIcono = new ImageIcon("/home/adolfo/NetBeansProjects/CalculadoraDeAreasyPerimetros/src/main/java/figuras.png");
        Image imagen = imagenIcono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(160,150,Image.SCALE_SMOOTH);

        ImageIcon nuevaImgRed = new ImageIcon(imagenRedimensionada);

        //asignar imagen la JLabel
        jLabelImagen = new JLabel(nuevaImgRed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setText("Calculadora de áreas y perimetros");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jComboBoxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Circulo", "Cuadrado", "Rectangulo", "Triangulo" }));

        /*
        jLabelImagen.setText("");
        */

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 98, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImagen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addGap(31, 31, 31)
                .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabelImagen)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        int opcion = jComboBoxFiguras.getSelectedIndex();
        switch (opcion) {
            case 0:
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new FormularioCirculo().setVisible(true);
                    }
                });
                break;
            case 1:
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new FormularioCuadrado().setVisible(true);
                    }
                });
                break;
            case 2:
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new FormularioRectangulo().setVisible(true);
                    }
                });
                break;
            case 3:
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new FormularioTriangulo().setVisible(true);
                    }
                });
                break;
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBoxFiguras;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
