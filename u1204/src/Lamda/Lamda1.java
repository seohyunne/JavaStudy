package Lamda;



public class Lamda1 {
    public static void main(String[] args) {
        Calculable mc = (int a, int b)-> a + b;
        int result = mc.sum(3,5);
        System.out.println((result));
    }
}
