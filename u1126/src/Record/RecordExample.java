package Record;

public class RecordExample{
    public static void main(String[] args) {
        Member member= new Member("winter","눈송이",25);

        // getter 메소드 호출
        System.out.println(member.id());
        System.out.println(member.name());
        System.out.println(member.age());
        System.out.println(member.toString());
        System.out.println();

        Member m1 = new Member("winter","눈송이",25);
        Member m2 = new Member("winter","눈송이",25);
        System.out.println("m1 hasCode: "+m1.hashCode());
        System.out.println("m2 hasCode: "+m2.hashCode());
        System.out.println("m1.equals(m2): "+m1.equals(m2));

    }
}
