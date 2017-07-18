/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.obj;

import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep
 */
public class HangHoa {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private Integer soLuong;
    private Integer giaMua;
    private Integer soLuongCon;

    public HangHoa() {
    }

    public HangHoa(String maSach, String tenSach, String tacGia, String nhaXuatBan, Integer soLuong, Integer giaMua) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.giaMua = giaMua;
    }

    public HangHoa(String maSach, String tenSach, String tacGia, String nhaXuatBan, Integer soLuong, Integer giaMua, Integer soLuongCon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.giaMua = giaMua;
        this.soLuongCon = soLuongCon;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Integer giaMua) {
        this.giaMua = giaMua;
    }

    public Integer getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(Integer soLuongCon) {
        this.soLuongCon = soLuongCon;
    }
    
    
}
