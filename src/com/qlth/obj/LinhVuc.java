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
public class LinhVuc {
    private String maLinhVuc;
    private String tenLinhVuc;
    private String maLinhVucUpdate;

    public LinhVuc() {
    }

    public LinhVuc(String maLinhVuc) {
        this.maLinhVuc = maLinhVuc;
    }

    public LinhVuc(String maLinhVuc, String tenLinhVuc, String maLinhVucUpdate) {
        this.maLinhVuc = maLinhVuc;
        this.tenLinhVuc = tenLinhVuc;
        this.maLinhVucUpdate = maLinhVucUpdate;
    }

    public LinhVuc(String maLinhVuc, String tenLinhVuc) {
        this.maLinhVuc = maLinhVuc;
        this.tenLinhVuc = tenLinhVuc;
    }

    public String getMaLinhVuc() {
        return maLinhVuc;
    }

    public void setMaLinhVuc(String maLinhVuc) {
        this.maLinhVuc = maLinhVuc;
    }

    public String getTenLinhVuc() {
        return tenLinhVuc;
    }

    public void setTenLinhVuc(String tenLinhVuc) {
        this.tenLinhVuc = tenLinhVuc;
    }

    public String getMaLinhVucUpdate() {
        return maLinhVucUpdate;
    }

    public void setMaLinhVucUpdate(String maLinhVucUpdate) {
        this.maLinhVucUpdate = maLinhVucUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        LinhVuc linhVuc = (LinhVuc)obj;
        if (linhVuc!=null && this.getMaLinhVuc()!=null && linhVuc.getMaLinhVuc()!=null && this.getMaLinhVuc().equals(linhVuc.getMaLinhVuc()))
            return true;
        return false;
    }
    
}
