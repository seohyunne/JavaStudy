package List;

import java.util.ArrayList;
import java.util.List;

class Student{

    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class List1 {
    public static void main(String[] args) {
        // ArrayList 추가
        List<Student> studentList = new ArrayList<>();

        // 객체 추가
        studentList.add(new Student(101,"Alice",20));
        studentList.add(new Student(102,"Bob",22));
        studentList.add(new Student(103,"Charlie",21));

        // ArrayList 내용 출력
        System.out.println("Student List 내용 출력 : ");
        for(Student student : studentList){
            System.out.println(student);
        }

        // 특정 인덱스의 객체 가져오기
        System.out.println("\n특정 인덱스(1) "+studentList.get(1));
        // ArrayList의 객체 요소 중 일부를 가져올 때 변수 선언 따로 해줄 것
        String name = studentList.get(1).getName();
        System.out.println(name);

        // 모든 학생의 이름만 출력
        System.out.println("\n모든 학생의 이름 출력");
        for (Student student : studentList){
            System.out.println(student.getName());
        }
        
        // 데이터 추가
        System.out.println("\n새로운 학생 추가");
        studentList.add(new Student(104,"David",28));
        printList(studentList);

        // 데이터 변경
        System.out.println("\n특정 학생 정보 변경");
        updateStudent(studentList,102,"Robert",25);
        printList(studentList);

        // 데이터 삭제
        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList,103);
        printList(studentList);

        // 데이터 검색
        System.out.println("\n특정 학생 검색");
        Student foundStudent = findStudentById(studentList,104);
        System.out.println(foundStudent != null ? foundStudent : "학생을 찾을 수 없습니다.");

    }


    private static void printList(List<Student> studentList) {
        for(Student student : studentList){
            System.out.println(student);
        }
    }

    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge){
        for(Student student : studentList){
            if(student.getId()==id){
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("학생 ID "+id+" 정보가 수정되었습니다.");
                return;
            }
            else{
                System.out.println("학생 ID "+id+"를 찾을 수 없습니다.");
            }
        }
    }

    private static void deleteStudent(List<Student> studentList, int id) {
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getId()==id){
                studentList.remove(i);
                System.out.println("학생 ID "+id+" 정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("학생 ID "+id+"를 찾을 수 없습니다.");
        }

    private static Student findStudentById(List<Student> studentList, int id) {
        for(Student student : studentList){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }


}

