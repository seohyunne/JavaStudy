package Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        // Map 생성
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(101, "Alice", 20));
        studentMap.put(2, new Student(102, "Bob", 22));
        studentMap.put(3, new Student(103, "Charlie", 21));

        // Map 내용 출력
        System.out.println("Student Map 내용 출력");
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println("key: " + student.getKey() + ", value: " + student.getValue());
        }

        // 특정 키로 객체 가져오기
        System.out.println("\n특정 키(2)의 Student 정보");
        Student student = studentMap.get(2);
        System.out.println(student);

        // 모든 student 이름 출력
        System.out.println("\n모든 학생의 이름 출력");
        for (Student s : studentMap.values()) {
            System.out.println(s.getName());
        }

        // 데이터 추가
        addStudent(studentMap, 4, 104, "John", 27);
        printMap(studentMap);

        // 데이터 업데이트
        System.out.println("\n특정키 (1) Student 정보 수정");
        updateStudent(studentMap, 1, "seohyun", 23);  // id는 유지하고 이름과 나이만 수정
        printMap(studentMap);

        // 데이터 삭제
        System.out.println("\n특정키 (2) Student 정보 삭제");
        deleteStudent(studentMap, 2);
        printMap(studentMap);
    }

    private static void addStudent(Map<Integer, Student> studentMap, int key, int id, String name, int age) {
        Student student = new Student(id, name, age);
        studentMap.put(key, student);
    }

    private static void printMap(Map<Integer, Student> studentMap) {
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println("key: " + student.getKey() + ", value: " + student.getValue());
        }
    }

    private static void updateStudent(Map<Integer, Student> studentMap, int key, String name, int age) {
        Student student = studentMap.get(key);   // for문 안 돌려도 key값으로 찾을 수 있다~
        if (student != null) {
            student.setName(name);
            student.setAge(age);
        } else {
            System.out.println("학생을 찾을 수 없습니다.");
        }
    }

    private static void deleteStudent(Map<Integer, Student> studentMap, int key) {
        if (studentMap.containsKey(key)) {    // containsKey - 맵에 해당 key가 존재하는지 검사하는 메소드
            Student removedStudent = studentMap.remove(key);
            System.out.println(removedStudent.getName() + " 학생 삭제");
        }
    }
}