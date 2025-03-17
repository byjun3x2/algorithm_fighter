package kr.ac.kopo.Lecture;

class Car {
    // 여기는 public 을 붙이면 안된다.
    String name;
    int maxSpeed;
}

public class CarMain {
    public static void main(String[] args) {
        // 객체를 만드는 행위를 인스턴스화 시켰다고 말한다.
        Car c1 = new Car();

        c1.name = "포르쉐";
        c1.maxSpeed = 310;

        Car c2 = new Car();

        c2.name = "람보르기니";
        c2.maxSpeed = 330;

        System.out.println("첫번째 자동차의 모델명은 : " + c1.name + "이고 " + "최대 스피드는 :" + c1.maxSpeed); // 여기서는 값을 할당하지 않았으니 각각 null , 0
        System.out.println("두번째 자동차의 모델명은 : " + c2.name + "이고 " + "최대 스피드는 :" + c2.maxSpeed); // 여기서는 값을 할당하지 않았으니 각각 null , 0

    }
}
