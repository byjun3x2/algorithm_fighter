package kr.ac.kopo.homework;

import java.util.Random;

public class P08_0307 {
    public static void main(String[] args) {

        int count = 1;
        Random random = new Random();
        int Random_Picked_Number = random.nextInt(100) + 1;

        System.out.println("랜덤으로 뽑힌 수는? " + Random_Picked_Number + "입니다.");

        while (count <= 81) {
            if ((count +  " ").contains("3") || (count +  " ").contains("6") || (count +  " ").contains("9")) {

                if (count % 10 == 0) {
                    System.out.println('짝' + "뽀".repeat(count / 10) + "숑");
                } else {
                    System.out.println("짝");
                    if ((count + "").length() >= 2) {
                        System.out.println("짝짝");
                    }
                }
            } else {
                if (count % 10 == 0) {
                    System.out.println("뽀".repeat(count / 10) + "숑");
                } else {
                    System.out.println(count);
                }
            }

            count++;
        }
    }
}
