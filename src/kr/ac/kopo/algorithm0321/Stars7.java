package kr.ac.kopo.algorithm0321;

import java.util.Scanner;

public class Stars7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1;  j <=  N - (N-i); j ++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
