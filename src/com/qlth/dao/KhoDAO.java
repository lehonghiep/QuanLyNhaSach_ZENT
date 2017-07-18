/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.Kho;
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
public class KhoDAO {

    public List<Kho> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Kho");
            List<Kho> khoList = new ArrayList<>();
            while (rs.next()) {
                Kho kho = new Kho();
                kho.setMaSach(rs.getString("Ma_Sach"));
                kho.setSoLuong(rs.getInt("So_Luong"));
                khoList.add(kho);
            }
            return khoList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public boolean insert(Kho kho) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Kho(Ma_Sach,So_Luong) VALUES (?,?)");
            statement.setString(1, kho.getMaSach());
            statement.setInt(2, kho.getSoLuong());

            return statement.execute();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update1(Kho kho) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("UPDATE Kho SET Ma_Sach=? WHERE Ma_Sach=?");
            statement.setString(1, kho.getMaSachUpdate());
            statement.setString(2, kho.getMaSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean update2(Kho kho) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("UPDATE Kho SET So_Luong=? WHERE Ma_Sach=?");
            statement.setInt(1, kho.getSoLuong());
            statement.setString(2, kho.getMaSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean delete(Kho kho) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Kho WHERE Ma_Sach = ?");
            statement.setString(1, kho.getMaSach());
            return statement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public Kho getImageById(String maImage) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Kho WHERE Ma_Sach = ?");
            statement.setString(1, maImage);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Kho akho = new Kho();
                akho.setMaSach(rs.getString("Ma_Sach"));
                akho.setSoLuong(rs.getInt("So_Luong"));
                return akho;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
