package AccommondationReserve;

import java.util.ArrayList;
import java.util.Scanner;

// 숙소를 관리
public class AccManager {
    private ArrayList<Accommodation> accommodations;  // 모든 숙소
    private ArrayList<Accommodation> bookedAccommodations;  // 예약된 숙소

    public AccManager(){
        accommodations = new ArrayList<>();  // 초기 숙소를 저장할 리스트
        bookedAccommodations = new ArrayList<>();

        // 초기 숙소를 리스트에 추가
        accommodations.add(new Accommodation("호텔A","서울",100.0));
        accommodations.add(new Accommodation("호텔B","부산",80.0));
        accommodations.add(new Accommodation("호텔C","제주",120.0));

    }

    public void availAccommodation(){
        System.out.println("예약 가능 숙소 보기");
        for(Accommodation accomodation : accommodations){
            if(accomodation.isAvailable())
                System.out.println(accomodation);
        }
    }

    public boolean bookedAccommodations(String name){
        for(Accommodation accommodation : accommodations){
            if(accommodation.getName().equals(name) && accommodation.isAvailable()){
                accommodation.book();  
                bookedAccommodations.add(accommodation);   // 예약 숙소 리스트에 추가
                return true;
            }
        }return false;
    }

    public void bookedAccommodations(){
        System.out.println("== 예약된 숙소 목록 ==");
        for(Accommodation i :  bookedAccommodations){
            System.out.println(i);
        }
    }

    public void addAccommodation(String name, String location, double pricePerNight ){
        accommodations.add(new Accommodation(name,location,pricePerNight));
    }

    public void deleteAccommodation(String name){
        boolean result = false;
        for(Accommodation i : accommodations){
            if(i.getName().equalsIgnoreCase(name)){ // 입력한 호텔이 존재하는지 확인
                if(i.isAvailable()){  // 입력한 호텔이 존재하는데 이미 예약된 호텔인지 확인  (예약한 호텔은 삭제하면 안됨)
                    accommodations.remove(i);
                    result = true;
                    break;
                }
                else{  // 숙소가 예약 중이면 삭제 불가능
                    System.out.println("예약된 숙소는 삭제할 수 없습니다.");
                    break;
                }
            }
        }
        if(result) System.out.println("삭제 완료");
        else System.out.println("삭제 안됨");
    }

    public void updateAccommodation(String name){
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        Accommodation newA = new Accommodation();
        System.out.println(name);

        for(Accommodation a : accommodations){   // 리스트를 순회하면서 같은 이름 있는지 찾기
            i++;
            if(a.getName().equals(name)){
                index = i -1;
                newA = a;   // 수정하려는 객체를 newA에 저장
            }
            System.out.println(a.getName().equals(name) + " ");
        }
        if (index!=-1){   // 위에서 수정할 숙소를 찾으면 idnex 값을 -1 하므로 idnex는 -1이 아님 (즉, 수정할 숙소가 있을 때)
            System.out.println("수정할 내용");
            System.out.print("1.숙소 이름  2.지역  3. 가격  > ");
            menu = input.nextInt();
            input.nextLine();

            while(flag){
                switch(menu){
                    case 1:{
                        System.out.print("수정할 이름 입력 > ");
                        newA.setName(input.nextLine());   // newA 이름 변경
                        accommodations.set(index,newA);
                        flag = false;
                        break;
                    }
                    case 2:{
                        System.out.print("수정할 위치 입력 > ");
                        newA.setLocation(input.nextLine());   // newA 이름 변경
                        accommodations.set(index,newA);
                        flag = false;
                        break;
                    }
                    case 3:{
                        System.out.print("수정할 가격 입력 > ");
                        newA.setPricePerNight(input.nextInt());   // newA 이름 변경
                        accommodations.set(index,newA);
                        flag = false;
                        break;
                    }
                    default:{
                        System.out.println("올바른 숫자를 입력하세요.");
                        break;
                    }
                }
            }

        }
        else
            System.out.println("찾는 숙소가 없어서 업데이트 불가능");
    }

    public void showAccommodation(String name){
        for(Accommodation a : accommodations){
            if(a.getName().equalsIgnoreCase(name)){
                System.out.println(a);
            }
        }

    }
}
