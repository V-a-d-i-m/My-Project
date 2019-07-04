package drivingschool;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Students extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Students() {
        initComponents();
        setLocationRelativeTo(null);
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGroupCode = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassport = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOtherCategory = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtStudentID = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Students");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information about the student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student's code");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Group code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Full name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Birthday");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtGroupCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGroupCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtGroupCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 192, 120, -1));
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 75, 120, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 130, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Phone");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 161, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel1.add(txtPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 223, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Passport");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(txtOtherCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 254, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Other category");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 280, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Status");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 283, 50, -1));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 318, 113, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 318, 120, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 352, 113, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 352, 127, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 318, 80, 70));

        txtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudentIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, -1));
        jPanel1.add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgonline-com-ua-Mirror-q7nclRzL7fpAl9.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 510, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Reset()
{
    txtStudentID.setText("");
    txtFullName.setText("");
    
    txtPhone.setText("");
    txtAddress.setText("");
    txtGroupCode.setText("");
    txtPassport.setText("");
    txtOtherCategory.setText("");
    txtStatus.setText("");
    
    
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtStudentID.requestDefaultFocus();

}
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            
            if (txtStudentID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter student ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int P = JOptionPane.showConfirmDialog(null," Delete?", "Confirm action",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from students where id = '" + txtStudentID.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Success", "Removed",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Date departDatedD = (Date) jXDatePicker1.getDate();
    SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String departDate = oDateFormat.format(departDatedD);
        
        try{
            con=Connect.ConnectDB();
            
            if (txtStudentID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter student ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtFullName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the full name of the student","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (departDate.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter date ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtPhone.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter phone number ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the address ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtGroupCode.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the group code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtPassport.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter student's passport","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
         
            if (txtStatus.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the status of the student's education","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String sql= "update students set fname='"+ txtFullName.getText() + "',birth='"+ departDate 
                    + "',phone='"+ txtPhone.getText() + "',address='"+ txtAddress.getText() 
                    + "',gcode='"+ txtGroupCode.getText() + "',passport='"+ txtPassport.getText() 
                    + "',othercategory='"+ txtOtherCategory.getText() + "',status='"+ txtStatus.getText() 
                    + "' where id='" + txtStudentID.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Update successful","The student is updated",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.hide();
     StudentsRecord frm=new StudentsRecord();
     frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        Date departDatedD = (Date) jXDatePicker1.getDate();
    SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String departDate = oDateFormat.format(departDatedD);
        
        try{
            con=Connect.ConnectDB();

            if (txtFullName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the full name of the student","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (departDate.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter date ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtPhone.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter phone number ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the address ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtGroupCode.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the group code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtPassport.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter student's passport","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
         
            if (txtStatus.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the status of the student's education","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt= con.createStatement();

            String sql= "insert into students (fname, birth, phone, address, gcode, passport, othercategory, status)"
                    + "values('"+ txtFullName.getText() + "','" + departDate + "','"+ txtPhone.getText() 
                    + "','" + txtAddress.getText() + "','"+ txtGroupCode.getText() + "','" + txtPassport.getText() 
                    + txtOtherCategory.getText() + "','"+ "','"+ txtStatus.getText() +"')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Success","Student is recorded",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtStudentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentIDKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtStudentIDKeyTyped

    private void txtGroupCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGroupCodeKeyTyped
        
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
            ||(vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }
        
    }//GEN-LAST:event_txtGroupCodeKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
     SearchStudent frm=new SearchStudent();
     frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtFullName;
    public javax.swing.JTextField txtGroupCode;
    public javax.swing.JTextField txtOtherCategory;
    public javax.swing.JTextField txtPassport;
    public javax.swing.JTextField txtPhone;
    public javax.swing.JTextField txtStatus;
    public javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
