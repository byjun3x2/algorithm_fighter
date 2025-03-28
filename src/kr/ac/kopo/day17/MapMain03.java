package kr.ac.kopo.day17;

class A {
    public void print(Object i) {
        System.out.println("A::print() 호출... ");
    }
}

class B extends A {

    public void print(B i) {
        System.out.println("B::print() 호출... ");
    }
}

public class MapMain03 {
    public static void main(String[] args) {
        A obj = new B();
        obj.print(10);
    }
}
