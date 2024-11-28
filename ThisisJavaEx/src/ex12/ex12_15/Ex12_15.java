package ex12.ex12_15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Ex12_15 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        // 오늘 날짜 구하기
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println("오늘 날짜 : "+year+"년 "+month+"월 "+day+"일");

        // 시작일
        LocalDateTime start= LocalDateTime.of(year,month,day,0,0,0);
        // 종료일
        LocalDateTime end = LocalDateTime.of(2024,12,31,0,0,0);

        long remainDay = start.until(end, ChronoUnit.DAYS);

        System.out.println("올해는 "+remainDay+"일 남았습니다.");
    }
}
