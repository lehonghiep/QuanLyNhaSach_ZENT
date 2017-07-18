/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.frm;

import com.qlth.dao.LoaiSachDAO;
import com.qlth.dao.SachDAO;
import com.qlth.obj.LinhVuc;
import com.qlth.obj.LoaiSach;
import com.qlth.obj.NhaXuatBan;
import com.qlth.obj.Sach;
import com.qlth.obj.TacGia;
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
public class FrmLoaiSach extends javax.swing.JFrame {
DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form FrmLoaiSach
     */
    public FrmLoaiSach() {
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
        tblLoaiSach = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        btnResetBang = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtMaLoaiSach = new javax.swing.JTextField();
        txtTenLoaiSach = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnXuatExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh mục loại sách"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        tblLoaiSach.setModel(new javax.swing.table.DefaultTableModel(
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
        tblLoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiSach);

        jPanel1.add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel4.setLayout(new java.awt.GridLayout(5, 1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel4.add(btnThem);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/22.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel4.add(btnSua);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/24.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoa);

        btnXoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/23.png"))); // NOI18N
        btnXoaTrang.setText("Xóa trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoaTrang);

        btnResetBang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/27.png"))); // NOI18N
        btnResetBang.setText("Reset bảng");
        btnResetBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetBangActionPerformed(evt);
            }
        });
        jPanel4.add(btnResetBang);

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/26.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        txtMaLoaiSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtMaLoaiSach);

        txtTenLoaiSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtTenLoaiSach);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã loại sách");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên loại sách");
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKiem)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (txtMaLoaiSach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã loại sách");
            return;
        }
        if (txtTenLoaiSach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên loại sách");
            return;
        }

        LoaiSachDAO loaiSachDAO = new LoaiSachDAO();
        //lấy giá trị nhập trên form truyền vào đôi tượng
        LoaiSach ls = new LoaiSach();
        ls.setMaLoaiSach(Convert.convertID(txtMaLoaiSach.getText()));
        ls.setTenLoaiSach(Convert.convertName(txtTenLoaiSach.getText()));

        
        //thực hiện thêm vào DB
        boolean result = loaiSachDAO.insert(ls);
        //nếu thành công thì thông báo
        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm sách thành công");
        }
        //reset form
        xoaTrang();
        //load lại dữ liệu lên lưới
        loadDuLieuLenLuoi();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblLoaiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSachMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
//lấy ra dòng được click trên table
        int row = tblLoaiSach.getSelectedRow();
        //lấy giá trị trên dòng được chọn cột thứ 0
        String maLoaiSach = (String) tblLoaiSach.getValueAt(row, 0);
        //lấy giá trị trên dòng được chọn cột thứ 1
        String tenLoaiSach = (String) tblLoaiSach.getValueAt(row, 1);
        //lấy giá trị trên dòng được chọn cột thứ 2
        
        txtMaLoaiSach.setText(maLoaiSach);
        txtTenLoaiSach.setText(tenLoaiSach);
        
        
        
        
    }//GEN-LAST:event_tblLoaiSachMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //kiêm tra các thông tin bắt buộc nhập là quyền và tên vai trò
        int row = tblLoaiSach.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn mục muốn sửa");
            return;
        }
        if (txtMaLoaiSach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã loại sách");
            return;
        }
        if (txtTenLoaiSach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên loại sách");
            return;
        }

        LoaiSachDAO loaiSachDAO = new LoaiSachDAO();
        //lấy giá trị nhập trên form truyền vào đôi tượng
        LoaiSach ls = new LoaiSach();
        ls.setMaLoaiSachUpdate(Convert.convertID(txtMaLoaiSach.getText()));
        ls.setTenLoaiSach(Convert.convertName(txtTenLoaiSach.getText()));

        ls.setMaLoaiSach((String) tblLoaiSach.getValueAt(row, 0));
        //thực hiện thêm vào DB
        boolean result = loaiSachDAO.update(ls);
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
        // TODO add your handling code here:
        int row = tblLoaiSach.getSelectedRow();
        if (row >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thông báo", OK_CANCEL_OPTION);
            //Nếu chọn Yes
            if (confirm == JOptionPane.YES_OPTION) {
                //Lấy dòng được chọn

                //Lấy giá trị dòng được lấy cột đầu tiên => mã nhân viên
                String maLoaiSach = (String) tblLoaiSach.getValueAt(row, 0);
                LoaiSachDAO loaiSachDAO = new LoaiSachDAO();
                LoaiSach loaiSach = new LoaiSach(maLoaiSach);
                //thực hiện xóa vai trò
                boolean result = loaiSachDAO.delete(loaiSach);
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
        // TODO add your handling code here:
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã loại sách");
        tableModel.addColumn("Tên loại sách");
        
        
        LoaiSachDAO loaiSachDAO = new LoaiSachDAO();
        //lấy ra thông tin tìm kiếm
        LoaiSach ls = new LoaiSach();
        ls.setMaLoaiSach(txtTimKiem.getText());
        ls.setTenLoaiSach(txtTimKiem.getText());
//        NhomKhachHang nhomKhachHang = (NhomKhachHang)cbbNhomKhachHang.getSelectedItem();
//        kh.setMaNhomKhachHang(nhomKhachHang!=null? nhomKhachHang.getMaNhomKhachHang():null);
        List<LoaiSach> loaiSachList = loaiSachDAO.search(ls);
        for (LoaiSach loaiSach : loaiSachList) {
            Vector vector = new Vector();
            vector.add(loaiSach.getMaLoaiSach());
            vector.add(loaiSach.getTenLoaiSach());
            
            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblLoaiSach.setModel(tableModel);
        tblLoaiSach.getColumnModel().getColumn(1).setPreferredWidth(400);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        Report report=new Report();
        report.xuatExcel(tableModel, this);
    }//GEN-LAST:event_btnXuatExcelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoaiSach().setVisible(true);
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
    private javax.swing.JTable tblLoaiSach;
    private javax.swing.JTextField txtMaLoaiSach;
    private javax.swing.JTextField txtTenLoaiSach;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void xoaTrang() {
        txtMaLoaiSach.setText("");
        txtTenLoaiSach.setText("");
        txtTimKiem.setText("");
    }

    private void loadDuLieuLenLuoi() {
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã loại sách");
        tableModel.addColumn("Tên loại sách");
        

        LoaiSachDAO loaiSachDAO = new LoaiSachDAO();
        //lấy ra toàn bộ vai trò
        List<LoaiSach> loaiSachList = loaiSachDAO.selectAll();
        for (LoaiSach loaiSach : loaiSachList) {
            Vector vector = new Vector();
            vector.add(loaiSach.getMaLoaiSach());
            vector.add(loaiSach.getTenLoaiSach());
            

            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblLoaiSach.setModel(tableModel);
        tblLoaiSach.getColumnModel().getColumn(1).setPreferredWidth(400);
    }
}
