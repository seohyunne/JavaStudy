package CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CvsRead {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\YONSAI\\Desktop\\전국지역특화거리표준데이터.csv") ;
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
            String line;
            while ((line = br.readLine())!=null) {
                List<String> aLine = new ArrayList<String>();
                String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
                aLine = Arrays.asList(lineArr);
                System.out.println(aLine);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
