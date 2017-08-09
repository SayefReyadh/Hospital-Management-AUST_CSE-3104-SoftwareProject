/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.design;

import database.ReportDatabase;
import javax.swing.JPanel;
import model.ReportModel;

/**
 *
 * @author SayefReyadh
 */
public class ReportFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public ReportFrame() {
        initComponents();
    }
        
    public ReportFrame(int reportId) {
        initComponents();
        ReportDatabase reportDatabase = new ReportDatabase();
        ReportModel reportModel = reportDatabase.getReportInformation(reportId);
        
        reportDetailsTextArea.setText(reportModel.getReportDetailsString());
        reportPatientNameTextField.setText(String.valueOf(reportModel.getPatientId()));
        reportSubjectTextField.setText(reportModel.getReportSubjectString());
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        reportPatientNameLabel = new javax.swing.JLabel();
        reportPatientNameTextField = new javax.swing.JTextField();
        reportSubjectTextField = new javax.swing.JTextField();
        reportSubjectLabel = new javax.swing.JLabel();
        reportDetailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportDetailsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(200, 50, 1000, 700));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 20));
        setResizable(false);

        reportPanel.setBackground(new java.awt.Color(0, 153, 153));

        reportPatientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reportPatientNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPatientNameLabel.setText("Patient Id");

        reportPatientNameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reportPatientNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reportPatientNameTextField.setText("Name");
        reportPatientNameTextField.setEnabled(false);

        reportSubjectTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reportSubjectTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reportSubjectTextField.setText("Default All");
        reportSubjectTextField.setEnabled(false);

        reportSubjectLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reportSubjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportSubjectLabel.setText("Report Subject");

        reportDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reportDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportDetailsLabel.setText("Details");

        reportDetailsTextArea.setColumns(20);
        reportDetailsTextArea.setRows(5);
        reportDetailsTextArea.setEnabled(false);
        jScrollPane1.setViewportView(reportDetailsTextArea);

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addComponent(reportPatientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportPatientNameTextField))
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addComponent(reportSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportSubjectTextField))
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addComponent(reportDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportPatientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportSubjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportSubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(reportDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reportDetailsLabel;
    private javax.swing.JTextArea reportDetailsTextArea;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JLabel reportPatientNameLabel;
    private javax.swing.JTextField reportPatientNameTextField;
    private javax.swing.JLabel reportSubjectLabel;
    private javax.swing.JTextField reportSubjectTextField;
    // End of variables declaration//GEN-END:variables
}
