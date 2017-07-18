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
public class NhaXuatBan {
    private String maNhaXuatBan;
    private String tenNhaXuatBan;
    private String diaChi;
    private String soDienThoai;
    private String maNhaXuatBanUpdate;

    public NhaXuatBan() {
    }

    public NhaXuatBan(String maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }

    public NhaXuatBan(String maNhaXuatBan, String tenNhaXuatBan, String diaChi, String soDienThoai, String maNhaXuatBanUpdate) {
        this.maNhaXuatBan = maNhaXuatBan;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maNhaXuatBanUpdate = maNhaXuatBanUpdate;
    }

    public NhaXuatBan(String maNhaXuatBan, String tenNhaXuatBan, String diaChi, String soDienThoai) {
        this.maNhaXuatBan = maNhaXuatBan;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNhaXuatBan() {
        return maNhaXuatBan;
    }

    public void setMaNhaXuatBan(String maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaNhaXuatBanUpdate() {
        return maNhaXuatBanUpdate;
    }

    public void setMaNhaXuatBanUpdate(String maNhaXuatBanUpdate) {
        this.maNhaXuatBanUpdate = maNhaXuatBanUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        NhaXuatBan nhaXuatBan = (NhaXuatBan)obj;
        if (nhaXuatBan!=null && this.getMaNhaXuatBan()!=null && nhaXuatBan.getMaNhaXuatBan()!=null && this.getMaNhaXuatBan().equals(nhaXuatBan.getMaNhaXuatBan()))
            return true;
        return false;
    }
    
}
