package dental_management_system;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bushra
 */
public class InsertEquipmentRecordForm extends javax.swing.JFrame {
    
     User user;
    ResultSet rs; 
    public InsertEquipmentRecordForm()
    {
            initComponents();
            this.setLocationRelativeTo(null); // for centering form on screen
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //does not close app on exit of window
    }

    InsertEquipmentRecordForm(User user) 
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

        jButton1_add = new javax.swing.JButton();
        jLabel1_month = new javax.swing.JLabel();
        jLabel2_payments = new javax.swing.JLabel();
        jLabel4_wbill = new javax.swing.JLabel();
        jLabel5_maintenance = new javax.swing.JLabel();
        jTextField1_month = new javax.swing.JTextField();
        jTextField2_payments = new javax.swing.JTextField();
        jTextField4_wbill = new javax.swing.JTextField();
        jTextField5_maintenance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 839, 489));
        setPreferredSize(new java.awt.Dimension(839, 489));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_management_system/images/approve.png"))); // NOI18N
        jButton1_add.setBorderPainted(false);
        jButton1_add.setContentAreaFilled(false);
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_add);
        jButton1_add.setBounds(540, 350, 110, 100);

        jLabel1_month.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1_month.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_month.setText("Equipment Name");
        getContentPane().add(jLabel1_month);
        jLabel1_month.setBounds(180, 110, 160, 40);

        jLabel2_payments.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2_payments.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_payments.setText("    State");
        getContentPane().add(jLabel2_payments);
        jLabel2_payments.setBounds(260, 160, 80, 40);

        jLabel4_wbill.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4_wbill.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_wbill.setText("   Quantity");
        getContentPane().add(jLabel4_wbill);
        jLabel4_wbill.setBounds(230, 230, 110, 30);

        jLabel5_maintenance.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5_maintenance.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5_maintenance.setText("   Cost");
        getContentPane().add(jLabel5_maintenance);
        jLabel5_maintenance.setBounds(270, 280, 80, 50);

        jTextField1_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_monthActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_month);
        jTextField1_month.setBounds(360, 90, 380, 60);
        getContentPane().add(jTextField2_payments);
        jTextField2_payments.setBounds(360, 150, 380, 60);
        getContentPane().add(jTextField4_wbill);
        jTextField4_wbill.setBounds(360, 210, 380, 60);

        jTextField5_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_maintenanceActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5_maintenance);
        jTextField5_maintenance.setBounds(360, 270, 380, 60);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("            Equipments ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 20, 420, 50);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_management_system/images/appbackground copy.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 830, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed

        Medicines_and_Equipments data = new Medicines_and_Equipments();

        data.Equipment_name = jTextField1_month.getText();
        data.State = jTextField2_payments.getText();
        data.EQuantity = Integer.parseInt(jTextField4_wbill.getText());
        data.ECost = Integer.parseInt(jTextField5_maintenance.getText());

        Receptionist recept = new  Receptionist(user.userName,user.password,user.userType);

        recept.InsertEquipmentData(data);

        JOptionPane.showMessageDialog(rootPane, "Record added successfully.");
    }//GEN-LAST:event_jButton1_addActionPerformed

    private void jTextField1_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_monthActionPerformed

    private void jTextField5_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_maintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_maintenanceActionPerformed

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
            java.util.logging.Logger.getLogger(InsertEquipmentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertEquipmentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertEquipmentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertEquipmentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertEquipmentRecordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_add;
    private javax.swing.JLabel jLabel1_month;
    private javax.swing.JLabel jLabel2_payments;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_wbill;
    private javax.swing.JLabel jLabel5_maintenance;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1_month;
    private javax.swing.JTextField jTextField2_payments;
    private javax.swing.JTextField jTextField4_wbill;
    private javax.swing.JTextField jTextField5_maintenance;
    // End of variables declaration//GEN-END:variables
}
