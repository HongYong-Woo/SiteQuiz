
//프로그래머스 코딩테스트 입문 삼각형의 완성조건(2)
public class Conditions_for_Completion_of_a_Triangle2 {

  public static void main(String[] args) {
    int[] arrInt = new int[]{11, 7};

    System.out.println(solution(arrInt));
  }

  public static int solution(int[] sides) {
    int answer = 0;
    int num = Math.abs(sides[0] - sides[1]);
    if (sides[0] > sides[1]) {
      for (int n = num + 1; n <= sides[0]; n++) {
        answer++;
      }
      num = sides[0] + sides[1];
      for (int n = sides[0] + 1; n < num; n++) {
        answer++;
      }
    } else {
      for (int n = num + 1; n <= sides[1]; n++) {
        answer++;
      }
      num = sides[0] + sides[1];
      for (int n = sides[1] + 1; n < num; n++) {
        answer++;
      }
    }
    return answer;
  }
}
