package except;

public class ExceptTest {
	public static void main(String[] args) {
		
		
//		alt + shift + z
		int[] arData = new int[5];
		
		try {
//			arData[5] = 10; // 예외를 발생할 코드만
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음!");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 재대로 확인해!");
		} catch (Exception e) {
			// 마지막
			System.out.println("알 수 없는 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
		
	}
}
