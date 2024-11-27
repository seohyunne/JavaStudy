package animal;

public class Fish extends Animal{
    public void sound(){
        System.out.println("..");
    }
    public void move(){
        System.out.println("지느러미로 헤엄친다");
    }
    Fish(String name,int age){
        this.name=name;
        this.age=age;
    }
}
