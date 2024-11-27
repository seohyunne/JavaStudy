package Record;

public record Member (String id, String name, int age){
    // 레코드 선언 후 컴파일하면 변수의 타입과 이름을 이용해서 private final 필드,생성자 및
    // Getter 메소드 자동 추가 hashCode(), equals(), toString() 메소드를 재정의한 코드 자동 추가
}

