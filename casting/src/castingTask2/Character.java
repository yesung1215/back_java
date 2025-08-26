package castingTask2;

//캐릭터 클래스
//사냥 메서드

public class Character {
	String name;
	int level;
	
	public Character() {;}

	public Character(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	void hunt(Monster monster) {
		if(monster instanceof Oak) {
			Oak oak = (Oak)monster;
			oak.callEcho();
			monster.die();
			oak.getExp();
		}else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.cry();
			monster.die();
		}else {
			Human human = (Human)monster;
			monster.die();
			human.comment();
			human.reBirth();
		}
	}
	
	
}
