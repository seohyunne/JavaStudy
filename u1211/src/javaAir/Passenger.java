package javaAir;

import java.time.LocalDate;
import java.time.Period;

// 예매 정보 저장
public class Passenger {
    private String name;    // 이름
    private int birthDate;   // 생년월일
    private String pw;    // 예약비밀번호
    private String seat;

    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    // 15세 이상만 국제선 예약 가능하도록 설정
    public boolean man15(Passenger p){
        int y =  p.birthDate/10000;      // 출생연도 2자리만 추출
        int m = (p.birthDate%10000)/100;    // 출생월만 추출
        int d = p.birthDate%100;

        if(y>0 && y<=24){
            y+=2000;
        }else{
            y+=1900;
        }
        LocalDate birthDate2 = LocalDate.of(y,m,d);        // 생년월일
        LocalDate currentDate = LocalDate.now();           // 오늘 년/월/일
        int age = Period.between(birthDate2,currentDate).getYears();
        return age > 15;
    }
}
