package ex01_Calculator;

public class Calculator {
	
	public int plus(int a, int b) {
		int result= a+b;
		return result;
	}
	
	public int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public double multiple(double x, double y) {
		double result = x*y;
		return result;
	}
	
	public double divide(double x, double y) {
		double result = x/y;
		return result;
	}
	
	public int sum(int[] arr) {
		int sum=0;
//		for (int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
		for (int i:arr) {
			sum += i;
		}
		return sum;
	}
	
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = sum/arr.length;
		return avg;
	}
	
	
}
