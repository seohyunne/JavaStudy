package json;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json1 {
    public static void main(String[] args) throws IOException {
        try {
            // URL 구성
            StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088");
            urlBuilder.append("/" + URLEncoder.encode("726b5a586873656f313038535372744a", "UTF-8"));  // 인증키
            urlBuilder.append("/" + URLEncoder.encode("json", "UTF-8"));  // 요청 파일 타입 (json)
            urlBuilder.append("/" + URLEncoder.encode("SearchFirstAndLastTrainbyLineServiceNew", "UTF-8"));  // 서비스명
            urlBuilder.append("/" + URLEncoder.encode("1", "UTF-8"));  // 요청 시작 위치
            urlBuilder.append("/" + URLEncoder.encode("5", "UTF-8"));  // 요청 종료 위치

            // 전체 데이터 출력할 때는 홈페이지에 나와 있는 기본 사용 링크 (위에 다섯 줄) 만 써도 되는데,
            // 특정 데이터 추출할 때는 요청 인수 다 있어야 함 !! 그냥 맘 편하게 요청 인수 다 써놓고 시작하자
            urlBuilder.append("/" + URLEncoder.encode("01호선", "UTF-8"));  // 호선 정보
            urlBuilder.append("/" + URLEncoder.encode("1", "UTF-8"));  // 추가 매개변수
            urlBuilder.append("/" + URLEncoder.encode("1", "UTF-8"));  // 추가 매개변수

            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");

            int responseCode = conn.getResponseCode();
            System.out.println("Response code: " + responseCode);

            BufferedReader rd;
            if (responseCode >= 200 && responseCode <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();

            // 응답된 전체 JSON 데이터 출력
            System.out.println(sb.toString());

            // JSON 응답 파싱
            JSONObject jsonResponse = new JSONObject(sb.toString());

            // "SearchFirstAndLastTrainbyLineServiceNew" 안의 데이터에 접근
            if (jsonResponse.has("SearchFirstAndLastTrainbyLineServiceNew")) {
                JSONObject serviceData = jsonResponse.getJSONObject("SearchFirstAndLastTrainbyLineServiceNew");

                // "row" 배열을 추출
                JSONArray rows = serviceData.getJSONArray("row");

                // "LSTTM_HRM" 데이터를 출력
                System.out.println("FSTT_HRM 데이터:");
                for (int i = 0; i < rows.length(); i++) {
                    JSONObject row = rows.getJSONObject(i);
                    String lsttmHrm = row.getString("FSTT_HRM");
                    System.out.println(lsttmHrm);
                }
            } else {
                System.out.println("SearchFirstAndLastTrainbyLineServiceNew 키가 존재하지 않습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
