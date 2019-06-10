/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author petri
 */
public class AdaugaProdus extends javax.swing.JFrame {

    FunctiiProduse functii_produse = new FunctiiProduse();
    String[] date_categorii = functii_produse.categorii_produse();
    String[] furnizori_nume = functii_produse.afisare_furnizori();
    final DefaultComboBoxModel date_categorii_afisare = new DefaultComboBoxModel(date_categorii);
    final DefaultComboBoxModel furnizori_afisare = new DefaultComboBoxModel(furnizori_nume);

    public AdaugaProdus() {
        initComponents();
        setSize(400, 580);
        setVisible(true);
        setTitle("Adauga produse - Craciun Petrisor");

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantitate = new javax.swing.JTextField();
        cod_articol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cod_bare = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        furnizor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        buton_adauga_produs = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nume_produs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        um_kg = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pret_buc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        data_expirare = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        categorii = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adaugare produs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 40);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Furnizor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 390, 139, 20);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Cod articol:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 91, 21);
        getContentPane().add(cantitate);
        cantitate.setBounds(130, 350, 220, 30);
        getContentPane().add(cod_articol);
        cod_articol.setBounds(130, 50, 220, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Cod de bare:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 139, 20);
        getContentPane().add(cod_bare);
        cod_bare.setBounds(130, 90, 220, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Nume produs:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 139, 20);

        furnizor.setModel(furnizori_afisare);
        furnizor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furnizorActionPerformed(evt);
            }
        });
        getContentPane().add(furnizor);
        furnizor.setBounds(130, 390, 220, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\anuleaza.png")); // NOI18N
        jButton1.setText("Anuleaza");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 450, 140, 50);

        buton_adauga_produs.setIcon(new javax.swing.ImageIcon("C:\\Users\\petri\\Desktop\\Practica2018\\imagini\\adauga.png")); // NOI18N
        buton_adauga_produs.setText("Adauga produs");
        buton_adauga_produs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_adauga_produsMouseClicked(evt);
            }
        });
        getContentPane().add(buton_adauga_produs);
        buton_adauga_produs.setBounds(20, 450, 160, 50);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Tip cantitate:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 170, 139, 20);
        getContentPane().add(nume_produs);
        nume_produs.setBounds(130, 130, 220, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Pret buc/kg:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 220, 139, 20);

        um_kg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "U.M", "KG" }));
        um_kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                um_kgActionPerformed(evt);
            }
        });
        getContentPane().add(um_kg);
        um_kg.setBounds(130, 170, 220, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Categorie:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 270, 139, 20);
        getContentPane().add(pret_buc);
        pret_buc.setBounds(130, 220, 220, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Data expirare:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 310, 139, 20);
        getContentPane().add(data_expirare);
        data_expirare.setBounds(130, 310, 220, 30);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Cantitate:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 350, 139, 20);

        categorii.setModel(date_categorii_afisare);
        categorii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriiActionPerformed(evt);
            }
        });
        getContentPane().add(categorii);
        categorii.setBounds(130, 270, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void furnizorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furnizorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_furnizorActionPerformed

    private void um_kgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_um_kgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_um_kgActionPerformed

    private void categoriiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriiActionPerformed

    private void buton_adauga_produsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_adauga_produsMouseClicked
        int categorie_int = (Integer) categorii.getSelectedItem();
        int furnizor_int = (Integer) furnizor.getSelectedItem();
        String[] date = new String[10];
        date[0] = "1";
        date[1] = cod_articol.getText();
        date[2] = nume_produs.getText();
        date[3] = pret_buc.getText();
        date[4] = cod_bare.getText();
        date[5] = um_kg.getSelectedItem().toString();
        date[6] = String.valueOf(categorie_int);
        date[7] = data_expirare.getText();
        date[8] = cantitate.getText();
        date[9] = String.valueOf(furnizor_int);
    }//GEN-LAST:event_buton_adauga_produsMouseClicked

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
            java.util.logging.Logger.getLogger(AdaugaProdus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugaProdus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugaProdus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugaProdus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdaugaProdus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_adauga_produs;
    private javax.swing.JTextField cantitate;
    private javax.swing.JComboBox<String> categorii;
    private javax.swing.JTextField cod_articol;
    private javax.swing.JTextField cod_bare;
    private javax.swing.JTextField data_expirare;
    private javax.swing.JComboBox<String> furnizor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nume_produs;
    private javax.swing.JTextField pret_buc;
    private javax.swing.JComboBox<String> um_kg;
    // End of variables declaration//GEN-END:variables
}
