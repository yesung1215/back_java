package inheritanceTask;

//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
//
//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
//
//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
//
//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기


//class PersonTask {
//	String name;
//	int age;
//	String home;
//	String phone;
//	
//	public PersonTask() {;}
//	public PersonTask(String name, int age, String home, String phone) {
//		this.name = name;
//		this.age = age;
//		this.home = home;
//		this.phone = phone;
//	}
//	
//	void work() {
//		System.out.println("일을 한다");
//	}
//	
//	void sleep() {
//		System.out.println("잠을 잔다");
//	}
//	
//	void eat() {
//		System.out.println("세 끼를 먹는다");
//	}
	

	
//}

public class InheritanceTask2 {
	public static void main(String[] args) {
		InheritancePersonTask person = new InheritancePersonTask();
		StudentTask st = new StudentTask("태희", 16, "경기" , "57051641", "xogml_oo");
		EmployeeTask et = new EmployeeTask("태희", 27, "경기" , "57051641", 50_000_000);
		
		person.work();
		person.sleep();
		person.eat();
		System.out.println("\n");
		st.work();
		st.sleep();
		st.eat();
		System.out.println("\n");
		et.work();
		et.sleep();
		et.eat();
	}
	

}
