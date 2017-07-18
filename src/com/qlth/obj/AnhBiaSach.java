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
public class AnhBiaSach {
    private String maSach;
    private String pathAnh;
    private String maSachUpdate;

    public AnhBiaSach(String maSach, String pathAnh, String maSachUpdate) {
        this.maSach = maSach;
        this.pathAnh = pathAnh;
        this.maSachUpdate = maSachUpdate;
    }

    public AnhBiaSach() {
    }

    public AnhBiaSach(String maSach) {
        this.maSach = maSach;
    }

    public AnhBiaSach(String maSach, String pathAnh) {
        this.maSach = maSach;
        this.pathAnh = pathAnh;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getPathAnh() {
        return pathAnh;
    }

    public void setPathAnh(String pathAnh) {
        this.pathAnh = pathAnh;
    }

    public String getMaSachUpdate() {
        return maSachUpdate;
    }

    public void setMaSachUpdate(String maSachUpdate) {
        this.maSachUpdate = maSachUpdate;
    }
    
}
