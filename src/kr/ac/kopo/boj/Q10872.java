package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int multiple = 1;

        for (int i = 1; i <= N; i++) {
            multiple *= i;
        }

        System.out.println(multiple);
    }
}
