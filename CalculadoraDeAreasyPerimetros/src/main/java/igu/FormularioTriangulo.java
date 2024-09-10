package igu;

import entidades.Triangulo;
import java.util.Set;
import javax.swing.JOptionPane;

public class FormularioTriangulo extends javax.swing.JFrame {

    public FormularioTriangulo() {
        initComponents();
        setTitle("Triangulo");
        setResizable(false);
        setLocationRelativeTo(null);
        jTextPaneArea.setEditable(false);
        jTextPanePerimetro.setEditable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldLado1 = new javax.swing.JTextField();
        jTextFieldLado2 = new javax.swing.JTextField();
        jButtonCalcularArea = new javax.swing.JButton();
        jButtonCalcularPerimetro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPanePerimetro = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneArea = new javax.swing.JTextPane();
        jLabelAltura = new javax.swing.JLabel();
        jLabelBase = new javax.swing.JLabel();
        jLabelLado1 = new javax.swing.JLabel();
        jLabelLado2 = new javax.swing.JLabel();
        jTextFieldBase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCalcularArea.setText("Área");
        jButtonCalcularArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularAreaActionPerformed(evt);
            }
        });

        jButtonCalcularPerimetro.setText("Perimetro");
        jButtonCalcularPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularPerimetroActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPanePerimetro);

        jScrollPane4.setViewportView(jTextPaneArea);

        jLabelAltura.setText("Altura");

        jLabelBase.setText("Base");

        jLabelLado1.setText("Lado 1");

        jLabelLado2.setText("Lado 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButtonCalcularArea, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalcularPerimetro)
                            .addComponent(jTextFieldLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAltura))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelBase))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelLado1)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLado2)
                                            .addComponent(jTextFieldLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAltura)
                    .addComponent(jLabelBase)
                    .addComponent(jLabelLado1)
                    .addComponent(jLabelLado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcularPerimetro)
                    .addComponent(jButtonCalcularArea))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
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

        Triangulo triangulo = new Triangulo();
        
    private void jButtonCalcularAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularAreaActionPerformed
        
        String alturaInput = jTextFieldAltura.getText();
        String baseInput = jTextFieldBase.getText();
        
        float altura = triangulo.esUnNumero(alturaInput);
        float base = triangulo.esUnNumero(baseInput);
        float area;
        
        if(altura > 0 && base > 0){
            triangulo.setAltura(altura);
            triangulo.setBase(base);
            
            area = triangulo.calcularArea();
            
            jTextPaneArea.setText("Altura: "+altura+" Base: "+base+"\nEl área es: "+area);
            
        }else{
            jTextPaneArea.setText("");
            JOptionPane.showMessageDialog(null,"Verifique sus datos");
        }
    }//GEN-LAST:event_jButtonCalcularAreaActionPerformed

    private void jButtonCalcularPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularPerimetroActionPerformed
        String baseInput = jTextFieldBase.getText();
        String lado1Input = jTextFieldLado1.getText();
        String lado2Input = jTextFieldLado2.getText();
        
        float base = triangulo.esUnNumero(baseInput);
        float lado1 = triangulo.esUnNumero(lado1Input);
        float lado2 = triangulo.esUnNumero(lado2Input);
        float perimetro;
        
        if(base > 0 && lado1 > 0 && lado2 > 0){
            triangulo.setBase(base);
            triangulo.setLado1(lado1);
            triangulo.setLado2(lado2);
            
            perimetro = triangulo.calcularPerimetro();
            
            jTextPanePerimetro.setText("Base: "+base+" lado 1: "+lado1+"\nlado 2: "+lado2+"\nPerimetro: "+perimetro);
        }else{
            jTextPanePerimetro.setText("");
            JOptionPane.showMessageDialog(null,"Verifique sus datos");
        }
    }//GEN-LAST:event_jButtonCalcularPerimetroActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularArea;
    private javax.swing.JButton jButtonCalcularPerimetro;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelBase;
    private javax.swing.JLabel jLabelLado1;
    private javax.swing.JLabel jLabelLado2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldBase;
    private javax.swing.JTextField jTextFieldLado1;
    private javax.swing.JTextField jTextFieldLado2;
    private javax.swing.JTextPane jTextPaneArea;
    private javax.swing.JTextPane jTextPanePerimetro;
    // End of variables declaration//GEN-END:variables
}
