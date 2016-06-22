package com.my.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.dto.Category;
import com.my.dto.Product;
import com.my.exception.AddException;
import com.my.exception.FindException;

public class ProductDAOOracle implements ProductDAOInterface {

	
	
	@Override
	public void add(Product product) throws AddException {
		//TODO 구현안함
	}

	@Override
	public List<Product> selectAll() throws FindException {
		// TODO 완성하세요

	/*	String className = "oracle.jdbc.driver.OracleDriver";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;
		List<Product> temp = null;
		try {
			 //2) JDBC드라이버 클래스 로딩
			Class.forName(className);
			 
			 
			 //3) DB서버에 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hr";
			String password = "hr";
			con = DriverManager.getConnection(url, user, password);*/

		ArrayList<Product> temp = new ArrayList<Product>();
			Connection con = null;
			Statement stmt = null;
			ResultSet rs =null;
			
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hr";
			String password = "hr";
			con = DriverManager.getConnection(url, user, password);
			//4) SQL문장 송신
			String sql = "SELECT prod_no,  prod_name, prod_price, prou_mf_dt, category_no FROM product";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);  //5) 결과 수신
			// 첫번째 행으로 이동 함수 .next
			while ( rs.next() ) 
			{
				String prod_no = rs.getString("prod_no"); // 변수는 db의 데이터형과 맞추어준다.
				String prod_name = rs.getString("prod_name");
				int prod_price = rs.getInt("prod_price");
				String prou_mf_dt = rs.getString("prou_mf_dt");
				String category_no = rs.getString("category_no"); // 인덱스 번호 순서를 넣어도 가능하다.
				Category cat = new Category(category_no, null);
				Product pro = new Product(prod_no, prod_name, prod_price, prou_mf_dt, cat);
				temp.add(pro);
				
				}
			if(temp.size() == 0){
				 throw new FindException("검색결과가 없습니다.!?");
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{ //7) DB와 연결닫기
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
		
		return temp;
	}

	@Override
	public List<Product> selectByName(String name) {
		// TODO 완성하세요.
		ArrayList<Product> temp = new ArrayList<Product>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;
		//con = MyConnection.getConnection();
		
		return null;
	}

	@Override
	public Product selectByNo(String no) {
		// TODO 완성하세요.
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO 구현안함
		return null;
	}

	@Override
	public boolean delete(String no) {
		// TODO 구현안함
		return false;
	}

}
