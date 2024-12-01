package Library;

import java.util.ArrayList;

public class BookManager {
     // 대여 중인 도서 리스트
    private ArrayList<Book> bookList;
    private ArrayList<Book> rentList;
    public BookManager(){
        bookList = new ArrayList<>();   // 전체 도서 리스트
        rentList = new ArrayList<>();

        bookList.add(new Book("결국 무엇이든 해내는 사람","김상현",1));
        bookList.add(new Book("소년이 온다","한강",2));
        bookList.add(new Book("트렌드 코리아 2025","김난도 외",3));
        bookList.add(new Book("채식주의자","한강",4));
    }

    public void bookLent(String name){
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(name)){    // 입력한 도서가 전체 도서 리스트에 있는지 확인
                if(book.isAvailable()){                    // 입력한 도서가 대출 가능한지 확인
                    book.setAvailable(false);              // '대출중' 으로 변경
                    System.out.println("해당 도서는 대출이 가능합니다.");
                    System.out.println("대출 완료! 일주일 이내로 반납하세요."); // 일주일 기한 추가하기
                    break;
                }else {
                    System.out.println("해당 도서는 현재 대출이 불가능합니다.");
                }
            }else{
                System.out.println("입력하신 도서가 존재하지 않습니다.");
            }
        }
    }

    public void showBookList(){
        System.out.println("===== 도서 리스트 =====");
        for(Book book : bookList){
            System.out.println(book);
        }
        System.out.println("=======================");
    }
    
}
