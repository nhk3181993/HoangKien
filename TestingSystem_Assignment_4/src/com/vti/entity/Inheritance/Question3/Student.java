package com.vti.entity.Inheritance.Question3;

public class Student extends Person{
	private int ID;
	
	public Student(String name, int id) {
		super(name);
		this.ID = id;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
