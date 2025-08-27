package castingTask4;

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//- 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

public class Cunsumor {
	private String name;
	private String phone;
	private int money;
	private int point;
	private int coupon;
	private int discount;
	
	public Cunsumor() {;}
	public Cunsumor(String name, String phone, int money, int point, int coupon, int discount) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
		this.discount = discount;
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
	int getMoney() {
		return money;
	}
	void setMoney(int money) {
		this.money = money;
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
		return discount;
	}
	void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
