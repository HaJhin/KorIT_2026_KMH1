package ex2_characterstream;

import java.io.FileReader;

public class FileReaderExample {
	// char기반의 스트림은 Reader,Writer의 자식 클래스들을 사용
	// 기본적으로 2byte를 지원하기 때문에 2byte로 구성된 파일도 쉽게 입출력 가능
	public static void main(String[] args) {
		// try-with-resources
		// 매개변수로 제안된 객체를 자동으로 닫아준다.
		try {
			FileReader fr = new FileReader("test.txt");
			int code = 0;
			while ((code = fr.read())!= -1) {
				System.out.println((char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
