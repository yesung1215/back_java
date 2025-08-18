package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//      3개의 정수를 한 번에 입력 받은 후
//      세 정수의 곱셈을 출력
//      sc.next()만 사용
		
		String message = "정수 3개를 한번에 입력하시오!\nex)3 5 7", str1 = null, str2 = null, 
				str3 = null, resultMessage = "%d, %d, %d 을(를) 곱하면 %d!!";
		int int1 = 0, int2 = 0, int3 = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		sc.close();
		int1 = Integer.parseInt(str1);
		int2 = Integer.parseInt(str2);
		int3 = Integer.parseInt(str3);
		
		result = int1 * int2 * int3;
		
		System.out.printf(resultMessage, int1, int2, int3, result);
	}
}
