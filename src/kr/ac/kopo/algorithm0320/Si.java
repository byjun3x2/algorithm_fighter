package kr.ac.kopo.algorithm0320;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();

        String s2 = s.charAt(i) + "" ;
        System.out.println(s2);
    }
}
