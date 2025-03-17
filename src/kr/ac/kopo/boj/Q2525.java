package kr.ac.kopo.boj;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHour = sc.nextInt();
        int currentMin = sc.nextInt();
        int givenMin = sc.nextInt();

        int totalMinutes = currentHour * 60 + currentMin + givenMin;

        currentHour = (totalMinutes / 60) % 24;
        currentMin = totalMinutes % 60;

        System.out.println(currentHour + " " + currentMin);

        sc.close();
    }
}
