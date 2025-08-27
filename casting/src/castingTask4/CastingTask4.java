package castingTask4;

// 결과 확인
public class CastingTask4 {
	public static void main(String[] args) {
		
		Market emart = new Market();
		Product product = new Product("면도기", 5000, 4);
		MarketMember member = new MarketMember("태희", "01057051641", 50000, 0, 0, 50);
		
		emart.getRegisterProduct(product);
		emart.getSell(product, member);
		emart.getPoint(product, member);
	}
}
