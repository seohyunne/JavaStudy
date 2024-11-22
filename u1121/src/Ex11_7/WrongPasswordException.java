package Ex11_7;

// 잘못된 패스워드를 입력하면 WrongPasswordException 예외 발생
public class WrongPasswordException extends Exception {
	public WrongPasswordException() {};
	public WrongPasswordException(String message) {
		super(message);
	}
}
