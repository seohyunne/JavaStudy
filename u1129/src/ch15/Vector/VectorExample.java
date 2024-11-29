package ch15.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성
        List<Board> list = new Vector<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            public void run(){
                // 객체 1000개 추가
                for(int i=0; i<1000; i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+1));
                }
            }
        };
        Thread threadB = new Thread(){
            public void run(){
                // 객체 1000개 추가
                for(int i=1001; i<2001; i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+1));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드가 모두 종료될 때까지 메인 스레드를 기다리게 함
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e) {
        }

        // 저장된 총 객체 수 얻기
        System.out.println("총 객체 수: "+list.size());

    }
}
