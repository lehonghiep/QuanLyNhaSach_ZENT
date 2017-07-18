/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.NhaXuatBan;
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
public class NhaXuatBanDAO {
     public List<NhaXuatBan> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Nha_Xuat_Ban");
            List<NhaXuatBan> nhaXuatBanList = new ArrayList<>();
            while (rs.next()) {
                NhaXuatBan nhaXuatBan = new NhaXuatBan();
                nhaXuatBan.setMaNhaXuatBan(rs.getString("Ma_Nha_Xuat_Ban"));
                nhaXuatBan.setTenNhaXuatBan(rs.getString("Ten_Nha_Xuat_Ban"));
                nhaXuatBan.setDiaChi(rs.getString("Dia_Chi"));
                nhaXuatBan.setSoDienThoai(rs.getString("So_Dien_Thoai"));
                nhaXuatBanList.add(nhaXuatBan);
            }
            return nhaXuatBanList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(NhaXuatBan nhaXuatBan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Nha_Xuat_Ban(Ma_Nha_Xuat_Ban,Ten_Nha_Xuat_Ban,Dia_Chi,So_Dien_Thoai) VALUES (?,?,?,?)");
            statement.setString(1, nhaXuatBan.getMaNhaXuatBan());
            statement.setString(2, nhaXuatBan.getTenNhaXuatBan());
            statement.setString(3, nhaXuatBan.getDiaChi());
            statement.setString(4, nhaXuatBan.getSoDienThoai());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(NhaXuatBan nhaXuatBan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Nha_Xuat_Ban SET Ma_Nha_Xuat_Ban=?,Ten_Nha_Xuat_Ban=?,Dia_Chi=?,So_Dien_Thoai=? WHERE Ma_Nha_Xuat_Ban=?");
            statement.setString(1, nhaXuatBan.getMaNhaXuatBanUpdate());
            statement.setString(2, nhaXuatBan.getTenNhaXuatBan());
            statement.setString(3, nhaXuatBan.getDiaChi());
            statement.setString(4, nhaXuatBan.getSoDienThoai());
            statement.setString(5, nhaXuatBan.getMaNhaXuatBan());
            
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(NhaXuatBan nhaXuatBan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Nha_Xuat_Ban WHERE Ma_Nha_Xuat_Ban = ?");
            statement.setString(1, nhaXuatBan.getMaNhaXuatBan());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public NhaXuatBan getNhaXuatBanById(String maNhaXuatBan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Nha_Xuat_Ban WHERE Ma_Nha_Xuat_Ban = ?");
            statement.setString(1, maNhaXuatBan);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                NhaXuatBan nhaXuatBan = new NhaXuatBan();
                nhaXuatBan.setMaNhaXuatBan(rs.getString("Ma_Nha_Xuat_Ban"));
                nhaXuatBan.setTenNhaXuatBan(rs.getString("Ten_Nha_Xuat_Ban"));
                nhaXuatBan.setDiaChi(rs.getString("Dia_Chi"));
                nhaXuatBan.setSoDienThoai(rs.getString("So_Dien_Thoai"));
                return nhaXuatBan;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<NhaXuatBan> search(NhaXuatBan nXuatBan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Nha_Xuat_Ban WHERE 1=1 ";
            if (!nXuatBan.getMaNhaXuatBan().isEmpty()){
                sql = sql+ "AND Ma_Nha_Xuat_Ban LIKE N'%"+nXuatBan.getTenNhaXuatBan()+"%'";
            }
            if (!nXuatBan.getTenNhaXuatBan().isEmpty()){
                sql = sql+ "OR Ten_Nha_Xuat_Ban LIKE N'%"+nXuatBan.getTenNhaXuatBan()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<NhaXuatBan> nhaXuatBanList = new ArrayList<>();
            while (rs.next()) {
                NhaXuatBan nhaXuatBan = new NhaXuatBan();
                nhaXuatBan.setMaNhaXuatBan(rs.getString("Ma_Nha_Xuat_Ban"));
                nhaXuatBan.setTenNhaXuatBan(rs.getString("Ten_Nha_Xuat_Ban"));
                nhaXuatBan.setDiaChi(rs.getString("Dia_Chi"));
                nhaXuatBan.setSoDienThoai(rs.getString("So_Dien_Thoai"));
                nhaXuatBanList.add(nhaXuatBan);
            }
            return nhaXuatBanList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhaXuatBanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
