import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean status = true;
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.println("이름을 입력하세요");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("exit")) break;

            else if(list.contains(name)){
                System.out.println("저장된 이름: "+list);
                System.out.println("'"+name+"' 이 목록에 존재합니다.");
            }
            else if ((list.contains(name)==false)){
                System.out.println("목록에 없으므로 추가합니다.");
                list.add(name);
            }
        }

    }
}
