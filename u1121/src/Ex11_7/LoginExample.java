package Ex11_7;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception{
		// id가 blue가 아니면 NotExistIDException 발생
		if (id.equals("blue")) {
			throw new NotExistIDException("존재하지 않는 아이디입니다.");
		}
		// password가 12345 아니면 WrongPasswordException 발생
		if (password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 올바르지 않습니다");
		}
	}

}
