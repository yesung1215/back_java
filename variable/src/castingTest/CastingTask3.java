package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {
//		      String.valueOf(값);
//		      어떤 값을 문자열로 형변환시켜주는 메서드
		      
		      char a = 'a', j = 'j', k = 'k';
//		      모두 대문자로 바꿔서 출력
//		      아스키코드
//		      'A', 'J', 'K'
		      int A = 0, lowerA = 0, gap = 0, upperA = 0, upperJ = 0, upperK = 0;
		      char charA = ' ', charJ = ' ', charK = ' ';
//		      초기값 설정============================================================
		      A = 'A' * 1;
		      lowerA = a * 1;
		      gap = lowerA - A;
		      upperA = a - gap;
		      charA = (char)upperA;
		      upperJ = j - gap;
		      charJ = (char)upperJ;
		      upperK = k - gap;
		      charK = (char)upperK;
		      
		      String result = "%c, %c, %c";
		      
//		      System.out.println(A); //65
//		      System.out.println(lowerA); //97
//		      System.out.println(aski);
//		      System.out.println(charA);
//		      System.out.println(charJ);
//		      System.out.println(charK);
		      System.out.printf(result, charA, charJ, charK);
	}
}
