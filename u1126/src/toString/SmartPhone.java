package toString;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company=company;
        this.os=os;
    }

    // Object의 toString 메소드를 재정의
    public String toString(){
        return company +", "+os;
    }
}
