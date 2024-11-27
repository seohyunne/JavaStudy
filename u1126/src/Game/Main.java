package Game;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        pikachu.energy=100;
        pikachu.type="전기";
        pikachu.level=5;

        System.out.println("######## 피캬츄 ########");
        System.out.println("에너지: "+pikachu.energy);
        System.out.println("타입: "+pikachu.type);
        System.out.println("레벨: "+pikachu.level);
        System.out.println(""+pikachu.aAttack());
    }
}
