package br.com.ifba.giovaneneves.RegistrationProjectWithSpring.view;

//--+ Imports +--//

import br.com.ifba.giovaneneves.RegistrationProjectWithSpring.controller.FacadeInstance;
import br.com.ifba.giovaneneves.RegistrationProjectWithSpring.exceptions.student.StudentNotFoundException;
import br.com.ifba.giovaneneves.RegistrationProjectWithSpring.model.Student;
import br.com.ifba.giovaneneves.RegistrationProjectWithSpring.util.DataFormatValidator;

import javax.swing.*;
import java.time.LocalDate;

//--+ END Imports +--//
/**
 *
 * @author GiovaneNeves
 */
public class EditStudentGUI extends javax.swing.JFrame {

    public static Student student;
    
    /**
     * Creates new form EditStudentGUI.
     * @param studentToBeEdited and updated in the databse.
     */
    public EditStudentGUI(Student studentToBeEdited) {
        initComponents();
        
        student = studentToBeEdited;
        this.lblStudentId.setText("Student ID: " + student.getId());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlBackgroundTopMenu = new javax.swing.JPanel();
        jBtnMinimize = new javax.swing.JButton();
        jBtnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        txtAcademicYear = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        txtGrade3 = new javax.swing.JTextField();
        lblStudentId = new javax.swing.JLabel();
        lblUserIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setBackground(new java.awt.Color(0, 153, 51));
        jBtnMinimize.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinimize.setText("-");
        jBtnMinimize.setBorderPainted(false);
        jBtnMinimize.setFocusPainted(false);
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(510, 10, 40, 23);

        jBtnClose.setBackground(new java.awt.Color(255, 0, 0));
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.setBorderPainted(false);
        jBtnClose.setFocusPainted(false);
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnClose);
        jBtnClose.setBounds(560, 10, 50, 22);

        getContentPane().add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(40, 30, 230, 30);

        txtRegistrationNumber.setText("Registration Number");
        txtRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrationNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(40, 70, 230, 30);

        txtAcademicYear.setText("Academic Year");
        jPanel2.add(txtAcademicYear);
        txtAcademicYear.setBounds(40, 110, 230, 30);

        txtBirthDate.setText("Birth Date");
        txtBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtBirthDate);
        txtBirthDate.setBounds(40, 150, 230, 40);

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 51));
        btnUpdate.setText("UPDATE");
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(80, 240, 140, 40);

        txtGrade1.setText("Grade 01");
        jPanel2.add(txtGrade1);
        txtGrade1.setBounds(40, 200, 64, 30);

        txtGrade2.setText("Grade 02");
        txtGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtGrade2);
        txtGrade2.setBounds(120, 200, 70, 30);

        txtGrade3.setText("Grade 03");
        jPanel2.add(txtGrade3);
        txtGrade3.setBounds(200, 200, 70, 30);

        lblStudentId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStudentId.setText("Student ID: ");
        jPanel2.add(lblStudentId);
        lblStudentId.setBounds(120, 10, 170, 20);

        lblUserIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjx4Wb94axWcSUXXjE-AOOsf2f-ZDjVM-O6m1Fv-ZTdBuw7N4q-tCLOlsVXiYtin0dZK4JTA_rNSjS61gcDenNeDNHgwZhOD3BDojSxMbyklCpFaJ2AePoNL-6e9EuJUE9QY2LPdq68pxP5bys9BBn_PISEe8mdlKdjsrkAiC1g3kfvsjIJh42A6PuV3g/s16/user.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel2.add(lblUserIcon);
        lblUserIcon.setBounds(100, 0, 20, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(140, 20, 310, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 620, 320);

        setSize(new java.awt.Dimension(639, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinimizeActionPerformed

        //--+ Minimizes the window +--//
        setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jBtnMinimizeActionPerformed

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed

        //--+ Closes the window +--//
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this window?", "Close Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        new StudentDashboardGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrationNumberActionPerformed

    private void txtBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthDateActionPerformed

    /**
     * Collects the contents of text fields and attempts to update the data of a student registered in the database.
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String[] textFieldContents = {txtName.getText(), txtRegistrationNumber.getText(), txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};

        //--+ Checks if text fields are valid +--//
        if(!DataFormatValidator.isNull(textFieldContents)){

            LocalDate birthDate = DataFormatValidator.convertToLocalDate(txtBirthDate.getText());

            //--+ Checks if 'birthDate' are valid. +--//
            if(birthDate != null){

                int academicYear = DataFormatValidator.convertToInt(txtAcademicYear.getText());

                //--+ Checks if 'academicYear' are valid +--//
                if(academicYear != -1){

                    String[] stringGrades = {txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};
                    float[] convertedGrades = new float[stringGrades.length];

                    //--+ Converts the note strings to float +--//
                    for(int i = 0; i < stringGrades.length; i++){

                        convertedGrades[i] = DataFormatValidator.convertToFloat(stringGrades[i]);
                        if(convertedGrades[i] == -1) return;

                    }

                    //--+ Sets the student's grade point average +--//
                    float  sum = sumUpGrades(convertedGrades);
                    float average = (sum != 0) ? (sum / convertedGrades.length) : 0;

                    student.setName(txtName.getText());
                    student.setRegistrationNumber(txtRegistrationNumber.getText());
                    student.setBirthDate(birthDate);
                    student.setAcademicYear(academicYear);
                    student.setGrades(convertedGrades);
                    student.setAverageGrades(average);

                    //--+ Try to Update the student in the database +--//
                    try{

                        if(FacadeInstance.getInstance().updateStudent(student))
                            JOptionPane.showMessageDialog(null, "Student successfully updated", "Update", JOptionPane.INFORMATION_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, "Error to update the Student", "Update", JOptionPane.ERROR_MESSAGE);

                    } catch (StudentNotFoundException ex){

                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Edit", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();

                    }
                }

            }

        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * 
     * @param grades to be that will be added up.
     * @return of all as grades.
     */
    private float sumUpGrades(float[] grades){
        
        float sum = 0;
        
        for(float grade : grades)
            sum += grade;
        
        return sum;
    }
    
    private void txtGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudentGUI(student).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JTextField txtAcademicYear;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration//GEN-END:variables
}
