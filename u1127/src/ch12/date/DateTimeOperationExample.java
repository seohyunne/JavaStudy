package ch12.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 현재 컴퓨터의 날짜와 시간
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH.mm.ss");
        System.out.println("현재 시간: "+now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 더하기: "+result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 빼기: "+result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 더하기: "+result3.format(dtf));

    }
}
