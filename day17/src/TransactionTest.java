import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {
	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement pstmt = null;
		String className = "oracle.jdbc.driver.OracleDriver";

		//2) JDBC드라이버 클래스 로딩
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//3) DB서버에 연결
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hr";
		String password = "hr";
		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false); //자동커밋 해제
			String sql1 = "INSERT INTO product(prod_no, prod_name, prod_price, category_no) "+ " VALUES ('test1', 'n1', 100, 'F' )";
			
			String sql2 = "INSERT INTO product(prod_no, prod_name, prod_price, category_no) "+ " VALUES ('test1111111111', 'n1', 100, 'F' )";
		
			PreparedStatement pstmt1 = con.prepareStatement(sql1);
			pstmt1.executeUpdate();
			
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			pstmt2.executeUpdate();
			
			con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
