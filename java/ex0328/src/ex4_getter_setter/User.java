package ex4_getter_setter;

public class User {
	private String userName;
	private String password;
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if (userName.length() < 4) {
			System.out.println("닉네임은 4글자 이상이어야합니다.");
			return;
		} else this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("비밀번호는 6글자 이상이어야합니다.");
			return;
		} else this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@") == -1) {
			System.out.println("이메일 형식 오류");
		} else this.email = email;
	}
	
	
}
