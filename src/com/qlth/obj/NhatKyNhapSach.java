/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.obj;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep
 */
public class NhatKyNhapSach {
    private Integer sTT;
    private String maSach;
    private String tenSach;
    private Integer soLuong;
    private Date ngayNhap;

    public NhatKyNhapSach() {
    }

    public NhatKyNhapSach(String maSach, Integer soLuong, Date ngayNhap) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public NhatKyNhapSach(Integer sTT, String maSach, String tenSach, Integer soLuong, Date ngayNhap) {
        this.sTT = sTT;
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public NhatKyNhapSach(Integer sTT, String maSach, Integer soLuong, Date ngayNhap) {
        this.sTT = sTT;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
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

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
}
