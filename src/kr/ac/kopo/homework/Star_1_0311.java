package kr.ac.kopo.homework;

import java.util.Scanner;

public class Star_1_0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
