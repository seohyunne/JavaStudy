package ch07.airplane;

public class SupersonicAirplane extends Airplane{
    // 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    
    // 상태 필드 선언
    public int flyMode = NORMAL;
    
    public void fly(){
        if(flyMode==NORMAL)
            // Airplane 객체의 fly()메소드 호출
            super.fly();
        else
            System.out.println("초음속 비행합니다.");
    }
    
}
