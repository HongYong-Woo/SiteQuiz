package o_Json_20240718;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData()  {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */
    JSONObject productInfo = new JSONObject();
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("Tshirt", 50000);

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("1", "마트료시카");
    productInfo.put("extra", extra_product_info);
    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_list = new JSONArray();
    item_list.put("빨간옷");
    item_list.put("파란옷");
    item_list.put("초록옷");
    productInfo.put("item", item_list);

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
    JSONObject item_listJson = new JSONObject();
    item_listJson.put("2", item_list);
    productInfo.put("list", item_listJson);

    try {
      Writer writer = new FileWriter("C:/Study/shirt.json", StandardCharsets.UTF_8);
      String productInfoValue = productInfo.toString();
      writer.write(productInfoValue);
      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return productInfo;
  }

  public static void parseJsonData(JSONObject jsonObject) {

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    JSONObject parseRoot = jsonObject;

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */  //???

    String parseRootString = parseRoot.toString();


    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    int shirtPrice = parseRoot.getInt("Tshirt");
    System.out.println("Tshirt : " + shirtPrice);
    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    String product_info = parseRoot.getJSONObject("extra").getString("1");
    System.out.println(product_info);
    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JSONArray item_list = parseRoot.getJSONArray("item");
    for(int n=0; n< item_list.length() ; n++) {
      System.out.println("item : " + item_list.get(n));
    }

}

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */


    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */


      /**
       * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
       * product_no, product_name
       */


      /**
       * value로 Json을 가지는 프로퍼티 조회.
       * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
       */


      /**
       * value로 Array를 가지는 프로퍼티 조회.
       * item_list를 꺼낼 때, JSONArray로 캐스팅.
       */

        /**
         * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
         * [참고] 각 원소의 키가 다를 경우 유용하다.
         */

  }


public static String jsonToString(JSONObject jsonObject) {
  return jsonObject.toString();
}


}
