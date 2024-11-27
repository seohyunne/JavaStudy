package hashCode;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();  // HashSet 컬렉션 생성

        Student s1 = new Student(1,"홍길동");
        hashSet.add(s1);    // hashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: "+hashSet.size());

        Student s2 = new Student(1,"홍길동");
        hashSet.add(s2);    // hashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: "+hashSet.size());

        Student s3 = new Student(2,"홍길동");
        hashSet.add(s3);    // hashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: "+hashSet.size());
    }
}

// 실행 결과 참고 **
// s1 객체와 s2객체는 학생 번호와 이름이 같기 때문에 동등 객체이고, 동등 객체는 중복 저장되지 않음



