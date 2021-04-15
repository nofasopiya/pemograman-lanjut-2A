// Nama  : Nofa Sopiya
// Kelas : 2A
// NIM   : 11200930000021

package GUI;

/**
 *
 * @NOFA SOPIYA
 */
public class KonversiSuhu extends javax.swing.JFrame {

    double Celcius;
    double Fahrenheit;
    double Celvin;
    double Reamur;
    
    public KonversiSuhu() {
        initComponents();
    }
    private void Celcius(){
        
        Celcius = Double.parseDouble(TxtSuhu.getText());
        
        Fahrenheit = Celcius * 1.8 + 32;
        Celvin = Celcius + 273.15;
        Reamur = Celcius * 0.8;
        
        LblCelcius.setText((Celcius +" Celcius"));
        LblFahrenheit.setText(Fahrenheit +" Fahrenheit");
        LblCelvin.setText(Celvin +" Celvin");
        LblReamur.setText(Reamur +" Reamur");
        
    }
    private void Fahrenheit(){
        
        Fahrenheit = Double.parseDouble(TxtSuhu.getText());
        
        Celcius = (Fahrenheit - 32) / 1.8;
        Reamur = (Fahrenheit - 32) / 2.25;
        Celvin = (Fahrenheit + 459.67) / 1.8;
        
        LblCelcius.setText(Celcius +" Celcius");
        LblFahrenheit.setText(Fahrenheit +" Fahrenheit");
        LblCelvin.setText(Celvin +" Celvin");
        LblReamur.setText(Reamur +" Reamur");
        
    }
    private void Celvin(){
        
        Celvin = Double.parseDouble(TxtSuhu.getText());
        
        Fahrenheit = Celvin * 1.8 - 459.67;
        Celcius = Celvin - 273.15;
        Reamur = (Celvin - 273.15) * 0.8;
        
        LblCelcius.setText(Celcius +" Celcius");
        LblFahrenheit.setText(Fahrenheit +" Fahrenheit");
        LblCelvin.setText(Celvin +" Celvin");
        LblReamur.setText(Reamur +" Reamur");
    }
    private void Reamur(){
        
        Reamur = Double.parseDouble(TxtSuhu.getText());
        
        Fahrenheit = ( Reamur * 2.25) + 32;
        Celvin = (Reamur / 0.8) + 273.15;
        Celcius = Reamur / 0.8;
        
        LblCelcius.setText(Celcius +" Celcius");
        LblFahrenheit.setText(Fahrenheit +" Fahrenheit");
        LblCelvin.setText(Celvin +" Celvin");
        LblReamur.setText(Reamur +" Reamur");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtSuhu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RbCelcius = new javax.swing.JRadioButton();
        RbFahrenheit = new javax.swing.JRadioButton();
        RbCelvin = new javax.swing.JRadioButton();
        RbReamur = new javax.swing.JRadioButton();
        BtConvert = new javax.swing.JButton();
        BtReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LblCelcius = new javax.swing.JLabel();
        LblFahrenheit = new javax.swing.JLabel();
        LblCelvin = new javax.swing.JLabel();
        LblReamur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Konversi Suhu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Output Suhu :");

        RbCelcius.setText("Celcius");

        RbFahrenheit.setText("Fahrenheit");

        RbCelvin.setText("Celvin");

        RbReamur.setText("Reamur");

        BtConvert.setText("Convert");
        BtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConvertActionPerformed(evt);
            }
        });

        BtReset.setText("Reset");
        BtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Output Suhu :");

        LblCelcius.setText("Celcius");

        LblFahrenheit.setText("Fahrenheit");

        LblCelvin.setText("Celvin");

        LblReamur.setText("Reamur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(TxtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RbCelcius)
                                .addGap(18, 18, 18)
                                .addComponent(RbFahrenheit)
                                .addGap(18, 18, 18)
                                .addComponent(RbCelvin))
                            .addComponent(BtConvert)
                            .addComponent(LblFahrenheit)
                            .addComponent(LblCelcius))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCelvin)
                            .addComponent(LblReamur)
                            .addComponent(BtReset)
                            .addComponent(RbReamur))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbCelcius)
                    .addComponent(RbFahrenheit)
                    .addComponent(RbCelvin)
                    .addComponent(RbReamur))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtConvert)
                    .addComponent(BtReset))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCelcius)
                    .addComponent(LblCelvin))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblFahrenheit)
                    .addComponent(LblReamur, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConvertActionPerformed
        // TODO add your handling code here:
        
        if(RbCelcius.isSelected()){
            Celcius();
            
        }else if(RbFahrenheit.isSelected()){
            Fahrenheit();
            
        }else if(RbCelvin.isSelected()){
            Celvin();
            
        }else if(RbReamur.isSelected()){
            Reamur();
        }
        
    }//GEN-LAST:event_BtConvertActionPerformed

    private void BtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtResetActionPerformed
        // TODO add your handling code here:
        
        TxtSuhu.setText("");
        
        LblCelcius.setText("Celcius");
        LblFahrenheit.setText("Fahrenheit");
        LblCelvin.setText("Celvin");
        LblReamur.setText("Reamur");
        
    }//GEN-LAST:event_BtResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConvert;
    private javax.swing.JButton BtReset;
    private javax.swing.JLabel LblCelcius;
    private javax.swing.JLabel LblCelvin;
    private javax.swing.JLabel LblFahrenheit;
    private javax.swing.JLabel LblReamur;
    private javax.swing.JRadioButton RbCelcius;
    private javax.swing.JRadioButton RbCelvin;
    private javax.swing.JRadioButton RbFahrenheit;
    private javax.swing.JRadioButton RbReamur;
    private javax.swing.JTextField TxtSuhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
