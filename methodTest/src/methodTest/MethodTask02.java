package methodTest;

public class MethodTask02 {
//	1. 이름을 10번 출력해주는 함수
	void callNameTen(String name) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "번째 출력 \n" + name);
		}
	}
	
	void callNumName(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1 + "번째 출력 \n" + name);
		}
	}
	
	
	public static void main(String[] args) {
		//	2. 1번 메서드 사용
		MethodTask02 mt2 = new MethodTask02();
//		mt2.callNameTen("조예성");
		mt2.callNumName("하하하", 5);
	}
}
