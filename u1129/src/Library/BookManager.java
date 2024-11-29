package Library;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> bookList = new ArrayList<>();   // 전체 도서 리스트
    private ArrayList<Book> rentList = new ArrayList<>();   // 대여 중인 도서 리스트

    // 초기 책 리스트 만들기



    public void bookLent(String name){
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(name)){    // 입력한 도서가 전체 도서 리스트에 있는지 확인
                if(book.isAvailable()){                    // 입력한 도서가 대출 가능한지 확인
                    book.setAvailable(false);              // '대출중' 으로 변경
                    System.out.println("해당 도서는 대출이 가능합니다.");
                    System.out.println("대출 완료! 일주일 이내로 반납하세요.");    // 일주일 기한 추가하기
                }else {
                    System.out.println("해당 도서는 현재 대출이 불가능합니다.");
                }
            }else{
                System.out.println("입력하신 도서가 존재하지 않습니다.");
            }
        }
    }
    
}
