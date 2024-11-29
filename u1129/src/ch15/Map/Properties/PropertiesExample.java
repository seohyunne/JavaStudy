package ch15.Map.Properties;
// Properties는 Hashtable의 자식 클래스 -> Hashtable의 특성을 그대로 가지고 있음
// Properties는 키와 값을 String타입으로 제한한 컬렉션 

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        // Properties 컬렉션 생성
        Properties properties = new Properties();
        
        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        // 주어진 키에 대한 값 읽기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        // 값 출력하기

        System.out.println(driver);
        System.out.println(url);
        System.out.println(password);
        System.out.println(username);
        System.out.println(admin);
    }
}
