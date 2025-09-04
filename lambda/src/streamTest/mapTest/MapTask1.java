package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTask1 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
//      아래의 4개의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//      /news, /game, /brand, /rank
		
//		알고리즘
//		1. 문자열 배열 리스트 생성
//		2. 배열안에 링크들을 담는다. (Arrays.aslist(알고 있는 값))
		ArrayList<String> links = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		
		MapTask1 mt = new MapTask1();
		
//		links.add("/news");
//		links.add("/game");
//		links.add("/brand");
//		links.add("/rank");
//		System.out.println(links);
		
//		3. 링크들에 + /app 붙인다(map)
//		4. 하나씩 출력한다(forEach)
		links.stream().map(mt::addRoot).forEach(System.out::println);
	}
}
