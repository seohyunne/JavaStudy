package ch12.math;

public class MathExample {
    public static void main(String[] args) {

        double v1 = Math.ceil(5.3);  // 올림 6
        double v2 = Math.floor(5.3);  // 버림 5
        System.out.println(v1+", "+v2);

        long v3 = Math.max(3,7);
        long v4 = Math.min(3,7);
        System.out.println(v3+", "+v4);

        // 소수 둘째 자리에서 반올림
        // 100 곱해서 반올림하고 다시 100.0으로 나누기
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v5 = temp2/100.0;
        System.out.println(v5);
    }
}
