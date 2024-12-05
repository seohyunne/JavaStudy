package Hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager {
    private static ArrayList<Patient> patients;// 환자 목록
    Scanner input = new Scanner(System.in);

    public String hospital = "#     #    " + " ###     " + " ####     " + "#####    " + "#####    " + "#####      " + "#        " + "#\n"
            +"#     #    " + "#   #    " + "#         " + "#   #    " + "  #      " + "  #       " + "# #       " + "#\n"
            +"#######    " + "#   #    " + "#####     " + "#####    " + "  #      " + "  #      " + "#####      " + "#\n"
            +"#     #    " + "#   #    " + "    #     " + "#        " + "  #      " + "  #     " + "#     #     " + "#\n"
            +"#     #    " + " ###     " + "####      " + "#        " + "#####    " + "  #    " + "#       #    " + "#####\n";

    public PatientManager(){
        // PatientManager 객체 생성될 때 더미데이터 자동 생성
        patients = new ArrayList<>();
        patients.add(new Patient("홍길동", "010-1234-1234", "경기도 성남시", "치과", "12:30"));
    }

    public void patientUpload() {
        System.out.println("========= 환자 등록 =========");
        System.out.print("이름 >> ");
        String name = input.next();
        input.nextLine();
        System.out.print("전화번호(-포함): ");
        String phone = input.next();
        input.nextLine();
        System.out.print("주소: ");
        String address = input.nextLine();
        System.out.print("진료 내용: ");
        String disease = input.next();
        input.nextLine();
        System.out.print("예약 시간: ");
        String time = input.next();
        input.nextLine();

        patients.add(new Patient(name,phone,address,disease,time));
        System.out.println("접수 중입니다..");
        System.out.println("\n"+name+"님, 진료가 접수되었습니다.");
    }

    public void patientPrint() {
        boolean patientAppoint = false;  // 환자 존재 여부 확인용
        System.out.print("조회할 환자의 이름 입력 >> ");
        String name = input.next();

        for(Patient patient : patients){
            if(patient.getName().equalsIgnoreCase(name)){
                patientAppoint = true;
                System.out.println("등록정보: "+ patient.getDisease()+ " " + patient.getTime());
            }
        }
        if(!patientAppoint){
            System.out.println("정보가 존재하지 않습니다.");
            return;
        }
    }

    public void adminMenu() {
        System.out.println("<<< 관리자 모드로 접속 완료 >>>");
        while(true){
            System.out.println("\n======= 관리자 메뉴 =======\n");
            System.out.println("1. 환자 등록 목록");
            System.out.println("2. 환자 등록 삭제");
            System.out.println("3. 환자 정보 수정");
            System.out.println("4. 메인으로 돌아가기\n");
            System.out.print("입력 > ");

            int choice = -1;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                input.next();
                continue;
            }
            switch(choice){
                case 1:
                    printAll();   // 모든 환자 목록
                    break;
                case 2:
                    cancelAppoint();   // 환자 삭제
                case 3:
                    updateAppoint();    // 환자 수정
                case 4:
                    return;
                    // 메인메뉴에서 3번 선택하면 adminMenu() 실행
                    // adminMenu()실행 도중 4번 선택 시 adminMenu()를 종료하고 원래 실행 중이던 메인메뉴로 돌아간다.
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    break;
            }
        }
    }

    private void printAll() {
        for(Patient patient : patients){
            System.out.println(patient);
        }
        if(patients.isEmpty()){  // patients 리스트가 비어있다면 (환자가 없다면)
            System.out.println("조회할 환자가 존재하지 않습니다.");
            return;
        }
    }

    private void cancelAppoint() {
        System.out.print("삭제할 환자의 이름을 입력하세요 >> ");
        String name = input.next();
        boolean patientFound = false;
        for(Patient patient : patients){
            if(patient.getName().equalsIgnoreCase(name)){
                patientFound = true;
                patients.remove(patient);
                System.out.println("삭제 중..");
                System.out.println(name+" 환자 정보 삭제 완료");
                break;
            }
        }
        if(!patientFound)
            System.out.println("입력하신 환자는 없습니다.");
    }

    private void updateAppoint() {
        System.out.print("수정할 환자의 이름을 입력하세요 >> ");
        String name = input.next();
        boolean patientFound = false;
        for(Patient patient : patients){
            if(patient.getName().equalsIgnoreCase(name)){
                patientFound = true;
                System.out.println("1.연락처   2.주소   3.시간");
                System.out.print("수정할 정보를 선택하세요 >> ");
                int num = input.nextInt();
                switch(num){
                    case 1:
                        System.out.print("수정할 연락처 입력(-포함) >> ");
                        String number = input.next();
                        patient.setPhone(number);
                        System.out.println("연락처 수정 완료");
                        break;
                    case 2:
                        System.out.print("수정할 주소 입력 >> ");
                        String address = input.next();
                        patient.setAddress(address);
                        System.out.println("주소 수정 완료");
                        break;
                    case 3:
                        System.out.print("수정할 시간 입력 >> ");
                        String time = input.next();
                        patient.setTime(time);
                        System.out.println("시간 수정 완료");
                        break;
                    default:
                        System.out.println("올바른 숫자를 입력하세요.");
                        break;
                }
            }
        }
        if(!patientFound){
            System.out.println("입력하신 환자는 없습니다.");
        }
    }
}
