package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("street", "Victor Plains");
		dataMap.put("suite", "Suite 879");
		dataMap.put("city", "Wisokyburgh");
		dataMap.put("zipcode", "90566-7771");
		dataMap.put("lat", "-43.9509");
		dataMap.put("lng", "-34.4618");
		
		JSONObject json = new JSONObject(dataMap);
		System.out.println(json);
		
	}
}
