package Ex08_7;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		 DataAccessObject oracleDao = new OracleDao(); // 인터페이스 타입 참조
	        dbWork(oracleDao);

	        DataAccessObject mySqlDao = new MySqlDao(); // 인터페이스 타입 참조
	        dbWork(mySqlDao);
	}
}	
