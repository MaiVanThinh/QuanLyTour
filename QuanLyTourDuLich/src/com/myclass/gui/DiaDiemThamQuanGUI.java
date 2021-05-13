/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclass.gui;

import com.myclass.bus.DiaDiemThamQuanBUS;
import com.myclass.dto.DiaDiemThamQuanDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thin
 */
public class DiaDiemThamQuanGUI extends javax.swing.JFrame {
DefaultTableModel tableModel;
    List<DiaDiemThamQuanDTO> diadiemList = new ArrayList<>();
    /**
     * Creates new form DiaDiemThamQuan
     */
    public DiaDiemThamQuanGUI() {
        initComponents();
        tableModel = (DefaultTableModel) tblDiaDiem.getModel();      
    }
    
    private void showDiaDiem() {
        diadiemList = DiaDiemThamQuanBUS.xemDSDD();
        tableModel.setRowCount(0);

        diadiemList.forEach(ddDTO -> {
            tableModel.addRow(new Object[]{
                ddDTO.getMaDD(), ddDTO.getTenDD(), ddDTO.getND(), ddDTO.getDiachi()

            });
        });
    }
    
    private void showData(){
        int selectedIndex = tblDiaDiem.getSelectedRow();
        if (selectedIndex >= 0) {
            DiaDiemThamQuanDTO ddDTO = diadiemList.get(selectedIndex);
            
            txtMaDD.setText(ddDTO.getMaDD());
            txtTenDD.setText(ddDTO.getTenDD());
            cbNoiDung.setSelectedItem(ddDTO.getND());
            txtDiachi.setText(ddDTO.getDiachi());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbMaDD = new javax.swing.JLabel();
        txtMaDD = new javax.swing.JTextField();
        lbTenDD = new javax.swing.JLabel();
        txtTenDD = new javax.swing.JTextField();
        lbNoiDung = new javax.swing.JLabel();
        cbNoiDung = new javax.swing.JComboBox<>();
        lbDiachi = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiaDiem = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Ä�á»ŠA Ä�Iá»‚M THAM QUAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        lbMaDD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMaDD.setForeground(new java.awt.Color(0, 0, 0));
        lbMaDD.setText("MÃ£ Ä‘á»‹a Ä‘iá»ƒm");

        lbTenDD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTenDD.setForeground(new java.awt.Color(0, 0, 0));
        lbTenDD.setText("TÃªn Ä‘á»‹a Ä‘iá»ƒm");

        txtTenDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDDActionPerformed(evt);
            }
        });

        lbNoiDung.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNoiDung.setForeground(new java.awt.Color(0, 0, 0));
        lbNoiDung.setText("Ná»™i dung tham quan");

        cbNoiDung.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbNoiDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ná»™i dung 1", "Ná»™i dung 2", "Ná»™i dung 3", "Ná»™i dung 4" }));

        lbDiachi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDiachi.setForeground(new java.awt.Color(0, 0, 0));
        lbDiachi.setText("Ä�á»‹a chá»‰");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTenDD, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lbMaDD))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtMaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNoiDung))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(cbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDiachi))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTenDD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaDD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTenDD)
                .addGap(12, 12, 12)
                .addComponent(txtTenDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNoiDung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDiachi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDiaDiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDiaDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ£ Ä‘á»‹a Ä‘iá»ƒm", "TÃªn Ä‘á»‹a Ä‘iá»ƒm", "Ná»™i dung", "Ä�á»‹a chá»‰"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDiaDiem);

        btnXem.setBackground(new java.awt.Color(153, 153, 255));
        btnXem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXem.setForeground(new java.awt.Color(0, 0, 0));
        btnXem.setText("Xem Danh SÃ¡ch");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnLuu.setBackground(new java.awt.Color(153, 153, 255));
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(0, 0, 0));
        btnLuu.setText("LÆ°u Ä�á»‹a Ä�iá»ƒm");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 153, 255));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 0, 0));
        btnXoa.setText("XÃ³a Ä�á»‹a Ä�iá»ƒm");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(153, 153, 255));
        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(0, 0, 0));
        btnCapNhat.setText("Cáº­p Nháº­t");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 204));
        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(0, 0, 0));
        btnTimKiem.setText("TÃ¬m Kiáº¿m");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 204));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 0));
        btnSua.setText("Sá»­a ThÃ´ng Tin");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLuu)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSua)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhat)))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXem)
                            .addComponent(btnLuu)
                            .addComponent(btnXoa)
                            .addComponent(btnCapNhat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimKiem)
                            .addComponent(btnSua))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblDiaDiem.getSelectedRow();
        if (selectedIndex >= 0) {
            DiaDiemThamQuanDTO ddDTO = diadiemList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Báº¡n cháº¯c cháº¯n xÃ³a thÃ´ng tin Ä‘á»‹a Ä‘iá»ƒm nÃ y ?");
            //System.out.println("option: " + option);
            //yes->0
            //No->1
            //Cancel->2
            if (option == 0) {
                DiaDiemThamQuanBUS.XoaTTDD(ddDTO.getMaDD());
                showDiaDiem();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        // TODO add your handling code here:
        showDiaDiem();
    }//GEN-LAST:event_btnXemActionPerformed

    private void txtTenDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDDActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String madd = txtMaDD.getText();
        String tendd = txtTenDD.getText();
        String noidung = cbNoiDung.getSelectedItem().toString();
        String diachi = txtDiachi.getText();

        DiaDiemThamQuanDTO ddDTO = new DiaDiemThamQuanDTO(madd, tendd, noidung, diachi);
        DiaDiemThamQuanBUS.LuuTTDD(ddDTO);
        showDiaDiem();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        Object[] options = {
            "TÃ¬m kiáº¿m theo mÃ£ Ä‘á»‹a Ä‘iá»ƒm", "TÃ¬m kiáº¿m theo tÃªn Ä‘á»‹a Ä‘iá»ƒm", "Ä�Ã³ng"
        };
        int select = JOptionPane.showOptionDialog(this, "Báº¡n muá»‘n tÃ¬m kiáº¿m theo phÆ°Æ¡ng thá»©c nÃ o ?", "TÃ¹y chá»�n", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        //System.out.println("select: " + select);
        //mÃ£ -> select: 0
        //tÃªn -> select: 1
        // chi phi -> select: 2
        // Ä‘Ã³ng -> select: 3
        if (select == 0) {
            String input = JOptionPane.showInputDialog(this, "Má»�i nháº­p mÃ£ Ä‘á»‹a Ä‘iá»ƒm !");

            if (input != null && input.length() > 0) {
                diadiemList = DiaDiemThamQuanBUS.findByMaDD(input);

                tableModel.setRowCount(0);

                diadiemList.forEach(ddDTO -> {
                    tableModel.addRow(new Object[]{
                        ddDTO.getMaDD(), ddDTO.getTenDD(), ddDTO.getND(), ddDTO.getDiachi()
                    });
                });
            } else {
                JOptionPane.showMessageDialog(null, "Lá»—i tÃ¬m kiáº¿m !");
            }

        }
        
        if(select == 1){
            String input = JOptionPane.showInputDialog(this,"Má»�i nháº­p tÃªn Ä‘á»‹a Ä‘iá»ƒm !");
            
            if (input != null && input.length() > 0) {
                diadiemList = DiaDiemThamQuanBUS.findByTenDD(input);

                tableModel.setRowCount(0);

                diadiemList.forEach(ddDTO -> {
                    tableModel.addRow(new Object[]{
                        ddDTO.getMaDD(), ddDTO.getTenDD(), ddDTO.getND(), ddDTO.getDiachi()
                    });
                });
            } else {
                JOptionPane.showMessageDialog(null, "Lá»—i tÃ¬m kiáº¿m !");
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        String madd = txtMaDD.getText();
        String tendd = txtTenDD.getText();
        String noidung = cbNoiDung.getSelectedItem().toString();
        String diachi = txtDiachi.getText();
        

        DiaDiemThamQuanDTO ddDTO = new DiaDiemThamQuanDTO(madd, tendd, noidung, diachi);
        
        DiaDiemThamQuanBUS.CapNhatTTDD(ddDTO);
        //showKhachSan();
        
        int i = tblDiaDiem.getSelectedRow();
        DiaDiemThamQuanBUS.xemDSDD();
        tableModel.setValueAt(madd, i, 0);
        tableModel.setValueAt(tendd, i, 1);
        tableModel.setValueAt(noidung, i, 2);
        tableModel.setValueAt(diachi, i, 3);
        
        tblDiaDiem.setModel(tableModel);
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(DiaDiemThamQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaDiemThamQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaDiemThamQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaDiemThamQuanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiaDiemThamQuanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbNoiDung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbMaDD;
    private javax.swing.JLabel lbNoiDung;
    private javax.swing.JLabel lbTenDD;
    private javax.swing.JTable tblDiaDiem;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtMaDD;
    private javax.swing.JTextField txtTenDD;
    // End of variables declaration//GEN-END:variables
}