package com.vti.entity;

public class Department {
	private int departmentID;
	private String departmentName;
	//Ex1 q1-a
	public Department() {
		
	}
	//ex1 q1-b
	public Department(String departmentName) {
		this.departmentName = departmentName;
		this.departmentID = 0;
	}
	
	
	
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
	
	

}
