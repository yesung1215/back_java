package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		정수 + 실수 = 실수 -> 자동 형변환 
		System.out.println(1 + 2.5);
		
//		정수 + 정수 = 정수
		System.out.println(5 + 3);
		
//		정수 / 정수 = 정수
		System.out.println(5 / 2);
//		System.out.println(5.0 / 2);
		
//		정수와 정수를 사칙연산하면 정수가 나옴
		
//		강제 형변환
		int num1 = 5;
		float num2 = (float) num1;
		double num3 = (double) num1;
		
		System.out.println(5 / (double)2); // 최 단 산 쉬 관 리 삼 재 -> 단항이먼저되고 산술됨
		System.out.println((int)(5 / (double)2)); // 괄호 -> 최우선 연산자로 감싸서 처리
		
//		8.43 + 2.59를 더한 값이 10이 되도록 출력(형변환)
		System.out.println((int)8.43 + (int)2.59);
		
		char ch = 'A';
		int num4 = (int) ch;
		System.out.println(num4);
	}
}
