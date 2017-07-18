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
public class TaiKhoan {
    private String username;
    private String password;
    private String hoVaTen;
    private String maQuyen;
    private String chucVu;
    

    public TaiKhoan() {
    }

    public TaiKhoan(String username) {
        this.username = username;
    }

    public TaiKhoan(String username, String password, String hoVaTen, String maQuyen, String chucVu) {
        this.username = username;
        this.password = password;
        this.hoVaTen = hoVaTen;
        this.maQuyen = maQuyen;
        this.chucVu = chucVu;
    }

    public TaiKhoan(String username, String password, String hoVaTen, String maQuyen) {
        this.username = username;
        this.password = password;
        this.hoVaTen = hoVaTen;
        this.maQuyen = maQuyen;
    }

    public TaiKhoan(String username, String password, String maQuyen) {
        this.username = username;
        this.password = password;
        this.maQuyen = maQuyen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
}
