/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.LoaiSach;
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
public class LoaiSachDAO {
    public List<LoaiSach> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Loai_Sach");
            List<LoaiSach> loaiSachList = new ArrayList<>();
            while (rs.next()) {
                LoaiSach loaiSach = new LoaiSach();
                loaiSach.setMaLoaiSach(rs.getString("Ma_Loai_Sach"));
                loaiSach.setTenLoaiSach(rs.getString("Ten_Loai_Sach"));
                loaiSachList.add(loaiSach);
            }
            return loaiSachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(LoaiSach loaiSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Loai_Sach(Ma_Loai_Sach,Ten_Loai_Sach) VALUES (?,?)");
            statement.setString(1, loaiSach.getMaLoaiSach());
            statement.setString(2, loaiSach.getTenLoaiSach());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(LoaiSach loaiSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Loai_Sach SET Ma_Loai_Sach=?,Ten_Loai_Sach=? WHERE Ma_Loai_Sach=?");
            statement.setString(1, loaiSach.getMaLoaiSachUpdate());
            statement.setString(2, loaiSach.getTenLoaiSach());
            statement.setString(3, loaiSach.getMaLoaiSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(LoaiSach loaiSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Loai_Sach WHERE Ma_Loai_Sach = ?");
            statement.setString(1, loaiSach.getMaLoaiSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public LoaiSach getLoaiSachById(String maLoaiSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Loai_Sach WHERE Ma_Loai_Sach = ?");
            statement.setString(1, maLoaiSach);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                LoaiSach loaiSach = new LoaiSach();
                loaiSach.setMaLoaiSach(rs.getString("Ma_Loai_Sach"));
                loaiSach.setTenLoaiSach(rs.getString("Ten_Loai_Sach"));
                return loaiSach;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<LoaiSach> search(LoaiSach lSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Loai_Sach WHERE 1=1 ";
            if (!lSach.getMaLoaiSach().isEmpty()){
                sql = sql+ "AND Ma_Loai_Sach LIKE N'%"+lSach.getTenLoaiSach()+"%'";
            }
            if (!lSach.getTenLoaiSach().isEmpty()){
                sql = sql+ "OR Ten_Loai_Sach LIKE N'%"+lSach.getTenLoaiSach()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<LoaiSach> loaiSachList = new ArrayList<>();
            while (rs.next()) {
                LoaiSach loaiSach = new LoaiSach();
                loaiSach.setMaLoaiSach(rs.getString("Ma_Loai_Sach"));
                loaiSach.setTenLoaiSach(rs.getString("Ten_Loai_Sach"));
                loaiSachList.add(loaiSach);
            }
            return loaiSachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoaiSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
