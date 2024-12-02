package Library;

public class Book {
    private String title;
    private String author;
    private int year;
    private int number;
    private boolean available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(){
        this.available=true;  // 대여 가능(기본값)
    };

    public Book(String title, String author, int year,int number){
        this.title=title;
        this.author=author;
        this.year=year;
        this.number=number;
        this.available=true;  // 대여 가능(기본값)
    }
    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
        this.available=true;  // 대여 가능(기본값)
    }

    @Override
    public String toString() {
        return "도서번호: " + number + "     " +
                "도서명: " + title + "     "+
                "작가명: " + author + "     " +
                "출판연도: " + year + "     " +
                "대출가능여부: " + (available ? "O" : "X") ;
    }
}
