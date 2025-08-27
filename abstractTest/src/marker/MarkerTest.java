package marker;

public class MarkerTest {
	
// 어떤 동물이 어떤 분류인지 알려주는 메서드
//	1. 초식동물이라면 초식동물
//	2. 육식동물이라면 육식동물
//	3. 아니라면 잡식동물
	public void checkKinds(Animal animal) {
		if(animal instanceof HerviboreMarker) {
			System.out.println(animal.getName() + "는(은) 초식동물 입니다.");
		}else if(animal instanceof CarniboreMarker) {
			System.out.println(animal.getName() + "는(은) 육식동물 입니다.");
		}else {
			System.out.println(animal.getName() + "는(은) 잡식입니다.");
		}
	}
	
//	메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력!
	public static void main(String[] args) {
		MarkerTest mt = new MarkerTest();
		Animal[] animals = {new Bear("곰", 12, "사람"), new Cat("고양이", 7, "츄르"), new Cow("소", 13, "건초"),
				new Dog("개", 6, "사료"), new Rabbit("토끼", 4, "당근"), new Tiger("호랑이", 12, "토끼")};
		
		for(int i = 0; i < animals.length; i++) {
			mt.checkKinds(animals[i]);
		}
		
		
		
		
	}
	
}
