package ch15.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample_member {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

        // Member 객체 저장
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30)); // 인스턴스는 다르지만 동등 객체이므로 1개만 저장

        // 저장된 객체 수 출력
        System.out.println("저장된 객체 수: "+set.size());
    }
}
