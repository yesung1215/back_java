package arrayTest;


public class ArrayTask3 {
	public static void main(String[] args) {
//      1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기
		
//		알고리즘
//		a. 배열을 생성한다 칸 20개로 정수 타입
		int[] arData1 = new int[21];
		int evenPlus = 0;
		
//		b. 반복문을 사용해서 짝수만 값을 생성한다.
//		c. 배열안 값 +3 ...
//		b+c 삼항(짝수 시 +3해서 출력, 홀수 시 출력x)
//		for(int i = 0; i < arData1.length + 1; i += 2) {
//			evenPlus = i + 3;
//			arData1[i] = evenPlus;
//			System.out.println(arData1[i]);
//		}
			
		
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//		알고리즘
//		a. 주어진 값 배열에 담기
//		int[] arData2 = {10, 20, 30, 40, 50};
//		int sum = 0, length = 0;
//		double avg = 0.0;		
//				
//		length = arData2.length;
//		b. 주어진 값 하나하나 모두 더하고 개열의 갯수만큼 나눈다(평균).
//		for(int i = 0; i < arData2.length; i++) {
//			sum += arData2[i];
//		}
//		avg = sum / length;
//		System.out.println(avg);
		
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
//		알고리즘
//		a. 배열의 크기를 아니까 반복문을 사용해서 담는다
//		b. 만약 5보다 크면 *2 아니면 그대로 출력 이거 삼항
//		int[] arData3 = new int[11];
//		int arrValue = 0;
//		for(int i = 1; i < arData3.length; i++) {
//			arrValue = i + 1 > 5 ? i * 2 : i; 
//			arData3[i] = arrValue;
//			System.out.println(arData3[i]);
//		}
		
		
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
//		알고리즘
//		a. 배열을 정수로 담고 안에 담은 정수를 문자형으로 변환하기
		String [] arData4 = new String[10];
		String result = "";
		for(int i = 0; i < arData4.length; i++) {
			result = String.valueOf(i + 1);
			
//			System.out.print(result);
//		b. 배열 인덱스 요소에 *를 붙이고 마지막 인덱스라면 그대로 출력하게 하기
			if(i + 1 != 10) {
				arData4[i] = result + "*";
//				System.out.println(result);
//				System.out.println("값 들감?");
			}else{
				arData4[i] = result;
			}
//			System.out.print(arData4[i]);
		}
		
		
		
		
		
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기
		
//		알고리즘
//		a. 배열 만든다
		int[] arData5 = new int[10];
		int sum = 0;
		
//		b. 3의 배수만 값을 저장한다.
		for(int i = 0; i < arData5.length; i++) {
			arData5[i] = i;
//		c. 그 값을 모두 더한다
			if(arData5[i] % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
