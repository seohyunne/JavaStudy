package ch12;

// nanoTime()
public class MeasureRunTimeExample {
    public static void main(String[] args) {
        // 계산 후 시간 - 계산 전 시간으로 계산하는 데에 걸린 시간 구하기
        long time1 = System.nanoTime();
        int sum=0;
        for(int i=0; i<1000000; i++){
            sum+=i;
        }
        long time2= System.nanoTime();
        System.out.println("1부터 1000000까지 합: "+sum);
        System.out.println("총 소요 시간:" + (time2-time1));
    }
}
