import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.my.sql.MyConnection;

public class StatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection con =null;

		con = MyConnection.getConnection();
		String cname = "커피";
		String selectSQL = "SELECT prod_no, prod_name, prod_price,p.category_no, category_name" 
				+ " FROM product p JOIN category c ON p.category_no = c.category_no"
				+ " Where category_name=?";

		pstmt = con.prepareStatement(selectSQL);
		pstmt.setString(1, cname);
		rs = pstmt.executeQuery();


		while(rs.next()){
			String  prod_no = rs.getString("prod_no");
			String  prod_name = rs.getString("prod_name");
			int  prod_price = rs.getInt("prod_price");
			String category_no = rs.getString("category_no");
			String category_name = rs.getString("category_name");
			System.out.println(prod_no + ":" + prod_name +  ":" + category_no +":"+category_name );
		}
		String updateSQL = 
				"UPDATE product SET prod_price = prod_price * 1.1 WHERE prod_no =? ";
		pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1,  "F001");
		int rowcnt = pstmt.executeUpdate();
		System.out.println(rowcnt);



		MyConnection.close(con, pstmt, rs); // 

		/*String selectSQL = "SELECT prod_no, prod_name, prod_price,p.category_no, category_name" + " FROM product p JOIN category c ON p.category_no = c.category_no";
		stmt = con.createStatement();
		rs=stmt.executeQuery(selectSQL);



		while(rs.next()){
			String  prod_no = rs.getString("prod_no");
			String  prod_name = rs.getString("prod_name");
			int  prod_price = rs.getInt("prod_price");
			String category_no = rs.getString("category_no");
			String category_name = rs.getString("category_name");
			System.out.println(prod_no + ":" + prod_name +  ":" + category_no +":"+category_name );

		}*/

		/*String updateSQL = "UPDATE product SET prod_price = prod_price * 1.1 WHERE prod_no = 'F001' ";
		int rowcnt = stmt.executeUpdate(updateSQL);
		System.out.println(rowcnt);
		 */
		// MyConnection.close(con, stmt, rs);
	}


}
