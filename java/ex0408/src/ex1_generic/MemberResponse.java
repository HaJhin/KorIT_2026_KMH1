package ex1_generic;

public class MemberResponse<T> {
	boolean success;
	String message;
	T data;
	
	
	public MemberResponse(boolean success, String message, T data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	} // Ctor ed
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getMessage() {
		return message;
	} 
	
	public T getData(T data) {
		return data;
	} 
}
