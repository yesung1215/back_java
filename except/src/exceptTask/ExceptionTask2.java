package exceptTask;

import java.util.Scanner;

// 사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
// 만든 예외를 이용해서 메세지를 출력
public class ExceptionTask2 {
	
	public boolean checkSymbol(String message) {
		boolean check = false;
		
		String[] symbols = {"!", "@", "#", "*"};
		for(String c: symbols) {
			if(message.contains(c)) {
				check = true;
			}
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "문자를 입력하시오", inputMessage = null;
		
		System.out.println(message);
		inputMessage = sc.nextLine();
		
		try {
			if(inputMessage.contains("!")) {
				throw new SpecialCharacterException("'!' 사용금지");
			}else if(inputMessage.contains("@")) {
				throw new SpecialCharacterException("'@' 사용금지");
			}else if(inputMessage.contains("#")) {
				throw new SpecialCharacterException("'#' 사용금지");
			}else {
				System.out.println(inputMessage);
			}
		} catch (SpecialCharacterException e) {
			System.out.println("특수문자 사용금지");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
//			e.printStackTrace();
		}
	}
}
