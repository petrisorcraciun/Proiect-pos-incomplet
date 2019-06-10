/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

import javax.swing.JOptionPane;

/**
 *
 * @author petri
 */
public class PaginaProduse extends javax.swing.JPanel {

    FunctiiProduse functii_produse = new FunctiiProduse();
    public PaginaProduse() {
        initComponents();
        
        tabel_produse.getTableHeader().setReorderingAllowed(false);
        tabel_produse.getColumnModel().getColumn(0).setPreferredWidth(37);
        tabel_produse.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabel_produse.getColumnModel().getColumn(3).setPreferredWidth(50);
        setVisible(true);
        setSize(800,370);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_produse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buton_sterge_produs = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tabel_produse.setModel(functii_produse.tabel_date_produse());
        jScrollPane1.setViewportView(tabel_produse);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista produse:");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\adauga.png")); // NOI18N
        jButton1.setText("Adauga produs");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\modifica.png")); // NOI18N
        jButton2.setText("Modifica detalii");

        buton_sterge_produs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buton_sterge_produs.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\sterge.png")); // NOI18N
        buton_sterge_produs.setText("Sterge produs");
        buton_sterge_produs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_sterge_produsMouseClicked(evt);
            }
        });

        jButton3.setText("Cauta produs");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addComponent(buton_sterge_produs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_sterge_produs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new AdaugaProdus();
    }//GEN-LAST:event_jButton1MouseClicked

    private void buton_sterge_produsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_sterge_produsMouseClicked
        try {
                    int linieselectata=tabel_produse.getSelectedRow();
                    if(linieselectata == -1  )
                    {
                       JOptionPane.showMessageDialog(null, "Este necesara alegerea unui rand din tabel.");
                    }
                    else 
                    {
                        int linie = Integer.parseInt(tabel_produse.getModel().getValueAt(linieselectata,0).toString());
                        functii_produse.StergeProdus(linie);
                        JOptionPane.showMessageDialog(null, "Angajatul a fost sters cu succes.");
                    }
                    
                    
                } catch (Exception ex) {

                }
    }//GEN-LAST:event_buton_sterge_produsMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        new CautaProdus();
    }//GEN-LAST:event_jButton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_sterge_produs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_produse;
    // End of variables declaration//GEN-END:variables
}
