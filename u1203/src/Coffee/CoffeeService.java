package Coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false;     // 고객의 추가 주문 여부
    private String orderName = "";
    Scanner input = new Scanner(System.in);

    public CoffeeService(){
        orderList = new LinkedHashMap<>();    // 고객 주문 저장
    }

    Coffee coffee = Coffee.getInstance();   // 커피 메뉴를 관리하는 싱글톤 객체
                                            // 싱글톤은 getInstance()로 객체 생성
    Customer customer;

    // 지연 클래스
    Thread t = new Thread();
    Map<String,Integer> orderList;

    public void start(){
        System.out.println("어서오세요");
        System.out.println("연세IT커피숍입니다");
        customer = new Customer(orderName);
        coffee.getMenu();  // 메뉴판

        order();
        totalOrder(customer);
    }



    private void order() {
        System.out.println("\n 취소를 원하시면 0번을 눌러주세요");

        end: while(true){
            try{
                // 기본 주문
                System.out.println("원하시는 음료의 번호를 선택해주세요");
                String choice = input.next();
                int choiceNum = Integer.parseInt(choice.substring(0,1)); // 한글자만 추출해서 숫자로 변경

                if(choiceNum ==0){
                    System.out.println("주문을 취소합니다.");
                    System.exit(0);
                }
                input.nextLine();
                String coffeeName = coffee.coffeeList.get(choiceNum-1);
                System.out.print("선택한 음료는 "+coffeeName+"입니다. 몇 잔 주문하시겠습니까? >>");
                int orderCount = input.nextInt();
                input.nextLine();

                // 재주문
                if(reOrder){
                    for(String coffee : orderList.keySet()){ㅅ
                        if(coffee.equals(coffeeName)){
                            int addCount = orderList.get(coffee).intValue() + orderCount;
                            // 똑같은 메뉴를 또 주문하면 이전 주문 리스트의 수량을 불러와서 재주문한 수량과 더한다.
                            orderList.replace(coffeeName,addCount);      // 주문 리스트에서 변경
                        }
                        else{
                            orderList.put(coffeeName,orderCount);
                            break;
                        }
                        // 추가주문 메서드
                        addOrder();
                        customer.setCoffeeOrder(orderList);
                        break end; // end로 빠져나감
                    }
                }
            }catch(Exception e){
                System.out.println("숫자가 유효하지 않습니다.");
                continue;
            }

        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n주문을 계속 하시겠습니까?");
        System.out.println("예(Y) / 아니요(N)");
        String answer = input.nextLine();
        if (answer.equals('예') || answer.equalsIgnoreCase("y")) {
            coffee.getMenu();
            reOrder = true;
            order();
        } else if (answer.equals("아니오") || answer.equalsIgnoreCase("n")) {
            return;
        }
    }

    private void totalOrder(Customer customer) {
         int s = 1;
         int totalMoney = 0;
         int coffeePrice = 0;

        DecimalFormat f = new DecimalFormat("###,000원");
        String name = customer.getOrderName() + "번 ";
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|             " + name + "고객님 의 주문 내역 입니다         | " + "\n");
        for(Map.Entry<String,Integer> order: customer.getCoffeeOrder().entrySet()){
            coffeePrice = coffee.menu.get(order.getKey()).intValue();
            customer.getCoffeeOrder().get(order.getKey()).intValue();
        }
    }
}





// LinkedHashMap<>()
// 입력 순서 또는 접근 순서 보장
// 속도는 약간 느림
// 순서가 중요한 경우에 쓰임
