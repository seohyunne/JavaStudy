import java.util.Scanner;

public class Ex8_7_Answer {

	public static void main(String[] args) {
		game();
	}
	
	public class InputMismatchException extends Exception{
		public InputMismatchException() {};
		public InputMismatchException(String message) {
			super(message);
		};
	}
	
	static public void game() {
		Scanner input = new Scanner(System.in);
		int count = 0; // 시도 횟수
		int random = (int)(Math.random()*100+1);

		while(true) {
			try {
				count++;
				System.out.print("1과 100사이의 값을 입력하세요: ");
				
				
				if(!input.hasNextInt()) {  // input(입력값)이 숫자인지 확인
					input.next(); // 잘못된 입력 버퍼 제거
					throw new InputMismatchException("유효하지 않은 값입니다.");
				}
					
				
			}
				
			int num = input.nextInt();
				
			if(num>100 || num<1) {
				System.out.println("유효하지 않은 숫자입니다.");
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
	
				
		catch(InputMismatchException e) {
			System.out.println("잘못된 값을 입력했습니다 ");
			continue;
			}

			}
		
	}
}
