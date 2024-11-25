package Interface.Casting;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        // 구현 객체는 인터페이스 타입으로 자동 타입 변환 발생
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); 자동 타입 변환으로 인한 에러 발생


        Bus bus = (Bus) vehicle;   // 강제 타입 변환
        bus.run();
        bus.checkFare();

    }
}
