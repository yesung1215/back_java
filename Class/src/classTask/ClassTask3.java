package classTask;

// 1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
// 2. 클래스로 리턴
// 3. 메인 메서드에서 메서드 사용
public class ClassTask3 {
   Result getMaxAndMin(int[] arData) {
      Result result = new Result(arData[0], arData[1]);
      for(int i = 0; i < arData.length; i++) {
         if(result.min > arData[i]) { result.min = arData[i]; };
         if(result.max < arData[i]) { result.max = arData[i]; };
      }
      return result;
   }
   
   public static void main(String[] args) {
      ClassTask3 ct3 = new ClassTask3();
      int[] arData = {1, 3, 5, 9, 0};
      Result result = ct3.getMaxAndMin(arData);
      System.out.println(result.min);
      System.out.println(result.max);
   }
   
}



//package classTask;
//
//
////1. 2개의 값을 전달했을 때 최솟값과 최댓값을 구해주는 메서드
////2. 클래스로 리턴
////3. 메인 메서드에서 메서드 사용
//
//class Number {
//int num1;
//int num2;
//int maxNum;
//int minNum;
//
//public Number() {;}
//
//public Number(int num1, int num2) {
//   this.num1 =num1;
//   this.num2 = num2;
//}
//
//public static Number getMaxAndMin(int num1, int num2) {
//   Number result = new Number();
//   result.num1 = num1;
//   result.num2 = num2;
//   if(num1 > num2) {
//      result.maxNum = num1;
//      result.minNum = num2;
//   } else if(num1 < num2) {
//      result.maxNum = num2;
//      result.minNum = num1;
//      System.out.println("최댓값 : " + result.maxNum);
//      System.out.println("최솟값 : " + result.minNum);
//   }else {
//      System.out.println("두 값이 일치합니다.");
//   }
//   return result;
//}
//
//
//
//
//public Number(int num1, int num2, int maxNum, int minNum) {
//   this.num1 = num1;
//   this.num2 = num2; 
//   this.maxNum = maxNum;
//   this.minNum = minNum;
//}
//}
//
//public class CalssTask3 {
//
//
//public static void main(String[] args) {
//   Number result = Number.getMaxAndMin(3, 5);
//   
//}
//}

