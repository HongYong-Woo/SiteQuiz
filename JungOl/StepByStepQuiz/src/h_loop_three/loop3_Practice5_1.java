package h_loop_three;

public class loop3_Practice5_1 {
    public static void main(String[] args) {

        int cnt =1;
        for(int x=1 ; x<=5 ; x++) {
            for(int y=5-x ; y>0 ; y--) {
                System.out.printf(" ");
            }


            for(int y =1; y<=cnt ; y++)
                System.out.printf("*");
            cnt+=2;
            System.out.println();
        }

    }
}

//Quiz.아래와 같이 출력하는 프로그램을 작성하시오.
//    *
//   ***
//  *****
// *******
//*********
