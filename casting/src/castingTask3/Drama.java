package castingTask3;

public class Drama extends Netflex {

	public Drama() {;}

	public Drama(String title, int ageLimit) {
		super(title, ageLimit);
	}
	
	@Override
	void getFunction() {
		System.out.println("굿즈 지원");
	}
	
	
}
