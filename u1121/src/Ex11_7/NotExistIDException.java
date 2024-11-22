package Ex11_7;
// 이것이 자바다

// 존재하지 않는 ID 입력 시 NotExistIDException 예외 발생
public class NotExistIDException extends Exception{
	public NotExistIDException() {};   // 기본 생성자
	public NotExistIDException(String message) {
		super(message);
	}
}
