package ch12.CarClass;

public class CarClassExample {
    public static void main(String[] args) {
//        Class clazz = Car.class;

        Car car = new Car();
        Class clazz = car.getClass();

        System.out.println("패키지: "+clazz.getPackage().getName());
        System.out.println("클래스 간단 이름: "+clazz.getSimpleName());
        System.out.println("클래스 전체 이름: "+clazz.getName());
    }
}
