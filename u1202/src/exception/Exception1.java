package exception;

import java.io.*;
import java.io.BufferedReader;

public class Exception1 {
    public static void main(String[] args) {
        // 파일 입출력
        // 파일이 존재하지 않거나 읽기/쓰기 권한이 없을 대 발생하는 예외

        try{
            File file = new File("example.text");
            if(file.exists()){
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while((line=br.readLine()) !=null){
                    System.out.println(line);
                }
                br.close();
            }else{
                System.out.println("파일을 찾을 수 없습니다.");
            }

        }catch(FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다."+e.getMessage());
        }catch (IOException e){
            System.out.println("파일을 읽는 도중 오류가 발생했습니다."+e.getMessage());
        }
    }
}
