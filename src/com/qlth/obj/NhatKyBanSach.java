/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.obj;

import java.util.Date;

/**
 *
 * @author Hong Hiep
 */
public class NhatKyBanSach {

    private Integer sTT;
    private String maSach;
    private Integer soLuong;
    private Date ngayBan;
    private String tenSach;
    private Integer maHoaDon;

    public NhatKyBanSach(Integer sTT, String maSach, Integer soLuong, Date ngayBan, String tenSach, Integer maHoaDon) {
        this.sTT = sTT;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.ngayBan = ngayBan;
        this.tenSach = tenSach;
        this.maHoaDon = maHoaDon;
    }

    public NhatKyBanSach(String maSach, Integer soLuong, Date ngayBan, Integer maHoaDon) {
        
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.ngayBan = ngayBan;
        this.maHoaDon = maHoaDon;
    }

   

    public NhatKyBanSach() {
    }

    public NhatKyBanSach(String maSach, Integer soLuong, Date ngayBan) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.ngayBan = ngayBan;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Integer getsTT() {
        return sTT;
    }

    public void setsTT(Integer sTT) {
        this.sTT = sTT;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Integer maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

}
