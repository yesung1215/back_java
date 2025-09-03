package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
//		회원가입
		User user = new User("xocds991215", "조예성", "1234", "01077131372"); // 프론트에서
		userField.join(user); // 버튼 이벤트
		System.out.println(DBconnecter.users);
		
//		로그인
		User userForLogin = new User("xocds991215", "조예성", "1234", "01077131372");
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
//		비밀번호 변경
		userForLogin.setPassword("12345");
		userField.update(userForLogin);
		// db 쿼리에 데이터 보내면 완료
		
//		로그아웃
		userField.logout(); // 버튼 누르는 이벤트 발생
		System.out.println(userField.userId);
		System.out.println("로그아웃이 되었습니다");
		
	}
}
