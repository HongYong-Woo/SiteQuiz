package LC_C.h_loop_three;

public class loop3_Practice2 {
    public static void main(String[] args) {
        for(int x=1; x<=3; x++) {
            for(int y =1; y<=x; y++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

//QUiz.아래 모양과 같이 출력하는 프로그램을 for문을 이용하여 작성하시오.
//*
//**
//***