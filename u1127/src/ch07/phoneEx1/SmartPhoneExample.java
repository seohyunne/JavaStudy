package ch07.phoneEx1;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시","은색");

        // 부모(Phone)에게 상속 받은 필드 읽기
        System.out.println(smartPhone.model);
        System.out.println(smartPhone.color);

        // SmartPhone 필드 읽기
        System.out.println(smartPhone.wifi);

        // 부모(Phone) 메소드 읽기
        smartPhone.bell();
        smartPhone.sendVoice("안녕");
        smartPhone.receiveVoice("그래 안녕");
        smartPhone.hangUp();

        // SmartPhone 메소드 읽기
        smartPhone.setWifi(true);
        smartPhone.internet();
    }
}
