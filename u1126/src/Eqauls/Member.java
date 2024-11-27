package Eqauls;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    // object는 모든 클래스의 조상 --> object의 eqauls() 메소드 재정의

    public boolean equals(Object obj){
        // obj가 Member 타입인지 확인하고, 맞으면 obj를 Member 타입으로 변환하여 target에 저장
        if(obj instanceof Member target){
            // this.id와 target.id가 같은 값을 가지는지 확인
            if(id.equals(target.id))
                return true;
        }
        return false;
    }

}
