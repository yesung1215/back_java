package operaterTest;

import java.util.Scanner;
//사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오.
//단 next() 사용
//입력 결과) 1.1
//출력 결과) 실수

public class OperTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		알고리즘
//		1. 메세지를 변수에 저장한다.
		String message = "숫자를 입력하시오", value = "", idInt = "정수", idFloat = "실수", checkValue = "";
		double valueDouble = 0;
		
//		2. 메세지를 콘솔창에 띄운다.
		System.out.println(message);
		
//		3. 입력값을 받고 닫는다.
		value = sc.next();
		sc.close();
		
//		4. 입력값을 double로 변환 시킨다.
		valueDouble = Double.parseDouble(value);
		
//		5. 입력 값이 정수인지 실수인지 판단한다.
		checkValue = valueDouble % 1 == 0 ? idInt : idFloat;
//		실수 - 정수 == 0 ? "정수" : "실수" 정수, 실수 판단법
		
//		6. 출력값을 반환한다.
		System.out.println(checkValue);
	}
}
