package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "xocds991215"); // -> add와 비슷
		userMap.put("password", "1234"); // -> add와 비슷
		userMap.put("name", "조예성"); // -> add와 비슷
		userMap.put("age", 20); // -> add와 비슷
		userMap.put("isRich", true); // -> add와 비슷
		
		System.out.println(userMap);
		System.out.println(userMap.get("age"));
		System.out.println(userMap.entrySet());
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
//			System.out.println(userMapIter.next());
			Entry<String, Object> entry = userMapIter.next();
//			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	}
}
