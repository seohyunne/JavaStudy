package ch15.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 객체를 하나씩 가져와서 리턴
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for(String element : set){
            System.out.println(element);
        }
    }
}
