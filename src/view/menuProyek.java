/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author biyan
 */
public class menuProyek extends javax.swing.JFrame implements View{

    /**
     * Creates new form menuProye
     */
    public menuProyek() {
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
        btnTambahTugas = new javax.swing.JButton();
        btnLihatTugas = new javax.swing.JButton();
        btnHapusTugas = new javax.swing.JButton();
        btnLihatAnggota = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Project Menu");

        btnTambahTugas.setText("Add Task");

        btnLihatTugas.setText("View Task");

        btnHapusTugas.setText("Delete Task");

        btnLihatAnggota.setText("View Member");

        btnBack.setText("<< Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLihatAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapusTugas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLihatTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(btnTambahTugas)
                .addGap(18, 18, 18)
                .addComponent(btnLihatTugas)
                .addGap(17, 17, 17)
                .addComponent(btnHapusTugas)
                .addGap(19, 19, 19)
                .addComponent(btnLihatAnggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapusTugas;
    private javax.swing.JButton btnLihatAnggota;
    private javax.swing.JButton btnLihatTugas;
    private javax.swing.JButton btnTambahTugas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public Object getBtnHapusTugas() {
        return btnHapusTugas;
    }

    public Object getBtnLihatAnggota() {
        return btnLihatAnggota;
    }

    public Object getBtnLihatTugas() {
        return btnLihatTugas;
    }

    public Object getBtnTambahTugas() {
        return btnTambahTugas;
    }

    public Object getBtnBack() {
        return btnBack;
    }
    
    public void addListener(ActionListener e){
        btnHapusTugas.addActionListener(e);
        btnLihatAnggota.addActionListener(e);
        btnLihatTugas.addActionListener(e);
        btnTambahTugas.addActionListener(e);
        btnBack.addActionListener(e);
    }

    

}
