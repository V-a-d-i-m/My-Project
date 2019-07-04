package drivingschool;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


public class Classes extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Classes() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTypeOccupation = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtCodeInstructor = new javax.swing.JTextField();
        txtLessonCode = new javax.swing.JTextField();
        txtCodeCar = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        DateDD = new org.jdesktop.swingx.JXDatePicker();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel (date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner2 = new javax.swing.JSpinner(sm);
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Classes");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information about the lessons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lesson code");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date of the lesson");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Code car");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Student's code");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Code of the instructor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Type of Occupation");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Time");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(txtTypeOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 120, -1));

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

        txtCodeInstructor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeInstructorKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodeInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, -1));

        txtLessonCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLessonCodeKeyTyped(evt);
            }
        });
        jPanel1.add(txtLessonCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 120, -1));

        txtCodeCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeCarActionPerformed(evt);
            }
        });
        txtCodeCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodeCarKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodeCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 120, -1));

        txtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudentIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, -1));

        DateDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateDDActionPerformed(evt);
            }
        });
        jPanel1.add(DateDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner2, "HH:mm:ss");
        jSpinner2.setEditor(de);
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\prava23.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 20, 780, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    txtLessonCode.setText("");
    txtCodeCar.setText("");
    txtStudentID.setText("");
    txtCodeInstructor.setText("");
    txtTypeOccupation.setText("");
    
    
    
    
    
    
    
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtLessonCode.requestDefaultFocus();

}
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            
            if (txtCodeInstructor.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Class ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int P = JOptionPane.showConfirmDialog(null," Delete?", "Confirm action",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from classes where id = '" + txtCodeInstructor.getText() + "'";
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
        
    
        
        
    Date departDatedD = (Date) DateDD.getDate();
    SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String departDate = oDateFormat.format(departDatedD);
    
     Date time = (Date) jSpinner2.getValue();
     SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
     String timeInto = timeFormat.format(time);
    
    
    
    
    
        
    
        
        try{
            con=Connect.ConnectDB();
            
            if (txtLessonCode.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter class ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtCodeCar.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the car","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
                    
            if (txtStudentID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the student ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtCodeInstructor.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the instructor ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtTypeOccupation.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter type of the occupation","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (departDate.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter date ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
         
            
            
            String sql= "update classes set codecar='"+ txtCodeCar.getText() + "',scode='"+ txtStudentID.getText() 
                    + "',cinstructor='"+ txtCodeInstructor.getText() + "',typeoccupation='"+ txtTypeOccupation.getText() 
                    + "',timedate='"+ departDate + "',times='"+ timeInto 
                    + "' where id='" + txtLessonCode.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Update successful","The class is updated",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.hide();
     ClassesRecord frm=new ClassesRecord();
     frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        Date departDatedD = (Date) DateDD.getDate();
    SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String departDate = oDateFormat.format(departDatedD);
    
     Date time = (Date) jSpinner2.getValue();
     SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
     String timeInto = timeFormat.format(time);
        
    
       
        try{
            con=Connect.ConnectDB();

            if (txtCodeCar.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the car","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
                    
            if (txtStudentID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the student ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtCodeInstructor.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter the code of the instructor ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (txtTypeOccupation.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter type of the occupation","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (departDate.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter date ","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
            Statement stmt;
            stmt= con.createStatement();

            String sql= "insert into classes (codecar, scode, cinstructor, typeoccupation, timedate, times)"
                   + "values('"+ txtCodeCar.getText() + "','" + txtStudentID.getText() + "','"+ txtCodeInstructor.getText() 
                   + "','" + txtTypeOccupation.getText() + "','"+ departDate + "','" + timeInto +"')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Success","Class is recorded",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCodeInstructorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeInstructorKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCodeInstructorKeyTyped

    private void txtLessonCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLessonCodeKeyTyped
        
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
            ||(vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }
        
    }//GEN-LAST:event_txtLessonCodeKeyTyped

    private void txtCodeCarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeCarKeyTyped
        
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
            ||(vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }
        
    }//GEN-LAST:event_txtCodeCarKeyTyped

    private void txtStudentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentIDKeyTyped
        
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
            ||(vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }
        
    }//GEN-LAST:event_txtStudentIDKeyTyped

    private void DateDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateDDActionPerformed

    private void txtCodeCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeCarActionPerformed

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
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DateDD;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner2;
    public javax.swing.JTextField txtCodeCar;
    public javax.swing.JTextField txtCodeInstructor;
    public javax.swing.JTextField txtLessonCode;
    public javax.swing.JTextField txtStudentID;
    public javax.swing.JTextField txtTypeOccupation;
    // End of variables declaration//GEN-END:variables
}
