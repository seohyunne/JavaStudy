package Library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
     // 대여 중인 도서 리스트
    private ArrayList<Book> bookList;
    private ArrayList<Book> rentList;
    Scanner input= new Scanner(System.in);
    
    
    public BookManager(){
        bookList = new ArrayList<>();   // 전체 도서 리스트
        rentList = new ArrayList<>();
        
        // 초기 책 데이터 저장
        bookList.add(new Book("결국 무엇이든 해내는 사람","김상현", 2020, 1));
        bookList.add(new Book("소년이 온다","한강",2019,2));
        bookList.add(new Book("트렌드 코리아 2025","김난도 외",2024,3));
        bookList.add(new Book("채식주의자","한강", 2015, 4));
    }

    // 도서 대출
    public void bookLent(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dff = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        System.out.println("=== 도서 대출 ===");
        System.out.print("대출하려는 책 이름 입력 >> ");
        String name = input.nextLine();
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(name)){    // 입력한 도서가 전체 도서 리스트에 있는지 확인
                if(book.isAvailable()){                    // 입력한 도서가 대출 가능한지 확인
                    book.setAvailable(false);              // '대출중' 으로 변경
                    System.out.println("해당 도서는 대출이 가능합니다.");
                    System.out.println(now.plusDays(7).format(dff)+"까지 반납하세요!");// 일주일 기한 추가하기
                    break;
                }else {
                    System.out.println("해당 도서는 현재 대출이 불가능합니다.");
                }
            }else{
//                System.out.println("입력하신 도서가 존재하지 않습니다.");
            }
        }
    }
    // 도서 조회
    public void showBookList(){
        System.out.println("================= 도서 리스트 ================");
        for(Book book : bookList){
            System.out.println(book);
        }
        System.out.println("==============================================");
    }

    // 도서 추가
    public void bookInsert(){
        Book newBook = new Book();
        newBook.setNumber(bookList.size());
        System.out.println("=== 도서 추가 ===");
        System.out.print("도서명 >>");
        newBook.setTitle(input.nextLine());
        System.out.print("작가명 >>");
        newBook.setAuthor(input.nextLine());
        System.out.print("출판연도 >>");
        newBook.setYear(input.nextInt());

        bookList.add(newBook);
        System.out.println("입력하신 도서를 추가했습니다.");
    }

    // 도서 삭제
    public void bookDelete(){
        int index = searchIndex();   // 삭제할 도서의 인덱스 반환
        if(index==-1){
            System.out.println("해당 도서가 존재하지 않습니다.");
        }else{
            delete(index);
            System.out.println(bookList.get(index).getTitle()+" 삭제 완료!");
        }
    }


    private int searchIndex(){
        int index = -1;
        String title = input.nextLine();
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(index).getTitle().equals(title)){
                index = i;
                break;
            }
        }
        return index;
    }

    private void  delete(int index){
        bookList.remove(index);
    }
}
