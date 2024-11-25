package StudentHw;

public class StudentHw {
    public static void main(String[] args) {
        Student student = new Student("홍길동",20231234,90,85,92);


//        System.out.println(student.name); // private 접근 제한자이므로 접근 불가 !

        System.out.println("이름: "+student.getName());
        System.out.println("학번: "+student.getNumber());
        System.out.println("국어: "+student.getKor());
        System.out.println("수학: "+student.getMath());
        System.out.println("영어: "+student.getEng());
        System.out.println("평균: "+student.getAvg());



    }
}
