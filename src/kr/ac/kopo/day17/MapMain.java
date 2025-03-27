package kr.ac.kopo.day17;

import com.sun.source.tree.LiteralTree;

import javax.xml.stream.events.EndElement;
import java.util.*;
import java.util.Map.Entry;

// Map : key, value 집합 , key 에 대한 중복을 허용 안 함...
// - HashMap
// - TreeMap

public class MapMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> members = new HashMap<>();
        members.put("aaa" , "1111");
        members.put("bbb" , "2222");
        members.put("ccc" , "3333");
        members.put("ddd" , "4444");
        // 비밀번호 변경 서비스
        System.out.println("**** 비밀번호 변경 서비스 ****");
        System.out.println("ID를 입력하세요");
        String id = sc.nextLine();

        if (!members.containsKey(id)) {
            System.out.println("입력하신 ID [" + id + "]는 존재하지 않습니다.");
            System.out.println("비밀번호 변경서비스를 종료합니다.");
            System.exit(0);
        }

        System.out.print("현재 비밀번호를 입력하세요 : ");
        String password = sc.nextLine();

        if(!members.get(id).equals(password)) { // String 끼리의 비교는 equals 를 써야합니다.
            System.out.println("비밀번호가 틀렸습니다.");
            System.out.println("비밀번호 변경 서비스를 종료합니다.");
            System.exit(0);
        }

        System.out.print("변경할 비밀번호를 입력하세요 : ");
        String newPassword = sc.nextLine();
        members.put(id, newPassword);

        System.out.println("비밀번호가 변경되었습니다.");

        System.out.println("<< 전체 회원목록 조회 >>");
        System.out.println("----------------------------");
        System.out.println("ID\tPASSWORD");
        System.out.println("----------------------------");
        Set<Map.Entry<String, String>> entry = members.entrySet();

        for(Entry<String, String> e: entry) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }


        System.out.println("----------------------------");
    }
}
