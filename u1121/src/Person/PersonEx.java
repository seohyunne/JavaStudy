package Person;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name="홍길동";
		p1.age=30;
		p1.gender="남성";
		
		System.out.println("이름: "+p1.name);
		System.out.println("성별: "+p1.gender);
		System.out.println("나이: "+p1.age);
		
		Person p2 = new Person("김서현","여성",23);
		
	}

}
