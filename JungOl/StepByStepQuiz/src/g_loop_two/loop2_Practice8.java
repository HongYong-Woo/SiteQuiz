package g_loop_two;

public class loop2_Practice8 {
    public static void main(String[] args) {
        for(int x =1; x<=9 ; x++) {
            for(int y =2 ; y<=4 ; y++) {
                System.out.printf("%d * %d = %2d   ",y,x,y*x);
            }
            System.out.println();
        }
    }
}

//Quiz.아래와 같이 2단부터 4단까지의 구구단을 출력하는 프로그램을 작성하시오.
//2 * 1 =  2   3 * 1 =  3   4 * 1 =  4
//2 * 2 =  4   3 * 2 =  6   4 * 2 =  8
//2 * 3 =  6   3 * 3 =  9   4 * 3 = 12
//2 * 4 =  8   3 * 4 = 12   4 * 4 = 16
//2 * 5 = 10   3 * 5 = 15   4 * 5 = 20
//2 * 6 = 12   3 * 6 = 18   4 * 6 = 24
//2 * 7 = 14   3 * 7 = 21   4 * 7 = 28
//2 * 8 = 16   3 * 8 = 24   4 * 8 = 32
//2 * 9 = 18   3 * 9 = 27   4 * 9 = 36