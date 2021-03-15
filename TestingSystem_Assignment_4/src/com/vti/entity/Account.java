package com.vti.entity;

import java.time.LocalDate;

public class Account {
	private int accountID;
	private String Email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDate createDate;
	
public Account(String userName) {
		this.userName = userName;
	}
	
	//2-a
	public Account() {
		
	}
	//2-b
	public Account(int accountID, String Email, String firstName, String lastName) {
		this.accountID = accountID;
		this.Email = Email;
		this.fullName = firstName + lastName;
	}
	
	//2-c
	public Account(int accountID, String Email, String userName, String fistName, String lastName, Position position) {
		this.accountID = accountID;
		this.Email = Email;
		this.userName = userName;
		this.fullName = fistName + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}
	
	//2-d
	public Account(int accountID, String Email, String userName, String fistName, String lastName, Position position, LocalDate createDate) {
		this.accountID = accountID;
		this.Email = Email;
		this.userName = userName;
		this.fullName = fistName + lastName;
		this.position = position;
		this.createDate = createDate;
	}
	
	
	
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "accountID : " + accountID + "\nEmail : " + Email + "\nuserName : " + userName + "\nfullName : "
				+ fullName + "\ndepartment : " + department + "\nposition : " + position + "\ncreateDate : " + createDate;
	}
	
	
}
