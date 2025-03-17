package kr.ac.kopo.homework;

import java.util.Scanner;

public class Star_2_0311 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N/2; i++) {
            for (int j = 1; j <= i; j++) { // j = 1
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= N/2 -1 ; i++) {
            for (int j = 1; j <= N/2 -i; j++) { //6 - 1 = 5 (첫번째 루프) // 6 - 2 = 4
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
