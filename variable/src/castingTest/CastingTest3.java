package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		int a = 0;
		char b = ' ';
		String c = "";
		
		System.out.println(Integer.parseInt("10") - 5); // 스트링은 클래스이므로 
		
		// 문자열의 강제 형변환
		// int의 어머니 Integer.parseInt(매서드)
		System.out.println(Float.parseFloat("10") - 5);
		System.out.println(Double.parseDouble("10"));
		System.out.println(Boolean.parseBoolean("10"));
	}
}
