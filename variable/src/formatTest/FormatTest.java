package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "조예성";
		int age = 27;
		double height = 181.2;
		
//		System.out.println("저의 이름은" + name + "입니다.");
		System.out.printf("저의 이름은 %s입니다.", name);
		System.out.printf("저의 나이는 %d이고, 저의 키는 %.2fcm입니다.", age, height);
		
	}
}
