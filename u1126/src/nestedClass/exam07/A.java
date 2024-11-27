package nestedClass.exam07;
// 바깥 클래스의 객체 접근

public class A {
    // A 인스턴스 필드
    String field = "A field";

    // A 인스턴스 메소드
    void method(){
        System.out.println("A method");
    }

    // 인스턴스 멤버 클래스
    class B{
        String field = "B field";

        void method(){
            System.out.println("B method");
        }

        void print(){
            // B 객체의 필드와 메소드 사용
            System.out.println(this.field);
            this.method();

            // A 객체의 필드와 메소드 사용 - 바깥클래스이름.this
            System.out.println(A.this.field);
            A.this.method();
        }
    }

    // A의 인스턴스 메서드
    void useB(){
        B b = new B();
        b.print();
    }
}
