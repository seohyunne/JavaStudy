package ex12;

public class ex12_10 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<100;i++){
            sb.append(i+1);
        }
        System.out.println(sb.toString());
    }
}
