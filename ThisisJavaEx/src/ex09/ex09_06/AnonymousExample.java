package ex09.ex09_06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous ano = new Anonymous();

        ano.field.run();
        ano.method1();
        ano.method2(new Vehicle(){
            public void run(){
                System.out.println("트럭이 달립니다.");
            }
        });

    }

}
