package classTask;

class Market {
//	1. 상품명, 상품가격, 상품재고
//	판매(sell)
//	힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율 판매에 적용시킬 수 있을까?
	String product;
	int price;
	int inventory;
	
	public Market() {;}

	public Market(String product, int price, int inventory) {
		this.product = product;
		this.price = price;
		this.inventory = inventory;
	}
	
	
	
	public void sellProduct(Customer customer) {
		// ClassTask01_check 참고, 줌 수업 다시 듣기
//		System.out.println(customer.name);
		if(inventory > 0) {
			if(price * customer.discount / 100 < customer.money) {
				int restMoney = customer.money -= (price - price * customer.discount / 100);
				inventory--;
				System.out.printf("남은 재고: %d개, 남은 금액 %d원", inventory, restMoney);
			}else {
				System.out.println("잔액 부족");
			}
		}else {
			System.out.println("재고 부족");
		}
	}
}

// 알고리즘
// a. 마트는 물건을 판매하는 행위를하면 상품 재고값이 변동되야함 
// b. 소비자는 남은돈이 할인율만큼 받은 물건의 값만큼 잔고가 변동되야함	
// c. 마트는 여러 소비자를 받을 수 있음

class Customer {
//	2. 이름, 폰, 돈, 할인율
	String name;
	String phoneNumber;
	int money;
	int discount;
	
	public Customer() {;}

	public Customer(String name, String phoneNumber, int money, int discount) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.discount = discount;
	}
	
	
}


public class ClassTask2 {

	public static void main(String[] args) {
//		3. 마켓, 소비자를 객체화 시키고,
//		소비자에게 마켓의 물건을 판매
//		마켓의 상품 재고와, 소비자의 남은 금액을 출력
		Market emart = new Market("컴퓨터", 50000, 5); 
		Customer ys = new Customer("예성", "01077131372", 300000, 40);
//		System.out.println(ys.name);
		

		emart.sellProduct(ys);
		System.out.println("\n");
//		emart.sellProduct(th);
		System.out.println("\n");
	}
	
}
