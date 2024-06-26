
/** 20240624 복습테스트 풀어보기 */
public class HomeworkBasic {

  public static void main(String[] args) {

    HomeworkBasic hwb = new HomeworkBasic();
    hwb.method17();
  }

  public static void method1() {
    System.out.println("1번");
    System.out.println("java  /   .class");
  }

  public  void method2() {
    System.out.println("2번");
    System.out.println("Shape.java\nShape");
  }

  public  void method3() {

    System.out.println("3번");
    System.out.println("(sum>100) ? 100 : 0");
  }

  public  void method4() {
    System.out.println("4번");
    System.out.println("(1), (2)");
  }

  public  void method5() {
    System.out.println("5번");
    System.out.println("(1) int height;\n(2) double size = 0.25;");
    System.out.println("(3) char c = 'a';\n(4) String name = \"우홍용\"");
  }
  public  void method6() {
    System.out.println("6번");
    int k = 10;
    int j = 20;
    int result = k + j;
    System.out.printf("public class SampleProgream { \nint k = 10;\nint j = 20;\n int result = k+j;");
    System.out.printf("public static void main(String[] args) { \nSystem.out.println(result); }}\n");
    System.out.println("main()과 println에 ;가 빠짐");

  }

  public  void method7() {
    System.out.println("7번");
    System.out.println("SampleProgram.java");
  }

  public  void method8() {
    System.out.println("8번");
    System.out.println("javac");
  }

  public  void method9() {
    System.out.println("9번");
    System.out.println("java");
  }

  public  void method10() {
    System.out.println("10번");
    System.out.println("(1) X\n(2) X\n(3) X\n(4) O");
  }

  public  void method11() {
    System.out.println("11번");
    System.out.println("Scanner");
  }

  public  void method12() {
    System.out.println("12번");
    System.out.println("Extend");
  }

  public  void method13() {
    System.out.println("13번");
    System.out.println("오버로딩");
  }

  public  void method14() {
    System.out.println("14번");
    System.out.println("int");
  }
  public  void method15() {
    System.out.println("15번");
    System.out.println("int add(int a, int b, int c) {return a+b+c;}");
  }
  public  void method16() {
    System.out.println("16번");
    for(int i=1; i<10; i+=2) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public  void method17() {
    System.out.println("17번");
    int sum=0;
    for(int i =1; i<=15 ; i++) {
      sum +=i;
    }
    System.out.println("1) sum +=i\n2) " + sum);
  }
}
