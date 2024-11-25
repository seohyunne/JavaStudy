package Ex06.Ex06_06;

public class SoundableExample {
//    Cat cat = new Cat();
//    Dog dog = new Dog();

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

}
