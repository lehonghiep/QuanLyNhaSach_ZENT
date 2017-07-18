/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.dao;

import com.qlth.obj.NhatKyNhapSach;
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
public class NhatKyNhapSachDAO {

    public boolean insert(NhatKyNhapSach nhatKyNhapSach) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Nhat_Ky_Nhap_Sach(Ma_Sach,So_Luong,Ngay_Nhap) VALUES (?,?,?)");
            statement.setString(1, nhatKyNhapSach.getMaSach());
            statement.setInt(2, nhatKyNhapSach.getSoLuong());
            statement.setDate(3, Convert.convertDate(nhatKyNhapSach.getNgayNhap()));

            return statement.execute();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhatKyNhapSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public List<NhatKyNhapSach> selectAll() {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select nkns.*, s.Ten_Sach From Kho k \n"
                    + "join Sach s on k.Ma_Sach=s.Ma_Sach\n"
                    + "join Nhat_Ky_Nhap_Sach nkns on nkns.Ma_Sach=k.Ma_Sach");
            List<NhatKyNhapSach> nhatKyNhapSachList = new ArrayList<>();
            while (rs.next()) {
                NhatKyNhapSach nhatKyNhapSach = new NhatKyNhapSach();
                nhatKyNhapSach.setMaSach(rs.getString("Ma_Sach"));
                nhatKyNhapSach.setTenSach(rs.getString("Ten_Sach"));
                nhatKyNhapSach.setNgayNhap(rs.getDate("Ngay_Nhap"));
                nhatKyNhapSach.setSoLuong(rs.getInt("So_Luong"));
                nhatKyNhapSach.setsTT(rs.getInt("STT"));
                
                nhatKyNhapSachList.add(nhatKyNhapSach);
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
                Logger.getLogger(NhatKyNhapSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public List<NhatKyNhapSach> search(NhatKyNhapSach nKBS) {
        Connection conn = null;
        try {
            conn = SQLServerConnection.getConnection();
            String sql = "Select nkns.*, s.Ten_Sach From Kho k \n"
                    + "join Sach s on k.Ma_Sach=s.Ma_Sach\n"
                    + "join Nhat_Ky_Nhap_Sach nkns on nkns.Ma_Sach=k.Ma_Sach where 1=1";
            if (!(nKBS.getNgayNhap().toString().isEmpty())){
                sql = sql+ "AND nkns.Ngay_Nhap = '"+nKBS.getNgayNhap().toString()+"'";
            }
            sql=sql+" order by nkns.STT DESC";
           
            
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<NhatKyNhapSach> nhatKyNhapSachList = new ArrayList<>();
            while (rs.next()) {
                NhatKyNhapSach nhatKyNhapSach = new NhatKyNhapSach();
                nhatKyNhapSach.setMaSach(rs.getString("Ma_Sach"));
                nhatKyNhapSach.setTenSach(rs.getString("Ten_Sach"));
                nhatKyNhapSach.setNgayNhap(rs.getDate("Ngay_Nhap"));
                nhatKyNhapSach.setSoLuong(rs.getInt("So_Luong"));
                nhatKyNhapSach.setsTT(rs.getInt("STT"));
                nhatKyNhapSachList.add(nhatKyNhapSach);
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
                Logger.getLogger(NhatKyNhapSachDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
