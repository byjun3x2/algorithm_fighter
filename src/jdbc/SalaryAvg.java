package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import kr.ac.kopo.util.ConnectionFactory;

public class SalaryAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection conn = new ConnectionFactory().getConnection();
			while (true) {
				StringBuilder sql = new StringBuilder();
				System.out.println("0 입력시 시스템 종료");
				System.out.print("급여를 입력하시오 : ");
				int monny = sc.nextInt();
				if(monny == 0) {
					System.out.println("시스템 종료");
					break;
				}
				sql.append("SELECT C1.JOB_TITLE, AVG(M1.SALARY) AS AVG_SEL ");
				sql.append("  FROM EMPLOYEES M1 ");
				sql.append("       JOIN JOBS C1 ON C1.JOB_ID = M1.JOB_ID ");
				sql.append(" WHERE SALARY >= ? ");
				sql.append(" GROUP BY C1.JOB_TITLE ");
				sql.append(" ORDER BY AVG_SEL DESC ");

				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				pstmt.setInt(1, monny);
				
				ResultSet rs = pstmt.executeQuery();
				int a = 0;
				while (rs.next()) {
					String id = rs.getString(1);
					String name = rs.getString(2);
					System.out.println("[" + id + "] " + name);
					a++;
				}
				System.out.println("            총 [" + a + "]명이 검색되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}