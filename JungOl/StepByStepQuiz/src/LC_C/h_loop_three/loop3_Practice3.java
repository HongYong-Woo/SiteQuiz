package LC_C.h_loop_three;

public class loop3_Practice3 {
    public static void main(String[] args) {

        for(int y =0; y<3; y++) {
            for(int z =0; z<=y; z++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for(int y =3; y>0; y--) {
            for(int z =y; z>0; z--) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
//Quiz.아래 모양과 같이 출력하는 프로그램을 for문을 이용하여 작성하시오.
//*
//**
//***
//***
//**
//*