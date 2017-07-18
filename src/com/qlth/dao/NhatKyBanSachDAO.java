/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.NhatKyBanSach;
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
public class NhatKyBanSachDAO {
    public boolean insert(NhatKyBanSach nhatKyBanSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Nhat_Ky_Ban_Sach(Ma_Sach,So_Luong,Ngay_Ban,Ma_Hoa_Don) VALUES (?,?,?,?)");
            statement.setString(1, nhatKyBanSach.getMaSach());
            statement.setInt(2, nhatKyBanSach.getSoLuong());
            statement.setDate(3, Convert.convertDate(nhatKyBanSach.getNgayBan()));
            statement.setInt(4, nhatKyBanSach.getMaHoaDon());
            
           
            return statement.execute();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhatKyBanSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    public List<NhatKyBanSach> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select nkbs.*, s.Ten_Sach "
                    + "From Nhat_Ky_Ban_Sach nkbs join Sach s on nkbs.Ma_Sach=s.Ma_Sach order by nkbs.STT DESC");
            List<NhatKyBanSach> nhatKyNhapSachList = new ArrayList<>();
            while (rs.next()) {
                NhatKyBanSach nhatKyBanSach = new NhatKyBanSach();
                nhatKyBanSach.setMaSach(rs.getString("Ma_Sach"));
                nhatKyBanSach.setTenSach(rs.getString("Ten_Sach"));
                nhatKyBanSach.setNgayBan(rs.getDate("Ngay_Ban"));
                nhatKyBanSach.setSoLuong(rs.getInt("So_Luong"));
                nhatKyBanSach.setsTT(rs.getInt("STT"));
                nhatKyBanSach.setMaHoaDon(rs.getInt("Ma_Hoa_Don"));
                
                nhatKyNhapSachList.add(nhatKyBanSach);
            }
            return nhatKyNhapSachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhatKyBanSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
   public List<NhatKyBanSach> getNhatKyBanSachById(Integer maHoaDon) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("SELECT nkbs.*, s.Ten_Sach FROM Nhat_Ky_Ban_Sach nkbs join Sach s on nkbs.Ma_Sach=s.Ma_Sach where nkbs.Ma_Hoa_Don = ?");
            statement.setInt(1, maHoaDon);
            ResultSet rs =  statement.executeQuery();
            List<NhatKyBanSach> nhatKyNhapSachList = new ArrayList<>();
            while (rs.next()) {
                NhatKyBanSach nhatKyBanSach = new NhatKyBanSach();
                nhatKyBanSach.setMaSach(rs.getString("Ma_Sach"));
                nhatKyBanSach.setTenSach(rs.getString("Ten_Sach"));
                nhatKyBanSach.setNgayBan(rs.getDate("Ngay_Ban"));
                nhatKyBanSach.setSoLuong(rs.getInt("So_Luong"));
                nhatKyBanSach.setsTT(rs.getInt("STT"));
                nhatKyBanSach.setMaHoaDon(rs.getInt("Ma_Hoa_Don"));
                
                nhatKyNhapSachList.add(nhatKyBanSach);
            }
            return nhatKyNhapSachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhatKyBanSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return null;
    }
    public List<NhatKyBanSach> search(NhatKyBanSach nKBS) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "Select nkbs.*, s.Ten_Sach From Nhat_Ky_Ban_Sach nkbs join Sach s on nkbs.Ma_Sach=s.Ma_Sach where 1=1";
            if (!(nKBS.getNgayBan().toString().isEmpty())){
                sql = sql+ "AND nkbs.Ngay_Ban = '"+nKBS.getNgayBan().toString()+"'";
            }
            sql=sql+" order by nkbs.STT DESC";
           
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<NhatKyBanSach> nhatKyBanSachList = new ArrayList<>();
            while (rs.next()) {
                NhatKyBanSach nhatKyBanSach = new NhatKyBanSach();
                nhatKyBanSach.setMaSach(rs.getString("Ma_Sach"));
                nhatKyBanSach.setTenSach(rs.getString("Ten_Sach"));
                nhatKyBanSach.setNgayBan(rs.getDate("Ngay_Ban"));
                nhatKyBanSach.setSoLuong(rs.getInt("So_Luong"));
                nhatKyBanSach.setsTT(rs.getInt("STT"));
                nhatKyBanSachList.add(nhatKyBanSach);
            }
            return nhatKyBanSachList;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhatKyBanSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
