package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

// 1. 드라이버 로딩
// 2. 드라이버 매니저를 활요하여 디비 접속
// 3. 쿼리를 생성해서 실행시킴
// 4. 결과를 받기
// 5. 종료

public class DBMain {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			System.out.println("conn: " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
