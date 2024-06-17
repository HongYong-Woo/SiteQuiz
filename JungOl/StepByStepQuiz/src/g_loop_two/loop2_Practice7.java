package g_loop_two;

public class loop2_Practice7 {
    public static void main(String[] args) {
        for(int x =1; x<=5 ; x++) {
            for(int y =0; y<5; y++) {
                System.out.printf("%d ",x);
            }
            System.out.println();
        }
        System.out.println();

        for(int x =1; x<=5 ; x++) {
            for(int y =1; y<=5; y++) {
                System.out.printf("%d ",y);
            }
            System.out.println();
        }
    }
}
//Quiz.아래 출력예와 같이 출력하는 프로그램을 작성하시오.
//1 1 1 1 1
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4
//5 5 5 5 5
//
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5