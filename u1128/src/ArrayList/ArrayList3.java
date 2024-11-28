package ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // 삽입
        list.add(1,15);  // index 번호 1번에 15 삽입
        // 출력
        System.out.println("ArrayList: " + list);

        // 삭제
        list.remove(1);
        System.out.println("ArrayList: " + list);
    }
}
