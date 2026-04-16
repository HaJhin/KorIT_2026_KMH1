package ex2_characterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Converter {
	
	public void copy(String source,String target) {
		
		try (FileInputStream fr = new FileInputStream(source);
				FileOutputStream copy = new FileOutputStream(target);
				FileOutputStream log = new FileOutputStream("log.txt");) {
			int data = 0;
			long countByte = 0;
			
			byte[] buffer = new byte[1024];
			System.out.println("복사 시작");
			while ((data = fr.read(buffer))!=-1) {
				copy.write(buffer,0,data);
				countByte += data;
			}
			
			System.out.println("복사 종료");
			System.out.println("총 바이트 수 : "+countByte);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
