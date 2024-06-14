package b_input;

public class input_Diagnosis5 {
    public static void main(String[] args) {
        float yd = 2.1f;
        float inch = 10.5f;

        System.out.printf("%4.1fyd = %5.1fcm\n", yd,yd*91.44);
        System.out.printf("%.1fin = %5.1fcm", inch, inch*2.54);
    }
}

//Quiz. 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
//2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
