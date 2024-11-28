package ex12.ex12_05;

public class Student {
    private int studentNum;

    public Student(String StudentNum){
        this.studentNum = studentNum;
    };

    public int getStudentNum(){
        return studentNum;
    }

    public int hashCode(){

        return studentNum;
    }
    public boolean equals(Object obj){
        return false;
    }

}
