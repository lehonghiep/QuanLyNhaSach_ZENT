/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.frm;

import com.qlth.obj.TaiKhoan;
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
public class PanelMainHeThong extends JPanel {

    JButton btnQuanLyTaiKhoan;
    JButton btnTaiKhoanCuaToi;
    JButton btnQuyen;
//    JButton btnDangXuat;

    public PanelMainHeThong(TaiKhoan tk) {
        setLocation(0, 0);
        addControls(tk);
        addEvents(tk);
    }

    private void addControls(TaiKhoan tk) {
        btnTaiKhoanCuaToi = new JButton("tài khoản của tôi");
        btnTaiKhoanCuaToi.setIcon(new ImageIcon("src/com/qlth/img/35.png"));
        btnQuanLyTaiKhoan = new JButton("Quản lý tài khoản");
        btnQuanLyTaiKhoan.setIcon(new ImageIcon("src/com/qlth/img/36.png"));
        btnQuyen = new JButton("Quyền");
        btnQuyen.setIcon(new ImageIcon("src/com/qlth/img/38.png"));
//        btnDangXuat = new JButton("Đăng xuất");
//        btnDangXuat.setIcon(new ImageIcon("src/com/qlth/img/37.png"));
        if (tk.getChucVu().equalsIgnoreCase("admin")) {
            setLayout(new GridLayout(2, 2, 0, 0));
            add(btnTaiKhoanCuaToi);
            add(btnQuyen);
            add(btnQuanLyTaiKhoan);
        }else{
            setLayout(new GridLayout(1, 2, 0, 0));
            add(btnTaiKhoanCuaToi);
//            add(btnDangXuat);
        }
        
    }

    private void addEvents(TaiKhoan tk) {
        btnTaiKhoanCuaToi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmMyAccount frmMyAcount=new FrmMyAccount(tk);
                frmMyAcount.setVisible(true);
            }
        });
        btnQuyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmQuyen frmQuyen=new FrmQuyen();
                frmQuyen.setVisible(true);
            }
        });
        btnQuanLyTaiKhoan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAccountManager frmAccountManager=new FrmAccountManager();
                frmAccountManager.setVisible(true);
            }
        });
    }
}
