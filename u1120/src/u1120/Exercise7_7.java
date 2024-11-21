package u1120;

class Outerr{
	static class Inner{
		int iv = 300;
	}
}

public class Exercise7_7 {
	// 내부 클래스가 정적 클래스이므로 외부 객체 선언 XX
	public static void main(String[] args) {
		Outerr.Inner inner = new Outerr.Inner();
		System.out.println(inner.iv);

	}

}
