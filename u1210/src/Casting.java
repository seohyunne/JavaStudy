import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("넓이 계산을 원하는 도형을 선택하세요");
        System.out.println("1.원\t 2.사각형\t 3.삼각형");
        int shape = input.nextInt();
        Shape shapeObject = new Shape("");
        double area = 0;

        switch(shape){
            case 1:
                System.out.print("반지름 >> ");
                double radius = input.nextDouble();
                area = shapeObject.calculateArea(radius);
                break;

            case 2:
                System.out.println("가로 >> ");
                double width = input.nextDouble();
                System.out.println("세로 >> ");
                double height = input.nextDouble();
                area = shapeObject.calculateArea(width,height);
                break;

            case 3:
                System.out.println("밑변 >> ");
                double base = input.nextDouble();
                System.out.println("높이 >> ");
                double triHeight = input.nextDouble();
                area = shapeObject.calculateArea(base,triHeight,true);
                break;
            default:
                System.out.println("잘못된 입력값입니다.");
                return;
        }
        System.out.println(shapeObject.getRender()+"의 넓이: "+area);
    }
}

class Shape{
    private String render;
    public Shape(String render){
        this.render = render;
    }

    public String getRender() {
        return render;
    }

    public double calculateArea(double radius){
        this.render="circle";
        return Math.PI * Math.pow(radius,2);
    }

    public double calculateArea(double width,double height){
        this.render="rectangle";
        return width*height;
    }

    public double calculateArea(double width, double height, boolean isTriangle){
        if(isTriangle){
            this.render="triangle";
            return width*height*0.5;
        }
        return 0; // 심긱형이 아닐 경우 기본값 반환
    }



}


