package kr.ac.kopo.algorithm0321;

import java.util.Scanner;

public class Stars6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // 앞쪽 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 별과 내부 공백 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
