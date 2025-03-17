package kr.ac.kopo.homework;

import java.util.Scanner;

public class UTF8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UTF-8 바이너리 문자열을 입력하세요 (8비트 단위로): ");
        String binaryInput = scanner.nextLine().replaceAll("\\s", ""); // 공백 제거
        scanner.close();

        if (binaryInput.length() % 8 != 0) {//길이를 8로 나눠서 바이트단위인지 검사
            System.out.println("잘못된 입력입니다. 8비트(1바이트) 단위로 입력해야 합니다.");
            return;
        }

        int byteCount = binaryInput.length() / 8;//입력한 코드가 몇 byte인지 byteCount에 저장
        byte[] utf8Bytes = new byte[byteCount];//byteCount 크기의 새로운 바이트 배열을 생성

        for (int i = 0; i < byteCount; i++) {// i byte만큼 반복
            String byteSegment = binaryInput.substring(i * 8, (i + 1) * 8); //8비트씩 잘라서 문자열 추출.
            utf8Bytes[i] = (byte) Integer.parseInt(byteSegment, 2); //byte타입으로 2진수를 정수로 변환
        }

        // UTF-8 바이트 배열을 직접 문자열로 변환
        StringBuilder unicodeString = new StringBuilder();//문자열을 반환할곳
        StringBuilder binaryOutput = new StringBuilder();// 2진수를 반환할곳
        int i = 0;
        while (i < utf8Bytes.length) {
            int c = utf8Bytes[i] & 0xFF;//byte값에 정수를 c에 넣는다. FF는 1111 1111 임으로 utf8Bytes[i]에 값이 반환된다.
            int charCode = 0;
            //1byte
            if (c < 0x80) { //  0x80은 1000 0000 이고 1바이트문자인지 검사하고 unicodeString에 값을 넣는다.
                charCode = c;
                unicodeString.append((char) c);
                i += 1;}
             //2byte
            else if ((c & 0xE0) == 0xC0) { // 0xE0 = 1110 0000, 0xC0 = 1100 0000 2바인트인지 검사
                charCode = ((c & 0x1F) << 6) | (utf8Bytes[i + 1] & 0x3F);// 110xxxxx 10xxxxxx에서 각 비트에 맞는 값 가져오기
                unicodeString.append((char) charCode);
                i += 2;}
            // 3byte
            else if ((c & 0xF0) == 0xE0) { // 0xF0 = 1111 0000 3바이트 문자인지 검사
                charCode = ((c & 0x0F) << 12) | ((utf8Bytes[i + 1] & 0x3F) << 6) | (utf8Bytes[i + 2] & 0x3F);// 110xxxxx 10xxxxxx 10xxxxxx
                unicodeString.append((char) charCode);
                i += 3;
            } else {
                System.out.println("잘못된 UTF-8 입력입니다.");
                return;
            }
            binaryOutput.append(String.format("%016d", Long.parseLong(Integer.toBinaryString(charCode)))).append(" ");
        }

        System.out.printf("변환된 유니코드 문자열: %s%n", unicodeString);
    }
}
