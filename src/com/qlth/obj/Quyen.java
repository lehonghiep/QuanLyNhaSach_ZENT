/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.obj;

/**
 *
 * @author Hong Hiep
 */
public class Quyen {
    private String maQuyen;
    private String chucVu;
    private String maQuyenUpdate;

    public Quyen(String maQuyen, String chucVu, String maQuyenUpdate) {
        this.maQuyen = maQuyen;
        this.chucVu = chucVu;
        this.maQuyenUpdate = maQuyenUpdate;
    }

    public Quyen() {
    }

    public Quyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public Quyen(String maQuyen, String chucVu) {
        this.maQuyen = maQuyen;
        this.chucVu = chucVu;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaQuyenUpdate() {
        return maQuyenUpdate;
    }

    public void setMaQuyenUpdate(String maQuyenUpdate) {
        this.maQuyenUpdate = maQuyenUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        Quyen quyen = (Quyen)obj;
        if (quyen!=null && this.getMaQuyen()!=null && quyen.getMaQuyen()!=null && this.getMaQuyen().equals(quyen.getMaQuyen()))
            return true;
        return false;
    }
    
}
