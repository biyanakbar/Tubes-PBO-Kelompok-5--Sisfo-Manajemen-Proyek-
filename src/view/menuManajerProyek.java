/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import controller.Controller;
import javax.swing.JTextField;

/**
 *
 * @author biyan
 */
public class menuManajerProyek extends javax.swing.JFrame implements View{

    /**
     * Creates new form menuManajerProye
     */
    public menuManajerProyek() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textIdManajerProyek = new javax.swing.JTextField();
        btnBuatProyek = new javax.swing.JButton();
        btnUpdateProyek = new javax.swing.JButton();
        btnLihatProyek = new javax.swing.JButton();
        btnCariProyek = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();
        txNotif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Manajer Proyek");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Menu Manajer Proyek");

        btnBuatProyek.setText("Buat Proyek");
        btnBuatProyek.setEnabled(false);
        btnBuatProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatProyekActionPerformed(evt);
            }
        });

        btnUpdateProyek.setText("Update Proyek");
        btnUpdateProyek.setEnabled(false);

        btnLihatProyek.setText("Lihat Proyek");
        btnLihatProyek.setEnabled(false);

        btnCariProyek.setText("Cari Proyek");
        btnCariProyek.setEnabled(false);

        btnBack.setText("<< Back");

        btnCek.setText("Cek");

        txNotif.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBuatProyek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCariProyek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLihatProyek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateProyek, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txNotif, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCek)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(textIdManajerProyek)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textIdManajerProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCek)
                    .addComponent(txNotif))
                .addGap(18, 18, 18)
                .addComponent(btnBuatProyek)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProyek)
                .addGap(18, 18, 18)
                .addComponent(btnLihatProyek)
                .addGap(18, 18, 18)
                .addComponent(btnCariProyek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuatProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatProyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuatProyekActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuatProyek;
    private javax.swing.JButton btnCariProyek;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnLihatProyek;
    private javax.swing.JButton btnUpdateProyek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textIdManajerProyek;
    private javax.swing.JLabel txNotif;
    // End of variables declaration//GEN-END:variables

    public Object getBtnBuatProyek() {
        return btnBuatProyek;
    }

    public Object getBtnCariProyek() {
        return btnCariProyek;
    }

    public Object getBtnLihatProyek() {
        return btnLihatProyek;
    }

    public Object getBtnUpdateProyek() {
        return btnUpdateProyek;
    }

    public Object getBtnBack() {
        return btnBack;
    }

    public Object getBtnCek() {
        return btnCek;
    }
    
    public String getTextManajerProyek() {
        return textIdManajerProyek.getText();
    }
    
    public void setTxNotif(String s){
        txNotif.setText(s);
    }
    
    public void setDisableTextManajerProyek(){
        textIdManajerProyek.setEditable(false);
    }
    
    public void setEnableBtn(){
        btnBuatProyek.setEnabled(true);
        btnCariProyek.setEnabled(true);
        btnLihatProyek.setEnabled(true);
        btnUpdateProyek.setEnabled(true);
    }
    
    public void setDisableBtn(){
        btnBuatProyek.setEnabled(false);
        btnCariProyek.setEnabled(false);
        btnLihatProyek.setEnabled(false);
        btnUpdateProyek.setEnabled(false);
    }
      
    public void addListener(ActionListener e){
        btnBuatProyek.addActionListener(e);
        btnCariProyek.addActionListener(e);
        btnLihatProyek.addActionListener(e);
        btnUpdateProyek.addActionListener(e);
        btnBack.addActionListener(e);
        btnCek.addActionListener(e);
    }
    
}
