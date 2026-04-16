package ex1_bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyExample {
	public static void main(String[] args) {
		// 상대 경로에 있는 이미지 파일을 바이트 기반 스트림으로 읽어오기
		// 복사본 만들기 : image_copy.jpg
		// 복사하면서 걸리는 시간 currentTimeMillis(); 로 측정
		
		FileInputStream in = null;
		FileOutputStream copy = null;
		try {
			in = new FileInputStream("image.jpg");
			copy = new FileOutputStream("image_copy.jpg");
			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작");
			
			int data = 0;
			// 파일을 읽어와서
			while((data = in.read())!= -1) {
				// buffer의 0부터 data개만큼 출력파일에 기록
				copy.write(buffer,0,data);
			}
			// 파일은 4mb
			// 우리가 전달한 배열은 512바이트
			// 우리가 전달한 파일을 512바이트씩 잘라서 여러번 읽고 쓰는 방식
			
			System.out.println("이미지 복사 종료");
			long ed = System.currentTimeMillis();
			long time = (ed-start)/1000;
			System.out.println(time+"초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (copy!=null) copy.close();
				if (in!=null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // finally ed
		
		
	} // main
}
