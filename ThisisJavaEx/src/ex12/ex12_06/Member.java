package ex12.ex12_06;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id=id;
        this.name=name;
    }


    public String toString(){
        return id+": "+name;
    }



}
