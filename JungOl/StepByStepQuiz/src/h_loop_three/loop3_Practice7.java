package h_loop_three;

public class loop3_Practice7 {
    public static void main(String[] args) {
        int num =1;
        char c = 'a';

        for(int x=0 ; x<4 ; x++) {
            for(int y=0; y<=x ; y++) {
                System.out.printf("%c ", c++);
            }
            for(int y=4-x ; y>0 ; y--) {
                System.out.printf("%d ", num++);
            }
            System.out.println();
        }
    }
}

//Quiz.for문을 이용하여 다음과 같이 출력하는 프로그램을 작성하시오.
//a 1 2 3 4
//b c 5 6 7
//d e f 8 9
//g h i j 10
