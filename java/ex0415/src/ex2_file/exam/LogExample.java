package ex2_file.exam;

import java.io.File;

public class LogExample {
	public static void main(String[] args) {
		// logs 폴더를 나타내는 File 객체 만들기
		File logDir = new File("logs");
		logDir.mkdirs();
		// 폴더가 존재하지 않으면 "logs폴더가 없습니다." 출력하고 종료하기
		if (!logDir.exists()) {
			System.out.println("logs 폴더 없음");
			return;
		}
		// logs 폴더 안의 파일 중 확장자가 .log인 파일만 찾기
		File[] logFiles = logDir.listFiles((d,name)->name.toLowerCase().endsWith(".log"));
		// .logs파일의 이름과 크기를 바이트 단위로 출력
		int logBytes = 0;
		for (File f : logFiles) {
			System.out.println(f.getName()+" - "+f.length()+"byte");
			logBytes += f.length();
		}
		// 마지막에 .log 파일 개수와 전체 용량 합계 출력
		System.out.println("log 파일 개수 : "+logFiles.length);
		System.out.println("전체 용량 : "+logBytes+"byte");
	}
}
