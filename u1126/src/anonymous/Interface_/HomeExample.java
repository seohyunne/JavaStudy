package anonymous.Interface_;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();
        
        home.use2();

        // 익명 구현 객체가 대입된 매개변수 사용
        home.use3(new RemoteControl(){
            public void turnOn(){
                System.out.println("난방을 켭니다");
            }
            public void turnOff(){
                System.out.println("난방을 끕니다");
            }  
        });
    }
}
