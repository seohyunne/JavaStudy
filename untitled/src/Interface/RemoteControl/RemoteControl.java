package Interface.RemoteControl;

public interface RemoteControl {
    // 인터페이스에서 선언된 필드는 모두 public static final 성질을 가짐
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 (인터페이스에서는 선언부만 가지고, 인터페이스 구현 객체는
    // 추상 메소드의 실행부를 갖는 재정의된 메소드를 반드시 가져야 한다
    public void turnOn();
    public void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드 : 완전한 실행 코드를 가진 메소드    ** 구현 객체 필요
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
            setVolume( MIN_VOLUME);
        }else{
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드 (구현 객체 없이 인터페이스 명으로 접근하여 호출 가능)
    // - 상수 필드를 제외한 추상 메소드, 디폴트 메소드, private 메소드는 호출 불가
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다.");
    }


}
