package com.vti.frontend;
import com.vti.entity.*;
import com.vti.entity.Encapsulation.Student;


//
public class demo2_Student_Encapsulation {
	public static void main(String[] args) {
		Student student1 = new Student("Thanh Nam", "Cau Giay");
		student1.plusScore(6);
		System.out.println(student1);
	}
	
}
