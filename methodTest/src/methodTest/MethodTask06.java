package methodTest;

//   1. 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
//   2. 1번 메서드 사용
public class MethodTask06 {
   
//   .replace(문자열, 대체할 문자열)
//   .replaceAll(문자열, 대체할 문자열)
   
   int getCount(String value, char c) {
      return value.length() - value.replaceAll(String.valueOf(c), "").length();
   }
   
   public static void main(String[] args) {
      MethodTask06 mt = new MethodTask06();
      int count = 0 ;
      count = mt.getCount("abcdeaaa", 'a');
      System.out.println(count);
   }
}
