package u1120;

class Outer{
	class Inner{
		int iv = 100;
	}
}
public class Exercise7_6 {
	// 내부 클래스가 인스턴스 클래스이면 외부 클래스의 객체 생성해주기
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);

	}

}

