package optionalSelf;

import java.util.Objects;

public class UserSelf {
	private Long id;
	private String userName;
	private String userPassword;
	private String userEmail;
	private static Long seq;
	
	static {
		seq = 1L;
	}
	
	{
		this.id = seq++;
	}

	
	public UserSelf() {;}
	public UserSelf(String userName, String userPassword, String userEmail) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}
	Long getId() {
		return id;
	}
	void setId(Long id) {
		this.id = id;
	}
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	String getUserPassword() {
		return userPassword;
	}
	void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	String getUserEmail() {
		return userEmail;
	}
	void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	static Long getSeq() {
		return seq;
	}
	static void setSeq(Long seq) {
		UserSelf.seq = seq;
	}
	
	@Override
	public String toString() {
		return "UserSelf [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSelf other = (UserSelf) obj;
		return Objects.equals(id, other.id);
	}
	
}
