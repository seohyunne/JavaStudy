package student;

public class StudentDTO {

    private int id;
    private String name;
    private int num;
    private int kor;
    private int eng;

    public StudentDTO(int id, String name, int num, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    private int math;

    public StudentDTO(){};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return
                "id: "+ id+
                "  이름: " + name +
                "  나이: " + num +
                "  국어: " + kor +
                "  영어: " + eng +
                "  수학: " + math;
    }
}


