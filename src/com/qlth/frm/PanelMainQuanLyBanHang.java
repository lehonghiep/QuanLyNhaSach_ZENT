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
public class PanelMainQuanLyBanHang extends JPanel{
    JButton btnBanHang;
    JButton btnQuanlyHoaDon;
    JButton btnNhatKyBanSach;
    public PanelMainQuanLyBanHang(){
        setLocation(0, 0);
        setLayout(new GridLayout(1, 2, 0, 0));
        addControls();
        addEvents();
    }
    private void addControls(){
        btnBanHang=new JButton("Bán hàng");
        btnBanHang.setIcon(new ImageIcon("src/com/qlth/img/39.png"));
        JPanel pncot1=new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel pncot2=new JPanel(new GridLayout(2, 1, 0, 0));
        btnQuanlyHoaDon=new JButton("Quản lý hóa đơn");
        btnQuanlyHoaDon.setIcon(new ImageIcon("src/com/qlth/img/40.png"));
        btnNhatKyBanSach=new JButton("Nhật ký bán sách");
        btnNhatKyBanSach.setIcon(new ImageIcon("src/com/qlth/img/61.png"));
        pncot2.add(btnQuanlyHoaDon);
        pncot2.add(btnNhatKyBanSach);
        pncot1.add(btnBanHang);
        add(pncot1);
        add(pncot2);
    }

    private void addEvents() {
        btnBanHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmBanHang frmBanHang=new FrmBanHang();
                frmBanHang.setVisible(true);
            }
        });
        btnQuanlyHoaDon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmHoaDon frmHoaDon=new FrmHoaDon();
                frmHoaDon.setVisible(true);
            }
        });
        btnNhatKyBanSach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNhatKyBanSach frmNhatKyBanSach=new FrmNhatKyBanSach();
                frmNhatKyBanSach.setVisible(true);
            }
        });
    }
}
