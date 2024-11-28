package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        //특정요소확인
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");


        System.out.println("일단 출력 : "+ list);

        Collections.sort(list);
        System.out.println("정렬 후 출력 : "+list);

        Collections.reverse(list);
        System.out.println("역순 정렬 후 출력 : "+list);
    }
}
