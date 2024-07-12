package AllQuiz;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

//1181번 단어정렬
public class WordSort_1181 {

  public static void main(String[] args) throws IOException {

    Comparator<String> MyComp = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int result = (o1.length() - o2.length());
        if (o1.length() == o2.length()) {
          result = (o1.compareTo(o2));
        }
        return result;
      }
    };

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    TreeSet<String> stringSet = new TreeSet<>(MyComp);
    for (int n = 0; n < cnt; n++) {
      stringSet.add(br.readLine());
    }
    for (String s : stringSet) {
      System.out.println(s);
    }
    br.close();
    ;
  }
}
//Quiz.알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//단, 중복된 단어는 하나만 남기고 제거해야 한다.

//Input
//첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000)
// 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
// 주어지는 문자열의 길이는 50을 넘지 않는다.

//Output
//조건에 따라 정렬하여 단어들을 출력한다.