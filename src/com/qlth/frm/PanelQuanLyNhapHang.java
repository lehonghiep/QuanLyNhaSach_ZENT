/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.frm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Hong Hiep
 */
public class PanelQuanLyNhapHang extends JPanel {
    JButton btnNhapHang;
    JButton btnNhatKyNhapHang;
    public PanelQuanLyNhapHang() {
        setLocation(0, 0);
        setLayout(new GridLayout(1, 2, 0, 0));
        addControls();
        addEvents();
    }

    private void addControls() {
        btnNhapHang=new JButton("Nhập hàng");
        btnNhapHang.setIcon(new ImageIcon("src/com/qlth/img/41.png"));
        btnNhatKyNhapHang=new JButton("Nhật ký nhập hàng");
        btnNhatKyNhapHang.setIcon(new ImageIcon("src/com/qlth/img/42.png"));
        add(btnNhapHang);
        add(btnNhatKyNhapHang);
    }

    private void addEvents() {
        btnNhapHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FrmNhapHang frmNhapHang=new FrmNhapHang();
               frmNhapHang.setVisible(true);
            }
        });
        btnNhatKyNhapHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FrmNhatKyNhapSach frmNhatKyNhapSach=new FrmNhatKyNhapSach();
               frmNhatKyNhapSach.setVisible(true);
            }
        });
    }
    

}
