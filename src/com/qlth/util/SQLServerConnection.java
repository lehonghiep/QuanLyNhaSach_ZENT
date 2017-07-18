/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlth.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NguyenAn
 */
public class SQLServerConnection {

    private static Connection conn;
    private static final String server = "localhost";
    private static final String port = "1433";
    private static final String instanceName = "DESKTOP-IKTCLMP";
    private static final String userName = "sa";
    private static final String passWord = "123456";
    private static final String databaseName = "QUAN_LY_NHA_SACH";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (conn == null || conn.isClosed()) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://" + server + "\\" + instanceName + ":" + port + ";databaseName=" + databaseName;

            conn = DriverManager.getConnection(url, userName, passWord);
        }
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null || conn.isClosed()) {
            conn.close();
        }
    }
}
