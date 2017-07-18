/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

/**
 *
 * @author Hong Hiep
 */
public class GioHangDAO {
    private String maSach;
    private String tenSach;
    private Integer giaMua;
    private Integer soLuong;

    public GioHangDAO() {
    }

    public GioHangDAO(String maSach, String tenSach, Integer giaMua, Integer soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaMua = giaMua;
        this.soLuong = soLuong;
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

    public Integer getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Integer giaMua) {
        this.giaMua = giaMua;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    
}
