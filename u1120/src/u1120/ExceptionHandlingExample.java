package u1120;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] arr = {"100", "1oo"};
		
		for (int i=0; i<arr.length+1; i++) {
			try {
				int value = Integer.parseInt(arr[i]);
				System.out.println("array["+i+"]: "+arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과 "+ e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 불가능 "+ e.getMessage());
			}
		}
	}

}
