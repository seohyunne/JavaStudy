package Stream;


import java.util.ArrayList;
import java.util.List;

//회원 (Member) 객체에 '남자' 회원의 평균 나이를
//외부 반복자를 이용하는 방법과 , 내부 반복자 람다식 스트림을 적용하는
//방법으로 코딩하시오
public class Stream3 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member m1 = new Member("박태호",Member.MALE,30);
        Member m2 = new Member("김연경",Member.FEMALE, 29);
        Member m3 = new Member("손유일", Member.MALE, 32);
        Member m4 = new Member("안재홍", Member.MALE, 27);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        // 1. 외부 반복자
        // index 값을 사용한 for문
        int count = 0;
        double sum = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getGender == Member.MALE){
                sum+=list.get(i).getAge();
                count++;
            }
        }double ageAvg1 = sum/count;
        System.out.println("남자 회원의 평균 나이: "+ageAvg1+"세");

        // 2. 내부 반복자

        double ageAvg2 = list.stream()
                .filter(m->m.getGender() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 회원의 평균 나이: "+ageAvg2+"세");
    }
}

// 내부 반복자 부연설명
// 1. list.stream()  : 리스트를 스트림으로 변환
// 2. 성별이 남성인 회원만 필터링 -> 중간 연산
// 3. 회원 객체를 나이로 매칭 - mapToInt() : 객체를 int값으로 변환
// 4. IntStream 생성
// 5. getAsDouble(): 평균값을 double형태로 반환