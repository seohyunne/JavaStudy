// 이것이 자바다
package u1120;

import java.util.Scanner;
public class Ex5_9 {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;    // 학생 수
		int[] scores = null;   // 점수
		
		Scanner input = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			int choice = Integer.parseInt(input.nextLine());
				
			if(choice==1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(input.nextLine());
				scores = new int[studentNum];
			}
			else if(choice==2) {
				for(int i=0;i <scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = Integer.parseInt(input.nextLine());
				}
			}
			else if(choice==3) {
				for(int i=0;i <scores.length; i++) {
					System.out.println(scores[i]);
				}
			}
			else if(choice==4) {
				// 최고 점수 구하기
				int max = scores[0];
				for (int n : scores) {
					max = Math.max(max, n);
				}
				// 평균 점수 구하기
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
				}
				double average = sum / scores.length;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+average);
			}
			else if(choice==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
