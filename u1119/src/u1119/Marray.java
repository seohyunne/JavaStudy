package u1119;
import java.util.Scanner;

public class Marray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] scores = new int[3][3];
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("학생 %d의 국어, 영어, 수학 점수 입력 : ", i+1);
			for(int j=0; j<scores[i].length; j++) {
				scores[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum+=scores[i][j];
			}
			double avg = sum/ scores[i].length;
			System.out.printf("학생%d의 총점, %d, 평균: %.2f\n",i+1, sum, avg);
		}
		
		// 총점 전체 평균
		int totalSum = 0;
		int totalInwon = 0;
		for (int i=0; i<scores.length; i++) {
			totalInwon+=1;
			for(int j =0; j<scores[i].length; j++) {
				totalSum = totalSum + scores[i][j];
			}
		}
		System.out.println("총 인원 : "+totalInwon);
		System.out.println("점수 총합 : "+totalSum);
		System.out.println("전체 평균 : "+totalSum/totalInwon);
		

	}

}



