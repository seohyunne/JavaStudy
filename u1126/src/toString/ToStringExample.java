package toString;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성전자","안드로이드");

        System.out.println(smartPhone.toString());
        System.out.println(smartPhone);

    }
}
