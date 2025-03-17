package kr.ac.kopo.homework;

public class Lecture05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {

            if (i <= 5) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 10 - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

//
//        for (int i = 4; i > 0; i--) {
//            System.out.println("*".repeat(i));
//        }


        // 1 , 2 , 3, 4, 5, 6, 7, 8, 9
        // 1 , 2 , 3, 4, 5, 4, 3, 2, 1,
    }
}
