package kr.ac.kopo.homework;

import java.util.Scanner;

public class P05_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double score = null;

        while (score == null) {
            System.out.println("************************");
            System.out.println("** 성적을 입력해주세요!! **");
            System.out.println("************************");

            String[] grades = {"A", "B", "C", "D", "F"};

            if (sc.hasNextDouble()) {
                score = sc.nextDouble();

                if (score < 0.0 || score > 100.0) { // 점수 범위 예외 처리
                    System.out.println("잘못된 점수를 입력하셨습니다.");
                    System.out.println("점수를 다시 입력해주세요");
                    score = null;
                    continue; // 다시 입력받도록 루프 처음으로 이동
                }

                int gradeKey = (int)(score / 10); // 10으로 나누어 정수로 변환하여 간소화 10으로 나눠야 케이스를 나타내는 숫자를 1자리수에서 최대 2자리수로 할 수 있음

                switch (gradeKey) {
                    case 10: // 100점인 경우도 A학점 처리
                    case 9:
                        System.out.println(grades[0] + "학점입니다.");
                        break;
                    case 8:
                        System.out.println(grades[1] + "학점입니다.");
                        break;
                    case 7:
                        System.out.println(grades[2] + "학점입니다.");
                        break;
                    case 6:
                        System.out.println(grades[3] + "학점입니다.");
                        break;
                    default: // 그 외는 모두 F학점
                        System.out.println(grades[4] + "학점입니다.");
                        break;
                }

            } else { // 숫자가 아닌 입력값 예외 처리
                System.out.println("입력된 값은 숫자가 아닙니다.");
                System.out.println("점수를 다시 입력해주세요");
                sc.next(); // 잘못된 입력값 버퍼에서 제거
            }
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
