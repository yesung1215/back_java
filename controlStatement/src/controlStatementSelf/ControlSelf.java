package controlStatementSelf;

import java.util.Scanner;

public class ControlSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1~100중에 3과 7의 공배수
		for(int i = 0; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0 && i != 0) {
//				System.out.println(i);
			}
		}
		
//		숫자 입력 받아서 역으로 뒤집기
		String message = "수를 입력하시오\nex)1 2 3", input = null;
//		int int1 = 0, int2 = 0, int3 = 0;
//		System.out.println(message);
		
//		input = sc.next();
		
//		for(int i = input.length() - 1; i >= 0; i--) {
//			System.out.println(input.charAt(i));
//		}
		
//		"programming"이라는 문자열에서 'g' 문자가 몇 번 나오는지 세는 코드를 작성
		String str = "programming", str2 = null;
		char c = ' ';
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			str2 = String.valueOf(c);
//			System.out.println(c);
			if(str2.equals("g")) {
				count++;
			}
		}
		System.out.println(count);
	}
}


