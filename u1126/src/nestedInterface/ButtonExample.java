package nestedInterface;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
        class OkListener implements Button.ClickListener{
            public void onClick(){
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현 객체 주입
        button.setClickListener(new OkListener());

        button.click();

        // Cancel 버튼 객체 생성
        Button cancel = new Button();
        class CancelListener implements Button.ClickListener {
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다");
            }
        }

        cancel.setClickListener(new CancelListener());
        cancel.click();

    }
}
