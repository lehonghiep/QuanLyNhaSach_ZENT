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
public class TacGia {
    private String maTacGia;
    private String tenTacGia;
    private Date namSinh;
    private Date namMat;
    private String queQuan;
    private String maTacGiaUpdate;

    public TacGia() {
    }

    public TacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public TacGia(String maTacGia, String tenTacGia, Date namSinh, Date namMat, String queQuan, String maTacGiaUpdate) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
        this.namMat = namMat;
        this.queQuan = queQuan;
        this.maTacGiaUpdate = maTacGiaUpdate;
    }

    public TacGia(String maTacGia, String tenTacGia, Date namSinh, Date namMat, String queQuan) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
        this.namMat = namMat;
        this.queQuan = queQuan;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public Date getNamMat() {
        return namMat;
    }

    public void setNamMat(Date namMat) {
        this.namMat = namMat;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaTacGiaUpdate() {
        return maTacGiaUpdate;
    }

    public void setMaTacGiaUpdate(String maTacGiaUpdate) {
        this.maTacGiaUpdate = maTacGiaUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        TacGia tacGia = (TacGia)obj;
        if (tacGia!=null && this.getMaTacGia()!=null && tacGia.getMaTacGia()!=null && this.getMaTacGia().equals(tacGia.getMaTacGia()))
            return true;
        return false;
    }
    
}
