package ex3_bufferedstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
	public static void main(String[] args) {
		// 바이트 기반 스트림 OutputStream을 문자 기반의 스트림으로 변환하는 보조스트림
		
		try (FileOutputStream fos = new FileOutputStream("test.txt");
				OutputStreamWriter os = new OutputStreamWriter(fos,"UTF-8")) {
			String[] strArray = {
					"OutputStreamWriter에 대해 배웁니다.",
					"we are learning about OutputStreamWriter"
			};
			// test.txt에 배열에 들어있는 문자열을 순차적으로 넣기
			for (String str : strArray) {
				os.write(str+"\n");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
