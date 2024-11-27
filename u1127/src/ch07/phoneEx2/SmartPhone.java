package ch07.phoneEx2;

public class SmartPhone extends Phone{
    SmartPhone(String model, String color){
        // 부모 클래스에 매개변수를 갖는 생성자가 있는 경우
        super(model,color);  // 생략 불가능
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
