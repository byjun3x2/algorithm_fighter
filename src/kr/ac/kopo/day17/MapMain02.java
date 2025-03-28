package kr.ac.kopo.day17;


import java.util.HashMap;
import java.util.Map;

class Member extends Object{
    private String name;
    private String phone;

    public Member(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        boolean a = false;
        return a;
    }

}

class Car extends Object {
    private String model;
    private String id;

    public Car() {

    }

    public Car(String model, String id) {
        super();
        this.model = model;
        this.id = id;
    }
}


public class MapMain02 {

    public static void main(String[] args) {
        Map<Member, Car> map = new HashMap<>();
        map.put(new Member("김민재", "010-111-1111"), new Car("벤츠", "22-22222"));
        map.put(new Member("손흥민", "010-111-1222"), new Car("페라리", "22-3333"));
        map.put(new Member("손흥민", "010-111-1332"), new Car("산타페", "22-3343"));
        map.put(new Member("김민재", "010-111-1111"), new Car("람보르기니", "22-22222"));

        System.out.println("등록대수 : " + map.size());

    }

    // Object 클래스에 있는 equals 는 객체의 주소값을 비교해서 주소값이 같으면 true
}
