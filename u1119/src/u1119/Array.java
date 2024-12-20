package u1119;
import java.util.Scanner;

public class Array {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("배열 크기를 입력하세요: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        System.out.println("배열 요소를 입력하세요:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("원래 배열:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\n 역순 배열");
	        for(int i = size - 1; i >=0; i--){
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println("\n 실제 역순 정렬 배열");
	        for (int i = 0; i < arr.length; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length-1 - i];
	            arr[arr.length-1 - i] = temp;
	            System.out.print(arr[i] + " ");
	        }

	    }
}
