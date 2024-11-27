package nestedClass.exam01;

public class AExample {
    public static void main(String[] args) {
        // B 객체를 A 클래스 외부에 생성하려면?
        // 1. default 또는 public 접근 제한을 가져야 한다.
        // 2. A 겍체를 먼저 생성한 다음 B 객체를 생성해야 한다.

        A a = new A();

        A.B b = a.new B();

    }
}
