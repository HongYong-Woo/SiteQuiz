package l_Exception1_20240709.Prob2;

public class CellPhone {

  /** 핸드폰 모델 번호 */
  private String model;

  /** 남은 배터리 양 */
  private double battery;

  /** 모델명을 입력 받는 생성자 */
  public CellPhone(String model) {
    this.model = model;
  }

  /**
   * 통화
   * 통화시간 time
   */
  public void call (int time) {
    try {
      if(time<0)
        throw new IllegalArgumentException("통화 시간 입력 오류");
      System.out.println("통화 시간 : " + time + "분");
      this.battery -= time* 0.5f;

      if(this.battery <0)
        this.battery =0;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
  /**
   * 배터리 충전
   * 충전시간 time
   */
  public void charge(int time) {
    try {
      if(time<0)
        throw new IllegalArgumentException();
      System.out.println("충전 시간 : " + time + "분");
      this.battery += time * 3;

      if (this.battery > 100)
        this.battery = 100;
    } catch (IllegalArgumentException e) {
      System.out.println("충전 시간 입력 오류");
    }
  }

  /** 남은 배터리양 출력 */
  public void printBattery() {
    System.out.printf("남은 배터리 양 : %.1f\n", this.battery);
  }
}