package test1;

public class User {
	String id;
	String password;
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public byte[] byteData() {
		String data = new String().format("%s:%s\n",id,password);
		byte[] byteD = data.getBytes();
		return byteD;
	}
}
