package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        Student s1= new Student("Alice",20,"S001");
        Student s2=new Student("Bob",22,"S002");
        Student s3=new Student("Charlie",19,"S003");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        while(true){
            System.out.println("========== 학생 관리 프로그램 ==========");
            System.out.println("1.학생추가 2.학생명단확인");
            System.out.println("3.학생수정 4.학생삭제 5.프로그램 종료");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("이름 >> ");
                    String name = input.next();
                    System.out.print("나이 >> ");
                    int age = input.nextInt();
                    System.out.print("Id >> ");
                    String studentId = input.next();
                    students.add(new Student(name,age,studentId));
                    break;
                case 2:
                    if(students.isEmpty()){
                        System.out.println("학생 리스트가 비어있습니다.");
                    }else{
                        for(Student student : students){
                            System.out.println(student);
                        }
                    }
                    break; // 현재 반복문만 빠져나간다.
                case 3:
                    System.out.print("업데이트할 학생 Id 입력 >> ");
                    String updateId = input.next();
                    boolean found = false;
                    for(Student student : students){
                        if(student.getStudentID().equalsIgnoreCase(updateId)){
                            System.out.print("업데이트할 이름 >> ");
                            student.setName(input.nextLine());
                            System.out.print("업데이트할 나이 >> ");
                            student.setAge(input.nextInt());
                            System.out.println("학생 정보 수정 완료 !");
                            found= true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 학생 Id 입력 >> ");
                    String deleteId = input.next();
                    found = false;
                    for(Student student : students){
                        if(student.getStudentID().equalsIgnoreCase(deleteId)){
                            students.remove(student);  // 리스트에서 학생 한 줄 삭제
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                    break;

            }
        }


    }

}
