package kr.ac.kopo.homework;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import java.util.Scanner;

public class makeUTF8 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        System.out.print("문자를 입력하세요: ");
	        String input = scanner.next();
	        byte[] utf8Bytes = input.getBytes(StandardCharsets.UTF_8); // UTF-8 바이트 배열로 변환

	        StringBuilder binaryString = new StringBuilder();
	        for (byte b : utf8Bytes) {
	            String bin = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'); // 8비트 변환
	            binaryString.append(bin).append(" "); // 가독성을 위해 공백 추가
	        }

	        String[] binaryParts = binaryString.toString().trim().split(" "); // 각 바이트를 나눠서 처리
	        StringBuilder extracted = new StringBuilder();

	        if (binaryParts.length == 1) {
	            // 1바이트 문자 (0xxxxxxx)
	            extracted.append(binaryParts[0].substring(1));
	        } else if (binaryParts.length == 2) {
	            // 2바이트 문자 (110xxxxx 10xxxxxx)
	            extracted.append(binaryParts[0].substring(3)); // 첫 바이트 앞 3비트 제거
	            extracted.append(binaryParts[1].substring(2)); // 두 번째 바이트 앞 2비트 제거
	        } else if (binaryParts.length == 3) {
	            // 3바이트 문자 (1110xxxx 10xxxxxx 10xxxxxx)
	            extracted.append(binaryParts[0].substring(4)); // 첫 바이트 앞 4비트 제거
	            extracted.append(binaryParts[1].substring(2)); // 추가 바이트 앞 2비트 제거
	            extracted.append(binaryParts[2].substring(2));
	        } else if (binaryParts.length == 4) {
	            // 4바이트 문자 (11110xxx 10xxxxxx 10xxxxxx 10xxxxxx)
	            extracted.append(binaryParts[0].substring(5)); // 첫 바이트 앞 5비트 제거
	            extracted.append(binaryParts[1].substring(2));
	            extracted.append(binaryParts[2].substring(2));
	            extracted.append(binaryParts[3].substring(2));
	        }

	        System.out.println("UTF-8 원본 이진수: " + binaryString);
	        System.out.println("접두 비트 제거된 값: " + extracted);
	        scanner.close();
	    }
}

