package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2<T> {
	
	
	public static void main(String[] args) {
//		바로 시작!
//		a ~ z까지 문자열로 ArrayList에 추가하기
		ArrayList<String> datas = new ArrayList<String>();
		for(int i = 97; i < 123; i++) {
			char ch = (char)i;
			String StrCh = String.valueOf(ch); // 자료구조를 String으로 적었으므로
			datas.add(StrCh);
		}
//		System.out.println(datas);
		
//		조회 .get()
		for(int i = 0; i < datas.size(); i++) {
			if(i % 2 == 1) {
				System.out.print(datas.get(i).toUpperCase());
				continue;
			}
			System.out.print(datas.get(i));
		}
		
	}
}
