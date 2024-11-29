package ch15.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<String>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<String>();

        // ArrayList 컬렉션에 저장하는 시간 측정
        long start=System.nanoTime();
        for(int i=0; i<10000; i++){
            list1.add(0, String.valueOf(i));
        }
        long end=System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ",(end-start));

        // LinkedList 컬렉션에 저장하는 시간 측정
        start=System.nanoTime();
        for(int i=0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }
        end=System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ",(end-start));

        // 실행 결과 : LinkedList가 훨씬 빠름
        // Why? -> ArrayList는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문
    }
}
