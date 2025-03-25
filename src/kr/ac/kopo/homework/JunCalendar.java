package kr.ac.kopo.homework;
import java.util.Calendar;
import java.util.Scanner;

public class JunCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        System.out.print("항목을 선택하세요. (1.특정년(연)도 , 2.특정월, 3.종료) => ");
        int selectedNumber = sc.nextInt();
        int selectedYear;
        int selectedMonth;
        boolean flag = false;

        if (selectedNumber == 1) {
            System.out.print("특정 년(연)도를 입력하세요 => ");
            selectedYear = sc.nextInt();

            c.set(Calendar.YEAR, selectedYear);
            c.set(selectedYear, Calendar.JANUARY, 1); // 날짜 설정
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 이렇게 호출하면 요일을 숫자로 반환함
            System.out.println(dayOfWeek);
            String[] days = {"일", "월", "화", "수", "목", "금", "토"};
            System.out.println(selectedYear + "년의 1월 1일은 " + days[dayOfWeek - 1] + "요일 입니다.");

            for (int month = 1; month <= 12; month++) {
                System.out.println("<<" + selectedYear + "년 " + month + "월" + ">>" );
                System.out.println("| 일 | 월 | 화 | 수 | 목 | 금 | 토 |");
            }


            System.out.println(days[dayOfWeek - 1]);



        } else if (selectedNumber == 2) {
            System.out.print("특정 년(연)도를 입력하세요 => ");
            selectedYear = sc.nextInt();
            System.out.print("특정월을 입력하세요 => ");
            selectedMonth = sc.nextInt();




        } else if (selectedNumber == 3) {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
