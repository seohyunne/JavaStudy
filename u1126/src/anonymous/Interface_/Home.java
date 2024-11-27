package anonymous.Interface_;

public class Home {
    // 필드에 익명 객체 대입
    private RemoteControl rc = new RemoteControl(){
        public void turnOn(){
            System.out.println("Tv를 켭니다");
        }
        public void turnOff(){
            System.out.println("Tv를 끕니다");
        }
    };  // 익명 객체 세미콜론 필수 !

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드 (로컬 번수 이용)
    public void use2(){
        // 로컬 변수에 익명 객체 대입
        RemoteControl rc = new RemoteControl(){
            public void turnOn(){
                System.out.println("에어컨을 켭니다");
            }
            public void turnOff(){
                System.out.println("에어컨을 끕니다");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
