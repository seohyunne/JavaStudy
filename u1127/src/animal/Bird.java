package animal;

public class Bird extends Animal{
    public void sound(){
        System.out.println("짹잭");
    }
    public void move(){
        System.out.println("날개로 날아간다");
    }
    public Bird(String name, int age){
        this.name=name;
        this.age=age;
    }
}
