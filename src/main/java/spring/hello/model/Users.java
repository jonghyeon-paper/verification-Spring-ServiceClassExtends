package spring.hello.model;

import java.io.Serializable;

import spring.hello.element.UsersGender;

//@Alias("Users") // default camel case
public class Users implements Serializable {

	private static final long serialVersionUID = 7126132316099798710L;

	private String userId;
	private String username;
	private String password;
	private boolean enabled;
	private UsersGender gender;
	private String joinDate;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public UsersGender getGender() {
		return gender;
	}
	public void setGender(UsersGender gender) {
		this.gender = gender;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", gender=" + gender + ", joinDate=" + joinDate + "]";
	}
	
}
