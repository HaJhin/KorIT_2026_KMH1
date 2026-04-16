package ex3_bufferedstream;

import java.io.FileInputStream;

// 기본 스트림만 있어도 파일을 읽거나 쓰는 것이 가능
// 하지만 속도가 느리거나 기능이 부족할 수 있음
// 한 번에 어느정도 묶어서 읽고 내부 버펴에 저장해뒀다가 꺼내서 씀

// 버퍼 (buffer)
// 데이터를 잠시 저장해두는 임시 공간

// 파일,키보드,네트워크 등을 통해서 읽거나 쓰는 작업은 속도가 느리다
// 자주 접근할 수록 속도가 느려진다.
// 접근 횟수를 줄이고 한 번에 처리량을 늘려 성능을 개선할 수 있다.
public class BufferedInputExample 	{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		
		// 베이스 기반 스트림과 함께 사용
	}
}
