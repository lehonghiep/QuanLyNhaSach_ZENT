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
public class Sach {
    private String maSach;
    private String tenSach;
    private String maTacGia;
    private String maLoaiSach;
    private String maLinhVuc;
    private String maNhaXuatBan;
    private Integer giaMua;
    private String maSachUpdate;
    private Integer giaNhap;

    public Sach() {
    }

    public Sach(String maSach) {
        this.maSach = maSach;
    }

    public Sach(String maSach, String tenSach, String maTacGia, String maLoaiSach, String maLinhVuc, Integer giaMua, String maSachUpdate,Integer giaNhap) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maTacGia = maTacGia;
        this.maLoaiSach = maLoaiSach;
        this.maLinhVuc = maLinhVuc;
        this.giaMua = giaMua;
        this.maSachUpdate = maSachUpdate;
        this.giaNhap=giaNhap;
    }

    public Sach(String maSach, String tenSach, String maTacGia, String maLoaiSach, String maLinhVuc, String maNhaXuatBan, Integer giaMua,Integer giaNhap) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maTacGia = maTacGia;
        this.maLoaiSach = maLoaiSach;
        this.maLinhVuc = maLinhVuc;
        this.maNhaXuatBan= maNhaXuatBan;
        this.giaMua = giaMua;
        this.giaNhap=giaNhap;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getMaLoaiSach() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach = maLoaiSach;
    }

    public String getMaLinhVuc() {
        return maLinhVuc;
    }

    public void setMaLinhVuc(String maLinhVuc) {
        this.maLinhVuc = maLinhVuc;
    }

    public Integer getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Integer giaMua) {
        this.giaMua = giaMua;
    }

    public String getMaSachUpdate() {
        return maSachUpdate;
    }

    public void setMaSachUpdate(String maSachUpdate) {
        this.maSachUpdate = maSachUpdate;
    }

    public String getMaNhaXuatBan() {
        return maNhaXuatBan;
    }

    public void setMaNhaXuatBan(String maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }

    public Integer getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Integer giaNhap) {
        this.giaNhap = giaNhap;
    }
    
}
