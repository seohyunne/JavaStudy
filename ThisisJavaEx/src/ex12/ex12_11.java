package ex12;

import java.util.StringTokenizer;

public class ex12_11 {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";

        StringTokenizer st = new StringTokenizer(str,",");


        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
