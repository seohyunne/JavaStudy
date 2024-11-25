package Interface.RemoteControl;

public class RemoteControExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        RemoteControl audio = new Audio();

//        rc.turnOn();

        // 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버이므로 인터페이스로 바로 접근하여 상수값 읽기 가능
        System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: "+RemoteControl.MIN_VOLUME);

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        audio.turnOn();
        audio.setVolume(1);
        audio.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        audio.setMute(true);
        audio.setMute(false);
    
        // 정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
