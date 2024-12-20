package Ex6_Student;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){};
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		 return name+","+ban+","+no+","+kor+","+eng+","+math+","
	+(kor+eng+math)+","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
	}
	
	public int getTotal() {
		return kor+eng+math;
	}

	public float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
	
}
