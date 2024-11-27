package ch07.phoneEx2;

public class Phone {
    public String model;
    public String color;

    public Phone(){
        System.out.println("Phone() 생성자 실행");
    }

    public Phone(String model, String color){
        this.model=model;
        this.color=color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
