package fileSelf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSelf {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileSelf.txt", false));
		bufferedWriter.write("복습하고 있어요~\n코딩 잘하는법좀 알려주세요!");
		bufferedWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fileSelf.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		
	}
}
