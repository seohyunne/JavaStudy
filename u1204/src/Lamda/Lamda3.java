package Lamda;

//import java.util.
import java.util.Arrays;
import java.util.List;

public class Lamda3 {
    public static void main(String[] args) {
        // 컬렉션과 람다식
        List<String> names = Arrays.asList("apple","banana","kiwi");

        // 모든 요소 출력
        for(String name : names){
            System.out.println(name);
        }
    }
}
