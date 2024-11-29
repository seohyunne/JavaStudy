package ch15.HashSet;

public class Member {
    public String name;
    public int age;

    public Member(String name,int age) {
        this.name = name;
        this.age = age;
    }

    // 이름과 나이가 동일하다면 동일한 해시코드가 리턴
    public int hashCode(){
        return name.hashCode()+age;
    }
    
    // 이름과 나이가 동일하면 true 리턴
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            return target.name.equals(name) && (target.age==age);
        }else return false;
    }
}

