package methodTest;

public class MethodTask01 {
	
//	1. 1 ~ 10까지 출력해주는 메서드 선언
	void countTen() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	
	public static void main(String[] args) {
		//	2. 1번 메서드 사용
		MethodTask01 mt = new MethodTask01();
		mt.countTen();
	}

}
