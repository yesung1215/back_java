package restaurant;

//- 회원의 경우
//1) 10 % 할인
//2) 포인트 적립 10%
//3) 쿠폰 없음

public class MemberCustomer extends Customer {

	public MemberCustomer(String name, String phone, int valance, int point, int coupon, int disCount) {
		super(name, phone, valance, point, coupon, disCount);
	}
	
}
