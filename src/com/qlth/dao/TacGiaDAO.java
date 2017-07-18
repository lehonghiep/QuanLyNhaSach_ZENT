/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.TacGia;
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
public class TacGiaDAO {
    public List<TacGia> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Tac_Gia");
            List<TacGia> tacGiaList = new ArrayList<>();
            while (rs.next()) {
                TacGia tacGia = new TacGia();
                tacGia.setMaTacGia(rs.getString("Ma_Tac_Gia"));
                tacGia.setTenTacGia(rs.getString("Ten_Tac_Gia"));
                tacGia.setNamSinh(rs.getDate("Nam_Sinh"));
                tacGia.setNamMat(rs.getDate("Nam_Mat"));
                tacGia.setQueQuan(rs.getString("Que_Quan"));
                tacGiaList.add(tacGia);
            }
            return tacGiaList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    
    public boolean insert(TacGia tacGia) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Tac_Gia(Ma_Tac_Gia,Ten_Tac_Gia,Nam_Sinh,Nam_Mat,Que_Quan) VALUES (?,?,?,?,?)");
            statement.setString(1, tacGia.getMaTacGia());
            statement.setString(2, tacGia.getTenTacGia());
            statement.setDate(3, Convert.convertDate(tacGia.getNamSinh()));
            statement.setDate(4, Convert.convertDate(tacGia.getNamMat()));
            statement.setString(5, tacGia.getQueQuan());
            
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update(TacGia tacGia) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement
        ("UPDATE Tac_Gia SET Ma_Tac_Gia=?, Ten_Tac_Gia=?,Nam_Sinh=?,Nam_Mat=?,Que_Quan=? WHERE Ma_Tac_Gia=?");
            statement.setString(1, tacGia.getMaTacGiaUpdate());
            statement.setString(2, tacGia.getTenTacGia());
            statement.setDate(3, Convert.convertDate(tacGia.getNamSinh()));
            statement.setDate(4, Convert.convertDate(tacGia.getNamMat()));
            statement.setString(5, tacGia.getQueQuan());
            statement.setString(6, tacGia.getMaTacGia());
            
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(TacGia tacGia) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Tac_Gia WHERE Ma_Tac_Gia = ?");
            statement.setString(1, tacGia.getMaTacGia());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public TacGia getTacGiaById(String maTacGia) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Tac_Gia WHERE Ma_Tac_Gia = ?");
            statement.setString(1, maTacGia);
            ResultSet rs =  statement.executeQuery();
            while (rs.next()) {
                TacGia tacGia = new TacGia();
                tacGia.setMaTacGia(rs.getString("Ma_Tac_Gia"));
                tacGia.setTenTacGia(rs.getString("Ten_Tac_Gia"));
                tacGia.setNamSinh(rs.getDate("Nam_Sinh"));
                tacGia.setNamMat(rs.getDate("Nam_Mat"));
                tacGia.setQueQuan(rs.getString("Que_Quan"));
                return tacGia;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<TacGia> search(TacGia tGia) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "SELECT * FROM Tac_Gia WHERE 1=1 ";
            if (!tGia.getMaTacGia().isEmpty()){
                sql = sql+ "AND Ma_Tac_Gia LIKE N'%"+tGia.getTenTacGia()+"%'";
            }
            if (!tGia.getTenTacGia().isEmpty()){
                sql = sql+ "OR Ten_Tac_Gia LIKE N'%"+tGia.getTenTacGia()+"%'";
            }
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<TacGia> tacGiaList = new ArrayList<>();
            while (rs.next()) {
                TacGia tacGia = new TacGia();
                tacGia.setMaTacGia(rs.getString("Ma_Tac_Gia"));
                tacGia.setTenTacGia(rs.getString("Ten_Tac_Gia"));
                tacGia.setNamSinh(rs.getDate("Nam_Sinh"));
                tacGia.setNamMat(rs.getDate("Nam_Mat"));
                tacGia.setQueQuan(rs.getString("Que_Quan"));
                tacGiaList.add(tacGia);
            }
            return tacGiaList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
