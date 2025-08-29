package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
//		8.43 + 2.59를 더한 값이 10이 되도록 출력(형변환)
		double num1 = 8.43, num2 = 2.59;
		int result = 0;
		
		result = (int)num1 + (int)num2 ;
		
		System.out.printf("%.2f + %.2f = %d로 강제로 형변환", num1, num2, result);
//		암호화는 프론트가 아닌 백엔드에서 하는것!
		
//`		자동형반환 
//		문자형 + 정수 = 정수
		System.out.println('A' * 100);
		System.out.println((char)('A' * 100));
	}
}
