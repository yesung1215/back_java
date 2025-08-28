package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
//	사칙연산의 결과를 출력하는 메서드
	public void showCalcResult(CalcResult calcResult) {
		System.out.println(calcResult.getSum());
		System.out.println(calcResult.getSubtract());
		System.out.println(calcResult.getDevide());
		System.out.println(calcResult.getMultiple());
	}
	
	public static void main(String[] args) {
		// LambdaInter2 구현하기
		// 두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드	
		LambdaTask lt = new LambdaTask();
		LambdaInter2 lambdaInter2 = (num1, num2) -> {
			CalcResult calcResult = new CalcResult();
			calcResult.setSum(num1 + num2);
			calcResult.setSubtract(num1 - num2);
			calcResult.setDevide(num1 / (double)num2);
			calcResult.setMultiple(num1 * num2);
			return calcResult;
		};
//		System.out.println(lambdaInter2.calc(50, 10).getSum());
//		System.out.println(lambdaInter2.calc(50, 10).getSubtract());
//		System.out.println(lambdaInter2.calc(50, 10).getDevide());
//		System.out.println(lambdaInter2.calc(50, 10).getMultiple());
		
		
		lt.showCalcResult(lambdaInter2.calc(50, 10)); // 매번 출력하고 싶을때 재사용 가능
		
	}
}
