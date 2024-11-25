package Interface.Instanceof;

public class InstanceofExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        ride(taxi);
        System.out.println("");
        ride(bus);
    }

    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus bus){
            bus.checkFare();
        }
        vehicle.run();
    }
}
