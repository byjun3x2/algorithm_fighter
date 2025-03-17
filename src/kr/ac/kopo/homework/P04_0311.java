package kr.ac.kopo.homework;

import java.util.Scanner;

public class P04_0311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] evenNumbers = new int[5]; // 짝수를 저장할 배열
        int count = 0; // 짝수 개수를 세는 변수

        System.out.println("짝수 5개를 입력하세요.");

        while (count < 5) {
            System.out.print("num" + (count + 1) + " : ");
            int input = scanner.nextInt();

            if (input % 2 == 0) { // 짝수인지 확인
                evenNumbers[count] = input; // 짝수를 배열에 저장
                count++; // 카운트를 증가
            }
        }

        // 결과 출력
        System.out.println("< PRINT >");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
