package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            String star = "*".repeat(N);
//            star = star.substring(0, N);
            System.out.println(star);
            N--;
        }
    }
}
