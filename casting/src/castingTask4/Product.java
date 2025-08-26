package castingTask4;

//Product 상품
//- 필드: 이름, 가격, 재고

public class Product {
	private String name;
	private int price;
	private int productStock;

	public Product() {;}

	public Product(String name, int price, int productStock) {
		this.name = name;
		this.price = price;
		this.productStock = productStock;
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

	int getProductStock() {
		return productStock;
	}

	void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	
	
}
