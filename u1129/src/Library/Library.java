package Library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner input = new Scanner(System.in);

        boolean state = true;
        while(state){
            System.out.println("================ 도서 관리 시스템 ==============");
            System.out.println("1.대출 2.반납 3.조회 4.추가 5.삭제 6.수정 7.종료");
            System.out.println("================================================");
            System.out.print("원하는 작업 선택 >> ");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:{
                    manager.bookLent();
                    break;
                }
                case 2:{
                    manager.bookReturn();
                }
                case 3: {
                    manager.showBookList();
                    break;
                }
                case 4: {
                    manager.bookInsert();
                    break;
                }
                case 5: {
                    manager.bookDelete();
                    break;
                }
                case 6: {
                    manager.bookUpdate();
                }
                case 7:
                    System.out.println("프로그램 종료");
                    input.close();
                    System.exit(0);
            }
        }

    }
}
