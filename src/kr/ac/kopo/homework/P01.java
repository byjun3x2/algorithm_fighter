package kr.ac.kopo.homework;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("****물건 값을 입력해 주세요****");
        System.out.println("**************************");
        int productPrice = sc.nextInt(); // 물건 가격

        System.out.println("*************************");
        System.out.println("**지불할 돈의 액수를 입력해 주세요**");
        System.out.println("*************************");
        int paidMoney = sc.nextInt(); // 고객이 지불한 돈

        int change = paidMoney - productPrice; // 거스름돈 계산 코드

        if (change > 0) {
            System.out.println("거스름 돈은 " + change + " 원 입니다.");

            int number1000 = change / 1000; // 1000원 지폐 장 수
            int number500 = (change - (number1000 * 1000)) / 500; // 500원 지폐 장 수
            int number100 = (change - (1000 * number1000) - (500 * number500)) / 100; // 100원 지폐 장 수
            int number50 =  (change - (1000 * number1000) - (500 * number500) - (100 * number100)) / 50; // 50원 지폐 장 수
            int number10 = (change - (1000 * number1000) - (500 * number500) - (100 * number100) - (50 * number50)) / 10; // 10원 지폐 장 수

            System.out.println("1000원 : " + number1000 + "개" );
            System.out.println("500원 : " + number500 +  "개" );
            System.out.println("100원 : " + number100 +  "개" );
            System.out.println("50원 : " + number50 +  "개" );
            System.out.println("10원 : " + number10 +  "개" );

        } else if (change < 0) {
            System.out.println("고객님 카드 한도 초과 나왔어요!!!!!!! 😅");
            System.out.println(Math.abs(change) + "원이 모자랍니다");
        }
    }
}
