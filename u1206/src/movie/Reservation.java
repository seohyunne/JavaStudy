package movie;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
    private long id;              // 발급번호
    private long movieId;         // 영화 대표값
    private String movieTitle;    // 영화 제목
    private String seatName;      // 좌석

    private static final File file = new File("C:\\Users\\YONSAI\\Desktop\\java\\seohyunne\\u1206\\src\\reservation.txt");

    public static ArrayList<Reservation> findByMovieId(String movieIdStr) throws IOException {
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] temp = line.split("");
            if (movieIdStr.equals(temp[1])) {   // 대표값이 같은 예매된 영화만 조회
                long id = Long.parseLong(temp[0]);     // 예매 발급번호
                long movieId = Long.parseLong(temp[1]);   // 예매 영화 대표값
                String movieTitle = temp[2];                // 예매 영화 제목
                String seatName = temp[3];                 //  좌석
                Reservation r = new Reservation(movieId, movieTitle, seatName);
                reservations.add(r);
            }

        }
        br.close();
        return reservations;
    }

    public static Reservation cancel(String reservationId) throws IOException {
        Reservation canceled= null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        String text="";
        while((line = br.readLine())!=null){
            String[] temp = line.split(",");
            if(reservationId.equals(temp[0])){
                canceled = new Reservation(
                        Long.parseLong(temp[0]),
                        Long.parseLong(temp[1]),
                        temp[2],
                        temp[3]
                );
                continue;
            }
            text+=line+"\n";
        }br.close();
        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
        return canceled;
    }

    public static Reservation findById(String reservationId) throws IOException{
        Reservation r  = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while ((line = br.readLine()) != null){
            String[] temp = line.split(",");
            if(reservationId.equals(temp[0])){
                r = new Reservation(
                        Long.parseLong(temp[0]), //발급번호
                        Long.parseLong(temp[1]), // 영화 대푯값
                        temp[2], // 영화 제목
                        temp[3] // 좌석명
                );
                break; //반복탈출
            }
        }
        br.close(); //입력 흐름 해제
        return r;
    }


    public long getId() {
        return id;
    }

    public long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatName() {
        return seatName;
    }

    public Reservation(long id, long movieId, String movieTitle, String seatName) {
        this.id = id;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    public Reservation(long movieId, String movieTitle, String seatName) {
        this.id = Instant.now().toEpochMilli();     // 예약 대표값(Id) 현재 시간을 밀리세컨드로 바꾼 값
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    public String toString() {
        return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
    }

    public void save() throws IOException{
        FileWriter fw = new FileWriter(file, true); // 이어쓰기(append) 모드 설정(true)
        fw.write(this.toFileString() + "\n");
        fw.close();
    }

    private String toFileString() {
        return String.format("%d,%d,%s,%s",id, movieId, movieTitle,seatName);
    }
}
