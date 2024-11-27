package animal;

public class Dog extends Animal{
    public void sound(){
        System.out.println("멍멍");
    }
    public void move(){
        System.out.println("네 발로 걷는다");
    }
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
}
