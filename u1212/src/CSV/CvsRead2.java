package CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CvsRead2 {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\YONSAI\\Desktop\\전국대중교통환승센터표준데이터.csv") ;
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
