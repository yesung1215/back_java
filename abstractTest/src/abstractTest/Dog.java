package abstractTest;

public class Dog implements Pet, Animals{
	@Override
	public void poop() {
		System.out.println("패드 위에");
	}
	
	@Override
	public void sitDown() {
		System.out.println("강아지 앉아");
	}
	
	@Override
	public void waitNow() {
		System.out.println("기다려");
	}
}
