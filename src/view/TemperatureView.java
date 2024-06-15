package view;

import controller.TemperatureController;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TemperatureView extends javax.swing.JFrame {

    public TemperatureView() {
        this.initComponents();
        this.makeComboBoxTemp();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPane = new javax.swing.JPanel();
        tempTxt = new javax.swing.JTextField();
        tempInitialScaleCmb = new javax.swing.JComboBox<>();
        celsiusLbl = new javax.swing.JLabel();
        tempFinalScaleCmb = new javax.swing.JComboBox<>();
        resultPane = new javax.swing.JPanel();
        resultLbl = new javax.swing.JLabel();
        converterBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setIconImage(image.getImage());
        setResizable(false);

        tempTxt.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        tempTxt.setForeground(java.awt.Color.gray);
        tempTxt.setText("Enter a temperature");
        tempTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tempTxt.setPreferredSize(new java.awt.Dimension(111, 28));
        tempTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tempTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tempTxtFocusLost(evt);
            }
        });
        tempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTxtActionPerformed(evt);
            }
        });

        celsiusLbl.setText("to");

        javax.swing.GroupLayout inputPaneLayout = new javax.swing.GroupLayout(inputPane);
        inputPane.setLayout(inputPaneLayout);
        inputPaneLayout.setHorizontalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tempInitialScaleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celsiusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempFinalScaleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPaneLayout.setVerticalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempInitialScaleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celsiusLbl)
                    .addComponent(tempFinalScaleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tempFinalScaleCmb, tempInitialScaleCmb, tempTxt});

        resultLbl.setText("Result ");

        converterBtn.setText("Converter");
        converterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultPaneLayout = new javax.swing.GroupLayout(resultPane);
        resultPane.setLayout(resultPaneLayout);
        resultPaneLayout.setHorizontalGroup(
            resultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(converterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPaneLayout.setVerticalGroup(
            resultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(converterBtn)
                    .addComponent(resultLbl))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("Temperature Converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(title)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTxtActionPerformed
        try {
            String temp = TemperatureController.convert(
                    tempTxt.getText(),
                    tempInitialScaleCmb.getSelectedItem().toString(),
                    tempFinalScaleCmb.getSelectedItem().toString()
            );
            this.setResult(temp);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Enter a valid value", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tempTxtActionPerformed

    private void tempTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempTxtFocusGained
        if (tempTxt.getText().equals("Enter a temperature")) {
            tempTxt.setText("");
            tempTxt.setFont(new java.awt.Font("Segoe UI", 0, 12));
            tempTxt.setForeground(java.awt.Color.BLACK);
        }

    }//GEN-LAST:event_tempTxtFocusGained

    private void tempTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tempTxtFocusLost
        if (tempTxt.getText().isEmpty()) {
            tempTxt.setFont(new java.awt.Font("Segoe UI", 2, 12));
            tempTxt.setForeground(java.awt.Color.gray);
            tempTxt.setText("Enter a temperature");
        }
    }//GEN-LAST:event_tempTxtFocusLost

    private void converterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterBtnActionPerformed
        String inputTemp = tempTxt.getText();
        
        Object initialScale = tempInitialScaleCmb.getSelectedItem();
        String initialScaleName = initialScale.toString();
        
        Object finalScale = tempFinalScaleCmb.getSelectedItem();
        String finalScaleName = finalScale.toString();
        
        try {
            String temp = TemperatureController.convert(
                    inputTemp,
                    initialScaleName,
                    finalScaleName
            );
            this.setResult(temp);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid value", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_converterBtnActionPerformed

    private void makeComboBoxTemp() {
        List<String> temps = TemperatureController.consultAllTemperatures();
        for (String temp : temps) {
            tempInitialScaleCmb.addItem(temp);
            tempFinalScaleCmb.addItem(temp);
        }
        tempInitialScaleCmb.setSelectedIndex(0);
        tempFinalScaleCmb.setSelectedIndex(1);
    }

    private void setResult(String temp) {
        Object selectedItem = tempFinalScaleCmb.getSelectedItem();
        String scaleName = selectedItem.toString();

        if (scaleName.equals("Celsius")) {
            resultLbl.setText("Result " + temp + " °C");
        } else if (scaleName.equals("Farenheit")) {
            resultLbl.setText("Result " + temp + " °F");
        } else if (scaleName.equals("Kelvin")) {
            resultLbl.setText("Result " + temp + " K");
        } else if (scaleName.equals("Rankine")) {
            resultLbl.setText("Result " + temp + " °R");
        } else if (scaleName.equals("Reaumur")) {
            resultLbl.setText("Result " + temp + " °Re");
        } else {
            resultLbl.setText("Result");
        }
    }

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
            java.util.logging.Logger.getLogger(TemperatureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureView().setVisible(true);
            }
        });
    }

    private final ImageIcon image = new ImageIcon("photos/icon.png");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsiusLbl;
    private javax.swing.JButton converterBtn;
    private javax.swing.JPanel inputPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JPanel resultPane;
    private javax.swing.JComboBox<String> tempFinalScaleCmb;
    private javax.swing.JComboBox<String> tempInitialScaleCmb;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
