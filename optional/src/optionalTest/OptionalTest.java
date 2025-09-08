package optionalTest;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("김세환", "ksh", "1234"),
			new User("홍길동", "hgd", "1234"),
			new User("이순신", "lss", "1234"),
			new User("장보고", "jdg", "1234")
			));
	
//	if문에 한 번이라도 들어가지 않았다면 null이 리턴
//	NPE 발생
//	강조: 반드시 리턴 타입에만 Optional을 사용하고, 단일 객체만 감싼다.
//	나쁜 예시) Optional<List<User>> -- 단일 객체가 아니라 박살
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb: users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		
		Optional<User> foudeUser = optionalTest.findById(200L);
		
//		실무에서 가장 많이 쓰이는 null처리
//		user가 null아니면 통쨰로가 user
//		null이면 throw / 값이 없다면 통째로 예외
		try {
			User user = foudeUser.orElseThrow(() -> {
				throw new NoSearchUserException("유저를 찾을 수 없습니다.");
			});
			System.out.println(user);
		} catch (NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없습니다.");
		} 
		
//		boolean
		System.out.println(foudeUser.map(User::getId).isPresent());
		
		User user1 = null;
		if(foudeUser.isPresent()) {
			user1 = foudeUser.get();
		}
		
//		.ifPresent()
//		값이 있을 때에만 해당 로직을 수행
		optionalTest.findById(2L).map(User::getUserEmail).ifPresent((email) -> {
			System.out.println(email);
		});
		
		optionalTest
			.findById(100L)
			.map(User::getUserEmail)
			.ifPresentOrElse((email) -> {
				System.out.println(email);
			}, () -> {
				System.out.println("존재하지 않는 유저입니다.");
			});
		
	}
}
