package kr.ac.kopo.Lecture;

public class HandphoneMain {
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.name = "Galaxy S25 Ultra";
        hp.number = "010-4728-0170";
        hp.company = "SAMSUNG";

        HandPhone hp2 = new HandPhone();
        hp2.name = "iPhone 16 Pro Max";
        hp2.number = "010-4728-0171";
        hp2.company = "APPLE";

        HandPhone hp3 = new HandPhone();
        hp3.name = "Sony Experia";
        hp3.number = "010-4728-0172";
        hp3.company = "SONY";

        HandPhone[] hpArr = {hp, hp2, hp3};

        for (HandPhone phone : hpArr) {
            System.out.println("소유주는 " + phone.name + " 전화번호는 " + phone.number + " 제조사는 " + phone.company);
        }
    }
}
