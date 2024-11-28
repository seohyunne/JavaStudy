package ex12;
// 포장 객체는 내부 값을 비교하기 위해 != 와 == 연산자를 사용할 수 없는 것이 원칙이지만,
// 포장 객체의 효율적 사용을 위해 -128~127 범위로는 사용이 가능하다.
// 300은 해당 범위에 포함되지 않으므로 포장 객체의 내부 값이 아닌 번지를 비교하였으므로 false가 출력되었다.
// 값만 비교하려면 equals() 사용 !!
public class ex12_12 {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
    }
}
