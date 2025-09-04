package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {
	
	public int changeInt(String str) {
		str = "공일이삼사오육칠팔구";
	}
	
	
   public static void main(String[] args) {
      
//      요구사항
//      모두 stream문법으로 사용한다.
//	   	for, while, if문 불가
      
//      1. 1~10까지 ArrayList에 담고 출력
	   ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	   arrayList1.stream().forEach(System.out::println);
	   
//      2. ABCDEF를 각각 문자별로 출력
//	   ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	   IntStream.rangeClosed(65, 70).forEach((n) -> {
//		   System.out.println(String.valueOf((char) n)); 
	   });
	   
	   
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
	   ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter((n) -> n % 2 != 0).forEach((n) -> arrayList3.add(n));
//	   arrayList3.forEach(System.out::println);
	   
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//	   ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
	   IntStream.rangeClosed(65, 70).forEach((n) -> {
		   if(n != 68) {
//			   System.out.println(String.valueOf((char) n)); 
		   }
	   });
	   
	   
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
	   ArrayList<String> arrayList5 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
//	   arrayList5.stream().map((n) -> n.toLowerCase()).forEach(System.out::println);
	   
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
	   ArrayList<String> arrayList6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
//	   arrayList6.stream()
//	   	.filter((text) -> (int) text.charAt(0) >= 65 && text.charAt(0) <= 96)
//	   	.forEach(System.out::println);
	   
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
	   
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
      
   }
}
