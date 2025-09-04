package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		0~9
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream
//		.range(시작, 끝) : 마지막 포함 x
//		.rangeClosed(시작, 끝) : 마지막 포함 o
		
		IntStream.range(0, 10).forEach((n) -> {
			datas.add(n);
		});
//		
//		System.out.println(datas);
		
//		1~5까지 스트림 문법으로 출력하기
//		IntStream.rangeClosed(1, 5).forEach((num) -> {System.out.println(num);});
		
//		참조형 문법
//		.(소속::메서드명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);
//		System.out.println(datas);
		
//		1. datas 짝수만 출력하기
//		datas.stream().forEach((n) -> {
//			if(n % 2 == 0) {
//				System.out.println(n);
//			}
//		});
		
//		2. 단, 위에 방법은 사용할 수 없다.
//		datas 홀수만 출력하기
		datas.stream()
		.filter((data) -> {return data % 2 == 1;})
//		.forEach(System.out::println);
		.forEach((n)-> {System.out.print(n + " ");});
		
//		.stream(): 컬렉션을 Stream 객체로 변경
//		.chars(): 문자열을 IntStream 문법으로 변경
		
		"ABCD".chars().forEach((c) -> {
			System.out.print((char) c + " ");
		});
	}
}
