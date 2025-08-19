package inputTest;

import java.util.Scanner;

public class InputSelf {
	public static void main(String[] args) {
//		input값 2개 받아서
//		서로 나누고 실수 3자리 까지 출력
		Scanner sc = new Scanner(System.in);
//		알고리즘
//		1. 메세지 변수 선언
		String message = "두 개의 값을 입력하시오.\nex)5 4.1";
		double num1 = 0.0, num2 = 0.0, result = 0.0;
		
//		2. sc로 숫자 받기
		System.out.println(message);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		sc.close();
		
//		3. 받은 값 2개 나누기
		result = num1 / num2;
		
//		4. 출력
		System.out.printf("%f, %f 나누면 %.3f", num1, num2, result);
	}
}
