package inheritanceTask;

public class InheritancePersonTask {
	String name;
	int age;
	String home;
	String phone;
	
	public InheritancePersonTask() {;}
	public InheritancePersonTask(String name, int age, String home, String phone) {
		this.name = name;
		this.age = age;
		this.home = home;
		this.phone = phone;
	}
	
	void work() {
		System.out.println("일을 한다");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}
