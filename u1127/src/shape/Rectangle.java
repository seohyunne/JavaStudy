package shape;

public class Rectangle extends Shape{
    double width, height;

    public  Rectangle(){
        this(0,0);
    };

    public  Rectangle(double width, double height){
        this.width =  width;
        this.height = height;
    }
    double area(){
        return width*height;
    }
    double round(){
        return 2*(height+width);
    }
}
