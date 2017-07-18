/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.HangHoa;
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
public class HangHoaDAO {

    public List<HangHoa> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(
                    "SELECT s.Ma_Sach,s.Ten_Sach, tg.Ten_Tac_Gia, nxb.Ten_Nha_Xuat_Ban,s.Gia_Mua, k.So_Luong  FROM Sach s \n"
                    + "Join Tac_Gia tg ON s.Ma_Tac_Gia=tg.Ma_Tac_Gia\n"
                    + "Join Nha_Xuat_Ban nxb ON nxb.Ma_Nha_Xuat_Ban=s.Ma_Nha_Xuat_Ban\n"
                    + "join Kho k ON k.Ma_Sach=s.Ma_Sach");
            List<HangHoa> hangHoaList = new ArrayList<>();
            while (rs.next()) {
                HangHoa hangHoa = new HangHoa();
                hangHoa.setMaSach(rs.getString("Ma_Sach"));
                hangHoa.setTenSach(rs.getString("Ten_Sach"));
                hangHoa.setTacGia(rs.getString("Ten_Tac_Gia"));
                hangHoa.setNhaXuatBan(rs.getString("Ten_Nha_Xuat_Ban"));
                hangHoa.setGiaMua(rs.getInt("Gia_Mua"));
                hangHoa.setSoLuong(rs.getInt("So_Luong"));
                hangHoaList.add(hangHoa);
            }
            return hangHoaList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public List<HangHoa> search(HangHoa hHoa) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql
                    = "SELECT s.Ma_Sach,s.Ten_Sach, tg.Ten_Tac_Gia, nxb.Ten_Nha_Xuat_Ban,s.Gia_Mua, k.So_Luong  FROM Sach s \n"
                    + "Join Tac_Gia tg ON s.Ma_Tac_Gia=tg.Ma_Tac_Gia\n"
                    + "Join Nha_Xuat_Ban nxb ON nxb.Ma_Nha_Xuat_Ban=s.Ma_Nha_Xuat_Ban\n"
                    + "join Kho k ON k.Ma_Sach=s.Ma_Sach\n"
                    + "where 1=1";
            if (!hHoa.getMaSach().isEmpty()) {
                sql = sql + "AND s.Ma_Sach LIKE N'%" + hHoa.getMaSach() + "%'";
            }
            if (!hHoa.getTenSach().isEmpty()) {
                sql = sql + "OR s.Ten_Sach LIKE N'%" + hHoa.getTenSach() + "%'";
            }

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<HangHoa> hangHoaList = new ArrayList<>();
            while (rs.next()) {
                HangHoa hangHoa = new HangHoa();
                hangHoa.setMaSach(rs.getString("Ma_Sach"));
                hangHoa.setTenSach(rs.getString("Ten_Sach"));
                hangHoa.setTacGia(rs.getString("Ten_Tac_Gia"));
                hangHoa.setNhaXuatBan(rs.getString("Ten_Nha_Xuat_Ban"));
                hangHoa.setGiaMua(rs.getInt("Gia_Mua"));
                hangHoa.setSoLuong(rs.getInt("So_Luong"));
                hangHoaList.add(hangHoa);
            }
            return hangHoaList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(HangHoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
}
