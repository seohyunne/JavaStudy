package u1119;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int money = input.nextInt();
		
		System.out.println("오만원권 : "+money/50000+"매");
		money = money %50000;
		System.out.println("만원권 : "+money/10000+"매");
		money = money %10000;
		System.out.println("오천원권 : "+money/5000+"매");
		money = money % 5000;
		System.out.println("천원권 : "+money/1000+"매");
		money = money % 1000;
		System.out.println("오백원권 : "+money/500+"매");
		money = money % 500;
		System.out.println("백원권 : "+money/100+"매");
		money = money % 100;
		System.out.println("오십원권 : "+money/50+"매");
		money = money % 50;
		System.out.println("십원권 : "+money/10+"매");
		money = money % 10;
		System.out.println("오원권 : "+money/5+"매");
		money = money % 5;
		System.out.println("일원권 : "+money/1+"매");
		money = money % 1;
	}

}
