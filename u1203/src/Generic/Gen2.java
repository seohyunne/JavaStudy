package Generic;

import java.util.ArrayList;

public class Gen2 {
    public static void main(String[] args) {
        ArrayList<String> piches = new ArrayList();  // 컬렉션
        // 제네릭스로 자료형을 선언하면 그 후로는 형 변환 필요 X
        piches.add("123");
        piches.add("1239");

        String one = piches.get(0);
        String two = piches.get(0);
    }
}
