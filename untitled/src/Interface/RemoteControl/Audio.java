package Interface.RemoteControl;

public class Audio implements RemoteControl {
    private int volume;
    private int preVolume;

    public void turnOn(){
        // 구현 객체 Audio에서 재정의한 추상 메소드
        System.out.println("오디오를 켭니다.");
    }
    
    public void turnOff(){
        System.out.println("오디오를 끕니다.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("현재 볼륨: "+volume);
    }

    // 디폴트 메소드 재정의 (default 떼고 public 붙이기)
    public void setMute(boolean mute){
        if(mute){
            preVolume=volume;
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("무음 해제합니다.");
            setVolume(preVolume);
        }
    }
}
