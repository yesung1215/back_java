//package operaterTest;
//
//import java.util.Scanner;

//3개의 입력값 중 중간값 찾기
//17 25 35
//10 3 8
//sc.next();
//sc.nextint();
//입력예시: 10 3 8
//출력예시: 중간값: 8

//public class OperTask2 {
//   public static void main(String[] args) {
//	   Scanner sc = new Scanner(System.in);
//	   알고리즘
//	   1. 메세지를 변수에 저장한다.
//	   String message = "세 개의 정수를 입력하시오.\nex)5 7 10", 
//			   value1 = null, value2 = null, value3 = null;
//	   int midValue = 0, valueGap1 = 0, valueGap2 = 0, valueGap3 = 0,
//			   valueReverseGap1 = 0, valueReverseGap2 = 0, valueReverseGap3 = 0, 
//			   maxValue = 0, minValue = 0, 
//			   avgValueGap1 = 0, avgValueGap2 = 0, avgValueGap3 = 0;
	   
//	   double avgValue = 0.0, 
//			   avgValueGap1 = 0.0, avgValueGap2 = 0.0, avgValueGap3 = 0.0;
	   
//	   2. 메세지를 콘솔창에 띄운다.
//	   System.out.println(message);
	   
//	   3. 입력값을 받고 닫는다(nextInt 사용).
//	   value1 = sc.nextInt();
//	   value2 = sc.nextInt();
//	   value3 = sc.nextInt();
//	   sc.close();
	   
//	   4. 세 개의 입력값중 중간값 판별(삼항)
//	   	4.a 중간값은 최소값과의 차는 양수 , 최대값과의 차는 음수
	   
	   
//	   	4.b 중간값은 세 수의 평균값과 가장 가까운 수
//	   avgValue = (value1 + value2 + value3) / 3;
//	   avgValueGap1 = avgValue - value1;
//	   avgValueGap2 = avgValue - value2;
//	   avgValueGap3 = avgValue - value3;
//	   midValue = avgValueGap1 - avgValueGap2 < 0 && avgValueGap1 - avgValueGap3 < 0;
	
			  
//	   	4.c 오름차순 했을 때 가운데 순서에 있는 수
//	   valueGap1 = value1 - value2;
//	   valueReverseGap1 = value2 - value1;
//	   valueGap2 = value1 - value3;
//	   valueReverseGap2 = value3 - value1;
//	   valueGap3 = value2 - value3;
//	   valueReverseGap3 = value3 - value2;
//	   
//	   midValue = ;
	   
//	   5. 중간값 출력
//	   System.out.println(midValue);
	   
	   
	   
//   }
//}
