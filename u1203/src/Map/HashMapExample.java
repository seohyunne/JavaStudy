package Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        
        // 삽입 - put()
        hm.put("삼십",30);
        hm.put("십",10);
        hm.put("이십",20);
        hm.put("사십",40);

        System.out.println("맵에 저장된 키들의 집합: "+hm.keySet());
        for(String key: hm.keySet()){
            System.out.println(String.format("키: %s , 값: %d",key,hm.get(key)));    // 순서가 맘대로 나옴
        }

        System.out.println();

        // 삭제 - remove(key);
        hm.remove("삼십");

        Iterator<String> keys = hm.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(String.format("키: %s , 값: %d",key,hm.get(key)));
        }

        for(String key: hm.keySet()){
            System.out.println(String.format("키: %s , 값: %d",key,hm.get(key)));
        }
        System.out.println();

        // 요소의 개수 - size()



        // HashMap - 키와 값 한 쌍으로 데이터 저장
        // 각 데이터는 고유한 키(key)와 이에 대응하는 값(value)로 구성
        // 순서 없음
        // 중복 허용
        // null 허용
        // 동기화 되지 않음
        // 시간 복잡도 : 평균
        
    }
}
