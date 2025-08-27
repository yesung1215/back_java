package restaurant;

//- 필드 : name, phone, balance(잔액), point, coupon



public class Customer {
	private String name;
	private String phone;
	private int valance;
	private int point; // 사용자가 직접 넣는가? -> 직접 안 넣으면 초기화 블럭?
	private int coupon;
	private int disCount;
	
	public Customer() {;}
	public Customer(String name, String phone, int valance, int point, int coupon, int disCount) {
		this.name = name;
		this.phone = phone;
		this.valance = valance;
		this.point = point;
		this.coupon = coupon;
		this.disCount = disCount;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	int getValance() {
		return valance;
	}
	void setValance(int valance) {
		this.valance = valance;
	}
	int getPoint() {
		return point;
	}
	void setPoint(int point) {
		this.point = point;
	}
	int getCoupon() {
		return coupon;
	}
	void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	int getDiscount() {
		return disCount;
	}
	void setDiscount(int diㅁsCount) {
		this.disCount = disCount;
	}
	
}
