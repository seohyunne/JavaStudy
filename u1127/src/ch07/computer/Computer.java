package ch07.computer;

public class Computer extends Calculator{
    public double areaCircle(double r){
        System.out.println("Computer 클래스의 areaCircle() 실행");
        return Math.PI * r *r;
    }
}
