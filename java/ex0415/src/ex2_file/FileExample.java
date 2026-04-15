package ex2_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
	public static void main(String[] args) {
		
		File f = new File("src/ex2_file/test");
		// 절대 경로
		// 운영체제 기준으로 전체위치가 명확한 경로
		
		// 상대 경로
		// 현재 프로그램 실행 위치를 기준으로 한 경로
		// 상대 경로는 편하지만 프로그램을 어디서 실행하느냐에 따라 기준 위치가
		// 달라질 수 있다.
		
		// exist()
		// 파일이나 폴더가 실제로 존재하는지 확인
		if(f.exists()) {
			System.out.println("파일이 존재함");
		} else {
			System.out.println("파일이 존재하지 않음");
		} // if else ed
		
		// isFile()
		// 최종 목적지가 파일인지 확인
		if(f.isFile()) {
			System.out.println("파일임");
		} else System.out.println("파일 아님");
		
		// length()
		// 파일 크기를 바이트 단위로 반환
		System.out.println(f.length());
		
		// lastModified()
		// 마지막 수정 시간을 밀리초 단위로 반환
		f.lastModified();
		
		// createNewFile()
		// 실제 빈 파일 생성
		// 이미 있으면 false 반환
		File f2 = new File("secondfile.txt");
		try {
			boolean result = f2.createNewFile();
			System.out.println(result ? "성공":"실패");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// mkdir()
		// 폴더를 생성해준다
		File dir = new File("myFolder");
		boolean result2 = dir.mkdir();
		if (result2) System.out.println("폴더 생성");
		else System.out.println("이미 존재하는 폴더");
		
		// mkdirs()
		// 필요한 상위 폴더까지 모두 생성
		dir = new File("a/b/c");
		result2 = dir.mkdirs();
		if (result2) System.out.println("폴더들 생성");
		else System.out.println("폴더 이미 있삼");
		
		// mkdirs()는 폴더 1개만 생성 가능
		// mkdir()는 폴더 여러개 생성 불가능
		
		// delete()
		// 파일 또는 빈 폴더 삭제
		result2 = f2.delete();
		if (result2) System.out.println("삭제 완료");
		else System.out.println("삭제 실패");
		
		// 폴더는 내부가 비어있어야 삭제 가능
		// 안에 파일이 있으면 바로 삭제 X
		
		// list()
		// 이름 목록을 문자열 배열로 반환
		dir = new File("C:\\Users\\adminn\\Desktop\\KorIT_KMH\\java\\ex0415\\secondfile");
		String[] names = dir.list();
		if(names!=null) System.out.println(Arrays.toString(names));
		
		// listFile()
		// File[] 배열로 반환
		File[] files = dir.listFiles((d,name) -> name.endsWith(name));
		
		for(File file : files) {
			System.out.println(file.getName());
		}
		
		// File로는 파일 안에 쓰여진 내용을 읽고 쓸 수는 없다
		// 파일 그 자체가 아리나 파일의 위치정보와 상태정보를 담당한다.
	}
}
