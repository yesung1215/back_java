package controlStatement;

import java.util.Scanner;

public class ForTask5 {
	public static void main(String[] args) {
//      1. ACEG...Z 출력!
//		for(char i = 65; i < 91; i += 2) {
//			System.out.print(i);
//		}
		
//      2. 1 ~ N까지의 합 출력!
		Scanner sc = new Scanner(System.in);
		String message = "정수를 입력하시오\nex)10";
		int inputValue = 0, sum = 0;
		
//		System.out.println(message);
//		inputValue = sc.nextInt();
//		sc.close();
	
		for(int i = 0; i < inputValue; i++) {
			sum += i+1;
//			System.out.println(i);
		}
//		System.out.printf("합은 %d", sum);
		
//      3. 0123401234 출력!
		for(int i = 0; i < 10; i++) {
			System.out.print(i % 5);
		}
      
//      4. 입력예시) a1b22c357
//      abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
//      사용자가 입력한 횟수가 얼마가 있을지 모르고, 
//      입력한 횟수만큼 반복해주는 프로그램 만들기
		
		
		
		
	}
}
