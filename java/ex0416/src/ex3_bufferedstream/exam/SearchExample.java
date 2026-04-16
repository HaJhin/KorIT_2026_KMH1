package ex3_bufferedstream.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		// 사용자로부터 검색할 단어를 입력받고 stroy.txt파일에서 해당단어가 포함된 줄 출력
		File file = new File("stroy.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String keyword = null;
		byte[] read = new byte[(int)file.length()];
		try (FileInputStream fis = new FileInputStream("stroy.txt")) {
			System.out.print("키워드 입력 : ");
			keyword = br.readLine();
			fis.read(read);
			String[] txt = new String(read).split("\n");
			
			System.out.println("=== 키워드가 포함된 단어 출력 ===");
			for (String str : txt) {
				if (str.contains(keyword)) System.out.print(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
