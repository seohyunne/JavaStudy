package Coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Coffee {
    // 싱글톤
    private static Coffee instance;
    private Coffee(){};

    public static Coffee getInstance(){
        if(instance==null){   // 객체가 아직 생성되지 않았을 경우
            instance = new Coffee();   // 객체 생성
        }
        return instance;
    }

    // 메뉴 리스트로 저장
    ArrayList<String> coffeeList;
    ArrayList<Integer> coffeePrice;
    Map<String,Integer> menu;

    public void getMenu(){
        menu = new LinkedHashMap<String,Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();

        coffeeList.add("아메리카노");
        coffeeList.add("카푸치노");
        coffeeList.add("캬라멜 마끼아또");
        coffeeList.add("바닐라라떼");
        coffeeList.add("카페라떼");
        coffeeList.add("카페모카");
        coffeeList.add("헤이즐넛라떼");
        System.out.println(coffeeList);

        coffeePrice.add(2000);
        coffeePrice.add(4500);
        coffeePrice.add(5000);
        coffeePrice.add(5000);
        coffeePrice.add(4000);
        coffeePrice.add(4500);
        coffeePrice.add(5000);

        for (int i=0; i<coffeeList.size();i++){
            menu.put(coffeeList.get(i),coffeePrice.get(i));
        }
        DecimalFormat f = new DecimalFormat("0,000원");
        StringBuffer sb = new StringBuffer();
        sb.append("\n\n")
                .append("===========================================\n")
                .append("================== 메뉴판 =================\n")
                .append("========= menu ============ price =========\n");
        System.out.println(sb.toString());
        int s = 1;
        for(Entry<String, Integer> get : menu.entrySet()){
            System.out.printf("| [%d번] %-20s\t: %s      |\n"
                    , s, get.getKey(), f.format(get.getValue()));
            s++;
        }
        System.out.println("+-------------------------------------------------+\n");




    }

}
