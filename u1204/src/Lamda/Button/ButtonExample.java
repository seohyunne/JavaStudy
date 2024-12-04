package Lamda.Button;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼 활성화");
        });

        btnOk.click();

        Button btnCancel = new Button();

        btnCancel.setClickListener(()-> {
            System.out.println("Cancel 버튼 활성화");
        });

        btnCancel.click();
    }
}
