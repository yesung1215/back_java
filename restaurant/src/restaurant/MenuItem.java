package restaurant;
//- 필드 ; name, price, stock(count) 
//- 재고는 0 이상
//- 메서드

public class MenuItem {
	private String name;
	private int price;
	private int stock;
	
	public MenuItem() {;}
	public MenuItem(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getStock() {
		return stock;
	}
	void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
