package shape;

public class Circle extends Shape{

    double radius;  // 반지름

    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return radius*radius*Math.PI;
    }
    double round(){
        return 2*Math.PI*radius;
    }
}
