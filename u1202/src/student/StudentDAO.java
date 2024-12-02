package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    private ArrayList<StudentDTO> students;
    Scanner input = new Scanner(System.in);

    public StudentDAO() {
        students = new ArrayList<>();

        // 기본 데이터 생성
        StudentDTO s1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
        StudentDTO s2 = new StudentDTO(1, "테스트2", 22, 90, 89, 91);
        StudentDTO s3 = new StudentDTO(2, "테스트3", 33, 85, 77, 55);
        StudentDTO s4 = new StudentDTO(3, "테스트4", 44, 77, 68, 85);

        // 생성한 기본 데이터를 객체 배열에 삽입
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);

    }

    private void insert(StudentDTO s) {
        students.add(s);
    }

    private void  delete(int i){
        students.remove(i);
    }

    public void userInsert() {
//        System.out.print("사용자 이름: ");
//        String userName = input.nextLine();
//        System.out.print("나이: ");
//        int num = input.nextInt();
//        System.out.print("국어 점수: ");
//        int kor = input.nextInt();
//        System.out.print("영어 점수: ");
//        int eng = input.nextInt();
//        System.out.print("수학 점수: ");
//        int math = input.nextInt();
//
//        StudentDTO student = new StudentDTO(students.size(),userName,num,kor,eng,math);
//        students.add(student);
//        System.out.println(students);

        StudentDTO s = new StudentDTO();
        s.setId(students.size());
        System.out.println("== 학생 추가 ==");
        System.out.print("이름 : ");
        s.setName((input.next()));
        System.out.print("나이 : ");
        s.setNum(input.nextInt());
        System.out.print("국어점수 : ");
        s.setKor(input.nextInt());
        System.out.print("영어점수 : ");
        s.setEng(input.nextInt());
        System.out.print("수학점수 : ");
        s.setMath(input.nextInt());

        insert(s);
        System.out.println("추가 완료");
    }

    public void userDelete() {
        System.out.println("== 학생 정보 삭제 ==");
        System.out.print("삭제할 학생 이름 >> ");
        int index = searchIndex(); // searchIndex() - 삭제할 이름의 인덱스 반환
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
        } else {
            String name = students.get(index).getName();
            delete(index);
            System.out.println(name + " 학생 정보를 삭제하였습니다.");
        }
    }

    private StudentDTO select(int index){
        return students.get(index);
    }

    public void userSelect(){
        System.out.println("=== 학생 정보 찾기 ===");
        int index = searchIndex(); // searchIndex() - 조회할 이름의 인덱스 반환
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
        } else {
            System.out.println("이름    나이    국어    영어    수학");
            StudentDTO s = select(index);   // select 메소드가 객체를 반환해야 학생 정보 전체를 출력 가능
            System.out.println(s);
        }
    }

    public void userUpdate(){
        System.out.println("=== 학생 정보 수정 ===");
        System.out.println("수정할 학생 이름 >> ");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
        }else{
            // 빈 객체 새롭게 하나 생성해서 수정하려는 학생 정보를 뽑아온 후 수정 작업 -> 이후 수정 완료된 이 새 객체를 기존 객체에 붙여넣기
            StudentDTO s = new StudentDTO();
            s.setId(students.get(index).getId());
            s.setName(students.get(index).getName());
            s.setNum(students.get(index).getNum());
            System.out.println("<"+students.get(index).getName()+ " 학생의 정보 수정");

            System.out.print("국어점수 >> ");
            s.setKor(input.nextInt());
            input.nextLine();  // 개행 문자 제거
            System.out.print("영어점수 >> ");
            s.setKor(input.nextInt());
            input.nextLine();
            System.out.print("수학점수 >> ");
            s.setKor(input.nextInt());
            input.nextLine();

            update(index,s);
        }
    }

    public void printAll(){
        System.out.println("이름    나이    국어    영어    수학");
        System.out.println("====================================");
        for(int i=0; i<students.size();i++){
            System.out.println(students.get(i).toString());
        }
    }

    // 수정할 객체의 인덱스 자리에 새로 생성한 인덱스(점수 수정 완료한 객체) 넣기
    private void update(int index, StudentDTO s){
        students.set(index,s);
    }

    private int searchIndex() {
        int index = -1;
        String userName = input.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(userName)) {
                index = i;   // students에 입력한 이름과 같은 데이터가 있으면
                break;
            }
        }
        return index;
    }


}
