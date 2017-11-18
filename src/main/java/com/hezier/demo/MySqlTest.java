package com.hezier.demo;

import java.lang.Class;
import java.sql.*;

public class MySqlTest {
    public static void main(String[] args) {

//        String[] ID = {"11", "12", "13"};
//        String[] name = {"Wang", "Hui", "Wan", "Yuan", "Yuan", "Yang"};
//        int[] age = {16, 18, 20, 18, 22, 21};
//        String[] FM = {"F", "F", "M", "M", "M", "F"};
        String url = "jdbc:mysql://localhost:3306/springexample?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root";

//        String sql = "INSERT INTO springexample.student(ID,name,age,FM)VALUES(?,?,?,?)";
        String querysql = "SELECT * FROM springexample.student;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC加载成功");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC驱动加载失败");
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password); //MySQL连接对象
            Statement stmt = con.createStatement();
//            PreparedStatement prest = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            for (int i = 0; i < ID.length; i++) {
//                prest.setString(1, ID[i]);
//                prest.setString(2, name[i]);
//                prest.setInt(3, age[i]);
//                prest.setString(4, FM[i]);
//                prest.addBatch();
//            }

//            prest.executeBatch();
            ResultSet rs = stmt.executeQuery(querysql);
            while (rs.next()) {
                String qId = rs.getString("id");
                String qname = rs.getString("name");
                String qage = rs.getString(3);
                System.out.println(qId + " " + qname + " " + qage);
            }

//            int rows = stmt.executeUpdate("DELETE FROM springexample.student;");
//            System.out.println(rows);
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}