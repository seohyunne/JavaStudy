package Ex08_7;

public class MySqlDao implements DataAccessObject{
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	public void update() {
		System.out.println("MySql DB에서 수정");
	}
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}
