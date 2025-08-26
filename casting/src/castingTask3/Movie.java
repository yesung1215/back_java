package castingTask3;

public class Movie extends Netflex {

	public Movie() {;}

	public Movie(String title, int ageLimit) {
		super(title, ageLimit);
	}
	
	@Override
	public void getFunction() {
		System.out.println(("4D 지원"));
	}
	
	
}
