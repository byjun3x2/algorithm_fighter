package kr.ac.kopo.homework0318;

import java.util.Scanner;

public class StringUtilMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 문자를 입력해 주세요 : ");

        char ch = sc.nextLine().charAt(0); // 2. 받은 값을 char로 변환
        StringUtil su = new StringUtil(); // StringUtil 인스턴스 생성

        // 문제 1, 2
        // Character.isUpperCase() 정적 메서드
        //  매개변수에 대문자가 들어가면 true를 리턴 , 소문자가 들어가면 false를 리턴
        if (Character.isUpperCase(ch)) {
            System.out.println("입력한 문자는 대문자입니다. isLowerCase() 메서드를 실행합니다.");
            System.out.println("이 함수는 " + su.isUppercase(ch) + "를 반환합니다.");
        } else {
            System.out.println("입력한 문자는 소문자입니다. isUpperCase() 메서드를 실행합니다.");
            System.out.println("이 함수는 " + su.isLowercase(ch) + "를 반환합니다.");
        }

        // 문제 3, 4
        Scanner sc2 = new Scanner(System.in);
        System.out.print("숫자 두개를 입력해 주세요 : \t");
        int a = sc2.nextInt();
        int b = sc2.nextInt();
        System.out.println("입력한 숫자는 " + a + " 와 " + b + " 입니다.");
        System.out.println("큰 수는 " + su.max(a, b) + " 작은 수는 " + su.min(a, b) + "입니다.");

        // 문제 5
        su.reverseString("Apple");
        System.out.println();
        // 문제 6
        su.toUpperString("galaxy");
        // 문제 7
        su.toLowerString("PSYCHO");
        // 문제 8

        // 문제 9
        int count = su.checkChar("hello", 'l');
        System.out.println(count);

        String d = su.removeChar("hello", 'l');
        System.out.println(d);
    }
}
