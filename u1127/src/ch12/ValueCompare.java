package ch12;

public class ValueCompare {
    public static void main(String[] args) {
        // 범위 밖의 수일 경우
        // obj1과 obj2는 같은 값을 가지지만 == 연산자 사용 시 false로 나옴
        // 이 연산은 내부의 값이 아닌 !! 포장 객체의 번지를 비교하기 때문 !! -> 값 비교 시 eqauls()쓰기
        Integer obj1= 300;
        Integer obj2= 300;
        System.out.println("==: " + (obj1==obj2)); // false
        System.out.println("equals(): " + obj1.equals(obj2));  // true
        System.out.println("");

        // 범위 안의 수일 경우
        Integer obj3= 10;
        Integer obj4= 10;
        System.out.println("==: " + (obj3==obj4)); // false
        System.out.println("equals(): " + obj3.equals(obj4));  // true
        System.out.println("");

    }
}
