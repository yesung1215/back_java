package methodTest;


public class MethodTask03 {
//	1. 1 ~ n번까지 출력해주는 함수
	void printToCount(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	public static void main(String[] args) {
		//	2. 1번메서드 사용
		MethodTask03 mt3 = new MethodTask03();
		mt3.printToCount(5);
	}

}
