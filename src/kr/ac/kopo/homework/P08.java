package kr.ac.kopo.homework;

import java.util.Random;

public class P08 {
    public static void main(String[] args) {

        Random randomInstance = new Random(); // 랜덤 넘버를 사용하려면 인스턴스를 하나 만들어야 한다.
        int randomNumber = randomInstance.nextInt(100) + 1; // 자바에서 1~100까지 수 중에서 랜덤으로 뽑는 수
        // let randomInt = Math.floor(Math.random() * 100) + 1; (자바스크립트)
        // random_int = random.randint(1, 100); (파이썬)

        int count = 1; // while 문에서 매 369 게임의 횟 수 마다 카운트할 카운트 변수 선언 및 할당

        while (count < randomNumber) { // for 문으로 했어도 되는지 생각해봐야 할 문제

            if((count + "").contains("3") || (count + "").contains("6") || (count + "").contains("9")) { // 3, 6, 9 를 하나라도 포함
                // 3 6 9 게임이니 3의 배수로 나누면 13 19 같은 수가 대처가 안됨

                if (count % 10 == 0) { // 3 6 9 포함하는데 10의 배수만
                    System.out.println("짝" + "뽀".repeat(count/10) + "숑");
                } else { // 3 6 9 포함하는데 10의 배수 아님
                    String[] strCount = (count + "").split(""); // 두자리 이상 숫자 한글자씩 판단하기 위해 (반복문을 사용하기 위해) 배열화
                    // System.out.println(Arrays.toString(strCount)); // 자바에서는 배열을 출력하려면 이렇게 해야 한다는데...
                    String strSum = ""; // 초기값을 지정하고 변환되는 값 , 변환되지 않는 값을 누적
                    for (int i = 0; i < strCount.length; i++) {

                        if ( strCount[i].contains("3") || strCount[i].contains("6") || strCount[i].contains("9") ) { // 두자리 이상의 수의 각 자릿 수의 3 6 9 판별
                            strCount[i] = "짝";  // 3 6 9 를 포함하는데 10의 배수가 아니고 각 자리의 수가 3 6 9 라면 그 자리수는 "짝"
                        } else {
                            strCount[i] = ""; // 3 6 9 를 포함하는데 10의 배수가 아니고 각 자리의 수가 3 6 9가 아니라면 그 자리수는 "빈 문자열"
                        }
                        strSum += strCount[i]; // 각 자리의 "짝" 또는 "빈 문자열" 을 누적

                    }
                    System.out.println(strSum); // 33 36 39 63 66 69 93 96 99 333 336 339 등 숫자가 늘어나도 대처 가능
                }
            } else { // 3 6 9 그 어느 것이라도 포함 안 하는 수
                if ((count % 10) == 0) { // 3 6 9 그 어느 것이라도 포함 안 하는 수에서 10의 배수 // 10 20 40 50 70 ...
                    System.out.println("뽀".repeat(count/10) + "숑"); // "뽀"가 늘어나야 하는 것이 중점이니 "뽀숑"을 1음절로 쪼개서 대처
                } else {
                    System.out.println(count); // 1 ,2 ,4, 5 ... 11, 12 ... 17 ... 125 같은 수
                }
            }

            count++; // 모든 조건을 거치면 다음 순서로 진행
        }
    }
}
