package restaurant;

//- 비회원의 경우
//1) 5% 할인
//2) 포인트 적립 5%
//쿠폰 : 
// 1) 주문 1회 쿠폰 1개
// 2) 쿠폰 10장 시 주문 하나 무료

public class GuestCustomer extends Customer {
	
	public GuestCustomer(String name, String phone, int valance, int point, int coupon, int disCount) {
		super(name, phone, valance, point, coupon, disCount);
	}

}
