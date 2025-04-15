package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class PrnEmpSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("\n급여를 입력하세요");
            int inputed = sc.nextInt();
            
            if(inputed == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            int count = 0;
            
            try (
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(
                    "SELECT J.JOB_TITLE, AVG(E.SALARY) AS AVG_SAL " +
                    "FROM EMPLOYEES E " +
                    "JOIN JOBS J ON J.JOB_ID = E.JOB_ID " +
                    "WHERE SALARY >= ? " +
                    "GROUP BY J.JOB_TITLE " +
                    "ORDER BY AVG_SAL DESC");
            ) {
                pstmt.setInt(1, inputed);
                ResultSet rs = pstmt.executeQuery();
                
                while(rs.next()) {
                    String jobTitle = rs.getString("JOB_TITLE");
                    int avgSal = rs.getInt("AVG_SAL");
                    
                    System.out.printf("[%s] %d\n", jobTitle, avgSal);
                    count++;
                }
                
                System.out.printf("\n총 [%d]명이 검색되었습니다.\n", count);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        sc.close();  // 🚪 스캐너 리소스 해제
    }
}
