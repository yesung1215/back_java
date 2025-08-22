package classTest;

public class ClassTask {
// 동물(ClassTask)
// 추상화
// 필드 :이름(name), 나이(age), 먹이(feed)
	String name; // 변수 한줄로 안적음 필드에서
	int age;
	String feed;
	
	
	
// 기본 생성자, 초기화 생성자
// 생성자의 오버로딩(매개변수의 매배견수 개수 또는 타입이 다르면 동일한 이름의 메소드로 선언 가능)	
	public ClassTask() {;}
	public ClassTask(String name, int age, String feed) { // 단축키: alt + c + ?
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	
	public static void main(String[] args) {
		// 토끼, 강아지, 고양이 객체(객체화)
		ClassTask rabbit = new ClassTask("토순이", 5, "당근");
		ClassTask dog = new ClassTask("멍군이", 3, "사료");
		ClassTask cat = new ClassTask("나비", 6, "츄르");
		
		System.out.println(cat.age + "살");
		System.out.println(dog.name + " " + dog.age + "살");
	}
}
