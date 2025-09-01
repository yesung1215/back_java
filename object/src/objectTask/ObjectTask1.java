package objectTask;

// 상품 클래스를 만들고,
// toString, hashCode, Equals를 재정의 하고
// 같은 상품인지 비교하기

// 1번 상품 예시
// 이름: 파인애플
// 가격: 20000
// 재고(stock): 15
// 원산지(mou): 필리핀 

public class ObjectTask1 { // public -> 파일 이름 같아야함
	public static void main(String[] args) {
		Product pineApple = new Product(1, "파인애플", 20000, 15, "필리핀");
		
		if(pineApple.equals(new Product(1))) {
			System.out.println("동일한 상품번호 입니다.");
		}else {
			System.out.println("동일한 상품번호가 아닙니다.");
		}
	}
}
