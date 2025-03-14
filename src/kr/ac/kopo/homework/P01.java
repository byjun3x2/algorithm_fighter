package kr.ac.kopo.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner는 반복문 밖에서 생성

        while (true) {
            try {
                System.out.println("물건값을 입력해 주세요");
                int price = scanner.nextInt(); // 물건값 입력

                System.out.println("1000원, 500원, 100원, 50원, 10원의 개수를 순서대로 입력하세요");

                // 각 동전 개수 입력 // 한 줄로 입력하고 싶은데 못하겠어요
                int thousand_Won_Cnt = scanner.nextInt();
                int fiveHundred_Won_Cnt = scanner.nextInt();
                int oneHundred_Won_Cnt = scanner.nextInt();
                int fifty_Won_Cnt = scanner.nextInt();
                int ten_Won_Cnt = scanner.nextInt();

                // 총 금액 계산
                int charge = (thousand_Won_Cnt * 1000) +
                        (fiveHundred_Won_Cnt * 500) +
                        (oneHundred_Won_Cnt * 100) +
                        (fifty_Won_Cnt * 50) +
                        (ten_Won_Cnt * 10);

                System.out.println(charge + "원을 받았습니다");
                System.out.printf("1000원: %d개, 500원: %d개, 100원: %d개, 50원: %d개, 10원: %d개%n",
                        thousand_Won_Cnt, fiveHundred_Won_Cnt, oneHundred_Won_Cnt, fifty_Won_Cnt, ten_Won_Cnt);

                if (price > charge) {
                    System.out.println((price - charge) + "원이 모자랍니다. 다시 시도해 주세요.");
                    continue; // 반복문의 처음으로 돌아감
                } else if (price == charge) {
                    System.out.println("결제가 완료되었습니다. 안녕히 가세요");
                    break;
                } else {
                    int change = charge - price; // 잔돈 계산
                    System.out.println("결제가 완료되었습니다.");
                    System.out.println("잔돈은 " + change + "원입니다.");
                    break;
                }
            } catch (InputMismatchException e) { // InputMismatchException 에 대해서 찾아볼 것
                // 입력값이 정수가 아닌 경우 처리
                System.out.println("올바른 값이 입력되지 않았습니다. 다시 입력해 주세요.");
                scanner.nextLine(); // 버퍼를 비워줌
            }
        }

        scanner.close(); // Scanner 닫기
    }
}
