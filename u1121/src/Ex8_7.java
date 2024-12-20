// 자바의 정석
import java.util.Scanner;
public class Ex8_7 {

	public static void main(String[] args) {
		try {
			game();
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());	
		}
	}
	public class InputMismatchException extends Exception{
		public InputMismatchException() {};
		public InputMismatchException(String message) {
			super(message);
		};
	}
	
	static public void game() throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		int count = 0; // 시도 횟수
		int random = (int)(Math.random()*100+1);
		while(true) {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			int num = input.nextInt();
			if(num>100 || num<1) {
				System.out.println("1~100 사이의 값을 입력하세요");
			}
			else if(random<num) {
				System.out.println("더 작은 수를 입력하세요");
			}
			else if(random>num){
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(random==num) {
				System.out.println("정답");
				System.out.println("시도 횟수: "+count);
				break; // 맞추면 게임 종료
			}
		}
	}
}



