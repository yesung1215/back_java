//package randomTask;
//
//import java.util.Random;
//
////* 로또 번호를 추첨하는 기능
////1. 반복되는 코드를 반복문으로
////2. 메서드로 생성
////3. 6개를 배열로 리턴
////4. 메인 메서드에서 사용 
//
//class PlayLotto{
//	int lotteryNumber1;
//	int lotteryNumber2;
//	int lotteryNumber3;
//	int lotteryNumber4;
//	int lotteryNumber5;
//	int lotteryNumber6;
//	
//	public PlayLotto() {;}
//
//	public PlayLotto(int lotteryNumber1, int lotteryNumber2, int lotteryNumber3, int lotteryNumber4, int lotteryNumber5,
//			int lotteryNumber6) {
//		this.lotteryNumber1 = lotteryNumber1;
//		this.lotteryNumber2 = lotteryNumber2;
//		this.lotteryNumber3 = lotteryNumber3;
//		this.lotteryNumber4 = lotteryNumber4;
//		this.lotteryNumber5 = lotteryNumber5;
//		this.lotteryNumber6 = lotteryNumber6;
//	}
//	
//	
//	PlayLotto getLottoNumber(int[] arData) {
//		PlayLotto playLotto = new PlayLotto(arData[0], arData[1], arData[2], arData[3],arData[4], arData[5]);
//		Random random = new Random();
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] = random.nextInt(1, 46);
//		}
//		return playLotto;
//	}
//}
//
//
//
//public class RandomTask {
//	public static void main(String[] args) {
//		PlayLotto Pl = new PlayLotto();
//		int[] arData = new int[6];
//		PlayLotto playLotto = Pl.getLottoNumber(arData);
//		System.out.println(Pl.getLottoNumber(arData));
//	}
//
//}

package randomTask;

import java.util.Random;

//* 로또 번호를 추첨하는 기능
//1. 반복되는 코드를 반복문으로
//2. 메서드로 생성
//3. 6개를 배열로 리턴
//4. 메인 메서드에서 사용 
public class RandomTask {
   
   int[] getLottoNumbers() {
      Random random = new Random();
      int[] numbers = new int[6];
      for(int i = 0; i < 6; i++) {
         numbers[i] = random.nextInt(46);
      }
      return numbers;
   }
   
   public static void main(String[] args) {
      RandomTask rk = new RandomTask();
      int[] numbers = rk.getLottoNumbers();
      for(int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      }
   }
}









