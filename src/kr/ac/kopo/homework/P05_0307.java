package kr.ac.kopo.homework;

import java.util.Scanner;

import java.util.InputMismatchException;

public class P05_0307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("*************점수를 입력해 주세요*************");
                score = sc.nextDouble();

                if (score >= 0 && score <= 100) {
                    validInput = true; // 유효한 점수일 경우 루프 종료
                } else {
                    System.out.println("성적을 잘못 입력했습니다.");
                    System.out.println("올바른 성적을 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.next();
            }
        }

        System.out.println("*************점수가 입력되었습니다.*************");
        if (score >= 90) {
            System.out.println("A 학점입니다.");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B 학점입니다.");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C 학점입니다.");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D 학점입니다.");
        } else if (score < 60) {
            System.out.println("F 학점입니다. 반성하세요");
        }
    }
}



