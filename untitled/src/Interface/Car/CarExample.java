package Interface.Car;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        // 타이어 객체 교체
        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();

        car.run();
    }
}
