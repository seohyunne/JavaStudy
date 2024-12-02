package exception;

public class Exception2 {
    public static void main(String[] args) {
        String[] names = {"kim","lee","Park","Choi"};
        try{
            System.out.printf("0번 인덱스 요소:%s\n",names[0]);
            System.out.printf("1번 인덱스 요소:%s\n",names[1]);
            System.out.printf("2번 인덱스 요소:%s\n",names[2]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("시스템 접근이 잘못되었습니다.");
        }finally{
            System.out.println("예외 발생 여부 상관 없이 항상 수행");
        }
    }
}
