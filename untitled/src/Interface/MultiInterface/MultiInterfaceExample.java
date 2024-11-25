package Interface.MultiInterface;


public class MultiInterfaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();

        searchable.search("http://wwww.youtube.comm");
    }
}
