package ch12.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");
        for(String token: arr){
            System.out.println(token);
        }
        System.out.println("");

        String data2 = "홍길동,이수홍,박연수";
        StringTokenizer st = new StringTokenizer(data2, ",");
        while (st.hasMoreTokens()){   // 남아 있는 문자열이 있는 동안 반복
            String token = st.nextToken();  // nextToken() - 문자열 하나씩 가져옴
            System.out.println(token);
        }
    }
}
