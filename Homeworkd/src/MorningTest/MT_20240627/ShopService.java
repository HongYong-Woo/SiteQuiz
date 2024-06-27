package MorningTest.MT_20240627;

//클래스문제 18
public class ShopService {

  private static ShopService singleton = new ShopService();

  private ShopService() {
  }

  static ShopService getInstance() {
    return singleton;
  }


}
