package kr.ac.kopo.day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Naruto {
    public static void main(String[] args) {
    int count = 0;
        try {
//            FileInputStream fis = new FileInputStream("iotest/Naruto.jpg");
//            FileOutputStream fos = new FileOutputStream("iotest/Naruto2.jpg");

                for (int i = 0; i < 1000; i++) {
                    FileInputStream fis = new FileInputStream("iotest/Naruto.png");
                    FileOutputStream fos = new FileOutputStream("iotest/분신" + i +".png");

                    BufferedInputStream bis = new BufferedInputStream(fis);
                    BufferedOutputStream bos = new BufferedOutputStream(fos);


                    while (true) {
                        int c = bis.read();
                        if(c == -1) break;
                        bos.write(c);
                    }
                }
                System.out.println("Naruto.png -> Naruto" + count + ".png 복사완료.........");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}