package Interface.RemoteControl;

public class Television implements RemoteControl {
    private int volume;

    public void turnOn(){
        // 구현 객체 Television에서 재정의한 추상 메소드
        System.out.println("티비를 켭니다.");
    };

    public void turnOff(){
        System.out.println("티비를 끕니다.");
    }

    public void setVolume(int volume){
        this.volume=volume;
        System.out.println("현재 볼륨: "+volume);
    }
}
