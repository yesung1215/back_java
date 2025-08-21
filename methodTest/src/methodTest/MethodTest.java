package methodTest;

public class MethodTest {
	
//	1. 3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언
	int subtractValue(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
//	2. 성과 이름을 붙여서 출력해주는 메서드 선언
	void addFirstNameAndlastName(String firstName, String lastname) {
		String fullName = firstName + lastname;
		System.out.println(fullName);
	}
	
	
	public static void main(String[] args) {
		
		
	}
}
