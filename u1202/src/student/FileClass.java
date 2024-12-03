package student;

import java.io.*;

public class FileClass {
    private File file;
    private String dir;
    private String fileName;

    public FileClass(){
        file = new File("c:\\");
        //기본 생성자로, 기본디레토리 c:\ 로 설정
    }
    public FileClass(String dir, String fileName) {
        file = new File("c:\\"+dir+"\\"+fileName+".txt");
        this.dir = "c:\\"+dir;
        this.fileName = fileName + ".txt";
        //디렉토리 경로와 파일 이름을 받아서 파일 객체를 초기화 합니다.
        //디렉토리가 없는 경우 디레토리도 생성합니다.
    }

// 파일 입출력 시 예외 처리 필수 ~~
    public void create() throws Exception {
        boolean exist = check(file);
        if(exist){
            file.delete();           // 파일 삭제
            file.createNewFile();          // 기본 제공 메서드 : 새로운 파일 생성
        }else{
            file = new File(dir);       // c:\\dir
            file.mkdir();                // 기본 제공 메서드 : 디렉토리(폴더) 생성
            file = new File(dir+"\\"+fileName);    // c:\\student\\studentGrade.txt
            file.createNewFile();   // 새로운 파일 생성
        }
    }

    // 파일의 존재 여부를 확인하는 메서드
    private boolean check(File file) {
        if(file.exists()){   // exists() - file클래스에서 제공하는 메서드 : 파일이 존재하면 true를 리턴
            return true;
        }
        return false;
    }

    public void write(String str) throws Exception{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();
    }

    public void read() throws Exception{
        boolean exist = check(file);
        if(exist){
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while ((str = bw.readLine()) !=null) {
                System.out.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 없습니다.");
        }
    }


    // file = c:\\student\\studentGrade.txt
    // dir = c:\\student
    // fileName = studentGrade.txt



}

