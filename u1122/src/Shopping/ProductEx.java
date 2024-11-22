package Shopping;

public class ProductEx {
    public static void main(String[] args) {
        Product laptop = new Product("노트북",1200000,10);

//        System.out.println("제품명: "+laptop.getName());
//        System.out.println("가격: "+laptop.getPrice());
//        System.out.println("재고: "+laptop.getStock());
        System.out.println(laptop.toStr());

        laptop.setPrice(-500);
        System.out.println("수정된 가격: "+laptop.getPrice());

        laptop.addStock(5);
        System.out.println("수정된 재고: "+laptop.getStock());

        laptop.sellProduct(10);
    }
}
