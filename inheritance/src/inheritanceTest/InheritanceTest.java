package inheritanceTest;

//	상속클래스 사용하는 이유
//	기존에 있는 코드를 가져와서 + @
//	자식 = 부모 + @
//	자식을 부를 때는 부모먼저 호출하게 되어있음.
//	같은 코드 반복X
//	상속은 한 번 밖에 사용(귀중)
//	어떻게 코드를 작성하느냐에 따라 좋은 코드

// 부모 클래스
class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
	void walk() {
		System.out.println("네 발로 걷기");
	}
	
}

// 자식 클래스
class B extends A {
	public B() {
		super(); // 부모의 생성자
		System.out.println(this);
		System.out.println("자식 생성자 호출됨");
	}
	
	void printData() {
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data); // super.는 부모를 호출하는 키워드
	}
	
//	기존 메서드 -> 기능 또는 값
//	이제부터 메서드 -> 저장공간
//	부모 메서드가 맘에 안들어서 자식 메서드에서 재정의(오버라이딩)
//	오버 라이딩
	// 매개변수 같아야함	
	//@: 자바 - 어노테이션 / 자바스크립트 - 데코레이션
	// +@ 개념이 아닌 부모꺼를 사용하는거임
	@Override
	void walk() {
		System.out.println("두 발로 걷는다");
	}
	
	
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
//		자식 주소를 할당시키면 부모와 자식 둘 다 주소를 할당된다.
		b.printName();
		b.printData();
//		자식은 data가 없어도 부모의 data를 물려 받기에 출력가능.
		
		b.walk();
		a.walk();
//		부모의 코드는 그저 자기 자신이기 때문에 자식코드를 알 수 없음
	}
}
