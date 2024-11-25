package Interface.Car;

public class Car {
    // 인스턴스 변수에 구현 객체 대입
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
