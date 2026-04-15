package ex3_bytestream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		byte[] read = new byte[100];
		// file.txt를 만들고 아무 내용이나 입력
		// FileInputStream을 통해 내용을 읽어온 뒤 뒤집어도 같은 내용인지 아닌지 판별
		try {
			
			FileInputStream fis = new FileInputStream("exam1.txt");
			fis.read(read);
			String ori = new String(read);
			String rev = "";
			for(int i = ori.length()-1; i >= 0; i--) {
				rev += ori.charAt(i);
			}
			if (ori.equals(rev)) System.out.println("회문");
			else System.out.println("회문 아님");
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
