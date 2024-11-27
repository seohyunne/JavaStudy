package ch12.math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);  // seed값 같으면 같은 랜덤값 생성됨. 3과 5는 임의의 숫자이고 변경 가능
              // 만약 다른 배열에서 seed값 3인 랜덤 객체 사용하면 여기랑 같은 값 나오게 됨 (고정값)
        System.out.print("선택 번호: ");
        for(int i=0; i<selectNumber.length; i++){
            selectNumber[i] = random.nextInt(45)+1;
            System.out.print(selectNumber[i]+"  ");
        }
        System.out.println("");

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.print("당첨 번호: ");
        for(int i=0; i<winningNumber.length; i++){
            winningNumber[i] = random.nextInt(45)+1;
            System.out.print(winningNumber[i]+"  ");
        }
        System.out.println("");

        // 당첨 여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);   // 배열 정렬하기
        boolean result = Arrays.equals(selectNumber,winningNumber);
        System.out.println("당첨 여부");
        if(result){
            System.out.println("1등 당첨입니다 !");
        }
        else
            System.out.println("낙첨입니다 !");

    }
}
