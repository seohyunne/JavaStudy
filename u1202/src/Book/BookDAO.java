package Book;

import java.util.ArrayList;

public class BookDAO {
    private ArrayList<BookDTO> bookList;

    public BookDAO() {
        bookList = new ArrayList<>();   // 전체 도서 리스트

        bookList.add(new BookDTO(0,"결국 무엇이든 해내는 사람", "김상현", 2020));
        bookList.add(new BookDTO(1,"소년이 온다", "한강", 2019));
        bookList.add(new BookDTO(2,"트렌드 코리아 2025", "김난도 외", 2024));
        bookList.add(new BookDTO(3,"채식주의자", "한강", 2015));

    }
}
