package fmcg.master.user.data;

import java.util.Collection;
import java.util.Date;

import javax.persistence.OneToMany;

import fmcg.master.setup.data.CommonData;
import fmcg.master.setup.data.PasswordHistory;

public class User extends CommonData {
	private String userId;
	private Date dob;
	private String genter;
	private String firstName;
	private String lastName;
	private String middleName;
	@OneToMany
	private Collection<UserInfo> userInfo;
	@OneToMany
	private Collection<PasswordHistory> passwordHistory;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGenter() {
		return genter;
	}
	public void setGenter(String genter) {
		this.genter = genter;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Collection<UserInfo> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(Collection<UserInfo> userInfo) {
		this.userInfo = userInfo;
	}
	public Collection<PasswordHistory> getPasswordHistory() {
		return passwordHistory;
	}
	public void setPasswordHistory(Collection<PasswordHistory> passwordHistory) {
		this.passwordHistory = passwordHistory;
	}
	

}
