package Generic;

import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        ArrayList piches = new ArrayList();
        piches.add("123");
        piches.add("1239");
        // 제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체는 Object 자료형
        // Object - 모든 객체가 상속하고 있는 가장 기본적인 자료형
        // 자료를 넣을 때는 문제가 없으나 값을 가져올 때는 String으로 형변환 필수

        String one = (String) piches.get(0);
        String two = (String) piches.get(0);
    }
}