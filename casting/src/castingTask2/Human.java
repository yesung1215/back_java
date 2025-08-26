package castingTask2;

//휴먼 클래스 - 골드
//해치웠나,,,?를 출력하는 기능 메서드
//다시 부활하는 메서드

public class Human extends Monster{
	
	public Human() {;}

	public Human(String name, int level) {
		super(name, level);
	}

	@Override
	void die() {
		System.out.println("4753원을 얻었습니다");
	}
	
	void comment() {
		System.out.println("해치웠나?");
	}
	
	void reBirth() {
		System.out.printf("%s이(가) 다시 부활하였습니다\n", name);
	}
}
