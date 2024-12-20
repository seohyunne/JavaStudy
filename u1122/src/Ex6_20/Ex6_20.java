package Ex6_20;
import java.util.Scanner;

public class Ex6_20 {

	public static void main(String[] args) {
		
		BankApplication bankApplication = new BankApplication(); 
		Account Account = new Account();
		
		Scanner input = new Scanner(System.in);
		int totalMoney = 0;
		boolean state = true; 
		int count = 0; // 배열 인덱스
		
		
		while(state) {
			
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 2. 계좌목록 3.예금 4.출금 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int choice = input.nextInt();
			input.nextLine(); // *** 추가: 입력 버퍼 비우기 ***
			
			if(choice ==1) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				// 입력 받기 시작
				System.out.print("계좌번호: ");
				String account = input.nextLine();
				
				System.out.print("이름: ");
				String name = input.nextLine();
				System.out.print("초기 입금액: ");
				int firstInput = input.nextInt();
				totalMoney+=firstInput;  // 계좌 잔액에 초기 입금액 더하가
				input.nextLine(); // *** 추가: 입력 버퍼 비우기 ***
				System.out.println("결과: 계좌 생성 완료!");
				
				bankApplication.Account[count]=account;
				bankApplication.Name[count]=name;
				bankApplication.TotalMoney[count]=totalMoney;
				
				count++;
				totalMoney=0;  // 이거 안하면 계좌 생성하고 목록 확인했을 때 금액이 누적됨 !! 주의
				
			}
			else if(choice==2) {
				if(count!=0) {
					System.out.println("-------");
					System.out.println("계좌목록");
					System.out.println("-------");
					for(int i=0; i<count; i++) {
						System.out.print(bankApplication.Account[i]+"   ");
						System.out.print(bankApplication.Name[i]+"   ");
						System.out.println(bankApplication.TotalMoney[i]);
					}
	
				}
				else {
					System.out.println("조회할 계좌가 없습니다.");
				}
			}
			
			else if(choice==3) {
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				
				System.out.print("계좌번호: ");
				String account = input.nextLine();
				for (int i=0; i<count; i++) {
					if(bankApplication.Account[i].equals(account)) {
						System.out.print("예금액: ");
						int inputMoney = input.nextInt();    // 예금액
						input.nextLine(); // *** 추가: 입력 버퍼 비우기 ***
						bankApplication.TotalMoney[i] += inputMoney;
					}
					else {
						System.out.println("해당 계좌가 존재하지 않습니다.");
						break;
					}
					
				}
			}
			
			else if(choice==4) {
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				
				System.out.print("계좌번호: ");
				String account = input.nextLine();
				
				for (int i=0; i<count; i++) {
					if(bankApplication.Account[i].equals(account)) {
						System.out.print("출금액: ");
						int outputMoney = input.nextInt();    // 출금액
						input.nextLine(); // *** 추가: 입력 버퍼 비우기 ***
						
						if(bankApplication.TotalMoney[i]<outputMoney)
							System.out.println("출금 금액이 잔고보다 많습니다.");
						else {
							bankApplication.TotalMoney[i] -= outputMoney;
							System.out.println("출금이 성공되었습니다. 현재 잔액: "+bankApplication.TotalMoney[i]);
						}		
					}
					else {
						System.out.println("해당 계좌가 존재하지 않습니다.");
					}
				}
			}
			else if(choice==5) {
				state=false;
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println("1~5사이의 숫자를 입력하세요");
			}
		}

	}


}
