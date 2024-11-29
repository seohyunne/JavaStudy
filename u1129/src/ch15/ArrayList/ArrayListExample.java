package ch15.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();

        // 객체 추가
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        System.out.println("총 객체 수: "+list.size());
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board b2 = list.get(2);
        System.out.println(b2.getSubject()+", "+b2.getContent()+", "+b2.getWriter());
        System.out.println();

        // 모든 객체 하나씩 가져와서 출력하기 (forEach문)
        for(Board b : list){
            System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());

        }
        System.out.println();
    }
}
