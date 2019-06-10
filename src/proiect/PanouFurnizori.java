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
public class PanouFurnizori extends javax.swing.JPanel {

    FunctiiFurnizori functii_furnizori = new FunctiiFurnizori();
    public PanouFurnizori() {
        initComponents();
        
        tabel_furnizori.getTableHeader().setReorderingAllowed(false);
        tabel_furnizori.getColumnModel().getColumn(0).setPreferredWidth(27);
        tabel_furnizori.getColumnModel().getColumn(1).setPreferredWidth(130);
        tabel_furnizori.getColumnModel().getColumn(2).setPreferredWidth(130);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_furnizori = new javax.swing.JTable();
        buton_sterge = new javax.swing.JButton();
        buton_adauga = new javax.swing.JButton();
        buton_modifica = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista furnizori:");

        tabel_furnizori.setModel(functii_furnizori.tabel_date_furnizori());
        jScrollPane1.setViewportView(tabel_furnizori);

        buton_sterge.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buton_sterge.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\sterge.png")); // NOI18N
        buton_sterge.setText("Sterge furnizor");
        buton_sterge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_stergeMouseClicked(evt);
            }
        });

        buton_adauga.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buton_adauga.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\adauga.png")); // NOI18N
        buton_adauga.setText("Adauga furnizor");
        buton_adauga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_adaugaMouseClicked(evt);
            }
        });

        buton_modifica.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buton_modifica.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\modifica.png")); // NOI18N
        buton_modifica.setText("Modifica detalii");
        buton_modifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_modificaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 680, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(buton_adauga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buton_sterge)
                        .addGap(94, 94, 94)
                        .addComponent(buton_modifica)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_adauga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_sterge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void buton_adaugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_adaugaMouseClicked
        // TODO add your handling code here:
        new AdaugaFurnizor();
    }//GEN-LAST:event_buton_adaugaMouseClicked

    private void buton_stergeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_stergeMouseClicked
        
    }//GEN-LAST:event_buton_stergeMouseClicked

    private void buton_modificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_modificaMouseClicked
        try {
                    int linieselectata=tabel_furnizori.getSelectedRow();
                    if(linieselectata == -1  )
                    {
                       JOptionPane.showMessageDialog(null, "Este necesara alegerea unui rand din tabel.");
                    }
                    else 
                    {
                        int linie = Integer.parseInt(tabel_furnizori.getModel().getValueAt(linieselectata,0).toString());
                        functii_furnizori.StergeFurnizor(linie);
                        JOptionPane.showMessageDialog(null, "Angajatul a fost sters cu succes.");
                    }
                    
                    
                } catch (Exception ex) {

                }
    }//GEN-LAST:event_buton_modificaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_adauga;
    private javax.swing.JButton buton_modifica;
    private javax.swing.JButton buton_sterge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_furnizori;
    // End of variables declaration//GEN-END:variables
}
