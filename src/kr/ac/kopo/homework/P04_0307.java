package kr.ac.kopo.homework;

import java.util.Arrays;
import java.util.Scanner;

public class P04_0307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해 주세요");
        int first_Integer = sc.nextInt(); // 첫 번쨰 수 입력
        System.out.println("두 번째 수를 입력해 주세요");
        int second_Integer = sc.nextInt(); // 두 번째 수 입력
        System.out.println("세 번째 수를 입력해 주세요");
        int third_Integer = sc.nextInt(); // 세 번째 수 입력
        System.out.println("네 번째 수를 입력해 주세요");
        int fourth_Integer = sc.nextInt(); // 네 번째 수 입력

        Integer[] numbers = {first_Integer, second_Integer, third_Integer, fourth_Integer};
        Arrays.sort(numbers);
        System.out.println("가장 큰 수는? " + numbers[3] + "입니다");
    }
}
