package ex01_Calculator;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int a = 10;
		int b = 20;
		double x = 10.25;
		double y = 5.4;
		int arr[] = {1,2,3,4,5};

		
		System.out.println(cal.plus(a,b));
		System.out.println(cal.minus(a,b));
		System.out.println(cal.multiple(x,y));
		System.out.println(cal.divide(x,y));
		System.out.println(cal.sum(arr));
		System.out.println(cal.avg(arr));
		
	}

}
