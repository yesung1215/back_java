package castingTask4;

// 결과 확인
public class CastingTask4 {
	public static void main(String[] args) {
		
		Market emart = new Market();
		Product product = new Product("면도기", 5000, 5);
		
		emart.productRegister(product);
	}
}
