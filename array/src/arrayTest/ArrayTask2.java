package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hI!!
//      출력 예)안녕Hi!!
		
		Scanner sc = new Scanner(System.in);
		String message1 = "문자를 입력해보세요\nex)하이hI", input = null, result = "";
		char c = ' ';
		int intC = 0;
//		System.out.println((int)'Z');
//		System.out.println(message1);
		
//		input = sc.next();
//		sc.close();
//		char[] arData1 = new char[input.length()];
//		System.out.println(arData1.length);
//		for(int i = 0; i < arData1.length; i++) {
//			c = input.charAt(i);
//			intC = (int)c;
//			if(intC >= 97 && intC <= 122) {
//				result += (char)(intC - 32);
//			}else if(intC >= 65 && intC <= 90){
//				result += (char)(intC + 32);
//			}else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		
		
		
      
//      2. 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
		String message2 = "정수를 입력하시오\nex)1048", input2 = null, result2 = "";
		System.out.println(message2);
		input2 = sc.next();
		sc.close();
		
		int[] arData2 = new int[input2.length()];
//		System.out.println(arData2[1]);
		for(int i = 0; i < arData2.length; i++) {
			arData2[i] = (int)(input2.charAt(i)) - 48;
			if(arData2[i] == 1) {
				result2 += "일";
			}else if(arData2[i] == 2) {
				result2 += "이";
			}else if(arData2[i] == 3) {
				result2 += "삼";
			}else if(arData2[i] == 4) {
				result2 += "사";
			}else if(arData2[i] == 5) {
				result2 += "오";
			}else if(arData2[i] == 6) {
				result2 += "육";
			}else if(arData2[i] == 7) {
				result2 += "칠";
			}else if(arData2[i] == 8) {
				result2 += "팔";
			}else if(arData2[i] == 0) {
				result2 += "공";
			}else{
				result2 += "구";
//				System.out.println((char)arData2[i]);
//				System.out.println(arData2[i]);
			}
			
		}
		
//		System.out.println(result2);
//		
//	      String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
//	              result2 = "", hangle = "공일이삼사오육칠팔구";
//	        System.out.println(message2);
//	        input2 = sc.nextLine();
//	        
//	        for(int i = 0; i < input2.length(); i++) {
//	           result2 += hangle.charAt(input2.charAt(i) - 48);
//	        }
//	        System.out.println(result2);
		
		
	}
}
