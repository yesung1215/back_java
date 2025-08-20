package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
//		arData값은 주소(해시)값
		int[] arData1 = {1,2,3,4}; // 어떤 값이 들어올지 알 때
		
		int[] arData2 = new int[5]; // 값은 모르고 칸수만 알 때 
		// heap : 개발자가 동적으로 사용 할때 heap 영역에 할당 -> new -> heap 할당 동시에 초기화도 시켜줌(초기값: 주소)
		// heap : 동적 메모리 할당	
		
		int[] arData3 = null; // 값도 칸(크기)도 모를 때 / null -> 주소의 초기값
		
//		=============================================
		// 답: 저장6 값11
//	    int[] arData = new int[100]; // 저1 값1
//	    int result = 0; // 저1 값1
//	    for(int i = 0; i < arData.length; i++) { // 저1 값4
//	       arData[i] = i + 1; // 저1 값2
//	    }
//	      
//	    for(int i = 0; i < arData.length; i++) { // 저1 값4
//	       if(i % 2 != 0) { // 값3
//	          result += i; // 저1 값1
//	       }
//	    }
		
	}
}
