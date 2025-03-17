package kr.ac.kopo.icecream;

import java.util.Scanner;

public class IcecreamOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true; // 프로그램 반복 여부 플래그

        while (flag) {
            System.out.println("구입할 아이스크림의 갯수를 입력해주세요😊");

            int n = sc.nextInt();
            System.out.println("입력한 갯수는 " + n + "개" + "입니다.");

            Icecream[] icecream = new Icecream[n]; // 아이스크림 객체를 저장할 배열을 생성
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("***" + (i + 1) + "번째 아이스크림 구매 정보 입력 ***");
                icecream[i] = new Icecream();
                System.out.print("아이스크림 이름: ");
                icecream[i].name = sc.nextLine();
                System.out.print("아이스크림 가격: ");
                icecream[i].price = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("<아이스크림 구매 정보 출력>");
            System.out.println("----------------------------------");
            System.out.printf("%-5s %-15s %-10s%n", "번호", "아이스크림명", "아이스크림가격");
            System.out.println("----------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%-5d %-15s %-10d%n", (i + 1), icecream[i].name, icecream[i].price);
            }
            System.out.print("계속 구매할까요?: (Y/N) => ");
            flag = sc.nextLine().equalsIgnoreCase("y"); // 대소문자 구분 없이 비교
        }
        sc.close(); // Scanner 자원 해제
    }
}
