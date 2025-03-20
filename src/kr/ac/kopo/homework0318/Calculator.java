package kr.ac.kopo.homework0318;

public class Calculator {
    void add (int a, int b) {
        System.out.printf("$d + $d = $d/n" , a , b, a+b);
    }

    void sub (int a, int b) {
        System.out.printf("$d - $d = $d/n" , a , b, a-b);
    }

    void mul (int a, int b) {
        System.out.printf("$d x $d = $d/n" , a , b, a*b);
    }

    void div (int a, int b) {
        System.out.printf("$d / $d = $d/n" , a , b, a/b);
    }
}
