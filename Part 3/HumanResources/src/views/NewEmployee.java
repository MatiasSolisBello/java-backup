package views;

import Entities.Employee;
import dao.EmployeeDAO;
import javax.swing.JOptionPane;

public class NewEmployee extends javax.swing.JFrame {

    public NewEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lbl_rut = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        lbl_age = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_lastname = new javax.swing.JLabel();
        spn_age = new javax.swing.JSpinner();
        lbl_position = new javax.swing.JLabel();
        cbo_position = new javax.swing.JComboBox();
        txt_sex = new javax.swing.JLabel();
        rbt_male = new javax.swing.JRadioButton();
        rbt_female = new javax.swing.JRadioButton();
        chk_isforeign = new javax.swing.JCheckBox();
        btn_save = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_rut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_rut.setText("RUT:");

        lbl_age.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_age.setText("Edad:");

        lbl_name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_name.setText("Nombre:");

        lbl_lastname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_lastname.setText("Apellido:");

        lbl_position.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_position.setText("Cargo:");

        cbo_position.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Asistente", "Vendedor" }));

        txt_sex.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_sex.setText("Sexo:");

        buttonGroup1.add(rbt_male);
        rbt_male.setSelected(true);
        rbt_male.setText("Masculino");

        buttonGroup1.add(rbt_female);
        rbt_female.setText("Femenino");

        chk_isforeign.setText("¿Es extranjero?");
        chk_isforeign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_isforeignActionPerformed(evt);
            }
        });

        btn_save.setText("Guardar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_clean.setText("Limpiar");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(lbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lbl_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_position)
                            .addComponent(lbl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sex))
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbo_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spn_age, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbt_male)
                        .addGap(40, 40, 40)
                        .addComponent(rbt_female))
                    .addComponent(chk_isforeign)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_save)
                .addGap(26, 26, 26)
                .addComponent(btn_clean)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_position)
                    .addComponent(cbo_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sex)
                    .addComponent(rbt_male)
                    .addComponent(rbt_female))
                .addGap(29, 29, 29)
                .addComponent(chk_isforeign)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_clean))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_isforeignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_isforeignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_isforeignActionPerformed
    
    // -------------------------
    // Boton Guardar
    // -------------------------
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        try {
            Employee e = new Employee();
            
            e.setRut(txt_rut.getText());
            e.setName(txt_name.getText());
            e.setLast_name(txt_lastname.getText());
            e.setAge(Integer.parseInt(spn_age.getValue().toString()));
            e.setPosition(cbo_position.getSelectedItem().toString());
            e.setSex(rbt_male.isSelected());
            e.setIs_foreign(chk_isforeign.isSelected());
            
            EmployeeDAO dao = new EmployeeDAO();
            
            if(dao.createEmployee(e)){
                JOptionPane.showMessageDialog(this, "Guardado correctamente");
                this.clear();
            }else{
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        this.clear();
    }//GEN-LAST:event_btn_cleanActionPerformed
    
    // -----------------
    //  Metodo limpiar
    // -----------------
    private void clear(){
        txt_rut.setText("");
        txt_name.setText("");
        txt_lastname.setText("");
        spn_age.setValue(0);
        cbo_position.setSelectedIndex(0);
        rbt_male.setSelected(true);
        chk_isforeign.setSelected(false);
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
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbo_position;
    private javax.swing.JCheckBox chk_isforeign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_rut;
    private javax.swing.JRadioButton rbt_female;
    private javax.swing.JRadioButton rbt_male;
    private javax.swing.JSpinner spn_age;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JLabel txt_sex;
    // End of variables declaration//GEN-END:variables
}
