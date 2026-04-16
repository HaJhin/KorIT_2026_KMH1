package ex1_bytestream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			// 내가 기록하려 할때 목적지가 없어질수도 있어서 예외처리를 해줘야 함
			
			// 목적지에 파일이나 폴더가 없으면 만들어줌
			fos = new FileOutputStream("test.txt");
			String message = "\n메세지 작성.\n";
			
			// 목적지까지 가서 작성하려고 할 때 없을 수도 있기 때문에
			// 예외가 발생할 수 있어 예외처리
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			fos.write(message.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos!=null) {
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	} // main ed
}
