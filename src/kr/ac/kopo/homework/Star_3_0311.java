package kr.ac.kopo.homework;

import java.util.Scanner;

public class Star_3_0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N/2; i++) {
            for (int j = N/2 - i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = N/2 - i; j > 0; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
