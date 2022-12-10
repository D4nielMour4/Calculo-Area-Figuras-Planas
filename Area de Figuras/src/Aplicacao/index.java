package Aplicacao;

import javax.swing.JOptionPane;

/**
 *
 * @author moura
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        Campos();
    }
     public void Campos (){
        base.setVisible(false);
        altura.setVisible(false);
        calcular.setVisible(false);
        nomeBase.setVisible(false);
        nomeAltura.setVisible(false);
        nomeBaseMenor.setVisible(false);
        baseMenor.setVisible(false);
        diagonalMaior.setVisible(false);
        nomeDiagonalMaior.setVisible(false);
        diagonalMenor.setVisible(false);
        nomeDiagonalMenor.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomeBaseMenor = new javax.swing.JLabel();
        diagonalMenor = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        nomeAltura = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        nomeDiagonalMenor = new javax.swing.JLabel();
        base = new javax.swing.JTextField();
        nomeBase = new javax.swing.JLabel();
        nomeDiagonalMaior = new javax.swing.JLabel();
        baseMenor = new javax.swing.JTextField();
        diagonalMaior = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        figura = new javax.swing.JComboBox<>();
        OK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeBaseMenor.setText("Base Menor");
        jPanel1.add(nomeBaseMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        diagonalMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonalMenorActionPerformed(evt);
            }
        });
        jPanel1.add(diagonalMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 71, -1));

        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });
        jPanel1.add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 59, 71, -1));

        nomeAltura.setText("Altura");
        jPanel1.add(nomeAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 62, 37, -1));

        calcular.setText("Calcular !");
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMouseClicked(evt);
            }
        });
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 160, -1, -1));

        nomeDiagonalMenor.setText("Diagonal Menor");
        jPanel1.add(nomeDiagonalMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });
        jPanel1.add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 31, 71, -1));

        nomeBase.setText("Base");
        jPanel1.add(nomeBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 34, 37, -1));

        nomeDiagonalMaior.setText("Diagonal Maior");
        jPanel1.add(nomeDiagonalMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        baseMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseMenorActionPerformed(evt);
            }
        });
        jPanel1.add(baseMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 71, -1));

        diagonalMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonalMaiorActionPerformed(evt);
            }
        });
        jPanel1.add(diagonalMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 71, -1));

        jLabel2.setText("Escolha a Figura");

        figura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Quadrado", "Triangulo", "Retangulo", "Paralelogramo", "Trapezio", "Losango" }));

        OK.setText("OK");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("Sistema Calculo Areas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(figura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OK)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(figura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diagonalMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonalMenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagonalMenorActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
    }//GEN-LAST:event_calcularActionPerformed

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        String f = figura.getSelectedItem().toString();
        
        if (f == "Quadrado"){
            JOptionPane.showMessageDialog(null, "Quadrado");
            base.setVisible(true);
            altura.setVisible(false);
            calcular.setVisible(true);
            nomeBase.setVisible(true);
            nomeAltura.setVisible(false);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }else if (f == "Retangulo"){
            JOptionPane.showMessageDialog(null, "Retangulo");
            base.setVisible(true);
            altura.setVisible(true);
            calcular.setVisible(true);
            nomeBase.setVisible(true);
            nomeAltura.setVisible(true);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }else if (f == "Triangulo"){
            JOptionPane.showMessageDialog(null, "Triangulo");
            base.setVisible(true);
            altura.setVisible(true);
            calcular.setVisible(true);
            nomeBase.setVisible(true);
            nomeAltura.setVisible(true);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }else if (f == "Paralelogramo"){
            JOptionPane.showMessageDialog(null, "Paralelogramo");
            base.setVisible(true);
            altura.setVisible(true);
            calcular.setVisible(true);
            nomeBase.setVisible(true);
            nomeAltura.setVisible(true);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }else if (f == "Trapezio"){
            JOptionPane.showMessageDialog(null, "Trapezio");
            base.setVisible(true);
            altura.setVisible(true);
            calcular.setVisible(true);
            nomeBase.setVisible(true);
            nomeAltura.setVisible(true);
            nomeBaseMenor.setVisible(true);
            baseMenor.setVisible(true);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }else if (f == "Losango"){
            JOptionPane.showMessageDialog(null, "Losango");
            base.setVisible(false);
            altura.setVisible(false);
            calcular.setVisible(true);
            nomeBase.setVisible(false);
            nomeAltura.setVisible(false);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(true);
            nomeDiagonalMaior.setVisible(true);
            diagonalMenor.setVisible(true);
            nomeDiagonalMenor.setVisible(true);
        }else{
            base.setVisible(false);
            altura.setVisible(false);
            calcular.setVisible(false);
            nomeBase.setVisible(false);
            nomeAltura.setVisible(false);
            nomeBaseMenor.setVisible(false);
            baseMenor.setVisible(false);
            diagonalMaior.setVisible(false);
            nomeDiagonalMaior.setVisible(false);
            diagonalMenor.setVisible(false);
            nomeDiagonalMenor.setVisible(false);
        }
        
    }//GEN-LAST:event_OKMouseClicked

    private void calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseClicked
        String f = figura.getSelectedItem().toString();
        
        if (f == "Quadrado"){
            Quadrado q = new Quadrado();
            q.setBase(Double.parseDouble(base.getText()));
            JOptionPane.showMessageDialog(null, q.Tipofigura());
        }else if (f == "Triangulo"){
            Triangulo t = new Triangulo();
            t.setBase(Double.parseDouble(base.getText()));
            t.setAltura(Double.parseDouble(altura.getText()));
            JOptionPane.showMessageDialog(null, t.Tipofigura());
        }else if (f == "Retangulo"){
            Retangulo r = new Retangulo();
            r.setBase(Double.parseDouble(base.getText()));
            r.setAltura(Double.parseDouble(altura.getText()));
            JOptionPane.showMessageDialog(null, r.Tipofigura());
        }else if ( f == "Paralelogramo"){
            Paralelogramo p = new Paralelogramo();
            p.setBase(Double.parseDouble(base.getText()));
            p.setAltura(Double.parseDouble(altura.getText()));
            JOptionPane.showMessageDialog(null, p.Tipofigura());
        }else if (f == "Trapezio"){
            Trapezio t = new Trapezio();
            t.setBase(Double.parseDouble(base.getText()));
            t.setBaseMenor(Double.parseDouble(baseMenor.getText()));
            t.setAltura(Double.parseDouble(altura.getText()));
            JOptionPane.showMessageDialog(null, t.Tipofigura());
        }else if (f == "Losango"){
            Losango l = new Losango();
            l.setDiagonalMaior(Double.parseDouble(diagonalMaior.getText()));
            l.setDiagonalMenor(Double.parseDouble(diagonalMenor.getText()));
            JOptionPane.showMessageDialog(null, l.Tipofigura());
        }
    }//GEN-LAST:event_calcularMouseClicked

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OKActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void baseMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseMenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseMenorActionPerformed

    private void diagonalMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonalMaiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagonalMaiorActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JTextField altura;
    private javax.swing.JTextField base;
    private javax.swing.JTextField baseMenor;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField diagonalMaior;
    private javax.swing.JTextField diagonalMenor;
    private javax.swing.JComboBox<String> figura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomeAltura;
    private javax.swing.JLabel nomeBase;
    private javax.swing.JLabel nomeBaseMenor;
    private javax.swing.JLabel nomeDiagonalMaior;
    private javax.swing.JLabel nomeDiagonalMenor;
    // End of variables declaration//GEN-END:variables
}