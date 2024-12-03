package Coffee;

import java.util.Map;

public class Customer {

    private String orderName; // 주문번호

    private Map<String, Integer> coffeeOrder;   // 주문한 커피와 금액을 담을 map 선언

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOrderName() {
        return orderName;
    }

    public Map<String, Integer> getCoffeeOrder() {
        return coffeeOrder;
    }

    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    int money;

    public Customer(String s){
        orderName = s;
        this.money = 300000;
    }
}
