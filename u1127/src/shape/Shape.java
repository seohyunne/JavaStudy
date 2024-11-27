package shape;

public abstract class Shape {

    Point point;

    // 넓이와 둘레를 구하는 메소드 원형을 정의하시오

    abstract double area ();
    abstract double round (            );

    public Point getPoint(){
        return point;
    }
    public void setPoint(Point point){
        this.point = point;
    }
}
