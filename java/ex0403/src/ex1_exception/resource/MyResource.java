package ex1_exception.resource;

public class MyResource implements AutoCloseable{
	private String name;

	// 생성자를 통해 name 필드 초기화
	public MyResource(String name) {
		super();
		this.name = name;
	}
	
	public String read1() {
		System.out.println("[MyResource("+name+")열기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource("+name+")열기]");
		return "ABC";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource("+name+")닫기]");
	} //	
	
} // MyResource ed
