package Ex08.Ex08_05;

public class Tv implements Remocon{
    public void powerOn(){
        System.out.println("Tv를 켰습니다.");
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.powerOn();
    }
}
