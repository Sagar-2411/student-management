package com.bikkadIt.CrudRepositoryMethod.model;



@Entity
@Table(name="USER_ID")
public class User {
	@Id
	@ Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //automatic increment id 
	private int userId;
	
	@ Column(name="USER_NAME")
	private String username;
	
	@ Column(name="USER_ADDRESS")
	private String userAddress;
	
	@ Column(name="USER_EMAIL")
	private String userEmail;
	
	@ Column(name="USER_AGE")
	private int age;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userAddress=" + userAddress + ", userEmail="
				+ userEmail + ", age=" + age + "]";
	}
	
	
	

}
