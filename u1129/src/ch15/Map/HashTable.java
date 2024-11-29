package ch15.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        // HashTable 컬렉션 생성
        Map<String,Integer> map = new Hashtable<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            public void run(){
                // 엔트리 1000개 추가
                for(int i=0; i<1000; i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };
        Thread threadB = new Thread(){
            public void run(){
                // 엔트리 1000개 추가
                for(int i=1001; i<=2000; i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        }catch(Exception e){

        }

        // 저장된 총 엔트리 수 얻기
        System.out.println("저장된 총 엔트리 수: "+map.size());
        System.out.println();

    }
}
