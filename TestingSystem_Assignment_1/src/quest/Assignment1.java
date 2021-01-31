/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Assignment1 {

	Department dep1 = new Department();
	Department dep2 = new Department();
	Department dep3 = new Department();
	
	List<Department> departments = new ArrayList<>();

	Position pos1 = new Position();
	Position pos2 = new Position();
	Position pos3 = new Position();

	Account acc1 = new Account();
	Account acc2 = new Account();
	Account acc3 = new Account();
	Account acc4 = new Account();

	List<Account> listAccount = new ArrayList<>();

	Group gr1 = new Group();
	Group gr2 = new Group();
	Group gr3 = new Group();

	TypeQuestion tq1 = new TypeQuestion();
	TypeQuestion tq2 = new TypeQuestion();

	CategoryQuestion cq1 = new CategoryQuestion();
	CategoryQuestion cq2 = new CategoryQuestion();
	CategoryQuestion cq3 = new CategoryQuestion();

	Question q1 = new Question();
	Question q2 = new Question();
	Question q3 = new Question();

	Answer a1 = new Answer();
	Answer a2 = new Answer();
	Answer a3 = new Answer();

	Exam e1 = new Exam();
	Exam e2 = new Exam();
	Exam e3 = new Exam();

	public void inValue() {

		// insert Department

		dep1.setDepartmentID(1);
		dep1.setDepartmentName("sale");

		dep2.setDepartmentID(2);
		dep2.setDepartmentName("marketing");

		dep3.setDepartmentID(3);
		dep3.setDepartmentName("Quan ly");
		
		
		departments.add(dep1);
		departments.add(dep2);
		departments.add(dep3);

		// insert Position

		pos1.setPositionID(1);
		pos1.setPositionName("Dev");

		pos2.setPositionID(2);
		pos2.setPositionName("Test");

		pos3.setPositionID(3);
		pos3.setPositionName("PM");

		// insert Account

		acc1.setAccountID(1);
		acc1.seteMail("kiennh@gmail.com");
		acc1.setUserName("kiennh");
		acc1.setFullName("Nguyen Hoang Kien");
		acc1.setDepartment(dep3);
		acc1.setPosition(pos3);
		acc1.setCreateDate(Date.valueOf("2020-11-12"));

		acc2.setAccountID(2);
		acc2.seteMail("vietanh@gmail.com");
		acc2.setUserName("vietanh");
		acc2.setFullName("Nguyen Viet Anh");
		acc2.setDepartment(dep2);
		acc2.setPosition(pos2);
		acc2.setCreateDate(Date.valueOf("2020-12-12"));

		acc3.setAccountID(3);
		acc3.seteMail("huonggiang@gmail.com");
		acc3.setUserName("huonggiang");
		acc3.setFullName("Luu Huong Giang");
		acc3.setDepartment(dep1);
		acc3.setPosition(pos1);
		acc3.setCreateDate(Date.valueOf("2020-12-30"));

		acc4.setAccountID(4);
		acc4.seteMail("ngonthian@gmail.com");
		acc4.setUserName("anngonlam");
		acc4.setFullName("Ngon Thi An");
		acc4.setCreateDate(Date.valueOf("2020-12-31"));

		// List<Account> listAccount = new ArrayList<>();
		listAccount.add(acc1);
		listAccount.add(acc2);
		listAccount.add(acc3);
		listAccount.add(acc4);

		// insert Group

		gr1.setGroupID(1);
		gr1.setGroupName("lam viec");
		gr1.setCreator(acc1);
		gr1.setCreateDate(Date.valueOf("2021-01-01"));

		gr2.setGroupID(2);
		gr2.setGroupName("vo dung");
		gr2.setCreator(acc2);
		gr2.setCreateDate(Date.valueOf("2021-01-02"));

		gr3.setGroupID(3);
		gr3.setGroupName("an choi");
		gr3.setCreator(acc3);
		gr3.setCreateDate(Date.valueOf("2021-01-03"));

		// GroupAccount
		List<Group> groupAccount1 = new ArrayList<>();
		groupAccount1.add(gr1);
		groupAccount1.add(gr2);
		acc2.setGroups(groupAccount1);

		List<Group> groupAccount2 = new ArrayList<>();
		groupAccount2.add(gr1);
		groupAccount2.add(gr2);
		groupAccount2.add(gr3);
		acc1.setGroups(groupAccount2);

		// insert TypeQuestion

		tq1.setTypeID(1);
		tq1.setTypeName("Essay");

		tq2.setTypeID(2);
		tq2.setTypeName("Multiple Choice");

		// insert CategoryQuestion

		cq1.setCategoryID(1);
		cq1.setCategoryName("chem gio");

		cq2.setCategoryID(2);
		cq2.setCategoryName("chon bua");

		cq3.setCategoryID(3);
		cq3.setCategoryName("hen xui");

		// insert Question

		q1.setQuestionID(1);
		q1.setContent("do tra vao sua hay sua vao tra?");
		q1.setCategory(cq2);
		q1.setType(tq1);
		q1.setCreator(acc3);
		q1.setCreateDate(Date.valueOf("2021-02-01"));

		q2.setQuestionID(2);
		q2.setContent("lua chay thanh gio hay gio thoi thanh lua");
		q2.setCategory(cq3);
		q2.setType(tq1);
		q2.setCreator(acc1);
		q2.setCreateDate(Date.valueOf("2021-02-02"));

		q3.setQuestionID(3);
		q3.setContent("qua trung hay con ga co truoc :  A. Con ga  B. Qua trung");
		q3.setCategory(cq1);
		q3.setType(tq2);
		q3.setCreator(acc2);
		q3.setCreateDate(Date.valueOf("2021-02-03"));

		// insert Answer

		a1.setAnswerID(1);
		a1.setContent("cai nao truoc cung dc, do nhu nhau");
		a1.setQuestion(q1);
		a1.setIsCorrect(Boolean.TRUE);

		a2.setAnswerID(2);
		a2.setContent("con tuy truong hop");
		a2.setQuestion(q2);
		a2.setIsCorrect(Boolean.TRUE);

		a3.setAnswerID(3);
		a3.setContent("B");
		a3.setQuestion(q3);
		a3.setIsCorrect(Boolean.FALSE);

		// insert Exam

		e1.setExamID(1);
		e1.setCode(101);
		e1.setTitle("an uong");
		e1.setCategory(cq2);
		e1.setDuration(Time.valueOf("00:30:00"));
		e1.setCreator(acc3);
		e1.setCreateDate(Date.valueOf("2021-02-01"));

		e2.setExamID(2);
		e2.setCode(102);
		e2.setTitle("dot rung");
		e2.setCategory(cq3);
		e2.setDuration(Time.valueOf("00:30:00"));
		e2.setCreator(acc3);
		e2.setCreateDate(Date.valueOf("2021-02-02"));

		e3.setExamID(3);
		e3.setCode(103);
		e3.setTitle("sinh hoc");
		e3.setCategory(cq1);
		e3.setDuration(Time.valueOf("01:30:00"));
		e3.setCreator(acc3);
		e3.setCreateDate(Date.valueOf("2021-02-03"));

		// insert ExamQuestion
		Question[] ExamQuestion1 = { q1, q2 };
		e1.setQuestions(ExamQuestion1);

		Question[] ExamQuestion2 = { q2, q3 };
		e2.setQuestions(ExamQuestion2);

		Question[] ExamQuestion3 = { q1, q3 };
		e3.setQuestions(ExamQuestion3);

		// -------------------------------------
		ExamQuestion eq1 = new ExamQuestion();
		eq1.setExamID(e1);
		eq1.setQuestionID(q1);

		ExamQuestion eq2 = new ExamQuestion();
		eq2.setExamID(e2);
		eq2.setQuestionID(q2);

		ExamQuestion eq3 = new ExamQuestion();
		eq3.setExamID(e3);
		eq3.setQuestionID(q3);
	}

	public void A1() {

		inValue();
		System.out.println(dep1.getDepartmentID() + "\t" + dep1.getDepartmentName());
		System.out.println(pos1.getPositionID() + "\t" + pos1.getPositionName());
		System.out.println(acc1.getAccountID() + "\t" + acc1.geteMail() + "\t" + acc1.getUserName() + "\t"
				+ acc1.getFullName() + "\t" + acc1.getDepartment().getDepartmentID() + "\t"
				+ acc1.getPosition().getPositionID() + "\t" + acc1.getCreateDate());
		System.out.println(gr1.getGroupID() + "\t" + gr1.getGroupName() + "\t" + gr1.getCreator().getAccountID() + "\t"
				+ gr1.getCreateDate());

		System.out.println(tq1.getTypeID() + "\t" + tq1.getTypeName());
		System.out.println(cq1.getCategoryID() + "\t" + cq1.getCategoryName());
		System.out.println(q1.getQuestionID() + "\t" + q1.getContent() + "\t" + q1.getCategory().getCategoryID() + "\t"
				+ q1.getType().getTypeID() + "\t" + q1.getCreator().getAccountID() + "\t" + q1.getCreateDate());
		System.out.println(a1.getAnswerID() + "\t" + a1.getContent() + "\t" + a1.getQuestion().getQuestionID() + "\t"
				+ a1.getIsCorrect());
		System.out.println(
				e1.getExamID() + "\t" + e1.getCode() + "\t" + e1.getTitle() + "\t" + e1.getCategory().getCategoryID()
						+ "\t" + e1.getDuration() + "\t" + e1.getCreator().getAccountID() + "\t" + e1.getCreateDate());
	}

}
