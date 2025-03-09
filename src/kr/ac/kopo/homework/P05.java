package kr.ac.kopo.homework;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double score = null; // 소수점 자리수 점수 커버 , 아직 점수가 없는 상태이므로 null

        while (score == null) {
            System.out.println("************************");
            System.out.println("** 성적을 입력해주세요!! **");
            System.out.println("************************");

            String[] grades = {"A", "B", "C", "D", "F"}; // 나중에 grade 값을 S , A++ 로 바꿀 수 있으므로 배열로 저장

            if (sc.hasNextDouble()) { // 입력 값에서 Double 값이 있는지 확인하고 없으면 false
                score = sc.nextDouble(); // 점수 입력

                if (score >= 90.0 && score <= 100.0) {
                    System.out.println(grades[0] + "학점입니다.");
                } else if (score >= 80.0 && score < 90.0) { // 89점 이하로 지정하면 89.9 가 대처가 안됨
                    System.out.println(grades[1] + "학점입니다.");
                } else if (score >= 70.0 && score < 80.0) {
                    System.out.println(grades[2] + "학점입니다.");
                } else if (score >= 60.0 && score < 70.0) {
                    System.out.println(grades[3] + "학점입니다.");
                } else if (score >= 0.0 && score < 60.0) {
                    System.out.println(grades[4] + "학점입니다.");
                } else { // -1000, 101 , 100.1 같은 잘못된 점수가 입력되었을 때
                    System.out.println("잘못된 점수를 입력하셨습니다.");
                    System.out.println("점수를 다시 입력해주세요");
                    score = null; // 잘못된 점수일 경우 score를 null로 설정 // 여기서 null 처리를 안하면 while 문을 탈출하게 됨
                }

            } else { // 입력값이 숫자가 아니고 문자일 경우 (특수문자 포함)
                System.out.println("입력된 값은 숫자가 아닙니다.");
                System.out.println("점수를 다시 입력해주세요");
                sc.next(); // 잘못된 입력을 버퍼에서 제거 // "버퍼"라는 용어는 컴퓨터 시스템에서 데이터를 일시적으로 저장하는 메모리 영역
            }
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close(); // Scanner 객체 닫기 // 메모리 누수 예방
    }
}
