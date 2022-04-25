package shopping;

public class LoginDTO { // 로그인

	private int number;
	private String id; // 아이디
	private String password; // 비밀번호
	private String name; // 이름
	private String email; // 이메일
	private String phoneNumber; // 휴대폰 번호

	public LoginDTO() {

	}

	public LoginDTO(int number, String id, String password, String name, String email, String phoneNumber) {

		this.number = number;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "LoginDTO [number=" + number + ", id=" + id + ", password=" + password + ", name=" + name + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
