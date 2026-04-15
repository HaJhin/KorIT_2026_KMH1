package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class LogExample {
	public static void main(String[] args) {
		// error.log파일을 읽어서 ERROR라는 단어가 몇번 등장하는지 출력
		File error = new File("logs/error.log");
		
		byte[] err = new byte[(int)error.length()];
		
		try {
			FileInputStream fis = new FileInputStream("logs/error.log");
			fis.read(err);
			
			String str = new String(err);
			String[] words = str.split("ERROR");
			int count = words.length-1;
			
			System.out.println(count);
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
