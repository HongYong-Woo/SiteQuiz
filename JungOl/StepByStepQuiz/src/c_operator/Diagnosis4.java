package c_operator;
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
