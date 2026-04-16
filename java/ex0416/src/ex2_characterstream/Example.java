package ex2_characterstream;

import java.io.FileReader;

public class Example {
	public static void main(String[] args) {
		// test.txt 파일에 아무거나 적는다
		// 내용을 읽어와서 대문자 소문자 갯수 찾기
		try (FileReader fr = new FileReader("test.txt")) {
			int data = 0;
			int upper = 0;
			int lower = 0;
			while ((data = fr.read())!=-1) {
				if (data>=97 && 122>=data) {
					lower++;
				} else if (data>= 65 && 90>=data) {
					upper++;
				}
			}
			System.out.println("대문자 : "+upper);
			System.out.println("소문자 : "+lower);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
