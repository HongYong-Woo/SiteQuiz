package LC_C.c_operator;
import java.util.Scanner;
public class Diagnosis4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        --b;
        c = a*b;
        a++;

        System.out.printf("%d %d %d",a,b,c);

    }
}
//Quiz. 두 개의 정수를 입력받아서
//첫 번째수는 후치 증가 연산자를 사용하고
// 두 번째 수는 전치 감소 연산자를 사용하여
// 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.