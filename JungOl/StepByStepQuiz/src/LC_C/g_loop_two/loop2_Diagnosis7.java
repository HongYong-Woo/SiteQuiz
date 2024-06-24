package LC_C.g_loop_two;

public class loop2_Diagnosis7 {
    public static void main(String[] args) {
        for(int x =1 ; x<=5; x++) {
            int num = x+1;
            for(int y = 1; y<=5 ; y++) {
                System.out.printf("%d ",num);
                num++;
            }
            System.out.println();
        }
    }
}

//Quiz.아래와 같이 출력되는 프로그램을 작성하시오.
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9
//6 7 8 9 10