package methodTest;

public class MethodTask04 {
//	1. 사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력해주는 메서드
//	입력예시) 홍길동 5
//	출력예시) 홍길동 5번 출력
	
	void callNameRepeatCount(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1 + "번째출력:" + name);
		}
	}
	
//	메서드 선언
//	=================================================
//	메서드 사용
	
	public static void main(String[] args) {
		//	2. 1번 메서드 사용
		MethodTask04 mt4 = new MethodTask04();
		mt4.callNameRepeatCount("조예성", 4);
	}
}
