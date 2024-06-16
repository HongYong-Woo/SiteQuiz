package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Number? ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        switch (a) {
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
                break;
        }

        br.close();
    }
}
//Quiz. 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
// 해당 번호가 없으면 "I don't know."라고 출력한다.
//개-dog
//고양이-cat
//병아리-chick