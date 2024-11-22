package Shopping;

public class Product {
    private String name;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0)
            this.price=0;
        else
            this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock<0){
            this.stock=0;
        }else this.stock = stock;
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toStr(){
        return String.format("제품명: %s , 가격: %f , 재고: %d",name,price,stock);
    }

    public void addStock(int amount){
        if(amount<0)
            System.out.println("재고 추가 실패! 음수 값은 허용되지 않습니다.");
        else{
            stock+=amount;
            System.out.println(amount+"개의 재고가 추가되었습니다.");
        }

    }
    
    public void sellProduct(int amount){
        if(amount<0)
            System.out.println("판매 실패! 음수 값은 허용되지 않습니다.");
        else if(amount>stock)
            System.out.println("재고가 부족합니다. 구매 가능 수량: "+stock);
        else{
            stock-=amount;
            System.out.println(amount+"개 판매 완료. 남은 수량 :"+stock+"개");
        }
    }
}


