package kr.ac.kopo.Lecture;

public class ExamMain {
    public static void main(String[] args) {
        ExamMethod exam = new ExamMethod();

        exam.printSum(1, 10);

        // 두 수의 합을 구한 후
        int total = exam.getTotal(1,100);
        // 두 수 사이의 합을 출력
        exam.printTotal(1, 100, total);
    }
}
