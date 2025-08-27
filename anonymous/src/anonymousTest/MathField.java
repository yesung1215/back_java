package anonymousTest;

public class MathField {
	public static void main(String[] args) {
//		메서드 구현 후 4개의 메서드 사용
		MathTask mathTask = new MathTask() {
			
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
			
			@Override
			public String concat(String str1, String str2) {
				return str1 + str2;
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				int add = 0;
				int subtract = 0;
				int multiple = 0;
				double devide = 0.0;
				
				add = num1 + num2;
				subtract = num1 - num2;
				multiple = num1 * num2;
				devide = num1 / num2;
				
				CalcResult calcResult = new CalcResult();
				return calcResult;
			}
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println();
	}
}
