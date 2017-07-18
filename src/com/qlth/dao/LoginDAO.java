/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.TaiKhoan;
import com.qlth.util.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hong Hiep
 */
public class LoginDAO {

    public boolean checkLogin(String taiKhoan, String matKhau) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT COUNT(*) FROM Tai_Khoan WHERE Username = ? AND Password = ?");
            statement.setString(1, taiKhoan);
            statement.setString(2, matKhau);
            ResultSet rs = statement.executeQuery();
            Integer count = 0;
            while (rs.next()) {
                count = rs.getInt(1);

            }
            return count > 0;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public TaiKhoan getUser(String taiKhoan, String matKhau) {
        TaiKhoan tKhoan;
        Connection conn = null;
        try {

            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT tk.*, q.Chuc_Vu FROM Tai_Khoan tk JOIN Quyen q ON tk.Ma_Quyen = q.Ma_Quyen WHERE Username = ? AND Password = ?");
            statement.setString(1, taiKhoan);
            statement.setString(2, matKhau);
            ResultSet rs = statement.executeQuery();
//            Integer count = 0;
            tKhoan=new TaiKhoan();
            while (rs.next()) {
//                count = rs.getInt(1);

                tKhoan.setUsername(taiKhoan);
                tKhoan.setPassword(matKhau);
                tKhoan.setHoVaTen(rs.getString("Ho_Va_Ten"));
                tKhoan.setMaQuyen(rs.getString("Ma_Quyen"));
                tKhoan.setChucVu(rs.getString("Chuc_Vu"));
                
            }

            return tKhoan;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
