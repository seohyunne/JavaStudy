package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // 학생 객체 생성
//        StudentDTO student1 = new StudentDTO(0,"테스트1",11,100,90,80);
//        StudentDTO student2 = new StudentDTO(1,"테스트2",22,90,89,91);
//        StudentDTO student3 = new StudentDTO(2,"테스트3",33,85,75,80);
//
//        ArrayList<StudentDTO> arrList = new ArrayList<>();
//
//        // 객체 배열에 학생 객체 추가
//        arrList.add(student1);
//        arrList.add(student2);
//        arrList.add(student3);

        StudentDAO studentdao = new StudentDAO();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("===========================");
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 삭제");
            System.out.println("3. 학생정보 검색");
            System.out.println("4. 학생정보 수정");
            System.out.println("5. 학생 목록 보기");
            System.out.println("6. 파일로 저장하기");
            System.out.println("7. 학생정보 파일 불러오기");
            System.out.println("0. 종료");
            System.out.println("===========================");
            System.out.print(">>");
            int choice;
            try{
                choice = input.nextInt();
            }catch(Exception e){
                choice = -1;
            }

            if(choice==1){
                studentdao.userInsert();
            }
            else if(choice==2){
                studentdao.userDelete();
            }
            else if(choice==3){
                studentdao.userSelect();
            }
            else if(choice==4){
                studentdao.userUpdate();
            }
            else if(choice==5){
                studentdao.printAll();
            }
            else if(choice==6){
                try{
                    studentdao.dataSave();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else if(choice==7){
                studentdao.dataLoad();
            }
            else if(choice==0){
               input.close();
                System.exit(0);
            }
            else{
                System.out.println("잘못 선택했습니다. 올바른 값을 입력하세요.");
            }
        }
    }
}
