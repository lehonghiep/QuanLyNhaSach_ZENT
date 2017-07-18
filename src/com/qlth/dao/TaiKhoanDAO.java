/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.TaiKhoan;
import com.qlth.obj.TaiKhoanUpdate;
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
public class TaiKhoanDAO {
    public List<TaiKhoan> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Tai_Khoan");
            List<TaiKhoan> taiKhoanList = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(rs.getString("Username"));
                taiKhoan.setPassword(rs.getString("Password"));
                taiKhoan.setHoVaTen(rs.getString("Ho_Va_Ten"));
                taiKhoan.setMaQuyen(rs.getString("Ma_Quyen"));
                taiKhoanList.add(taiKhoan);
            }
            return taiKhoanList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(TaiKhoan taiKhoan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Tai_Khoan(Username,Password,Ho_Va_Ten,Ma_Quyen) VALUES (?,?,?,?)");
            statement.setString(1, taiKhoan.getUsername());
            statement.setString(2, taiKhoan.getPassword());
            statement.setString(3, taiKhoan.getHoVaTen());
            statement.setString(4, taiKhoan.getMaQuyen());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(TaiKhoanUpdate taiKhoanUpdate) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Tai_Khoan SET Username=?,Password=?,Ho_Va_Ten=?,Ma_Quyen=? WHERE Username=?");
            statement.setString(1, taiKhoanUpdate.getUsernameUpdate());
            statement.setString(2, taiKhoanUpdate.getPassword());
            statement.setString(3, taiKhoanUpdate.getHoVaTen());
            statement.setString(4, taiKhoanUpdate.getMaQuyen());
            statement.setString(5, taiKhoanUpdate.getUsername());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(TaiKhoan taiKhoan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Tai_Khoan WHERE Username = ?");
            statement.setString(1, taiKhoan.getUsername());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public TaiKhoan getTaiKhoanById(String maTaiKhoan) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Tai_Khoan WHERE Username = ?");
            statement.setString(1, maTaiKhoan);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(rs.getString("Username"));
                taiKhoan.setPassword(rs.getString("Password"));
                taiKhoan.setHoVaTen(rs.getString("Ho_Va_Ten"));
                taiKhoan.setMaQuyen(rs.getString("Ma_Quyen"));
                return taiKhoan;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<TaiKhoan> search(TaiKhoan lVuc) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Tai_Khoan WHERE 1=1 ";
            if (!lVuc.getUsername().isEmpty()){
                sql = sql+ "AND Username LIKE N'%"+lVuc.getUsername()+"%'";
            }
            if (!lVuc.getHoVaTen().isEmpty()){
                sql = sql+ "OR Ho_Va_Ten LIKE N'%"+lVuc.getHoVaTen()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<TaiKhoan> taiKhoanList = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setUsername(rs.getString("Username"));
                taiKhoan.setPassword(rs.getString("Password"));
                taiKhoan.setHoVaTen(rs.getString("Ho_Va_Ten"));
                taiKhoan.setMaQuyen(rs.getString("Ma_Quyen"));
                taiKhoanList.add(taiKhoan);
            }
            return taiKhoanList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
