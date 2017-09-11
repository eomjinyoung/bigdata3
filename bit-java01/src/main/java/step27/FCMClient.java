/* FCM 서버에 메시지를 전송
 * 
 */
package step27;

import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class FCMClient {
  public static void main(String[] args) throws Exception {
    //=> FCM 서버에 접속할 URL 준비
    //URL url = new URL("https://fcm.googleapis.com/fcm/send");
    
    //=> URL에 접속
    //HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
    
    //=> POST로 데이터를 보내고 받겠다고 설정한다.
    //con.setDoOutput(true);
    //con.setDoInput(true);
    
    //=> 출력 스트림을 준비한다.
    //OutputStream out = con.getOutputStream();
    
    //=> 보낼 데이터를 준비한다.
    //   FCM 서버로 데이터를 보낼 때는 JSON 형식의 문자열로 보내야 한다.
    /*   예)
    { "data": {
      "score": "5x1", <-- 보낼 데이터
      "time": "15:10" <-- 보낼 데이터 
    },
    "to" : "메시지를 받은 상태편 토큰 값"
    */
    //=> 직접 JSON 문자열을 만드는 것은 매우 번거롭기 때문에
    //   우리는 Map 객체에 데이터를 담고, JSON 라이브러리를 사용하여 
    //   Map 객체에 저장된 데이터를 JSON 문자열로 바꿀 것이다.
    Map<String,Object> message = new HashMap<>();
    
    //=> 메시지를 받을 상대편 토큰 값 저장 
    message.put("to", "dQ_NnNUrFww:APA91bGke4M87MneVw0ckgwabDMH8zfgQnvHthX_DdZKEZJS0vMQh67eZGuMc-pDpEAJCL1uQyP-WBO7UqwuXkTtO7Kb9O_HQG2Bz2btau0vTWRL1dQvQLaDurR8PgfQECuTzLV-iu5-");
    
    //=> 상대편에서 보낼 데이터
    Map<String,Object> data = new HashMap<>();
    data.put("name", "홍길동");
    data.put("age", "20");
    
    //=> message에 data를 담는다.
    message.put("data", data);
    
    //=> message 객체에 저장된 값을 JSON 문자열로 뽑아낸다.
    //   구글 gson 라이브러리를 이용하여 JSON 문자열을 뽑는다.
    String json = new Gson().toJson(message);
    
    System.out.println(json);
    
  }
}






