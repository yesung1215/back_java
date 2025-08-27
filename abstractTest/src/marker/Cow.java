package marker;

public class Cow extends Animal implements CarniboreMarker{
	
	public Cow() {;}
	public Cow(String name, int age, String feed) {
		super(name, age, feed);
	}

}
