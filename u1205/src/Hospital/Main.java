package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatientManager pm = new PatientManager();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println(pm.hospital);
        System.out.println("\t\t    어서오세요. JAVA 병원입니다.");

        while(true){
            System.out.println("========= 메인 메뉴 =========");
            System.out.println("1. 환자 등록");
            System.out.println("2. 등록 정보 보기");
            System.out.println("3. 관리자 메뉴");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice = -1;

            try{
                choice = input.nextInt();
            }catch(Exception e){
                System.out.println("잘못된 입력입니다.");
                input.next();
                continue;
            }
            switch(choice){
                case 1:
                    pm.patientUpload();  // 환자 등록
                    break;
                case 2:
                    pm.patientPrint();  // 환자 조회
                    break;
                case 3:
                    if(!checkAdminPw()){
                        System.out.println("비밀번호가 틀렸습니다.");
                        break;
                    }
                    pm.adminMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }

    private static boolean checkAdminPw() {
        Scanner input = new Scanner(System.in);
        System.out.print("관리자 비밀번호를 입력하세요 >> ");
        String pw = input.next();
        return "admin1234".equals(pw);   // 관리자 비밀번호가 입력한 비밀번호와 같으면 true, 다르면 false 리턴
    }
}
