package kr.ac.kopo.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 인스턴스 생성

        System.out.println("첫 번째 수를 입력해 주세요");
        int first_Integer = sc.nextInt(); // 첫 번쨰 수 입력
        System.out.println("두 번째 수를 입력해 주세요");
        int second_Integer = sc.nextInt(); // 두 번째 수 입력
        System.out.println("세 번째 수를 입력해 주세요");
        int third_Integer = sc.nextInt(); // 세 번째 수 입력

        Integer[] numbers = {first_Integer, second_Integer, third_Integer};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.printf("%d %d %d%n", numbers[0], numbers[1], numbers[2]);
    }
}
