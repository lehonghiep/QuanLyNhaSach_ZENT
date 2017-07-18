/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.LinhVuc;
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
public class LinhVucDAO {
    public List<LinhVuc> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Linh_Vuc");
            List<LinhVuc> linhVucList = new ArrayList<>();
            while (rs.next()) {
                LinhVuc linhVuc = new LinhVuc();
                linhVuc.setMaLinhVuc(rs.getString("Ma_Linh_Vuc"));
                linhVuc.setTenLinhVuc(rs.getString("Ten_Linh_Vuc"));
                linhVucList.add(linhVuc);
            }
            return linhVucList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(LinhVuc linhVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Linh_Vuc(Ma_Linh_Vuc,Ten_Linh_Vuc) VALUES (?,?)");
            statement.setString(1, linhVuc.getMaLinhVuc());
            statement.setString(2, linhVuc.getTenLinhVuc());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(LinhVuc linhVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Linh_Vuc SET Ma_Linh_Vuc=?,Ten_Linh_Vuc=? WHERE Ma_Linh_Vuc=?");
            statement.setString(1, linhVuc.getMaLinhVucUpdate());
            statement.setString(2, linhVuc.getTenLinhVuc());
            statement.setString(3, linhVuc.getMaLinhVuc());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(LinhVuc linhVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Linh_Vuc WHERE Ma_Linh_Vuc = ?");
            statement.setString(1, linhVuc.getMaLinhVuc());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public LinhVuc getLinhVucById(String maLinhVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Linh_Vuc WHERE Ma_Linh_Vuc = ?");
            statement.setString(1, maLinhVuc);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                LinhVuc linhVuc = new LinhVuc();
                linhVuc.setMaLinhVuc(rs.getString("Ma_Linh_Vuc"));
                linhVuc.setTenLinhVuc(rs.getString("Ten_Linh_Vuc"));
                return linhVuc;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<LinhVuc> search(LinhVuc lVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Linh_Vuc WHERE 1=1 ";
            if (!lVuc.getMaLinhVuc().isEmpty()){
                sql = sql+ "AND Ma_Linh_Vuc LIKE N'%"+lVuc.getTenLinhVuc()+"%'";
            }
            if (!lVuc.getTenLinhVuc().isEmpty()){
                sql = sql+ "OR Ten_Linh_Vuc LIKE N'%"+lVuc.getTenLinhVuc()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<LinhVuc> linhVucList = new ArrayList<>();
            while (rs.next()) {
                LinhVuc linhVuc = new LinhVuc();
                linhVuc.setMaLinhVuc(rs.getString("Ma_Linh_Vuc"));
                linhVuc.setTenLinhVuc(rs.getString("Ten_Linh_Vuc"));
                linhVucList.add(linhVuc);
            }
            return linhVucList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LinhVucDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
