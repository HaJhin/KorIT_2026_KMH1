package ex2_file.exam;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		// 1. 폴더가 없으면 생성
		File dir = new File("Matasaburo");
		if (!dir.exists()) {
			boolean created = dir.mkdirs();
			if (created) {
				System.out.println("바람의 마타사부로");
			} else {
				System.out.println("돗돗도 도도우도");
				return;
			}
		}
		// 2. 폴더인지 확인
		if (!dir.isDirectory()) {
			System.out.println("풋호두도 날려버려라");
			return;
		} 
		// 3. 내부 목록 조회
		File[] items = dir.listFiles();
		if(items == null) {
			System.out.println("불어라, 신록의 바람");
			return;
		}
		
		for(File item:items) {
			if(item.isDirectory()) {
				System.out.println("[DIR]" + item.getName());
			}
		}
	}
}
