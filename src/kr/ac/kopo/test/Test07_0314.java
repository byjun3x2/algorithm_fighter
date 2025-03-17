package kr.ac.kopo.test;

public class Test07_0314 {
    long add(int a, int b) {
        return a + b;
    }
    // long add(int x, int y) {return x + y;} 메서드 명도 똑같고 매개변수도 똑같아서 틀림
    long add(long a, long b) {return a + b;}
    int add(byte a, byte b) {return a + b;}
    int add(long a, int b) {return (int)a + b;}
}
