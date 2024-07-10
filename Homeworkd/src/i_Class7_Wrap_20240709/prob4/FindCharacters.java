package i_Class7_Wrap_20240709.prob4;


public class FindCharacters {


	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
    String[] arrString = str.split("");
		int cnt =0;
    for(String s : arrString) {
      if(s.equals(Character.toString(c))) {
        cnt ++;
      }
    }


    return cnt;
	}
}
