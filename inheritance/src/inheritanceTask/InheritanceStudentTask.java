package inheritanceTask;

class StudentTask extends InheritancePersonTask{
	String insta;
	public StudentTask() {;}
	public StudentTask(String name, int age, String home, String phone, String insta) {
		super(name, age, home, phone);
		this.insta = insta;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	}
	
	@Override
	void eat() {
		System.out.printf("%s는 아침을 거른다", name);
	}
	
}

public class InheritanceStudentTask {

}
