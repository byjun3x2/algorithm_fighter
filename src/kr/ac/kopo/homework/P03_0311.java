package kr.ac.kopo.homework;

import java.util.Scanner;

public class P03_0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        System.out.println("정수 10개를 차례대로 입력해주세요");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("입력된 수는 아래와 같습니다.");
        System.out.print(num[0] + "\t" + num[1] + "\t" + num[2] + "\t" + num[3] + "\t" + num[4] + "\t" + num[5] + "\t" + num[6] + "\t" + num[7] + "\t" + num[8] + "\t" + num[9] + "\n");
        System.out.println();
        System.out.print("짝수는: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + "\t");
                evenSum += num[i];
            }
        }
        System.out.print("\n");
        System.out.println("짝수의 총합은 " + evenSum);
        System.out.print("홀수는: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + "\t");
                oddSum += num[i];
            }
        }
        System.out.print("\n");
        System.out.println("홀수의 총합은 " + oddSum);
    }
}
