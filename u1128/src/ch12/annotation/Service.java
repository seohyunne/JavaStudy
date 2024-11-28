package ch12.annotation;

public class Service {
    @PrintAnnotation
    public void method1(){
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*")  // 둘 다 기본값 있으므로 생략 가능
    public void method2(){
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value="#",number=20)
    public void method3(){
        System.out.println("실행 내용3");
    }
}

