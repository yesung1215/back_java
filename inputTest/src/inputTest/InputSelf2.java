package inputTest;

import java.util.Scanner;

public class InputSelf2 {
//		세 정수 받아서
//		정수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		알고리즘
//		1. 메세지 변수 담기
		String message = "정수 세 개 입력하삼\nex)5 4 1";
		int int1 = 0, int2 = 0, int3 = 0, result = 0;
//		2. 메세지 출력
		System.out.println(message);
//		3. input값 받기 (정수로) , 정수값 초기화(상단에)
		int1 = sc.nextInt();
		int2 = sc.nextInt();
		int3 = sc.nextInt();
//		4. 받은 input값 모두 빼기
		result = int1 - int2 - int3;
//		5. 출력
		System.out.printf("%d-%d-%d=%d!!!", int1, int2, int3, result);
	}
	
}
