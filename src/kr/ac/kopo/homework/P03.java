package kr.ac.kopo.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class P03 {
    public static String countByKorean(int num) {
        switch (num) {
            case 1: return "첫";
            case 2: return "두";
            case 3: return "세";
            default: return Integer.toString(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 3개를 차례대로 입력해 주세요");

        ArrayList<Integer> numbers = new ArrayList<>(); // 입력받은 숫자를 저장할 리스트
        // 자바에서는 배열을 선언하면 크기가 고정되어 있어서 자바스크립트 처럼 push() 를 할 수 없다.
        // 따라서 동적으로 원소를 추가할 수 있는 ArrayList를 사용해서 추가후 배열로 변환


        // 세 개의 숫자를 입력받기
        for (int i = 1; i <= 3; i++) {
            while (true) {
                System.out.print(countByKorean(i) + " 번째 정수 입력: ");
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    numbers.add(num); // 입력받은 숫자를 리스트에 추가
                    break;
                } else {
                    System.out.println("숫자가 입력되지 않았습니다. 다시 입력해 주세요.");
                    scanner.next(); // 잘못된 입력 버리기
                }
            }
        }

        // 오름차순 정렬 구현
        int first = numbers.get(0);
        int second = numbers.get(1);
        int third = numbers.get(2);

        if (first > second) { // 첫 번째와 두 번째 값 비교
            int temp = first;
            first = second;
            second = temp;
        }
        if (second > third) { // 두 번째와 세 번째 값 비교
            int temp = second;
            second = third;
            third = temp;
        }
        if (first > second) { // 첫 번째와 두 번째 값 다시 비교 (최종 확인)
            int temp = first;
            first = second;
            second = temp;
        }

        // 결과 출력
        System.out.println("입력한 숫자를 오름차순으로 정렬한 결과:");

        // printf를 이용하여 출력
        System.out.printf("%d, %d, %d\n", first, second, third);

        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // 스캐너 종료
    }
}
