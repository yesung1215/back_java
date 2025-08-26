package castingTask4;

//Market
//- 필드: 이름
//- 메서드:
// 1. 상품 판매
//    - 등록된 상품만 판매할 수 있다.
//    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//    - 유저가 마다의 할인율이 적용된다.
//       1. 비회원 할인율 5% 적용
//       2. 멤버 할인율 30% 적용
//    - 등록된 상품의 재고보다 작으면 판매할 수 없다.

// 2. 상품 등록
//    - 상품 등록은 최대 5개까지만 할 수 있다. // 크기가 아는 배열 생성
//    (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//    - 마트에 같은 이름의 상품은 등록할 수 없다. -> 같으면 continue
//
// 3. 포인트 적립 메서드
//    - 비회원은 5%
//    - 회원은 10%

// 4. 만약 비회원이라면 
// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

public class Market {
	private String name;

	public Market() {;}
	
	public Market(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	public void sellProduct(Product product, Cunsumor cunsumor) { // 상품 판매
		if(product.getName().equals(product.getName())) {
			if(product.getPrice() <= cunsumor.getMoney()) {
				if(cunsumor instanceof MarketMember) {
					int memberDiscount = product.getPrice() * 30 / 100;
					cunsumor.setMoney(cunsumor.getMoney() - product.getPrice() - memberDiscount);
					product.setProductStock(product.getProductStock() - 1);
				}else if(cunsumor instanceof MarketNonMember) {
					int nonMemberDiscount = product.getPrice() * 5 / 100;
					cunsumor.setMoney(cunsumor.getMoney() - product.getPrice() - nonMemberDiscount);
					product.setProductStock(product.getProductStock() - 1);
				}
			}
		}
	}
	
	public void productRegister(Product product) {
		// 5개 -> 크기가 5인 배열 생성?
		String[] productArray = new String[5]; // 마켓의 필드애 적어야..
		for(int i = 0; i < productArray.length; i++) {
			productArray[i] = product.getName();
			System.out.printf(productArray[i]);
		}
	}
	
	

}


