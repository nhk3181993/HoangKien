package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	private String  groupName;
	private String creator;
	private Account[] accounts;
	private LocalDate  createDate;
	
	//3-a
	public Group() {
		
	}
	
	//3-b
	public Group(String groupName, String creator, Account[] accounts, LocalDate createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
		
	}
	
	//3-c
	public Group(String groupName, String creator, String[] username, LocalDate createDate) {
		this.groupName = groupName;
		this.creator = creator;
		Account[] accounts2 =new Account[username.length];
		for(int i = 0; i < username.length; i++) {
			accounts2[i] = new Account(username[i]);
		}
		this.createDate = createDate;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", creator=" + creator + ", accounts=" + Arrays.toString(accounts)
				+ ", createDate=" + createDate + "]";
	}
	
	
}
