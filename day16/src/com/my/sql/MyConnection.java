package com.my.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String className = "oracle.jdbc.driver.OracleDriver";

		//2) JDBC드라이버 클래스 로딩
		Class.forName(className);


		//3) DB서버에 연결
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hr";
		String password = "hr";
		return  DriverManager.getConnection(url, user, password);
	}
	public static void close(Connection con, 	Statement stmt ,	ResultSet rs ){

		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		if(stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


