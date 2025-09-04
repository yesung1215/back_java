package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
//		1 ~ 10까지 추가
//		IntStream.rangeClosed(1, 10)
//		.forEach((n) -> {datas1.add(n);});
//		
//		System.out.println(datas1);
		
//		datas1에서 stream 문법으로 1~5까지 삭제하기
//		방법 1
//		IntStream.rangeClosed(1, 10)
//			.filter((num) -> {return num > 5;})
//			.forEach((n) -> {datas1.add(n);});
//		
//		System.out.println(datas1);
		
////		방법 2
//		IntStream.range(0, 5).forEach((n) -> {datas1.remove(0);});
//		
//		System.out.println(datas1);
		
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
//		10 ~ 1 까지 추가 후 출력
		IntStream.rangeClosed(0, 9).forEach((n) -> {datas2.add(10 - n);});
		
//		System.out.println(datas2);
		
		ArrayList<String> datas3 = new ArrayList<String>();
//		"ABCDEFGHIJK" 을 datas3에 각각 한 글자씩 추가 후 출력학;
//		"A", "B", "C", ... "K"
		
		"ABCDEFGHIJK".chars().forEach((n) -> {datas3.add(String.valueOf((char)n));});
//		datas3.forEach(System.out::print);
		
		ArrayList<String> datas4 = new ArrayList<String>();
//		"aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
		
		"aBcDeFgHiJk".chars().forEach((askiNum) -> {
			if(askiNum >= 97 && askiNum <= 122) {
				String lowerStr = String.valueOf((char)askiNum);
				datas4.add(lowerStr);
			}
		});
//		System.out.print(datas4);
		
		
		ArrayList<String> datas5 = new ArrayList<String>();
//		"aBcDeFgHiJk"을 datas5에 모두 대문자로 변경 후 추가, 그리고 모두 출력하기
		
		String upperStr = "aBcDeFgHiJk".toUpperCase();
		upperStr.chars().forEach((askiNum) -> {
			String resultStr = String.valueOf((char)askiNum);
			datas5.add(resultStr);
		});
		
		datas5.forEach(System.out::print);
		
	}
}
