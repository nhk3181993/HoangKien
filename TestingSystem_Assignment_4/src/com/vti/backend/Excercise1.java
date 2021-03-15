package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.*;

public class Excercise1 {

	public void ex1() {
		Department department1a = new Department();
		Department department1b = new Department("check 2");
		System.out.println(department1b);
		System.out.println(department1b);

		Position pos1 = new Position(1, "tool1");
		Position pos2 = new Position(2, "tool2");
		

		// 2
		Account account2a = new Account();
		Account account2b = new Account(2, "bb@gmail.com", "Tran", "Cuong");
		Account account2c = new Account(3, "cc@gmail.com", "thichthinhich", "Thich", "Thi Nhich", pos2);
		Account account2d = new Account(4, "dd@gmail.com", "luyenlv", "Le", "Van Luyen", pos1,
				LocalDate.of(2020, 02, 01));
		
		System.out.println(account2a);
		System.out.println(account2b);
		System.out.println(account2c);
		System.out.println(account2d);
		// System.out.println(account2d.toString());

		// 3
		Group group3a = new Group();
		Account[] accounts = { account2a, account2b };
		Group group3b = new Group("groupb", "an", accounts, LocalDate.of(2020, 01, 31));
		String[] usernames = { "Dong Ta", "Tay Doc" };
		Group group3c = new Group("groupC", "uong", usernames, LocalDate.of(2020, 02, 02));
		
		System.out.println(group3a);
		System.out.println(group3b);
		System.out.println(group3c);

	}
}