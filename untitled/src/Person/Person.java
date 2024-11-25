package Person;

public class Person {
    // 변수, 필드, 인스턴스 변수
    private static int count; // 현재 사람 수를 저장하는 정젹 변수
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;

        count++;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // 정적변수를 참조하는 메서드는 정적메서드로 선언하기 !
    public static int getTotalCount(){
        return count;
    }

}

// 정적변수(static 변수) - 클래스 변수
// 정적변수는 클래스에 속하고, 객체를 생성하지 않고도 사용 가능
