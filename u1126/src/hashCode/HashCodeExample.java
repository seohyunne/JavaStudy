package hashCode;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if(s1.hashCode()==s2.hashCode()){  // 해시코드가 같은지 검사
            if(s1.equals(s2)){
                System.out.println("동등한 객체입니다."); // 데이터가 같은지 검사
            }
            else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        }
        else System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
    }
}
