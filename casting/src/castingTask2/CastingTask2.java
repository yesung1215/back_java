package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
		Character character = new Character("예성", 99);
		Oak oak = new Oak("오크전사", 75);
		Fairy fairy = new Fairy("눈의요정", 81);
		Human human = new Human("잭슨", 95);
		
		character.hunt(oak);
		System.out.println("==============================");
		character.hunt(fairy);
		System.out.println("==============================");
		character.hunt(human);
	}
}
