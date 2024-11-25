package Interface.Extends;

public class ExtendsExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        InterfaceCImp1 imp1 = new InterfaceCImp1();

        InterfaceA ia = imp1;
        ia.methodA();
        // ia.methodB(); // 구현 객체가 부모 인터페이스 변수에 대입되면 부모 인터페이스에 있는 추상 메소드만 호출 가능

        InterfaceB ib = imp1;
        // ib.methodA()
        ib.methodB();

        InterfaceC ic = imp1;
        // 구현 객체가 자식 인터페이스 변수에 대입되었으므로 부모, 자식 메소드 모두 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
