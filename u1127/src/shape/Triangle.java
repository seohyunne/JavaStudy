package shape;

public class Triangle extends Shape{
    double width, height;

    public Triangle(){
        this(0,0);
    };

    public  Triangle(double width, double height){
        this.width =  width;
        this.height = height;
    }
    double area(){
        return width*height/2;
    }
    double round(){
        return width*3;
    }
}
