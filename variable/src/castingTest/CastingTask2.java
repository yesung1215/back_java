package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//		1 + "8.24" + "7.8" 두 값을 더해서 115로 만들어 출력하기
//		int num1 = 1;
		String s1 = "8.24", s2 = "7.8", s3 = "1";
		String result = null;
		
		double dNum1 = Double.parseDouble(s1);
		int intNum1 = (int)dNum1;
		
		double dNum2 = Double.parseDouble(s2);
		int intNum2 = (int)dNum2;
//		int s1 = (int)Double.parseDouble(s1);
//		int s2 = (int)(Double.parseDouble(s2));
		result = s3 + (intNum1 + intNum2);
//		result = num1 + (Integer.parseInt(s1) + Integer.parseInt(s2));
		
		
		System.out.println((result));
	}
}
