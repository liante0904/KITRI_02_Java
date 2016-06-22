import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchTest {
	public static void main(String[] args) {
		Connection con =null;
		Statement stmt = null;
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

			stmt = con.createStatement();
			for(int i=1; i<=10; i++){
				String sql = 
						"INSERT INTO product(prod_no, prod_name, category_no) "+ " VALUES ('no"+i+"', 'nm"+i+"',  'F' )";
				//stmt.executeUpdate(sql);						
				stmt.addBatch(sql);


			}
			stmt.executeBatch();
			
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