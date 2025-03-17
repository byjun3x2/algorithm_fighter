package kr.ac.kopo.test;

public class Test05_0314 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 0;
        int l = 1;
        while (i <= 5) {
            System.out.println(i);
            ++i;
        }
        for (; j <= (5%10); j++) {
            System.out.println(j);
        }

        do { //
            ++k;
            System.out.println(k);
        } while (k <= 5);

        while (l <= 5) {
            System.out.println(l);
            l++;
        }
    }
}
