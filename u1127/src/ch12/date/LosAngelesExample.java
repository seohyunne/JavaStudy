package ch12.date;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {

        // TimeZone() 으로 원하는 지역의 Calender 얻기
        // 원하는 시간대의 TimeZone 객체 생성하여 getInstance()의 매개값으로 넘겨준다

        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch(week){
            case Calendar.MONDAY: strWeek = "월"; break;
            case Calendar.TUESDAY: strWeek = "화"; break;
            case Calendar.WEDNESDAY: strWeek = "수"; break;
            case Calendar.THURSDAY: strWeek = "목"; break;
            case Calendar.FRIDAY: strWeek = "금"; break;
            case Calendar.SATURDAY: strWeek = "토"; break;
            case Calendar.SUNDAY: strWeek = "일";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM)
            strAmPm = "오전";
        else strAmPm = "오후";

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year+"년 "+month+"월 "+day+"일");
        System.out.println(strWeek+"요일 "+strAmPm);
        System.out.println(hour+"시 "+minute+"분 "+second+"초");
    }
}
