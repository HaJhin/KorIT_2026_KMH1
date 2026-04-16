package ex3_bufferedstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamExample {
	public static void main(String[] args) {
		// DataInputStream
		// DataOutputStream
		// 기본자료형을 단위로 읽고 쓸 수 있게 해준다.
		// int, double, boolean, char같은 값들을 바이트로 직접 변환하지 않고
		// 메서들 편하게 다룰 수 있다.
		
		// .dat : 데이터가 들어있는 파일이다 알려주는 확장자
		
		try(FileOutputStream fos = new FileOutputStream("data.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("data.dat");
			DataInputStream dis = new DataInputStream(fis);) {
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
