package movie;

import java.util.Scanner;

// Menu 인터페이스를 상속 받은 추상 클래스 AbstractClass
// Menu 인터페이스를 구현하며, 추후 메인메뉴(Mainmenu)와 관리자 메뉴(Adminmenu)의 부모 클래스가 된다
abstract class AbstractMenu implements Menu {
    protected String menuText;  // 기본문구 - 인스턴스 변수
    protected Menu prevMenu;  // 이전메뉴 - 인스턴스 변수

    protected static final Scanner input = new Scanner(System.in);

    public AbstractMenu(String menuText, Menu prevMenu) {
        this.menuText = menuText;
        this.prevMenu = prevMenu;
    }

    public void setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;
    }  // 메뉴를 종료한 후 돌아갈 이전 메뉴 설정

    public void print(){
        System.out.println("\n"+menuText);
    }


}
