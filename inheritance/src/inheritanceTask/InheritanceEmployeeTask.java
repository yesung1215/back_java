package inheritanceTask;

class EmployeeTask extends InheritancePersonTask{
	int money;
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String home, String phone, int money) {
		super(name, age, home, phone);
		this.money = money;
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
	
}

public class InheritanceEmployeeTask {

}
