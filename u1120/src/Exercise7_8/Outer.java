package Exercise7_8;

public class Outer {
	int value = 10;
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
					
		} 
	} // Inner 클래스 끝
} // Outer 클래스 끝

