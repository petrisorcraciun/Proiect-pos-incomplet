/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author petri
 */
public class PaginaAngajat extends javax.swing.JFrame {

    FunctiiProduse Functii_produse = new FunctiiProduse();
    int cod_produs=0;
    public PaginaAngajat() {
        initComponents();
        try {
        int linieselectata=tabel_produse.getSelectedRow();
        
        String casuta_codbare_st = tabel_produse.getModel().getValueAt(linieselectata,0).toString();
        casuta_codbare.setText(casuta_codbare_st);          
                    
        } catch (Exception ex) {

        }
        casuta_pret.setEnabled(false);
        casuta_codbare.setEnabled(false);
        casuta_denumire.setEnabled(false);
        casuta_cantitate.setEnabled(false);
        total_plata.setEnabled(false);
        tabel_produse.getTableHeader().setReorderingAllowed(false);
       
        setVisible(true);
        setSize(1000,550);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanouSus = new javax.swing.JPanel();
        text_panousus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        text_lista_produe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_produse = new javax.swing.JTable();
        total_plata = new javax.swing.JTextField();
        text_total_plata1 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        casuta_pret = new javax.swing.JTextField();
        casuta_denumire = new javax.swing.JTextField();
        casuta_codbare = new javax.swing.JTextField();
        casuta_cantitate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buton_1 = new javax.swing.JButton();
        text_total_plata = new javax.swing.JLabel();
        afisare_cod = new javax.swing.JTextField();
        buton_adauga_cod = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        text_total_plata2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        sterge_o_cifra = new javax.swing.JButton();
        buton_2 = new javax.swing.JButton();
        buton_3 = new javax.swing.JButton();
        buton_4 = new javax.swing.JButton();
        buton_7 = new javax.swing.JButton();
        buton_5 = new javax.swing.JButton();
        buton_8 = new javax.swing.JButton();
        buton_0 = new javax.swing.JButton();
        buton_6 = new javax.swing.JButton();
        buton_9 = new javax.swing.JButton();
        buton_C = new javax.swing.JButton();
        buton_reducere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanouSus.setBackground(new java.awt.Color(102, 102, 102));

        text_panousus.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        text_panousus.setForeground(new java.awt.Color(255, 255, 255));
        text_panousus.setText("Panou vanzari - Craciun Petrisor 2018");
        PanouSus.add(text_panousus);

        getContentPane().add(PanouSus);
        PanouSus.setBounds(0, 0, 990, 40);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        text_lista_produe.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        text_lista_produe.setForeground(new java.awt.Color(255, 255, 255));
        text_lista_produe.setText("Lista produse:");

        tabel_produse.setModel(Functii_produse.tabel_produse(cod_produs));
        jScrollPane1.setViewportView(tabel_produse);

        total_plata.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        text_total_plata1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        text_total_plata1.setForeground(new java.awt.Color(255, 255, 255));
        text_total_plata1.setText("Total de plata:");

        jButton18.setText("Sterge produs");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });

        jButton19.setText("Modifica cantitate");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jButton24.setText("Cauta produs");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
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
                                .addComponent(text_lista_produe)
                                .addGap(121, 121, 121)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(text_total_plata1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(total_plata, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_lista_produe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_plata, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_total_plata1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton24)
                    .addComponent(jButton18))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 130, 590, 370);
        getContentPane().add(casuta_pret);
        casuta_pret.setBounds(420, 90, 180, 28);
        getContentPane().add(casuta_denumire);
        casuta_denumire.setBounds(60, 90, 260, 28);
        getContentPane().add(casuta_codbare);
        casuta_codbare.setBounds(60, 50, 260, 28);
        getContentPane().add(casuta_cantitate);
        casuta_cantitate.setBounds(420, 50, 180, 28);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Pret:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 90, 90, 21);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("PLU:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 40, 21);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Desc:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 50, 21);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Cantitate:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 50, 90, 21);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        buton_1.setText("1");
        buton_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_1MouseClicked(evt);
            }
        });

        text_total_plata.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        text_total_plata.setForeground(new java.awt.Color(255, 255, 255));
        text_total_plata.setText("Adauga cod produs:");

        buton_adauga_cod.setText("Adauga");
        buton_adauga_cod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_adauga_codMouseClicked(evt);
            }
        });

        jButton20.setText("Card");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        jButton21.setText("Numerar");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });

        jButton22.setText("Bon valoric");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });

        text_total_plata2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        text_total_plata2.setForeground(new java.awt.Color(255, 255, 255));
        text_total_plata2.setText("Metoda de plata:");

        jButton17.setText("INCHIDE BON");
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton17.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        sterge_o_cifra.setText("<-");
        sterge_o_cifra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sterge_o_cifraMouseClicked(evt);
            }
        });

        buton_2.setText("2");
        buton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_2MouseClicked(evt);
            }
        });

        buton_3.setText("3");
        buton_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_3MouseClicked(evt);
            }
        });

        buton_4.setText("4");
        buton_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_4MouseClicked(evt);
            }
        });

        buton_7.setText("7");
        buton_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_7MouseClicked(evt);
            }
        });

        buton_5.setText("5");
        buton_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_5MouseClicked(evt);
            }
        });

        buton_8.setText("8");
        buton_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_8MouseClicked(evt);
            }
        });

        buton_0.setText("0");
        buton_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_0MouseClicked(evt);
            }
        });

        buton_6.setText("6");
        buton_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_6MouseClicked(evt);
            }
        });

        buton_9.setText("9");
        buton_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_9MouseClicked(evt);
            }
        });

        buton_C.setText("C");
        buton_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_CMouseClicked(evt);
            }
        });

        buton_reducere.setText("%");
        buton_reducere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton_reducereMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(buton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(buton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(buton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(text_total_plata)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(afisare_cod))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sterge_o_cifra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(16, 16, 16)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(buton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buton_C, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buton_adauga_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(buton_reducere, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_total_plata2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(text_total_plata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(afisare_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sterge_o_cifra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buton_adauga_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buton_C, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buton_reducere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_total_plata2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(610, 50, 360, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_1MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+1;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
        
    }//GEN-LAST:event_buton_1MouseClicked

    private void buton_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_2MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+2;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_2MouseClicked

    private void buton_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_3MouseClicked
       if(String.valueOf(cod_produs).length()!=4)
       {
       cod_produs=cod_produs*10+3;
       afisare_cod.setText(String.valueOf(cod_produs));
       }
       else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_3MouseClicked

    private void buton_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_4MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+4;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_4MouseClicked

    private void buton_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_5MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+5;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_5MouseClicked

    private void buton_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_6MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+6;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_6MouseClicked

    private void buton_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_7MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+7;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_7MouseClicked

    private void buton_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_8MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+8;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_8MouseClicked

    private void buton_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_9MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10+9;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_9MouseClicked

    private void buton_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_0MouseClicked
        if(String.valueOf(cod_produs).length()!=4)
        {
        cod_produs=cod_produs*10;
        afisare_cod.setText(String.valueOf(cod_produs));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Maxim 4 cifre.");
        }
    }//GEN-LAST:event_buton_0MouseClicked

    private void buton_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_CMouseClicked

        cod_produs=cod_produs*0;
        afisare_cod.setText(String.valueOf(cod_produs));

    }//GEN-LAST:event_buton_CMouseClicked

    private void buton_reducereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_reducereMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buton_reducereMouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseClicked

    private void sterge_o_cifraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sterge_o_cifraMouseClicked
        cod_produs=cod_produs/10;
        afisare_cod.setText(String.valueOf(cod_produs));
    }//GEN-LAST:event_sterge_o_cifraMouseClicked

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        new CautaProdus();
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseClicked

    private void buton_adauga_codMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton_adauga_codMouseClicked
            Functii_produse.adaugare_produs_angajat(cod_produs);
            tabel_produse.removeAll();
            tabel_produse.revalidate();
            tabel_produse.repaint();
            Functii_produse.tabel_produse(cod_produs);
            tabel_produse.removeAll();
            tabel_produse.revalidate();
            cod_produs=cod_produs*0;
            afisare_cod.setText(String.valueOf(cod_produs));
            double sum = 0;
            for(int i = 0; i < tabel_produse.getRowCount(); i++)
            {
                sum = sum + Double.parseDouble(tabel_produse.getValueAt(i, 5).toString());
            }
            total_plata.setText(String.valueOf(sum));
    }//GEN-LAST:event_buton_adauga_codMouseClicked

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
            java.util.logging.Logger.getLogger(PaginaAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaAngajat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanouSus;
    private javax.swing.JTextField afisare_cod;
    private javax.swing.JButton buton_0;
    private javax.swing.JButton buton_1;
    private javax.swing.JButton buton_2;
    private javax.swing.JButton buton_3;
    private javax.swing.JButton buton_4;
    private javax.swing.JButton buton_5;
    private javax.swing.JButton buton_6;
    private javax.swing.JButton buton_7;
    private javax.swing.JButton buton_8;
    private javax.swing.JButton buton_9;
    private javax.swing.JButton buton_C;
    private javax.swing.JButton buton_adauga_cod;
    private javax.swing.JButton buton_reducere;
    private javax.swing.JTextField casuta_cantitate;
    private javax.swing.JTextField casuta_codbare;
    private javax.swing.JTextField casuta_denumire;
    private javax.swing.JTextField casuta_pret;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sterge_o_cifra;
    private javax.swing.JTable tabel_produse;
    private javax.swing.JLabel text_lista_produe;
    private javax.swing.JLabel text_panousus;
    private javax.swing.JLabel text_total_plata;
    private javax.swing.JLabel text_total_plata1;
    private javax.swing.JLabel text_total_plata2;
    private javax.swing.JTextField total_plata;
    // End of variables declaration//GEN-END:variables
}
