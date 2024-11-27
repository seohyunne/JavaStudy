package animal;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        
        int index = 0;
        while(true){
            // 배열이 꽉 차면 종료
            if(index==animals.length)
                break;
            
            System.out.println("1. Dog  2. Bird  3. Fish");
            System.out.print("> ");
            int animal = input.nextInt();
            input.nextLine( );
            System.out.print("이름 > ");
            String name = input.nextLine();
            System.out.print("나이 > ");
            int age = input.nextInt();

            switch(animal){
                case 1:
                    animals[index++]=new Dog(name,age);
                    break;
                case 2:
                    animals[index++]=new Bird(name,age);
                    break;
                case 3:
                    animals[index++]=new Fish(name,age);
                    break;
                default:
                    System.out.println("잘못된 입력값입니다.");
            }
        }

        for(int i=0; i<animals.length;i++){
            animals[i].sound();
            animals[i].move();
        }

    }
}
