package n_Json_20240718;

import org.json.JSONObject;

public class CreateJsonApp {

  public static void main(String[] args) {
    JSONObject jsonObject = UtilJson.createJsonData();

    //System.out.println(jsonObject);
    System.out.println(UtilJson.jsonToString(jsonObject));
    UtilJson.parseJsonData(jsonObject);
  }

}
