package optionalSelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalSelf {
	
	ArrayList<UserSelf> users = new ArrayList<UserSelf>(Arrays.asList(
			new UserSelf("조예성", "1234", "xocds991215@naver.com"),
			new UserSelf("노형진", "1234", "skyjin@naver.com"),
			new UserSelf("조현호", "1234", "jhh0810@naver.com")
			));
	
	public Optional<UserSelf> findById(Long id){
		UserSelf userSelf = null;
		for(UserSelf userInDb : users) {
			if(userInDb.getId() == id) {
				userSelf = userInDb;
			}
		}
		return Optional.ofNullable(userSelf);
		
	}
	
	public static void main(String[] args) {
		OptionalSelf optionalSelf = new OptionalSelf();
		Optional<UserSelf> foundUser = optionalSelf.findById(20L);
		Optional<UserSelf> foundUser2 = optionalSelf.findById(2L);
		
//		System.out.println(foundUser);
		try {
			UserSelf user = foundUser.orElseThrow(() -> {
				throw new NoSearchUserExceptionSelf("유저를 찾을 수 없습니다");
			});
			System.out.println(user);
		} catch (RuntimeException e) {
			System.out.println("유저를 찾을 수 없습니다");
		}
		
		System.out.println(foundUser.map(UserSelf::getId).isPresent());
		System.out.println(foundUser2.isPresent());
		
		UserSelf user1 = null;
		if(foundUser2.isPresent()) {
			user1 = foundUser2.get();
		}
		System.out.println(user1);
		
//		System.out.println(foundUser2.map(UserSelf::getUserEmail).isPresent());
		foundUser2.map(UserSelf::getUserEmail).ifPresent((email) -> {
			System.out.println(email);
		});
		
		
		foundUser.map(UserSelf::getUserEmail).ifPresentOrElse((email) -> {
			System.out.println(email);
		}, () -> {
			System.out.println("존재하지 않는 유저입니다.");
		});
	}
}
