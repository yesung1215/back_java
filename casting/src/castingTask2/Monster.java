package castingTask2;

public class Monster {
	String name;
	int level;
	
	
	
	public Monster() {;}

	public Monster(String name, int level) {
		this.name = name;
		this.level = level;
	}


	void die() {
		System.out.println("털썩.....");
	}
}
