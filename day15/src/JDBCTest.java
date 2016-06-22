import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JavaDataBaseConnectivity
 * 1) JDBC드라이버 설치
 * 2) JDBC드라이버 클래스 로딩
 * 3) DB서버에 연결
 * 4) SQL문장 송신
 * 5) 결과 수신
 * 6) 결과처리
 * 7) DB와 연결닫기
 * 
 * @author Administrator
 *
 */
public class JDBCTest {

	public static void main(String[] args) {
		String className = "oracle.jdbc.driver.OracleDriver";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;

		try {
			 //2) JDBC드라이버 클래스 로딩
			Class.forName(className);
			 
			 
			 //3) DB서버에 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hr";
			String password = "hr";
			con = DriverManager.getConnection(url, user, password);

			
			//4) SQL문장 송신
			String sql = "SELECT employee_id,  first_name, hire_date, salary FROM employees";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);  //5) 결과 수신
			// 첫번째 행으로 이동 함수 .next

			while ( rs.next() ) 
			{
				int emp_id = rs.getInt("employee_id"); // 변수는 db의 데이터형과 맞추어준다.
				String fname = rs.getString("first_name");
				java.sql.Date hire = rs.getDate("hire_date");
				int salary = rs.getInt(4); // 인덱스 번호 순서를 넣어도 가능하다.
				System.out.println(emp_id + ":" + fname + ":" + hire + ":" + salary);
			} 

			String sql1 = "SELECT SUM(salary) FROM employees";
			rs = stmt.executeQuery(sql1);
			rs.next();
			int sum  = rs.getInt(1);
			System.out.println("급여합계:" + sum); // 6) 결과처리
			// 반복문을 할경우, false가 나올때가지 반복하므로 끝까지 결과값이 출력된다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
	}
}
// 열었던 순서의 반대로 닫아준다.








