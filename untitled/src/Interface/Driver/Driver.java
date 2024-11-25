package Interface.Driver;

public class Driver {
    // 매개변수 타입을 인터페이스로 선언
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}
