package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random r = new Random();

        int[] intBox = new int[45];
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < intBox.length; i++) {
            intBox[i] = i + 1;
        }

        while(true) {
            int randomNumber = r.nextInt(45) + 1;
            numbers.add(randomNumber);
            HashSet<Integer> set = new HashSet<>(numbers);
            

            if (set.size() == 6) {
                System.out.println(set);
                break;
            }
        }
    }
}
