package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// t_test 테이블의 id, name 조회
public class SelectMain01 {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
		    Connection conn = DriverManager.getConnection(url, user, password);

		    String sql = "select id as 아이디, name as 이름 ";
		           sql += " from T_TEST ";
		           sql += " order by id ";      
		           
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    ResultSet rs = pstmt.executeQuery();
		    
		    while(rs.next()) {
		    	String id = rs.getString("아이디");
		    	String name = rs.getString("이름");
		    	
		    	System.out.println(id + "(" + name + ")");
		    }
		        
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	

	}

}
