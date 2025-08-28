package exceptTask;

import java.util.Scanner;

public class ExceptionTask {
	
//	5개의 정수만 입력 받기
//	- 무한 입력 상태로 구혆기
//	- q 입력시 나가기
//	- 각 정수는 배열에 담기
//	- if문은 한 번만 사용하기
	
	public static void main(String[] args) {
		String expression = null;
		String message = "정수 5개를 순서대로 입력하세요.", exampleMessage = "번 째 정수";
		int count = 0;
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			try {
				count++;
				
				if(count > 5) {
					throw new ArrayIndexOutOfBoundsException();
				}
				
				System.out.println(count + exampleMessage);
				expression = sc.nextLine().trim();
				
				if(expression.equals("q")) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				arData[count - 1] = Integer.parseInt(expression);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요 \nex)10");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개 정수를 모두 입력하셨습니다");
				for(int data: arData) {
					System.out.printf(data + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("ExceptionTask 예외 발생!");
				System.out.println("알 수 없는 예외 발생!");
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}
}
