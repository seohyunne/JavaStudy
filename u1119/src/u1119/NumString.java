package u1119;
import java.util.Scanner;

public class NumString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.println("한글로 변환할 수 입력하기 >> ");
		int num = input.nextInt();

		arr[0]= num/10000;
		arr[1]= (num/1000)%10;
		arr[2]= (num/100)%10;
		arr[3]= (num/10)%10;
		arr[4]= num%10;
		
		String sum_str ="";
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==1){
				sum_str +="일";
			}
			else if(arr[i]==2){
				sum_str +="이";
			}
			else if(arr[i]==3){
				sum_str +="삼";
			}
			else if(arr[i]==4){
				sum_str +="사";
			}
			else if(arr[i]==5){
				sum_str +="오";
			}
			else if(arr[i]==6){
				sum_str +="육";
			}
			else if(arr[i]==7){
				sum_str +="칠";
			}
			else if(arr[i]==8){
				sum_str +="팔";
			}
			else if(arr[i]==9){
				sum_str +="구";
			}
			
			if (i==0 && arr[0]>=1) {
				sum_str +="만";
			}
			else if(i==1&& arr[1]>=1) {
				sum_str +="천";
			}
			else if(i==2&& arr[2]>=1) {
				sum_str +="백";
			}
			else if(i==3&& arr[3]>=1) {
				sum_str +="십";
			}
		}
		System.out.println(sum_str);
		
	}

}