package nestedClass.exam01;

public class A {
    class B {}

    // 인스턴스 필드값으로 B 객체 대입
    B field = new B();

    // 생성자
    A(){
        B b = new B();
    }

    void method(){
        B b = new B();
    }
}
