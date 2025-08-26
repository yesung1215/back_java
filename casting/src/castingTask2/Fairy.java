package castingTask2;

//요정 클래스 - 팬던트
//ㄱr끔 눈물을 흘린다...출력하는 기능을 가진 메서드

public class Fairy extends Monster{

	public Fairy() {;}
	
	public Fairy(String name, int level) {
		super(name, level);
	}



	@Override
	void die() {
		System.out.printf("%s이(가) 팬던트를 떨어 뜨렸습니다.\n", name);
	}
	
	void cry() {
		System.out.println("나는 ㄱr끔 눈물을 흘린다...");
	}
}
