package marker;

public class Animal {
//	이름, 나이, 먹이
	private String name;
	private int age;
	private String feed;
	
	public Animal() {;}
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getFeed() {
		return feed;
	}
	void setFeed(String feed) {
		this.feed = feed;
	}
	
	
	
}
