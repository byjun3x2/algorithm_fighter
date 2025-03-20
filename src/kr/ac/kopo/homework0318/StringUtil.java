package kr.ac.kopo.homework0318;

import java.util.Arrays;

public class StringUtil {

    /**
     * 이 메서드는 char 자료형 매개변수를 받고 이 매개변수가 대문자이면
     * true를 반환, 그렇지 않으면 false를 반환
     *
     * @param c
     * @return true / false
     */
    boolean isUppercase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    /**
     * 이 메서드는 char 자료형 매개변수를 받고 이 매개변수가 소문자이면
     * true를 반환, 그렇지 않으면 false를 반환
     *
     * @param c
     * @return true / false
     */
    boolean isLowercase(char c) {
        if (c >= 'a' && c <= 'z') { // 소문자 범위 확인
            return true;
        }
        return false;
    }

    /**
     * 이 메서드는 int 자료형 매개변수 i , j 를 받고
     * 더 큰 수를 반환합니다.
     *
     * @param i
     * @param j
     * @return true / false
     */
    int max(int i, int j) {
        return Math.max(i, j);
    }

    /**
     * 이 메서드는 int 자료형 매개변수 i , j 를 받고
     * 더 작은 수를 반환합니다.
     *
     * @param i
     * @param j
     * @return true / false
     */
    int min(int i, int j) {
        return Math.min(i, j);
    }

    String reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return "변환이 완료되었습니다.";
    }

    // 1번줄에 StringBuffer 인스턴스 생성
    String toUpperString(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 소문자인 경우 대문자로 변환하여 추가
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32)); // ASCII 값을 이용해 대문자로 변환
            } else {
                sb.append(ch); // 소문자가 아니면 그대로 추가
            }
        }
        return sb + "";
    }

    String toLowerString(String str) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 소문자인 경우 대문자로 변환하여 추가
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32)); // ASCII 값을 이용해 대문자로 변환
            } else {
                sb.append(ch); // 소문자가 아니면 그대로 추가
            }
        }
        return sb.toString();
    }

    int compareTo(String str1, String str2) {
    int ans = 0;
    if (str1.length() >= str2.length()) {
        int a = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ans = str1.charAt(i) - str2.charAt(i);
                a = 1;
                break;
            }
        }
        if(a == 0) {
            ans = str1.length() - str2.length();
        }
    } else {
        int a = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ans = str1.charAt(i) - str2.charAt(i);
                a = 1;
                break;
            }
        }
        if(a == 0) {
            ans = str1.length() - str2.length();
        }
    }
    return ans;
}

    public static int checkChar (String strData,char ch){
        int count = 0;
        String[] arr = strData.split("");
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(String.valueOf(ch))){
                count++;
            }
        }
        return count;
    }

    public static String removeChar(String oriStar, char delChar) {
        String sum = "";

        String copied = oriStar.replace(delChar, ' ');
        for (int i = 0; i < copied.length(); i++) {
            sum += copied.charAt(i);
        }
        return sum.replace(" ", "");
    }
}
