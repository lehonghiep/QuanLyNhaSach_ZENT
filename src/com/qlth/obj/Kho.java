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
public class Kho {
    private String maSach;
    private Integer soLuong;
    private String maSachUpdate;

    public Kho() {
    }

    public Kho(String maSach) {
        this.maSach = maSach;
    }

    public Kho(String maSach, Integer soLuong) {
        this.maSach = maSach;
        this.soLuong = soLuong;
    }

    public Kho(String maSach, Integer soLuong, String maSachUpdate) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.maSachUpdate = maSachUpdate;
    }

    public String getMaSachUpdate() {
        return maSachUpdate;
    }

    public void setMaSachUpdate(String maSachUpdate) {
        this.maSachUpdate = maSachUpdate;
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

    
    
}
