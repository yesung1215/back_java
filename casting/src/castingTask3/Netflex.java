package castingTask3;

public class Netflex {
	private String title;
	private int ageLimit;
	
	public Netflex() {;}
	public Netflex(String title, int ageLimit) {
		this.title = title;
		this.ageLimit = ageLimit;
	}
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	int getAge() {
		return ageLimit;
	}
	void setAge(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	void getFunction() {
		System.out.println("어떤 기능?");
	}
	
}
