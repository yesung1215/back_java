package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//		메서드 선언
		MyInter myInter = new MyInter() {
			String str = "";
			
			@Override
//			알고리즘
//			a. ABCD를 전달받는다.
//			b. charAt()을 이용해 문자열을 문자형으로 나눈다.
//			c. 문자형 인덱스 2, 3 번째를 +1씩 미룬다.
			public void getString(String content) {
				char[] chars = content.toCharArray();
				for(char c: chars) {
					System.out.print((char)(c > 66 ? c + 1 : c));
				}
				
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				
				char[] chars2 = content.toCharArray();
				for(char c : chars2) {
					if(c >= 65 && c <= 90) {
						str += String.valueOf((char)(c + 32));
					}else if(c >= 97 && c <= 122) {
						str += String.valueOf((char)(c - 32));
					}
				}
				return str;
			}
		};
		
		myInter.getString("ABCD\n");
		System.out.println(myInter.changeUpperOrLower("abCd"));
		
	}
}
