package ch12.string;

import java.util.Arrays;

public class BytesToString {
    public static void main(String[] args) throws Exception {
        String data = "자바";

        // String -> byte 배열 (기본: UTF-8 인코딩)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1: "+ Arrays.toString(arr1));

        // byte 배열 -> String (기본: UTF-8 인코딩)
        String str1 = new String(arr1);
        System.out.println("str1: "+str1);


        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2: "+ Arrays.toString(arr1));

        // byte 배열 -> String (기본: UTF-8 인코딩)
        String str2 = new String(arr2);
        System.out.println("str2: "+str2);
    }
}