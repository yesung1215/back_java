package castingTest;

public class CastingTestSelf {
	public static void main(String[] args) {
//		1 + "8.24" + "7.8" 두 값을 더해서 115로 만들어 출력하기
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8", result = "";
//		알고리즘
//		1. 문자열 double로 바꾼 후 int로 강제 형변환
		double dou1 = Double.parseDouble(str1), dou2 = Double.parseDouble(str2);
		int int1 = (int)dou1, int2 = (int)dou2;
//		2. 정수 1 문자로 강제 형변환
		String sNum = String.valueOf(num1);
		result = sNum + (int1 + int2);
		
//		3. 두 정수 최우선연산자로 감싸기
		System.out.println(result);
		
	}
}
