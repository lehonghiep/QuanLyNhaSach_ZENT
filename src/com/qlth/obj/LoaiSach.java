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
public class LoaiSach {
    private String maLoaiSach;
    private String tenLoaiSach;
    private String maLoaiSachUpdate;

    public LoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public LoaiSach(String maLoaiSach, String tenLoaiSach, String maLoaiSachUpdate) {
        this.maLoaiSach = maLoaiSach;
        this.tenLoaiSach = tenLoaiSach;
        this.maLoaiSachUpdate = maLoaiSachUpdate;
    }

    public LoaiSach() {
    }

    public LoaiSach(String maLoaiSach, String tenLoaiSach) {
        this.maLoaiSach = maLoaiSach;
        this.tenLoaiSach = tenLoaiSach;
    }

    public String getMaLoaiSach() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public String getTenLoaiSach() {
        return tenLoaiSach;
    }

    public void setTenLoaiSach(String tenLoaiSach) {
        this.tenLoaiSach = tenLoaiSach;
    }

    public String getMaLoaiSachUpdate() {
        return maLoaiSachUpdate;
    }

    public void setMaLoaiSachUpdate(String maLoaiSachUpdate) {
        this.maLoaiSachUpdate = maLoaiSachUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        LoaiSach loaiSach = (LoaiSach)obj;
        if (loaiSach!=null && this.getMaLoaiSach()!=null && loaiSach.getMaLoaiSach()!=null && this.getMaLoaiSach().equals(loaiSach.getMaLoaiSach()))
            return true;
        return false;
    }
    
}
