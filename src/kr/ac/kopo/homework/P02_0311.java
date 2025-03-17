package kr.ac.kopo.homework;

import java.util.Scanner;

public class P02_0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1번부터 5번 학생까지 점수를 차례대로 입력해주세요");
        double $1_grade = sc.nextDouble();
        double $2_grade = sc.nextDouble();
        double $3_grade = sc.nextDouble();
        double $4_grade = sc.nextDouble();
        double $5_grade = sc.nextDouble();

        System.out.println("입력된 점수는 차례대로 " + $1_grade + "\t" + $2_grade + "\t" + $3_grade + "\t" + $4_grade + "\t" + $5_grade + "\t" );

        double[] grades = {$1_grade, $2_grade, $3_grade, $4_grade, $5_grade};
        double sum = 0.00;
        double average = 0.00;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 0.00 && grades[i] <= 100.00) {
                sum += grades[i];
            }
        }
        average = sum / grades.length;

        System.out.printf("총합은 %.1f\n", sum);
        System.out.printf("평균은 %.2f\n", average);
    }
}
