package com.vti.entity.Encapsulation;

public class Student {
	private int studentID;
	private String studentName;
	private String homeTown;
	private float score;
	
	public Student(String name, String hometown) {
		this.studentName = name;
		this.homeTown = hometown;
		this.score = 0;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public void plusScore(float score) {
		this.score += score;
	}

	@Override
	public String toString() {
		String hocluc = "";
		if(this.score < 4) {
			hocluc = "yeu";
		} else if(this.score >= 4 && this.score < 6) {
			hocluc = "trung binh";
		} else if(this.score >= 6 && this.score < 8) {
			hocluc = "kha";
		} else {
			hocluc = "gioi";
		}
		
		return"StudentName : " + studentName + "\nHometown : " + homeTown
				+ "\nScore : " + score +"\nHoc luc : " + hocluc;
	}
	
	
	

}
