package nestedInterface;
// 중접 인터페이스 : 클래스의 멤버로 선언된 인터페이스
// 암시적인 static이므로 항상 바깥 객체 없이 인터페이스 사용 가능

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener{
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    // Button이 클릭되었을 때 실행할 메소드
    public void click(){
        this.clickListener.onClick();
    }
}
