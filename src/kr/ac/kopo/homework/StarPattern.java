package kr.ac.kopo.homework;

public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // 패턴의 크기

        // 상단 삼각형
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 하단 삼각형
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
