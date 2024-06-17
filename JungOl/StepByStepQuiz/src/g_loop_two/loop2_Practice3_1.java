package g_loop_two;

public class loop2_Practice3_1 {
    public static void main(String[] args) {
        for(int n =1; n<=20;n++) {
            if(n%2 !=0)
                System.out.printf("%d ",n);
        }

        //연습문제 3-2
        int num=1;
        while (true) {
            if(num %2 !=0)
                System.out.printf("%d ",num);

            num++;

            if(num >20)
                break;
        }
    }
}
//Quiz. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램을 작성하시오.