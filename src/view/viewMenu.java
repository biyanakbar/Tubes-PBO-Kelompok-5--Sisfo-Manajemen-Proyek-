/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import controller.Controller;
import javax.swing.JButton;

/**
 *
 * @author biyan
 */
public class viewMenu extends javax.swing.JFrame implements View{

    /**
     * Creates new form viewMen
     */
    public viewMenu() {
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

        btnMenuManPro = new javax.swing.JButton();
        btnMenuProg = new javax.swing.JButton();
        btnInsManPro = new javax.swing.JButton();
        btnInsProg = new javax.swing.JButton();
        btnLihatManPro = new javax.swing.JButton();
        btnLihatProg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMenuManPro.setText("Menu Manajer Proyek");

        btnMenuProg.setText("Menu Programmer");

        btnInsManPro.setText("Insert Manajer Proyek");

        btnInsProg.setText("Insert Programmer");

        btnLihatManPro.setText("Lihat Manajer Proyek");
        btnLihatManPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatManProActionPerformed(evt);
            }
        });

        btnLihatProg.setText("Lihat Programmer");
        btnLihatProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatProgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Aplikasi Sistem Informasi Manajemen Proyek");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsManPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLihatManPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLihatProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuManPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnInsManPro)
                .addGap(18, 18, 18)
                .addComponent(btnInsProg)
                .addGap(18, 18, 18)
                .addComponent(btnLihatManPro)
                .addGap(18, 18, 18)
                .addComponent(btnLihatProg)
                .addGap(18, 18, 18)
                .addComponent(btnMenuManPro)
                .addGap(18, 18, 18)
                .addComponent(btnMenuProg)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLihatProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatProgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatProgActionPerformed

    private void btnLihatManProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatManProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatManProActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsManPro;
    private javax.swing.JButton btnInsProg;
    private javax.swing.JButton btnLihatManPro;
    private javax.swing.JButton btnLihatProg;
    private javax.swing.JButton btnMenuManPro;
    private javax.swing.JButton btnMenuProg;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public Object getBtnInsManPro() {
        return btnInsManPro;
    }

    public Object getBtnInsProg() {
        return btnInsProg;
    }

    public Object getBtnLihatManPro() {
        return btnLihatManPro;
    }

    public Object getBtnLihatProg() {
        return btnLihatProg;
    }

    public Object getBtnMenuManPro() {
        return btnMenuManPro;
    }

    public Object getBtnMenuProg() {
        return btnMenuProg;
    }
            
    public void addListener(ActionListener e) {
        btnInsManPro.addActionListener(e);
        btnInsProg.addActionListener(e);
        btnLihatManPro.addActionListener(e);
        btnLihatProg.addActionListener(e);
        btnMenuManPro.addActionListener(e);
        btnMenuProg.addActionListener(e);
        
    }
}
