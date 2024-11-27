package ch12;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        // 운영체제와 사용자 정보 출력
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName+", "+ userName +", "+userHome);

        // 전체 키와 값을 출력
        System.out.println("------------------------------");
        System.out.println(" key:   value ");
        System.out.println("------------------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();
    }


}
