package Directory;

import java.io.File;

public class DirectoryEx {
    public static void main(String[] args) {
        File dir = new File(".");   // "." - 현재 작업중인 디렉토리 위치
        String list[] = dir.list();  // 현재 디렉토리에 포함된 파일과 폴더 이름을 문자열 배열에 반환
        if(list != null){
            System.out.println("디렉토리 목록: ");
            for (String fileName : list){
                System.out.println(fileName);
            }
        }
    }

}
