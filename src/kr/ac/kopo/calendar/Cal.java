package kr.ac.kopo.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = new GregorianCalendar();
        // 후추 존나 뿌려야제
        Date d = new Date();
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(d);


    }
}
