package fileSelf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTaskSelf {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		String[] foods = {"라면", "짜장면", "울면"};
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt", false));
//		Arrays.asList(foods).stream().forEach((food) -> {
//			try {
//				bufferedWriter.write(food + "\n");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		
//		System.out.println("파일 생성 완료!");
//		bufferedWriter.close();
//		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//		String line = null;
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
//		
//		System.out.println("파일 불러오기 완료!");
//		bufferedReader.close();
		
//		-------- 수정하기
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//		String line = null, temp = "";
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("짜장면")) {
//				temp += "짬뽕" + "\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods_v2.txt", false));
//		bufferedWriter.write(temp);
//		
//		System.out.println("수정이 완료되었습니다");
//		bufferedWriter.close();
		
//		---------삭제하기
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods_v2.txt"));
		String line = null, temp = "";
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("짬뽕")) {
				continue;
			}
			temp += line + "\n";
		}
		bufferedReader.close();
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods_v3.txt", false));
		bufferedWriter.write(temp);
		
		System.out.println("삭제가 완료되었습니다");
		bufferedWriter.close();
		
	}
}
