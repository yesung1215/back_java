package streamTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public int multipleBy10(int num) {
		return num * 10;
	}
	
   public static void main(String[] args) {
	   StreamTask3 st = new StreamTask3();
	   
//      IntStream으로 시작
//      10, 30, 50, 70, 90만 ArrayList, List에 추가하기
	   List<Integer> datas = IntStream
//		리턴타입 적기
	   	.rangeClosed(1, 10) // IntStream 
	   	.filter(st::isOdd) // Stream 
	   	.map(st::multipleBy10) // Stream 
	   	.boxed() // Stream<Integer> 		Stream, collect에는 클래스가 들어와야하는데 기본 자료형을 부모클래스로 래핑해서 담기위헤
	   	.collect(Collectors.toList()); // List<Integer>
	   
	   System.out.println(datas); // List<Integer>
   }
}




