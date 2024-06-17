package g_loop_two;

public class loop2_Diagnosis8 {
    public static void main(String[] args) {
        for(int x =2; x<=4 ; x++) {
            for(int y =1 ; y<=5 ; y++) {
                System.out.printf("%d * %d = %2d   ",x,y,y*x);
            }
            System.out.println();
        }
    }
}

//Quiz.구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
//곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
//출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)
//2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10
//3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15
//4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20