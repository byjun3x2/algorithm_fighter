package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("정수값 N 을 입력해주세요");
        int N = sc.nextInt();

        String str = "";

        for (int i = 0; i < N; i++) {
            str += "*";
            System.out.println(str);
        }
    }
}
