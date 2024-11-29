package AccommondationReserve;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccManager manager = new AccManager(); //  숙소 관리 객체 생성 -> 숙소 리스트에 A,B,C 각각 추가

        boolean flag = true;
        while(flag){
            System.out.println("\n 숙소 예약 시스템에 오신 것을 환영합니다! ");
            System.out.println("1. 예약 가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 내용 보기");
            System.out.println("8. 종료");

            int choice = input.nextInt();
            input.nextLine();    // 메모리에 남아있는 개행문자 삭제

            switch(choice){
                case 1:{
                    System.out.println("예약 가능한 숙소");
                    manager.availAccommodation();
                    break;
                }
                case 2:{
                    System.out.println("숙소 예약하기");
                    System.out.println("예약하려는 숙소의 이름을 입력하세요.");
                    String accommodationName = input.nextLine();
                    if(manager.bookedAccommodations(accommodationName)){
                        System.out.println("숙소가 성공적으로 예약되었습니다.");
                    }else{
                        System.out.println("예약이 불가능하거나 존재하지 않는 숙소입니다.");
                    }
                    break;
                }
                case 3:{
                    manager.bookedAccommodations();
                    break;
                }
                case 4:{
                    System.out.println("숙소 추가하기");
                    System.out.print("추가하려는 숙소의 이름 > ");
                    String newName = input.nextLine();
                    System.out.print("추가하려는 숙소의 위치 > ");
                    String newLocation = input.nextLine();
                    System.out.print("추가하려는 숙소의 가격 > ");
                    double newPrice = input.nextDouble();
                    input.nextLine();  // 개행 문자 초기화

                    if(newName.equals("")){ // 이름 공백이면 재입력 받기
                        System.out.print("추가하려는 숙소 이름 재입력 > ");
                        newName = input.nextLine();
                    }

                    if(manager.equals(newName)){
                        System.out.println("이미 존재하는 숙소입니다.");
                    }else{
                        manager.addAccommodation(newName,newLocation,newPrice);
                        System.out.println("숙소 추가 완료!*");
                        break;
                    }

                }
                case 5:{
                    System.out.println("숙소 삭제하기");
                    System.out.print("삭제하려는 숙소의 이름 > ");
                    String deleteName = input.nextLine();

                    if(deleteName.equals("")){ // 이름 공백이면 재입력 받기
                        System.out.print("삭제하려는 숙소 이름 재입력 >");
                        deleteName = input.nextLine();
                    }
                    manager.deleteAccommodation(deleteName);

                    break;
                }
                case 6:{
                    System.out.println("숙소 수정하기");
                    System.out.println("수정하려는 숙소 이름 > ");
                    String updateName = input.nextLine();

                    if(updateName.equals("")){ // 이름 공백이면 재입력 받기
                        System.out.print("수정하려는 숙소 이름 재입력 > ");
                        updateName = input.nextLine();
                    }
                    manager.updateAccommodation(updateName);
                    System.out.println("수정 끝");
                    break;
                }
                case 7:{
                    System.out.print("조회할 호텔 이름 입력 > ");
                    String name = input.nextLine();
                    if(name.equals("")){ // 이름 공백이면 재입력 받기
                        System.out.print("조회하려는 숙소 이름 재입력 > ");
                        name = input.nextLine();
                    }
                    manager.showAccommodation(name);
                    break;
                }
                case 8:{
                    System.out.println("종료");
                    flag=false;
                    input.close();
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("다시입력");
                    break;
                }
            }
        }
    }
}
