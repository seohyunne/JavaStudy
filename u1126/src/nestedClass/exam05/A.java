package nestedClass.exam05;
// 로컬 클래스 : 생성자나 메소드 내부에 선언된 클래스
// 생성자와 메소드가 실행되는 동안에만 객체 생성 가능

// 로컬 변수는 final 특성을 갖게 되므로 읽기만 가능 -> 즉 수정 불가 !!

public class A {
    void useB(){
        class B{
            // 인스턴스 필드
            int field1= 1;

            // 정적 필드
            static int field2 = 2;

            B(){
                System.out.println("B 생성자 실행");
            }

            void method1(){
                System.out.println("B 메소드 1 실행");
            }

            static void method2(){
                System.out.println("B 메소드 2 실행");
            }
        }
        // 로컬 객체 생성
        B b = new B();

        // 로컬 객체의 인스턴스 필드와 메소드 사용
        System.out.println(b.field1);
        b.method1();

        // 로컬 객체의 정적 필드와 메소드 사용
        System.out.println(B.field2);
        B.method2();
    }
}
