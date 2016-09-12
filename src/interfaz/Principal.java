/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.DenominadorCeroException;
import clase.Mixto;
import javax.swing.JOptionPane;

/**
 *
 * @author aldair
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        txtEnteroUno.requestFocusInWindow();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeradorUno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtDenominadorCuatro = new javax.swing.JTextField();
        txtNumeradorCuatro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbOperaciones = new javax.swing.JComboBox<>();
        txtDenominadorUno = new javax.swing.JTextField();
        txtEnteroDos = new javax.swing.JTextField();
        txtNumeradorDos = new javax.swing.JTextField();
        txtDenominadorDos = new javax.swing.JTextField();
        txtEnteroTres = new javax.swing.JTextField();
        txtNumeradorTres = new javax.swing.JTextField();
        txtDenominadorTres = new javax.swing.JTextField();
        txtEnteroUno = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Operaciones Con Numero Mixto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 620, 50));

        txtNumeradorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeradorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 40, 70));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fraccionario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDenominadorCuatro.setEditable(false);
        jPanel1.add(txtDenominadorCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 100));

        txtNumeradorCuatro.setEditable(false);
        jPanel1.add(txtNumeradorCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 100));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, 270));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 130, 40));

        cmdCalcular.setBackground(new java.awt.Color(0, 0, 0));
        cmdCalcular.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(255, 255, 255));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 130, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("=");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        cmbOperaciones.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        jPanel2.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        txtDenominadorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtDenominadorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 40, 70));

        txtEnteroDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnteroDosKeyTyped(evt);
            }
        });
        jPanel2.add(txtEnteroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, 70));

        txtNumeradorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorDosKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeradorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, 70));

        txtDenominadorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorDosKeyTyped(evt);
            }
        });
        jPanel2.add(txtDenominadorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 40, 70));

        txtEnteroTres.setEditable(false);
        jPanel2.add(txtEnteroTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 40, 70));

        txtNumeradorTres.setEditable(false);
        jPanel2.add(txtNumeradorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 40, 70));

        txtDenominadorTres.setEditable(false);
        jPanel2.add(txtDenominadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 40, 70));

        txtEnteroUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnteroUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtEnteroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 70));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 40, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 40, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 40, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/e5de7bceeba3383e6357336b728c3209.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnteroUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnteroUnoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtEnteroUnoKeyTyped

    private void txtNumeradorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorUnoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeradorUnoKeyTyped

    private void txtDenominadorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorUnoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominadorUnoKeyTyped

    private void txtEnteroDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnteroDosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtEnteroDosKeyTyped

    private void txtNumeradorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorDosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeradorDosKeyTyped

    private void txtDenominadorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorDosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '-') {
            getToolkit();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominadorDosKeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:

        try {
            int op, e1, n1, d1, e2, n2, d2, e3, n3, d3;
            Mixto f1, f2, f3 = null;

            if (txtEnteroUno.getText().trim().isEmpty() && txtNumeradorUno.getText().trim().isEmpty() && txtDenominadorUno.getText().trim().isEmpty() && txtEnteroDos.getText().trim().isEmpty() && txtNumeradorDos.getText().trim().isEmpty() && txtDenominadorDos.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor LLENE  los campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtEnteroUno.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege la parte enera de la primera fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtNumeradorUno.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege el numerador de la primera fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtDenominadorUno.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege el denominador de la primera fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtEnteroDos.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege la parte entera de la segunda fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtNumeradorDos.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege el numerador de la segunda fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtDenominadorDos.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "por favor agrege el denominador de la segunda fraccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {

                op = cmbOperaciones.getSelectedIndex();
                e1 = Integer.parseInt(txtEnteroUno.getText());
                n1 = Integer.parseInt(txtNumeradorUno.getText());
                d1 = Integer.parseInt(txtDenominadorUno.getText());
                e2 = Integer.parseInt(txtEnteroDos.getText());
                n2 = Integer.parseInt(txtNumeradorDos.getText());
                d2 = Integer.parseInt(txtDenominadorDos.getText());

                f1 = new Mixto(e1, n1, d1);
                f2 = new Mixto(e2, n2, d2);

                switch (op) {
                    case 0:
                        f3 = f1.sumar(f2);
                        break;

                    case 1:
                        f3 = f1.restar(f2);
                        break;

                    case 2:
                        f3 = f1.multiplicar(f2);
                        break;

                    case 3:
                        f3 = f1.division(f2);
                        break;
                }

                e3 = f3.getEntero();
                n3 = f3.getNumerador();
                d3 = f3.getDenominador();

                txtEnteroTres.setText("" + e3);
                txtNumeradorTres.setText("" + n3);
                txtDenominadorTres.setText("" + d3);

                if (((e3 * d3) + n3) < 0 && d3 < 0) {
                    txtNumeradorCuatro.setText("" + ((e3 * d3) + n3) * -1);
                    txtDenominadorCuatro.setText("" + (d3 * -1));
                } else {
                    txtNumeradorCuatro.setText("" + ((e3 * d3) + n3));
                    txtDenominadorCuatro.setText("" + d3);
                }

            }
        } catch (DenominadorCeroException k) {
            JOptionPane.showMessageDialog(null, k.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException k) {
            JOptionPane.showMessageDialog(null, "hay digitos invalidos, por favor corrijalos", "ERROR", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        txtEnteroUno.setText("");
        txtEnteroDos.setText("");
        txtEnteroTres.setText("");
        txtNumeradorUno.setText("");
        txtNumeradorDos.setText("");
        txtNumeradorTres.setText("");
        txtNumeradorCuatro.setText("");
        txtDenominadorUno.setText("");
        txtDenominadorDos.setText("");
        txtDenominadorTres.setText("");
        txtDenominadorCuatro.setText("");
        cmbOperaciones.setSelectedIndex(0);
        txtEnteroUno.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominadorCuatro;
    private javax.swing.JTextField txtDenominadorDos;
    private javax.swing.JTextField txtDenominadorTres;
    private javax.swing.JTextField txtDenominadorUno;
    private javax.swing.JTextField txtEnteroDos;
    private javax.swing.JTextField txtEnteroTres;
    private javax.swing.JTextField txtEnteroUno;
    private javax.swing.JTextField txtNumeradorCuatro;
    private javax.swing.JTextField txtNumeradorDos;
    private javax.swing.JTextField txtNumeradorTres;
    private javax.swing.JTextField txtNumeradorUno;
    // End of variables declaration//GEN-END:variables
}
