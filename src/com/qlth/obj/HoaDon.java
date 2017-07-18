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
public class HoaDon {
    private Integer maHoaDon; 
    private Date ngayLap; 
    private Integer tongTien; 
    private Integer tienKhachDua; 
    private Integer tienTraLaiKhach;

    public HoaDon() {
    }

    public HoaDon(Integer maHoaDon, Date ngayLap, Integer tongTien, Integer tienKhachDua, Integer tienTraLaiKhach) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.tienKhachDua = tienKhachDua;
        this.tienTraLaiKhach = tienTraLaiKhach;
    }

    public HoaDon(Date ngayLap, Integer tongTien, Integer tienKhachDua, Integer tienTraLaiKhach) {
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.tienKhachDua = tienKhachDua;
        this.tienTraLaiKhach = tienTraLaiKhach;
    }

    

    public Integer getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Integer maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getTienKhachDua() {
        return tienKhachDua;
    }

    public void setTienKhachDua(Integer tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public Integer getTienTraLaiKhach() {
        return tienTraLaiKhach;
    }

    public void setTienTraLaiKhach(Integer tienTraLaiKhach) {
        this.tienTraLaiKhach = tienTraLaiKhach;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }
    
}
