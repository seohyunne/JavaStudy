package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap 컬렉션 생성
        TreeMap<String,Integer> tm = new TreeMap<>();

        // 엔트리 저장
        tm.put("apple",10);
        tm.put("forever",60);
        tm.put("ever",50);
        tm.put("zoo",80);
        tm.put("guess",70);
        tm.put("cherry",30);

        // 맵에 저장된 키들의 집합
        System.out.println("맵에 저장된 키: "+tm.keySet());

        // 알파벳 순서로 자동 정렬되어 출력
        for(String key : tm.keySet()){
            System.out.println(String.format("키: %s 값: %d",key,tm.get(key)));
        }


        TreeMap<String,Integer> tm1 = new TreeMap<>();

        // 엔트리 저장
        tm1.put("ㄷㄷㄷ",10);
        tm1.put("ㅅㅅㅅㅅ",60);
        tm1.put("ㄴㄴㄴ",50);
        tm1.put("ㄱㄱㄱ",80);
        tm1.put("ㅋㅋㅋㅋ",70);
        tm1.put("ㅇㅇㅇ",30);

        // 맵에 저장된 키들의 집합
        System.out.println("맵에 저장된 키: "+tm1.keySet());

        // 가나다 순으로 자동 정렬되어 출력
        for(String key : tm1.keySet()){
            System.out.println(String.format("키: %s 값: %d",key,tm1.get(key)));
        }
    }
}
