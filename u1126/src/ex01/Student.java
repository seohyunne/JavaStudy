package ex01;

public class Student {
    private String name;
    private String studentId;

    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentId;
    }

    public Student(){};

    public Student(String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }

    public String toString(){
        return "이름: "+ name +", 학번"+studentId;
    }
}
