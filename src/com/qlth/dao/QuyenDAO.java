/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.Quyen;
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
public class QuyenDAO {
    public List<Quyen> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Quyen");
            List<Quyen> quyenList = new ArrayList<>();
            while (rs.next()) {
                Quyen quyen = new Quyen();
                quyen.setMaQuyen(rs.getString("Ma_Quyen"));
                quyen.setChucVu(rs.getString("Chuc_Vu"));
                quyenList.add(quyen);
            }
            return quyenList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(Quyen quyen) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Quyen(Ma_Quyen,Chuc_Vu) VALUES (?,?)");
            statement.setString(1, quyen.getMaQuyen());
            statement.setString(2, quyen.getChucVu());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(Quyen quyen) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Quyen SET Ma_Quyen=?,Chuc_Vu=? WHERE Ma_Quyen=?");
            statement.setString(1, quyen.getMaQuyenUpdate());
            statement.setString(2, quyen.getChucVu());
            statement.setString(3, quyen.getMaQuyen());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(Quyen quyen) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Quyen WHERE Ma_Quyen = ?");
            statement.setString(1, quyen.getMaQuyen());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public Quyen getQuyenById(String maQuyen) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Quyen WHERE Ma_Quyen = ?");
            statement.setString(1, maQuyen);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                Quyen quyen = new Quyen();
                quyen.setMaQuyen(rs.getString("Ma_Quyen"));
                quyen.setChucVu(rs.getString("Chuc_Vu"));
                return quyen;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<Quyen> search(Quyen q) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Quyen WHERE 1=1 ";
            if (!q.getMaQuyen().isEmpty()){
                sql = sql+ "AND Ma_Quyen LIKE N'%"+q.getMaQuyen()+"%'";
            }
            if (!q.getChucVu().isEmpty()){
                sql = sql+ "OR Chuc_Vu LIKE N'%"+q.getChucVu()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Quyen> quyenList = new ArrayList<>();
            while (rs.next()) {
                Quyen quyen = new Quyen();
                quyen.setMaQuyen(rs.getString("Ma_Quyen"));
                quyen.setChucVu(rs.getString("Chuc_Vu"));
                quyenList.add(quyen);
            }
            return quyenList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuyenDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
