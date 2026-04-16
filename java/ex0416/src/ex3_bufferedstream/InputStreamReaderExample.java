package ex3_bufferedstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
	public static void main(String[] args) {
		// InputStreamReader
		// Java 입출력에서 바이스 스트림을 문자 스트림으로 변환해주는 다리 역할
		try(FileInputStream in = new FileInputStream("test.txt");
				InputStreamReader is = new InputStreamReader(in,"UTF-8")) {
			int read = 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
