/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.frm;

import com.qlth.dao.AnhBiaSachDAO;
import com.qlth.dao.HangHoaDAO;
import com.qlth.dao.KhoDAO;
import com.qlth.dao.NhatKyNhapSachDAO;
import com.qlth.dao.SachDAO;
import com.qlth.obj.HangHoa;
import com.qlth.obj.Kho;
import com.qlth.obj.NhatKyNhapSach;
import com.qlth.obj.Sach;
import com.qlth.util.Convert;
import com.qlth.util.Report;
import java.awt.Component;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hong Hiep
 */
public class FrmNhapHang extends javax.swing.JFrame {

    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form FrmNhapHang
     */
    public FrmNhapHang() {
        initComponents();
        loadDuLieuLenLuoi();
        loadDuLieuLenCombobox();
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
        tblDanhMucSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblBiaSach = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cbbSach = new javax.swing.JComboBox<>();
        txtSoLuongThem = new javax.swing.JTextField();
        btnNhapSanPham = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnResetBang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh mục sách"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        tblDanhMucSach.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhMucSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhMucSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhMucSach);

        jPanel1.add(jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bìa sách"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));
        jPanel2.add(lblBiaSach);

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/26.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel1.setText("(*)Tìm kiếm theo mã sách và tên sách");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập sách"));

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        cbbSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbbSach);
        jPanel4.add(txtSoLuongThem);

        btnNhapSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/59.png"))); // NOI18N
        btnNhapSanPham.setText("Nhập sản phẩm");
        btnNhapSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapSanPhamActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jLabel2.setText("Tên sách");
        jPanel5.add(jLabel2);

        jLabel3.setText("Số lượng nhập");
        jPanel5.add(jLabel3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhapSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNhapSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnResetBang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/27.png"))); // NOI18N
        btnResetBang.setText("Reset bản");
        btnResetBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetBangActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlth/img/34.png"))); // NOI18N
        jButton1.setText("Xuất Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnResetBang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnResetBang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhMucSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucSachMouseClicked
        int row = tblDanhMucSach.getSelectedRow();

        String maSach = (String) tblDanhMucSach.getValueAt(row, 0);

        String tenSach = (String) tblDanhMucSach.getValueAt(row, 1);

        String tenTacGia = (String) tblDanhMucSach.getValueAt(row, 2);

        String tenNhaCungCap = (String) tblDanhMucSach.getValueAt(row, 3);

        Integer giaMua = Integer.parseInt(tblDanhMucSach.getValueAt(row, 4).toString());

        Integer soLuong = Integer.parseInt(tblDanhMucSach.getValueAt(row, 5).toString());

        setImage(maSach);

    }//GEN-LAST:event_tblDanhMucSachMouseClicked

    private void btnNhapSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapSanPhamActionPerformed
        Integer soLuongThem;
        try {
            soLuongThem = Integer.parseInt(txtSoLuongThem.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không hợp lệ");
            return;
        }

        if (soLuongThem == null || soLuongThem <= 0) {
            JOptionPane.showMessageDialog(this, "Không hợp lệ");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm không?", "Thông báo", OK_CANCEL_OPTION);
        //Nếu chọn Yes
        if (confirm == JOptionPane.YES_OPTION) {
            String maSach = ((Sach) cbbSach.getSelectedItem()).getMaSach();
            KhoDAO khoDAO = new KhoDAO();
            Kho kho1 = khoDAO.getImageById(maSach);

            Kho kho2 = new Kho(maSach, kho1.getSoLuong() + soLuongThem);
            khoDAO.update2(kho2);

            NhatKyNhapSachDAO nhatKyNhapSachDAO = new NhatKyNhapSachDAO();
            NhatKyNhapSach nhatKyNhapSach = new NhatKyNhapSach(maSach, soLuongThem, new Date());
            nhatKyNhapSachDAO.insert(nhatKyNhapSach);

            loadDuLieuLenLuoi();
            txtSoLuongThem.setText("");
        }
    }//GEN-LAST:event_btnNhapSanPhamActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã sách");
        tableModel.addColumn("Tên sách");
        tableModel.addColumn("Tác giả");
        tableModel.addColumn("Nhà xuất bản");
        tableModel.addColumn("Giá mua");
        tableModel.addColumn("Số lượng");

        HangHoaDAO hangHoaDAO = new HangHoaDAO();
        //lấy ra thông tin tìm kiếm
        HangHoa hh = new HangHoa();
        hh.setMaSach(txtTimKiem.getText());
        hh.setTenSach(txtTimKiem.getText());

        List<HangHoa> hangHoaList = hangHoaDAO.search(hh);
        for (HangHoa hangHoa : hangHoaList) {
            Vector vector = new Vector();
            vector.add(hangHoa.getMaSach());
            vector.add(hangHoa.getTenSach());
            vector.add(hangHoa.getTacGia());
            vector.add(hangHoa.getNhaXuatBan());
            vector.add(hangHoa.getGiaMua());
            vector.add(hangHoa.getSoLuong());

            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblDanhMucSach.setModel(tableModel);
        tblDanhMucSach.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblDanhMucSach.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblDanhMucSach.getColumnModel().getColumn(3).setPreferredWidth(150);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnResetBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetBangActionPerformed
        loadDuLieuLenLuoi();
    }//GEN-LAST:event_btnResetBangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Report report =new Report();
        report.xuatExcel(tableModel, this);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNhapHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapSanPham;
    private javax.swing.JButton btnResetBang;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbbSach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiaSach;
    private javax.swing.JTable tblDanhMucSach;
    private javax.swing.JTextField txtSoLuongThem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void loadDuLieuLenLuoi() {
        tableModel = new DefaultTableModel();
        //tạo cột
        tableModel.addColumn("Mã sách");
        tableModel.addColumn("Tên sách");
        tableModel.addColumn("Tác giả");
        tableModel.addColumn("Nhà xuất bản");
        tableModel.addColumn("Giá mua");
        tableModel.addColumn("Số lượng còn");

        HangHoaDAO hangHoaDAO = new HangHoaDAO();
        //lấy ra toàn bộ vai trò
        List<HangHoa> hangHoaList = hangHoaDAO.selectAll();
        for (HangHoa hangHoa : hangHoaList) {
            Vector vector = new Vector();
            vector.add(hangHoa.getMaSach());
            vector.add(hangHoa.getTenSach());
            vector.add(hangHoa.getTacGia());
            vector.add(hangHoa.getNhaXuatBan());
            vector.add(hangHoa.getGiaMua());
            vector.add(hangHoa.getSoLuong());

            //tạo hàng
            tableModel.addRow(vector);
        }
        //đưa dữ liệu từ model vào bảng
        tblDanhMucSach.setModel(tableModel);
        tblDanhMucSach.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblDanhMucSach.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblDanhMucSach.getColumnModel().getColumn(3).setPreferredWidth(150);
    }

    private void loadDuLieuLenCombobox() {
        SachDAO sachDAO = new SachDAO();
        //lấy toàn bộ bảng vai trò
        List<Sach> tacGiaList = sachDAO.selectAll();
        Vector v = new Vector(tacGiaList);
        //khởi tạo dữ liệu cho combobox
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel(v);
        cbbSach.setModel(dcbm);
        //giúp tạo combobox hiển thị tên vai trò
        cbbSach.setRenderer(new ListCellRenderer() {
            DefaultListCellRenderer dlcr = new DefaultListCellRenderer();

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                // gọi method giống hệt method cần viết, truyền vào tham số y như nguyên
                JLabel label = (JLabel) dlcr.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    label.setText(((Sach) value).getTenSach());
                }
                return label;
            }
        });
    }

    private void setImage(String maSach) {
        AnhBiaSachDAO anhBiaSachDao = new AnhBiaSachDAO();
        String path = anhBiaSachDao.getImageById(maSach).getPathAnh();
//        lblBiaSach.setIcon(new ImageIcon(path!=null?path:""));
        if (path != null) {
            try {
                lblBiaSach.setIcon(Convert.load(path, lblBiaSach.getSize().width, lblBiaSach.getSize().height));
            } catch (Exception e) {
                lblBiaSach.setIcon(new ImageIcon(""));
            }

        } else {
            lblBiaSach.setIcon(new ImageIcon(""));
        }
    }
}