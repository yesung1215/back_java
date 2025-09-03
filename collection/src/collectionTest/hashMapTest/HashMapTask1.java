package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//HashMap 자료구조
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"


public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		ArrayList<Object> ak = new ArrayList<Object>();
		dataMap.put("street", "Victor Plains");
		dataMap.put("suite", "Suite 879");
		dataMap.put("city", "Wisokyburgh");
		dataMap.put("zipcode", "90566-7771");
		dataMap.put("lat", "-43.9509");
		dataMap.put("lng", "-34.4618");
		
		Iterator<Entry<String, Object>> dataMapIter = dataMap.entrySet().iterator();
		while(dataMapIter.hasNext()) {
			Entry<String, Object>dataEntry = dataMapIter.next();
			
			// value들만 ArrayList로 변경 후 출력
			Object dataValue = dataEntry.getValue();
			ak.add(dataValue);
			
		}
		System.out.println(ak);
	}
}
