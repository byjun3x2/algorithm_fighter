package kr.ac.kopo.day16;

// 순서를 가지고 있으면서 중복도 허용함
// ArrayList , LinkedList
// 주요 메서드 add(), get() , remove(), size(), isEmpty(), addAll()

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        System.out.println("전체 원소의 갯수: " + list.size());
        list.add("one");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        System.out.println("전체 원소의 갯수: " + list.size());

        for (String a : list) {
            System.out.println(a);
        }

        Set<String> set = new HashSet<String>();
        System.out.println(set.size()); // 0

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        set.add("중복데이터 삽입여부" + set.add("one")); // 리턴값 boolean


        System.out.println(set.size());
        //2가지
        //3가지
        //4가지
        //5가지
        //
         // class Lotto {
        //      int[] getLottos() {

                    // 숫자 6개 추출


        //          int[] lottos = new int[6];
        //      }
        // }
        //
        // class LottoGame() {
        //  void play() {
        //      for (int i = 0; game < 10; game++ ) {
        //
        //          }
        //      }
        // }
    }
}
