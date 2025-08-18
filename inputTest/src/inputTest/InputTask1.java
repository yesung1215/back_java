package inputTest;
import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//      사용자에게 정수를 2개 입력 받고,
//      두 수를 더해서 출력하기
//      30 
//      50
//      출력: 80
//      단, 메서드는 .next()만 사용
		Scanner sc = new Scanner(System.in);
		String message = "정수 2개를 입력하시오", int1 = null, int2 = null, sum = "%s + %s = 출력: %d";
		int result = 0;
		
		System.out.println(message);
		int1 = sc.next();
		int2 = sc.next();
		result = Integer.parseInt(int1) + Integer.parseInt(int2);
		
		System.out.printf(sum, int1, int2, result);
	}
}
