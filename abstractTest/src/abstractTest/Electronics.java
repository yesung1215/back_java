package abstractTest;

public abstract class Electronics { // 둘다 abstract 키워드를 붙여야함
//	추상 메서드
	public abstract void safe(); // 선언
//	일반 메서드 / 추상 메서드와 일반 메서드는 같이 사용가능
	public void on() {
		System.out.println("전원 켬");
	}
	
}
