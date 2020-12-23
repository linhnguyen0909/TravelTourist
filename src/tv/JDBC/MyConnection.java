/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv.JDBC;
import java.sql.*;
public class MyConnection {

    public Connection getConection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=travels";
        return DriverManager.getConnection(url,"sa","songlong");  // tài khoản sa và mật khẩu thay đổi theo máy mọi người
    }
     
}
