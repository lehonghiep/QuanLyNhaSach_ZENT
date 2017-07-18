/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.HoaDon;
import com.qlth.util.Convert;
import com.qlth.util.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep
 */
public class HoaDonDAO {
    public boolean insert(HoaDon hoaDon) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Hoa_Don(Ngay_Lap,Tong_Tien,Tien_Khach_Dua,Tien_Tra_Lai_Khach) VALUES (?,?,?,?)");
            statement.setDate(1, Convert.convertDate(hoaDon.getNgayLap()));
            statement.setInt(2, hoaDon.getTongTien());
            statement.setInt(3, hoaDon.getTienKhachDua());
            statement.setInt(4, hoaDon.getTienTraLaiKhach());
           
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    public List<HoaDon> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Hoa_Don order by Ngay_Lap DESC");
            List<HoaDon> hoaDonList = new ArrayList<>();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(rs.getInt("Ma_Hoa_Don"));
                hoaDon.setNgayLap(rs.getDate("Ngay_Lap"));
                hoaDon.setTongTien(rs.getInt("Tong_Tien"));
                hoaDon.setTienKhachDua(rs.getInt("Tien_Khach_Dua"));
                hoaDon.setTienTraLaiKhach(rs.getInt("Tien_Tra_Lai_Khach"));
                hoaDonList.add(hoaDon);
            }
            return hoaDonList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<HoaDon> search(HoaDon nKBS) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Hoa_Don where 1=1";
            if (!(nKBS.getNgayLap().toString().isEmpty())){
                sql = sql+ "AND Ngay_Lap = '"+nKBS.getNgayLap().toString()+"'";
            }
            sql=sql+" order by Ngay_Lap DESC";
           
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<HoaDon> hoaDonList = new ArrayList<>();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(rs.getInt("Ma_Hoa_Don"));
                hoaDon.setNgayLap(rs.getDate("Ngay_Lap"));
                hoaDon.setTongTien(rs.getInt("Tong_Tien"));
                hoaDon.setTienKhachDua(rs.getInt("Tien_Khach_Dua"));
                hoaDon.setTienTraLaiKhach(rs.getInt("Tien_Tra_Lai_Khach"));
                hoaDonList.add(hoaDon);
            }
            return hoaDonList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public Integer getMaHoaDon(){
        HoaDon hoaDon=new HoaDon();
        List<HoaDon>hoaDonList=selectAll();
        int kt=0;
        Integer maHoaDon = null;
        for (HoaDon hDon : hoaDonList) {
            if (hDon.getMaHoaDon()>kt) {
                maHoaDon=hDon.getMaHoaDon();
                kt=hDon.getMaHoaDon();
            }
            
        }
        return maHoaDon;
    }
}
