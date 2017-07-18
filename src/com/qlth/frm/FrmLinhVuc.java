/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Toolv | Templates
 * and open the template in the editor.
 */
package com.qlth.frm;

import com.qlth.dao.LinhVucDAO;
import com.qlth.obj.LinhVuc;
import com.qlth.util.Convert;
import com.qlth.util.Report;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hong Hiep
 */
public class FrmLinhVuc extends javax.swing.JFrame {

    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form FrmLinhVuc
     */
    public FrmLinhVuc() {
        initComponents();
        loadDuLieuLenLuoi();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        tblLinhVuc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMaLinhVuc = new javax.swing.JTextField();
        txtTenLinhVuc = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        btnResetBang = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh mục lĩnh vực"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        tblLinhVuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLinhVuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLinhVucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLinhVuc);

        jPanel1.add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã lĩnh vực");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên lĩnh vực");
        jPanel2.add(jLabel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        txtMaLinhVuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtMaLinhVuc);

        txtTenLinhVuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtTenLinhVuc);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel5.setLayout(new java.awt.GridLayout(5, 1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/22.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSua);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/24.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

        btnXoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/23.png"))); // NOI18N
        btnXoaTrang.setText("Xóa trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoaTrang);

        btnResetBang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/27.png"))); // NOI18N
        btnResetBang.setText("Reset bảng");
        btnResetBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetBangActionPerformed(evt);
            }
        });
        jPanel5.add(btnResetBang);

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/26.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/34.png"))); // NOI18N
        btnXuatExcel.setText("Xuất excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXuatExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (txtMaLinhVuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã lĩnh vực");
            return;
        }
        if (txtTenLinhVuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên lĩnh vực");
            return;
        }

        LinhVucDAO linhVucDAO = new LinhVucDAO();
        //lấy giá trị nhập trên form truyền vào đôi tượng
        LinhVuc lv = new LinhVuc();
        lv.setMaLinhVuc(Convert.convertID(txtMaLinhVuc.getText()));
        lv.setTenLinhVuc(Convert.convertName(txtTenLinhVuc.getText()));

        //thực hiện thêm vào DB
        boolean result = linhVucDAO.insert(lv);
        //nếu thành công thì thông báo
        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm sách thành công");
        }
        //reset form
        xoaTrang();
        //load lại dữ liệu lên lưới
        loadDuLieuLenLuoi();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //kiêm tra các thông tin bắt buộc nhập là quyền và tên vai trò
        int row = tblLinhVuc.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn mục muốn sửa");
            return;
        }
        if (txtMaLinhVuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã lĩnh vực");
            return;
        }
        if (txtTenLinhVuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên lĩnh vực");
            return;
        }

        LinhVucDAO linhVucDAO = new LinhVucDAO();
        //lấy giá trị nhập trên form truyền vào đôi tượng
        LinhVuc ls = new LinhVuc();
        ls.setMaLinhVucUpdate(Convert.convertID(txtMaLinhVuc.getText()));
        ls.setTenLinhVuc(Convert.convertName(txtTenLinhVuc.getText()));

        ls.setMaLinhVuc((String) tblLinhVuc.getValueAt(row, 0));
        //thực hiện thêm vào DB
        boolean result = linhVucDAO.update(ls);
        //nếu thành công thì thông báo
        if (result) {
            JOptionPane.showMessageDialog(this, "Sửa sách thành công");
        }
        //reset form
        xoaTrang();
        //load lại dữ liệu lên lưới
        loadDuLieuLenLuoi();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblLinhVuc.getSelectedRow();
        if (row >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thông báo", OK_CANCEL_OPTION);
            //Nếu chọn Yes
            if (confirm == JOptionPane.YES_OPTION) {
                //Lấy dòng được chọn

                //Lấy giá trị dòng được lấy cột đầu tiên => mã nhân viên
                String maLinhVuc = (String) tblLinhVuc.getValueAt(row, 0);
                LinhVucDAO linhVucDAO = new LinhVucDAO();
                LinhVuc linhVuc = new LinhVuc(maLinhVuc);
                //thực hiện xóa vai trò
                boolean result = linhVucDAO.delete(linhVuc);
                //thông báo
                if (result) {
                    JOptionPane.showMessageDialog(this, "Xóa sách thành công!");
                }
                //reset lại form nhập
                xoaTrang();
                //load lại dữ liệu lên lưới
                loadDuLieuLenLuoi();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chựa chọn mục muốn xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        // TODO add your handling code here:
        xoaTrang();
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnResetBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetBangActionPerformed
        // TODO add your handling code here:
        loadDuLieuLenLuoi();
    }//GEN-LAST:event_btnResetBangActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã loại sách");
        tableModel.addColumn("Tên loại sách");

        LinhVucDAO linhVucDAO = new LinhVucDAO();
        //lấy ra thông tin tìm kiếm
        LinhVuc lv = new LinhVuc();
        lv.setMaLinhVuc(txtTimKiem.getText());
        lv.setTenLinhVuc(txtTimKiem.getText());
//        NhomKhachHang nhomKhachHang = (NhomKhachHang)cbbNhomKhachHang.getSelectedItem();
//        kh.setMaNhomKhachHang(nhomKhachHang!=null? nhomKhachHang.getMaNhomKhachHang():null);
        List<LinhVuc> linhVucList = linhVucDAO.search(lv);
        for (LinhVuc linhVuc : linhVucList) {
            Vector vector = new Vector();
            vector.add(linhVuc.getMaLinhVuc());
            vector.add(linhVuc.getTenLinhVuc());

            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblLinhVuc.setModel(tableModel);
        tblLinhVuc.getColumnModel().getColumn(1).setPreferredWidth(400);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblLinhVucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLinhVucMouseClicked
        // TODO add your handling code here:
        int row = tblLinhVuc.getSelectedRow();
        //lấy giá trị trên dòng được chọn cột thứ 0
        String maLinhVuc = (String) tblLinhVuc.getValueAt(row, 0);
        //lấy giá trị trên dòng được chọn cột thứ 1
        String tenLinhVuc = (String) tblLinhVuc.getValueAt(row, 1);
        //lấy giá trị trên dòng được chọn cột thứ 2

        txtMaLinhVuc.setText(maLinhVuc);
        txtTenLinhVuc.setText(tenLinhVuc);
    }//GEN-LAST:event_tblLinhVucMouseClicked

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
        Report report = new Report();
        report.xuatExcel(tableModel, this);
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For detailv see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLinhVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLinhVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLinhVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLinhVuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLinhVuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetBang;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLinhVuc;
    private javax.swing.JTextField txtMaLinhVuc;
    private javax.swing.JTextField txtTenLinhVuc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void xoaTrang() {
        txtMaLinhVuc.setText("");
        txtTenLinhVuc.setText("");
        txtTimKiem.setText("");
    }

    private void loadDuLieuLenLuoi() {
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã lĩnh vực");
        tableModel.addColumn("Tên lĩnh vực");

        LinhVucDAO linhVucDAO = new LinhVucDAO();
        //lấy ra toàn bộ vai trò
        List<LinhVuc> linhVucList = linhVucDAO.selectAll();
        for (LinhVuc linhVuc : linhVucList) {
            Vector vector = new Vector();
            vector.add(linhVuc.getMaLinhVuc());
            vector.add(linhVuc.getTenLinhVuc());

            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblLinhVuc.setModel(tableModel);
        tblLinhVuc.getColumnModel().getColumn(1).setPreferredWidth(400);
    }
}