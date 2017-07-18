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
public class PanelMainDanhMuc extends JPanel{
    JButton btnNhaXuatBan;
    JButton btnSach;
    JButton btnTacGia;
    JButton btnLinhVuc;
    JButton btnLoaiSach;
    public PanelMainDanhMuc(){
        setLocation(0, 0);
        setLayout(new GridLayout(1, 3, 0, 0));
        addControls();
        addEvents();
    }
    public void addControls(){
        JPanel pnColumn1=new JPanel(new GridLayout(1, 1));
        JPanel pnColumn2=new JPanel(new GridLayout(2, 1));
        JPanel pnColumn3=new JPanel(new GridLayout(2, 1));
        btnNhaXuatBan=new JButton("Nhà xuất bản");
        btnNhaXuatBan.setIcon(new ImageIcon("src/com/qlth/img/14.png"));
        btnSach=new JButton("Sách");
        btnSach.setIcon(new ImageIcon("src/com/qlth/img/13.png"));
        btnTacGia=new JButton("Tác giả");
        btnTacGia.setIcon(new ImageIcon("src/com/qlth/img/15.png"));
        btnLinhVuc=new JButton("Lĩnh vực");
        btnLinhVuc.setIcon(new ImageIcon("src/com/qlth/img/16.png"));
        btnLoaiSach=new JButton("Loại sách");
        btnLoaiSach.setIcon(new ImageIcon("src/com/qlth/img/17.png"));
        pnColumn1.add(btnSach);
        pnColumn2.add(btnNhaXuatBan);
        pnColumn2.add(btnTacGia);
        pnColumn3.add(btnLinhVuc);
        pnColumn3.add(btnLoaiSach);
        
        add(pnColumn1);
        add(pnColumn2);
        add(pnColumn3);
    }

    private void addEvents() {
        btnSach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmSach frmSach=new FrmSach();
                frmSach.setVisible(true);
            }
        });
        btnLoaiSach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmLoaiSach frmLoaiSach=new FrmLoaiSach();
                frmLoaiSach.setVisible(true);
            }
        });
        btnNhaXuatBan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNhaXuatBan frmNhaXuatBan=new FrmNhaXuatBan();
                frmNhaXuatBan.setVisible(true);
            }
        });
        btnLinhVuc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmLinhVuc frmLinhVuc=new FrmLinhVuc();
                frmLinhVuc.setVisible(true);
            }
        });
        btnTacGia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmTacGia frmTacGia=new FrmTacGia();
                frmTacGia.setVisible(true);
            }
        });
    }
}
