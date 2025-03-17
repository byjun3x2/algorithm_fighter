package kr.ac.kopo.Lecture;

public class ExamMethod {

    void printSum(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum += a++;
        }
    }

    /**
     * 호출자가 넘겨준 두개의 정수 사이의 총합을 구한 후 , 총합을 호출자에게 넘겨주는 기능
     * @param a 첫번째 정수
     * @param b 두번쨰 정수
     * @return 첫번째 정수 ~ 두번째 정수 사이의 총합
     **/
    int getTotal(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum += a;
        }
        return sum;
    }

    void printTotal(int a, int b, int total) {
        System.out.printf("%d - %d 사이의 총합 : %d\n", a, b, total);
    }
}
