package Lamda;

// 함수형 인터페이스
interface Calculator{
    int sum(int a, int b);
}

public class Lamda2 {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;    // 각 요소를 합산
        
        int result = mc.sum(3,4);
        System.out.println((result));
    }
}
