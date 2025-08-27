package restaurant;
//- 필드 : name, menu(최대 5개 메뉴 등록 가능),
//menuCount (현재 등록 수)

public class Restaurant {
	private String name;
	private String menu;
	private int menuCount;
	
	public Restaurant() {;}

	public Restaurant(String name, String menu, int menuCount) {
		this.name = name;
		this.menu = menu;
		this.menuCount = menuCount;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getMenu() {
		return menu;
	}

	void setMenu(String menu) {
		this.menu = menu;
	}

	int getMenuCount() {
		return menuCount;
	}

	void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	
//- 메뉴 등록
//- 1) 중복 메뉴 등록 불가
//- 2) 최대 5개까지만 등록 가능 menucount <= 5
//- 3) 재고가 50을 초과하면 50으로 만들기(제한)
	public void registerMenu(MenuItem menu) {
		if(getMenuCount() >= 5) {
			setMenuCount(5);
			System.out.println("최대 메뉴는 5개까지 등록이 가능합니다. " + "메뉴 개수 " + getMenuCount());
		}else{
			setMenuCount(getMenuCount() + 1);
			System.out.println(menu.getName() + " 메뉴가 등록되었습니다. " + "메뉴 개수 " + getMenuCount());
		}
		if(menu.getStock() >= 50) {
			menu.setStock(50);
			System.out.println("음식의 재고는 50개를 넘을 수 없습니다. " + menu.getName() + " 재고 수 " + menu.getStock());
		}
	}
	
//- 주문
//- 1) 등록된 메뉴만 주문 가능
//- 2) 재고 부족 시 주문 불가
//- 3) 회원 / 비회원 할인 및 포인트 , 쿠폰 정책
//- 4) 결제 후 : 잔액 차감, 재고 감소, 포인트 적립, 쿠폰 지급 처리
	
}
