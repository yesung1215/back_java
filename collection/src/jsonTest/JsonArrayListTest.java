package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
//		JSONObject userJSON = new JSONObject();
		
		User user1 = new User(1L, "홍길동", 17, "개발자");
		User user2 = new User(2L, "장보고", 15, "기획자");
		User user3 = new User(3L, "이순신", 25, "디자이너");
		User user4 = new User(4L, "이성계", 37, "사장");
		User user5 = new User(5L, "이태희", 27, "개발자");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
		
//		알고리즘
//		반복문을 돈다
//		생성자를 이용해서 JSONObject 객체화(User 클래스)
//		JSONArray에 하나씩 put
		
		for(int i = 0; i < users.size(); i++) {
			usersJSON.put(new JSONObject(users.get(i))); 
		}
		System.out.println(usersJSON);
		
		users.forEach((data)-> {
			System.out.println(data);
		});
		
		users.stream().map((data)-> new JSONObject(data)).forEach((json)->{
			usersJSON.put(json);
		});
//		
//		System.out.println(usersJSON);
	}
}
