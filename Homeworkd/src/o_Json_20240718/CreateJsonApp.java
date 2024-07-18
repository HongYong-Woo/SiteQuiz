package o_Json_20240718;

import org.json.JSONObject;

public class CreateJsonApp {

  public static void main(String[] args) {
    JSONObject jsonObject = UtilJson.createJsonData();

    System.out.println(jsonObject);

    UtilJson.parseJsonData(jsonObject);
  }

}
