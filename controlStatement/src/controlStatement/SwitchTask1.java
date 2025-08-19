package controlStatement;

import java.util.Scanner;
//		계절을 맞추는 프르고램
//		겨울 12 1 2 
//		봄 3 4 5
//		여름 6 7 8
//		가을 9 10 11

//		입력) 10
//		출력) 10월은 가을입니다.
public class SwitchTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		알고리즘
//		1. 메세지 변수를 담는다.
		String message = "월(月)을 입력하시오\nex)1월이면 1", month = null;
		
		
//		2. 메세지를 콘솔창에 출력한다.
		System.out.println(message);
		
//		3. 입력값을 받고 닫는다.
		month = sc.next();
		sc.close();
		
//		4. switch
		switch(month) {
		case "12":
		case "1":
		case "2":
			System.out.printf("%s월은 겨울입니다", month);
			break;
		case "3":
		case "4":
		case "5":
			System.out.printf("%s월은 봄입니다.", month);
			break;
		case "6":
		case "7":
		case "8":
			System.out.printf("%s월은 여름입니다.", month);
			break;
		case "9":
		case "10":
		case "11":
			System.out.printf("%s월은 겨울입니다.", month);
			break;
		default:
			break;
		}
	}
}
