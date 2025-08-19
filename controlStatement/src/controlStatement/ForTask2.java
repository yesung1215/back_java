package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
		String str = "abcd";
		char strChar = ' ';
		int results = 0, add = 0, Count = 0, addSum = 0, add7 = 0, firstEven = 0, lastEven = 0;
		for(int i = 0; i < str.length(); i++) {
			results = (int)str.charAt(i);
//			System.out.println(results); 
		}
			
//		"abcd"에서 c빼고 출력 a b d
		for(int i = 0; i < str.length(); i++) {
			strChar = str.charAt(i);
			if(i == 2) continue;
//			System.out.println(strChar);
		}
		
//		짝수 출력
		for(int i = 0; i < 31; i += 2) {
//			System.out.println(i);
		}
		
//		짝수 출력2
		for(int i = 0; i < 31; i += 1) {
			if(i % 2 == 1) continue;
//			System.out.println(i);
		}
		
//		1~30까지 짝수의 개수 출력
		for(int i = 1; i < 31; i++) {
			if(i % 2 == 0) {
				Count++;
			}
		}
		
//		System.out.println(Count);
		
//		1~30까지 짝수의 총합 구하기
		for(int i = 0; i < 31; i += 2) {
//			System.out.println(i);
			addSum += i;
			}
//		System.out.println(addSum);
		
//		1~30까지 짝수중 7번째 숫자를 출력하기
		for(int i = 1; i < 31; i += 1) {
			if(i % 2 == 0 && i == 14) {
				System.out.println(i);
			}
		}
		
//		1~30까지 짝수중 첫번째 짝수와 마지막 짝수만 더해서 출력하기
		
			
	}
	
}

