package toStringTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	int getTotal() {
		return total;
	}
	void setTotal(int total) {
		this.total = total;
	}
	
	
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	public static void main(String[] args) {
		String a = "";
		Sports sports = new Sports();
		sports.setType("축구");
		sports.setTotal(11);
		System.out.println(sports);
//		sports.toString();
	}
	
}
