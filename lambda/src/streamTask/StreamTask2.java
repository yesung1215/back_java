package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
   public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//         - 1. Arrays.asList() 초기값으로 넣는 방법
      ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
      datas1.stream().mapToInt(Integer::intValue).sum();
      
//         - 2. IntStream
//      IntStream
      int total = IntStream
//    	리턴타입 적기
         .rangeClosed(1, 6) // IntStream 
         .map(n -> n * 10) // IntStream 
         .mapToObj(Integer::valueOf) // Stream<Integer>, Object Type
         .collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer>
         .stream() // Stream<Integer>
         .mapToInt(Integer::intValue) // IntStream * 
         .sum(); // int 
      
//      Stream<T>
//      .mapToObj(): IntStream -> Stream<T>
//      .mapToInt(): Stream<T> -> IntStream
//      .mapToInt(Boolean::booleanValue): Boolean -> boolean
//      .mapToLong(Long::longValue): Long -> long
//      .mapToDouble(Double::doubleValue): Double -> double

      
   }
}
