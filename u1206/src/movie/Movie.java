package movie;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
    private long id;
    private String title;   // 영화 제목
    private String genre;  // 영화 장르


    public Movie(String title, String genre) {
        this.id = Instant.now().getEpochSecond(); //타임스탬프;
        this.title = title;
        this.genre = genre;
    }

    public static ArrayList<Movie> findAll() throws IOException {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while((line=br.readLine())!= null){  // 파일을 한 행씩 읽어와서 반복 (데이터가 존재할 때까지)
            String[] temp = line.split(",");   // 한 행을 , 기준으로 나눠서 temp[0], [1], [2] 에 각각 저장
            Movie m = new Movie(
                    Long.parseLong(temp[0])
                    ,temp[1],temp[2]);

            movies.add(m);      // movies 리스트에 객체 추가
        }
        br.close();
        return movies;
    }

    // 객체 생성하지 않아서 static 붙음
    public static Movie findById(String movieIdStr) throws IOException{
        Movie movie = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while((line=br.readLine())!= null) {  // 파일을 한 행씩 읽어와서 반복 (데이터가 존재할 때까지)
            String[] temp = line.split(",");   // 한 행을 , 기준으로 나눠서 temp[0], [1], [2] 에 각각 저장
            if (movieIdStr.equals(temp[0])) { // 입력한 ID랑 데이터 ID값 비교
                movie = new Movie(
                        Long.parseLong(temp[0])
                        , temp[1], temp[2]);
                break; // 영화 발견하면 탈출 (더이상 찾지 않아도 됨)
            }
        }
        br.close();
        return movie;
    }

    public static void delete(String movieIdStr) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line = null;

        while ((line = br.readLine()) != null){
            String[] temp = line.split(",");
            if(movieIdStr.equals(temp[0])){// 삭제 대상값을 찾으면
                continue; //다음 반복으로 넘어감(복사되지 않게)
            }
            text += line + "\n"; // 읽은 문자열을 누적하여 복사
        }
        br.close(); //입력 흐름 해제
        FileWriter fw = new FileWriter(file); // FileWriter 객체 생성(덮어쓰기 모드)
        fw.write(text); // 파일 출력
        fw.close(); // 출력 흐름 해제
    }

    public void save() throws IOException{
        FileWriter fw = new FileWriter(file, true);
        //이어쓰기(append) 모드 설정 (true)
        fw.write(this.toFileString()+"\n");
        fw.close();
    }
    //객체정보를 문자열로 변환
    private String toFileString() {
        return String.format("%d,%s,%s",id, title, genre);
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    private static final File file = new File("C:\\Users\\YONSAI\\Desktop\\java\\seohyunne\\u1206\\src\\movies.txt");

    public Movie(long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("[%d] : %s(%s)",id, title, genre);
    }
}
