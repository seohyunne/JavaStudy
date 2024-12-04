package Lamda;

import java.util.Arrays;
import java.util.List;

public class Lamda4 {
    public static void main(String[] args) {
        // 컬렉션과 람다식
        List<String> names = Arrays.asList("apple","banana","strawberry");

        names.sort((s1,s2)-> s2.compareTo(s1));
        System.out.println("내림차순 정렬: "+names);

        names.sort(String:: compareTo);
        System.out.println("오름차순 정렬: "+names);
    }
}
