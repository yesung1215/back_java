package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter = (num1, num2) -> {System.out.println(num1 + num2);};
		lambdaInter.printAddResult(5, 10);
		
		LambdaInter2 lambdaInter2 = (num1,  num2) -> new CalcResult();
//		LambdaInter2 lambdaInter21 = (num1,  num2) -> {return new CalcResult();};
		
		LambdaInter3 lambdaInter3 = num -> num % 2 == 0;
	}
};
