package javaAir;

import java.time.DateTimeException;
import java.util.*;

public class FlightManager {
    private static ArrayList<Flight> flights;     // 항공편 정보를 저장하는 ArrayList
    private static ArrayList<Passenger> passengers;      // 항공편 정보를 저장하는 ArrayList
    // 승객을 key, 예약된 항공평을 value로 가지는 map
    private static Map<String,Flight> reservationMap = new HashMap<>();

    public static FileC fc = new FileC();    // 파일 관련된 작업

    Scanner input = new Scanner(System.in);

    public FlightManager(){
        flights = new ArrayList<>();
        flights.add(new Flight("제주","11:55", 78000, false));
        flights.add(new Flight("이스탄불","17:10",1200000,true));
        flights.add(new Flight("방콕","21:35",280000,true));

        passengers = new ArrayList<>();
        Flight sf = flights.get(0);
        reservationMap.put("테스트",sf);
    }

    public String airplane = "                       |                      \n" + "                      _|_                     \n" + "                    /_____\\                  \n" + "                   /oo   oo\\                 \n" + " \\_________________\\       /_________________/\n" + "  `-------|---|-----\\_____/-----|---|-------'\n" + "         ( ) ( )  O|OOo|oOO|O  ( ) ( )   \n";


    public void displayFlightList(String str) {
        // 항공편 목록 출력 -> Flight의 toString() 이용
        System.out.println("================== " + str + " ==================");
        int count = 1;
        for(Flight flight : flights){
            System.out.println(count+ "" +flight);
            count++;
        }
        System.out.println("================================================");
    }

    public void bookFlight() throws InterruptedException {
        // 국제선 - 사용자 이름, 생년월일 받아서 나이 확인하고, 만 15세 미만은 예약 거절
        for(;;){     // 무한루프
            displayFlightList("항공편 예매");
            System.out.print("예매할 항공편 입력 >> ");
            try{
                int bookNum = Integer.parseInt(input.next());
                // 입력 받은 번호는 flight.get(bookNum-1)
                if(bookNum > flights.size() || bookNum<1){
                    System.out.println("잘못된 입력입니다.");
                    continue;  //  유효하지 않은 입력일 경우 루프 다음을 반복
                               //  즉, 사용자에게 올바른 입력을 다시 요청
                }
                System.out.println("선택한 항공편");
                System.out.println("===============================================");
                System.out.println(bookNum + "" + flights.get(bookNum - 1));
                System.out.println("===============================================");
                Flight sf = flights.get(bookNum - 1);    // 선택한 항공편 sf로 저장

                if(flights.get(bookNum - 1).getInternationalFlight()) {      // 국제선을 선택하면
                    System.out.println("국제선은 만 15세 이상 예매 가능합니다.");
                    passengerInfo(sf);    // 승객 정보 입력하는 메소드
                }else{
                    passengerInfo(sf);
                }

                if(passengers!=null && !passengers.isEmpty()){  // 승객 명단이 비어있지 않다면
                    String seatNum  = Integer.toString(seatSelection(sf));
                    passengers.get(passengers.size()-1).setSeat(seatNum);
                    System.out.println("예약 중입니다 . . . ");
                    Thread.sleep(2000);   // 2초 후 실행
                }
                System.out.println("===============================================");
                System.out.println("예약에 성공했습니다.");
                System.out.println("[ " + passengers.get(passengers.size()-1).getName() + " ] 님의 예약정보");
                System.out.println(bookNum + "" + sf);
                System.out.println("===============================================");

                System.out.println("잠시후 메인 화면으로 이동합니다.");
                Thread.sleep(2000);
                reservationMap.put(passengers.get(passengers.size()-1).getName(),sf);
                break;
            }catch(NumberFormatException e){
                System.out.println("잘못된 입력입니다.");
            }


        }
    }

    // 예매자 정보 입력받기
    private void passengerInfo(Flight flight) {
        System.out.println("예매자 정보를 입력하세요");
        System.out.print("이름 >> ");
        String name = input.next();
        System.out.printf("생년월일(6자리) >> ");
        try{
            int birthDate = Integer.parseInt(input.next());
            Passenger p = new Passenger(name,birthDate);
            if(!p.man15(p) && flight.getInternationalFlight()){   // 국제선이고 만 15세 이상이 아니면
                System.out.println("만 15세 미만은 국제선 예매가 불가능합니다.");
            }
            else{
                System.out.print("결제 비밀번호 입력 >> ");
                String pw = input.next();
                p = new Passenger(name, birthDate, pw);
                passengers.add(p);//항공예약명단에 추가
            }
        }catch(DateTimeException e){
            System.out.println("생년월일을 6자리로 입력해주세요. (예- 020118)");
        }
    }

    // 좌석 선택하기
    private int seatSelection(Flight flight) {
        int seatNum = -1;
        while (true) {
            try{
                System.out.println("========================================");
                flight.seatToString(); //빈좌석 보이는 print
                System.out.println("좌석을 선택하세요");
                System.out.print("선택>");
                int seatInt = input.nextInt() - 1 ;
                input.nextLine();
                if(seatInt + 1 < 1 || seatInt + 1 > 20){//좌석이 1~20인지
                    System.out.println("존재하지 않는 좌석입니다.");
                }else if(flight.getSeats().get(seatInt).equals("XX")){
                    System.out.println("이미 예약된 좌석입니다.");
                }else{
                    //좌석이 비어있는 경우 XX를 넣는다.
                    flight.getSeats().set(seatInt, "XX");
                    System.out.println("좌석 선택이 완료되었습니다.");
                    seatNum = seatInt;
                    break;
                }

            }catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다.");
                input.nextLine();
            }
        }
        return seatNum;
    }

    //예약확인
    public void checkReservation() {
        int index = search("예약 확인");
        checkPassword(index);
    }

    // 비밀번호 확인
    private void checkPassword(int index) {
        for(;;){
            if(index !=-1){
                System.out.print("결제 비밀번호: ");
                String pw = input.next();
                System.out.println();
                if(passengers.get(index).getPw().equals(pw)){
                    System.out.println("비밀번호가 일치합니다.");
                    System.out.println(ticketPrint(reservationMap, passengers.get(index).getName()));
                    break;
                }else{
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }

            }else{
                System.out.println("일치하는 이름이 없습니다.");
                break;
            }

        }

    }

    // 티켓 출력
    String ticketPrint(Map<String, Flight> reservationMap, String name) {
        int index = -1;
        if(passengers !=null){
            for(int i=0; i < passengers.size();i++){
                if(passengers.get(i).getName().equals(name)){
                    index = i;
                }
            }
        }
        int seat = Integer.parseInt(passengers.get(index).getSeat())+1;
        return  "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n\n" +
                "\t" + name + "님의 티켓정보" +
                "| 좌석 : " + seat + "번\n"+
                "." + reservationMap.get(name) + "\n\n" +
                "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
    }

    private int search(String str) {//이름을 검색받아서 인텍스 번호 반환
        System.out.println("===================== " + str + " =====================");
        System.out.print("예약자 이름: ");
        String name = input.next();
        input.nextLine();

        int index = -1;
        if(passengers != null){
            for (int i=0; i < passengers.size(); i++){
                if(passengers.get(i).getName().equals(name)){
                    index = i;
                }
            }
        }
        return index;
    }
    public void ticketSave() {
        int index = search("티켓 조회");
        checkPassword(index);
        fc.ticketSaveFile(reservationMap, passengers.get(index).getName());

    }

    public static ArrayList<Flight> getFlights() {
        return flights;
    }


    public static Map<String, Flight> getReservationMap() {
        return reservationMap;
    }

}
