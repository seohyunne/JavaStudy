package Stream;

public class Member {
    public static int MALE = 0;
    public static int FEMALE = 0;
    public int getGender;
    // 클래스 변수는 클래스명.변수명 으로 바로 접근 가능

    private String name;
    private int gender;
    private int age;

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}
