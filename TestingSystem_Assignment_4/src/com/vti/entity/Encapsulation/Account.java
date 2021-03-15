package com.vti.entity.Encapsulation;

public class Account {
	private String ID;
	private String name;
	private int balance;
	
	public Account(String id, String name, int balance) {
		this.ID = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount) {
		return amount;
	}
	
	public int debit(int amount) {
		return amount;
	}
	
	public void transferTo(Account account, int amount) {
		
	}
}
