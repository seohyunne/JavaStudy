package Exercise7_8;

public class Exercise7_8 {

	public static void main(String[] args) {
		Outer outer = new Outer();    // 외부 객체 생성
		
		Outer.Inner inner = outer.new Inner();
		
		inner.method1();

	}

}
