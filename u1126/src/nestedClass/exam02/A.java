package nestedClass.exam02;
// 중첩 클래스 - 인스턴스 멤버 클래스

public class A {
    // 인스턴스 멤버 클래스
    class B{
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드
        static int field2 = 2;

        // 생성자
        B(){
            System.out.println("B 생성자 실행");
        }

        // 인스턴스 메소드
        void method1(){
            System.out.println("B method1 실행");
        }
        // 정적 메소드
        static void method2(){
            System.out.println("B method2 실행");
        }
    }

        // 인스턴스 메소드
        void useB(){
            // B 객체 생성 및 인스턴스 필드 및 메소드 사용
            B b = new B();
            System.out.println(b.field1);
            b.method1();

            // B 클래스의 정적 필드 및 메소드 사용
            // 객체 생성 없이 클래스에 바로 접근하여 호출
            System.out.println(B.field2);
            B.method2();


    }
}
