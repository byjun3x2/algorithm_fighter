package kr.ac.kopo.homework;

import java.util.Random;

public class P08 {
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
                    String[] arr = (count + "").split("");

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].contains("3") || arr[i].contains("6") || arr[i].contains("9")) {
                            arr[i] = "짝";
                            System.out.println(String.join("", arr));
                        }
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
