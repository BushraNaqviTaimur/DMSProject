package dental_management_system;

import java.sql.*;

/**
 *
 * @author bushra
 */
public class ViewMedicinesrecord extends javax.swing.JFrame {

    User user;
    ResultSet rs; 
   
    public ViewMedicinesrecord()
    {
        initComponents();
        this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
    }
    public ViewMedicinesrecord(User user)
    {
        initComponents();
        this.setLocationRelativeTo(null); // for centering form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
        
        this.user = user;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_medicines = new javax.swing.JButton();
        jButton2_equipments = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(724, 471));
        setResizable(false);
        setSize(new java.awt.Dimension(724, 471));
        getContentPane().setLayout(null);

        jButton1_medicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_medicinesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_medicines);
        jButton1_medicines.setBounds(120, 110, 200, 200);

        jButton2_equipments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_equipmentsActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2_equipments);
        jButton2_equipments.setBounds(410, 110, 210, 190);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel1.setText("   Medicines");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 320, 130, 50);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel2.setText("     Equipments");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 330, 150, 30);

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setMaximumSize(new java.awt.Dimension(724, 471));
        jLabel3.setMinimumSize(new java.awt.Dimension(724, 471));
        jLabel3.setPreferredSize(new java.awt.Dimension(724, 471));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 860, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_medicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_medicinesActionPerformed
       new Record_Of_Medicines(user).setVisible(true);
    }//GEN-LAST:event_jButton1_medicinesActionPerformed

    private void jButton2_equipmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_equipmentsActionPerformed
        new Record_Of_Equipments(user).setVisible(true);
    }//GEN-LAST:event_jButton2_equipmentsActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMedicinesrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMedicinesrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMedicinesrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMedicinesrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMedicinesrecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_medicines;
    private javax.swing.JButton jButton2_equipments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
