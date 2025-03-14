package kr.ac.kopo.homework;

import java.util.Scanner;

public class P04 {

    public static String countByKorean(int num) {
        switch (num) { // case 사이에 break를 넣지 않으면 다음차례로 넘어간다 // 혼공자에 있는 내용
            case 1: return "첫";
            case 2: return "두";
            case 3: return "세";
            case 4: return "네";
            default: return Integer.toString(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 4개를 차례대로 입력해 주세요");

        int max = 0; // 그냥 처음 값을 0으로 산정

        // 첫 번째 숫자 입력받기
        while (true) {
            System.out.print(countByKorean(1) + " 번째 정수 입력: "); // 1번 값 부터 시작해야 하니 1을 디폴트 값으로 넘겨주면 15번줄이 인식
            if (scanner.hasNextInt()) {
                max = scanner.nextInt();
                break;
            } else {
                System.out.println("숫자가 입력되지 않았습니다. 다시 입력해 주세요.");
                scanner.next(); // 잘못된 입력 버리기
            }
        }

        // 나머지 3개의 숫자 입력받기
        for (int i = 2; i <= 4; i++) {
            while (true) {
                System.out.print(countByKorean(i) + " 번째 정수 입력: ");
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (num > max) { // max 값과 비교해서 계속 바꿔치기
                        max = num;
                    }
                    break;
                } else {
                    System.out.println("숫자가 입력되지 않았습니다. 다시 입력해 주세요.");
                    scanner.next(); // 잘못된 입력 버리기
                }
            }
        }

        System.out.println("가장 큰 수는 : " + max + "입니다");
        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // 스캐너 종료
    }
}
