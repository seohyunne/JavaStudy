package Library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner input = new Scanner(System.in);

        boolean state = true;
        while(state){
            System.out.println("===== 도서 대여 시스템 ====");
            System.out.println("1.대출 2.반납 3.조회 4.종료");
            System.out.println("===========================");
            System.out.print("원하는 작업 선택 >> ");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:{
                    System.out.print("대출하려는 책 이름 입력 >> ");
                    String name = input.nextLine();
                    manager.bookLent(name);
                }
                case 4:
                    System.out.println("프로그램 종료");
                    break;
            }
        }

    }
}
