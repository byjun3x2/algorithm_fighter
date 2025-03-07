package kr.ac.kopo.boj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }
//        System.out.println(list);
//
        Integer[] arr = list.toArray(new Integer[list.size()]);

        System.out.println(arr);
//        int maxNumber = numbers[0];
//        int maxIndex = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > maxNumber) {
//                maxNumber = numbers[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println(maxNumber);
//        System.out.println(maxIndex);
    }
}
