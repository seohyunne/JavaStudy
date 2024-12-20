package u1119;
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random random = new Random();
		
		// 랜덤한 숫자를 생성하는 클래스를 객체로 생성 !
		// 배열의 인덱스 i에 0~99 사이의 랜덤 숫자 넣기
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		
		for (int n : numbers) {
			System.out.println(n + " ");
			
		}
		
		int max = numbers[0];
		int min = numbers[0];
		for (int n : numbers) {
			max = Math.max(max, n);
			min = Math.min(min, n);
		}
		System.out.println("최댓값 :" + max);
		System.out.println("최솟값 :" + min);
	}

}
