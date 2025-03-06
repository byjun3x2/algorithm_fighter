package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();

        if (A >= 90 && A <= 100) {
            System.out.println("A");
        } else if (A >= 80 && A <= 89) {
            System.out.println("B");
        } else if (A >= 70 && A <= 79) {
            System.out.println("C");
        } else if (A >= 60 && A <= 69) {
            System.out.println("D");
        } else if (A <= 100 && A >= 0) {
            System.out.println("F");
        }
    }
}
