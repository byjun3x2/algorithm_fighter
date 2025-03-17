package kr.ac.kopo.homework;

import java.util.Scanner;

public class P01_0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 5개를 차례대로 입력해주세요");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        int fifth = sc.nextInt();



        System.out.println("정수 입력이 완료되었습니다.");
        System.out.println("입력된 정수는:\t"+ first + "\t" + second + "\t" + third + "\t" + fourth + "\t" + fifth + " 입니다");

        int[] arr = {first, second, third, fourth, fifth};

        // 원소의 순서를 재배열 하기 전에 원소의 뒤집기를 먼저 한다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {  // 원소가 10보다 작으면 x10
                arr[i] = arr[i] * 10;
            } else if(arr[i] > 10) { // 10보다 큰 수라면 10의 자리 와 1의 자리를 바꾸는 구간
                arr[i] = (arr[i] % 10) * 10 + (arr[i] / 10);
            } else if (arr[i] % 10 == 0) { // 10, 20, 30, 40 .... 같은 10의 배수의 수이면 한 자리 수로 변환
                arr[i] = arr[i] / 10;
            };
        }

        System.out.print("<REVERSE>는: ");
        for (int i = arr.length - 1; i >= 0; i--) { // 원소의 뒤집기가 완료가 되었다면 기존 순서를 바꿔준다.
            System.out.print(arr[i] + "\t");
        }
        System.out.println("입니다.");
    }
}
