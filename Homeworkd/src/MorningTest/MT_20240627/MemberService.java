package MorningTest.MT_20240627;

//클래스문제 15
public class MemberService {

  boolean login(String id, String password) {
    boolean loginCheck = false;
    if(id.equals("hong") && password.equals("12345")) {
      loginCheck = true;
    }
    else
      loginCheck = false;

    return  loginCheck;
  }

  void logout(String id) {
    System.out.printf("%s님이 로그아웃 되었습니다.\n", id);
  }

}
