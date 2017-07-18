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
public class TaiKhoanUpdate {
    private String username;
    private String password;
    private String hoVaTen;
    private String maQuyen;
    private String usernameUpdate;

    public TaiKhoanUpdate() {
    }

    public TaiKhoanUpdate(String username, String password, String hoVaTen, String maQuyen, String usernameUpdate) {
        this.username = username;
        this.password = password;
        this.hoVaTen = hoVaTen;
        this.maQuyen = maQuyen;
        this.usernameUpdate = usernameUpdate;
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

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getUsernameUpdate() {
        return usernameUpdate;
    }

    public void setUsernameUpdate(String usernameUpdate) {
        this.usernameUpdate = usernameUpdate;
    }
    
}
