/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.Sach;
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
public class SachDAO {
    public List<Sach> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Sach");
            List<Sach> sachList = new ArrayList<>();
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString("Ma_Sach"));
                sach.setTenSach(rs.getString("Ten_Sach"));
                sach.setMaTacGia(rs.getString("Ma_Tac_Gia"));
                sach.setMaLoaiSach(rs.getString("Ma_Loai_Sach"));
                sach.setMaLinhVuc(rs.getString("Ma_Linh_Vuc"));
                sach.setMaNhaXuatBan(rs.getString("Ma_Nha_Xuat_Ban"));
                sach.setGiaMua(rs.getInt("Gia_Mua"));
                sach.setGiaNhap(rs.getInt("Gia_Nhap"));
                sachList.add(sach);
            }
            return sachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    
    public boolean insert(Sach sach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Sach(Ma_Sach, Ten_Sach, Ma_Tac_Gia, Ma_Loai_Sach, Ma_Linh_Vuc, Gia_Mua, Ma_Nha_Xuat_Ban,Gia_Nhap) VALUES (?,?,?,?,?,?,?,?)");
            statement.setString(1, sach.getMaSach());
            statement.setString(2, sach.getTenSach());
            statement.setString(3, sach.getMaTacGia());
            statement.setString(4, sach.getMaLoaiSach());
            statement.setString(5,sach.getMaLinhVuc());
            statement.setInt(6, sach.getGiaMua());
            statement.setString(7, sach.getMaNhaXuatBan());
            statement.setInt(8, sach.getGiaNhap());
           
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        
    }

    public boolean update(Sach sach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Sach SET Ma_Sach=?,Ten_Sach=?,Ma_Tac_Gia=?,Ma_Loai_Sach=?,Ma_Linh_Vuc=?,Gia_Mua=?,Ma_Nha_Xuat_Ban=?,Gia_Nhap=? WHERE Ma_Sach=?");
            statement.setString(1, sach.getMaSachUpdate());
            statement.setString(2, sach.getTenSach());
            statement.setString(3, sach.getMaTacGia());
            statement.setString(4, sach.getMaLoaiSach());
            statement.setString(5,sach.getMaLinhVuc());
            statement.setInt(6, sach.getGiaMua());
            statement.setString(7, sach.getMaNhaXuatBan());
            statement.setInt(8, sach.getGiaNhap());
            statement.setString(9, sach.getMaSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
        
        }
        
        
        
    }

    public boolean delete(Sach sach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Sach WHERE Ma_Sach = ?");
            statement.setString(1, sach.getMaSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public List<Sach> search(Sach s) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Sach WHERE 1=1 ";
            if (!s.getMaSach().isEmpty()){
                sql = sql+ "AND Ma_Sach LIKE N'%"+s.getMaSach()+"%'";
            }
            if (!s.getTenSach().isEmpty()){
                sql = sql+ "OR Ten_Sach LIKE N'%"+s.getTenSach()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Sach> sachList = new ArrayList<>();
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMaSach(rs.getString("Ma_Sach"));
                sach.setTenSach(rs.getString("Ten_Sach"));
                sach.setMaTacGia(rs.getString("Ma_Tac_Gia"));
                sach.setMaLoaiSach(rs.getString("Ma_Loai_Sach"));
                sach.setMaLinhVuc(rs.getString("Ma_Linh_Vuc"));
                sach.setGiaMua(rs.getInt("Gia_Mua"));
                sach.setMaNhaXuatBan(rs.getString("Ma_Nha_Xuat_Ban"));
                sach.setGiaNhap(rs.getInt("Gia_Nhap"));
                sachList.add(sach);
            }
            return sachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
