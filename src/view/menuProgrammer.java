/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author biyan
 */
public class menuProgrammer extends javax.swing.JFrame implements View{

    /**
     * Creates new form menuProgramme
     */
    public menuProgrammer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        textIdProgrammer = new javax.swing.JTextField();
        btnLihatTugas = new javax.swing.JButton();
        btnUpdateTugas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();
        txNotif = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Menu Programmer");

        btnLihatTugas.setText("Lihat Tugas");
        btnLihatTugas.setEnabled(false);

        btnUpdateTugas.setText("Update Tugas");
        btnUpdateTugas.setEnabled(false);

        jLabel1.setText("ID Programmer");

        btnBack.setText("<< Back");

        btnCek.setText("Cek");

        txNotif.setText(" ");

        jLabel2.setText("Password");

        txPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLihatTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateTugas)
                                .addComponent(btnCek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textIdProgrammer, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(txPass))))
                    .addComponent(txNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textIdProgrammer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnCek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLihatTugas)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateTugas)
                .addGap(3, 3, 3)
                .addComponent(btnBack)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPassActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnLihatTugas;
    private javax.swing.JButton btnUpdateTugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textIdProgrammer;
    private javax.swing.JLabel txNotif;
    private javax.swing.JPasswordField txPass;
    // End of variables declaration//GEN-END:variables

    public Object getBtnLihatTugas() {
        return btnLihatTugas;
    }

    public Object getBtnUpdateTugas() {
        return btnUpdateTugas;
    }

    public Object getBtnBack() {
        return btnBack;
    }

    public Object getBtnCek() {
        return btnCek;
    }

    public String getTextProgrammer() {
        return textIdProgrammer.getText();
    }

    public String getTxPass() {
        return txPass.getText();
    }
    
    public void setTxNotif(String s){
        txNotif.setText(s);
    }
    
    public void setEnableBtn(){
        btnLihatTugas.setEnabled(true);
        btnUpdateTugas.setEnabled(true);
    }
    
    public void setDisableBtn(){
        btnLihatTugas.setEnabled(false);
        btnUpdateTugas.setEnabled(false);
    }
    
    public void setDisableTextProgrammer(){
        textIdProgrammer.setEditable(false);
    }
    
    public void setDisableTxPass(){
        txPass.setEditable(false);
    }

    public void addListener(ActionListener e){
        btnLihatTugas.addActionListener(e);
        btnUpdateTugas.addActionListener(e);
        btnBack.addActionListener(e);
        btnCek.addActionListener(e);
    }
}
