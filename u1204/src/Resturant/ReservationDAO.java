package Resturant;

import java.util.ArrayList;

public class ReservationDAO {
    private ArrayList<ReservationDTO> reservationList = new ArrayList<>();

    public ReservationDAO(){
        ReservationDTO r1 = new ReservationDTO("김서현",76378552,"7:30");
        ReservationDTO r2 = new ReservationDTO("홍길동",12354678,"6:30");
        ReservationDTO r3 = new ReservationDTO("seohyun",15686515,"4:30");
    }
}
