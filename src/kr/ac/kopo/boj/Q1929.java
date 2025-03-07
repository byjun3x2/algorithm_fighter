package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i = M; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i * j == N) {
                    System.out.print(i);
                    System.out.println(j);
                }
            }
        }
    }
}
