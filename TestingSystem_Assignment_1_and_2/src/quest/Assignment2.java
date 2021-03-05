package quest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Assignment2 extends Assignment1 {
//Exercise 1
	// Q1
	public void A2_11() {

		try {
			int check = 0;

			inValue();
			System.out.printf("Nhap AccountID: ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();

			for (int i = 0; i < listAccount.size(); i++) {

				if (id == listAccount.get(i).getAccountID()) {

					if (listAccount.get(i).getDepartment() == null) {

						System.out.println("Nhân viên này chưa có phòng ban");
					} else {
						System.out.println("Phòng ban của nhân viên này là "
								+ listAccount.get(i).getDepartment().getDepartmentName());
					}
					check = 0;
					break;

				} else {
					check = 1;
				}
			}

			if (check == 1) {
				System.out.println("Account isn't exists");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Q2
	public void A2_12() {
		try {
			int check = 0;

			inValue();

			System.out.printf("Nhap AccountID: ");
			Scanner sc = new Scanner(System.in);

			int id = sc.nextInt();

			for (int i = 0; i < listAccount.size(); i++) {

				if (id == listAccount.get(i).getAccountID()) {

					if (listAccount.get(i).getGroups() == null) {

						System.out.println("Nhân viên này chưa có group");

					} else if (listAccount.get(i).getGroups().size() == 1
							|| listAccount.get(i).getGroups().size() == 2) {

						System.out.println("Group của nhân viên\r\n" + "này là Java Fresher, C# Fresher.");
					} else if (listAccount.get(i).getGroups().size() == 3) {
						System.out.println("Nhân viên này là người\r\n" + "quan trọng, tham gia nhiều group.");
					} else if (listAccount.get(i).getGroups().size() == 4) {
						System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group.");

					}

					check = 0;
					break;

				} else {
					check = 1;
				}
			}

			if (check == 1) {
				System.out.println("Account isn't exists");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Q4
	public void A2_14() {

		try {
			inValue();
			int check = 0;
			System.out.printf("Nhap AccountID: ");
			Scanner sc = new Scanner(System.in);

			int id = sc.nextInt();

			for (int i = 0; i < listAccount.size(); i++) {
				if (id == listAccount.get(i).getAccountID()) {
					if (listAccount.get(i).getPosition().getPositionName().equals("Dev")) {
						System.out.println("Đây là Developer");
					} else {
						System.out.println("Người này không phải là Developer");
					}
					check = 0;
					break;
				} else {
					check = 1;
					break;
				}

			}
			if (check == 1) {
				System.out.println("nhap id sai");
			}

		} catch (Exception e) {
			System.out.println("phai nhap chu so");
		}
	}

	// Q5
	public void A2_15() {
		inValue();
		int num = acc1.getGroups().size();
		switch (num) {
		case 1: {
			System.out.println("Nhom co mot thanh vien");
			break;
		}
		case 2: {
			System.out.println("Nhom co hai thanh vien");
			break;
		}
		case 3: {
			System.out.println("Nhom co ba thanh vien");
			break;
		}
		default: {
			System.out.println("Nhom co nhieu thanh vien");
			break;
		}
		}
	}

	// Q6
	public void A2_16() {
		inValue();
		int num = acc2.getGroups().size();
		switch (num) {
		case 1:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;

		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
	}

	// Q7
	public void A2_17() {
		inValue();
		int num = acc1.getPosition().getPositionID();
		switch (num) {
		case 1:
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
	}

	// Q8
	public void A2_18() {
		inValue();
		for (Account i : listAccount) {

			System.out.println("Email: " + i.geteMail());
			System.out.println("FullName: " + i.getFullName());
			System.out.println("Department name: " + i.getDepartment().getDepartmentName() + "\n");
		}
	}

	// Q9
	public void A2_19() {
		inValue();

		for (Department i : departmentList) {

			System.out.println("ID: " + i.getDepartmentID());
			System.out.println("Name: " + i.getDepartmentName());
		}
	}

	// Q10
	public void A2_110() {
		inValue();
		int a = listAccount.size();
		for (Account i : listAccount) {
			System.out.println("Thong tin account " + i.getAccountID() + " la");
			System.out.println("Email" + i.geteMail());
			System.out.println("Full name");
			/*
			 * System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			 * System.out.println("Email: " + listAccount.get(i).geteMail());
			 * System.out.println("Full name: " + listAccount.get(i).getFullName());
			 * System.out.println("Phong ban: " +
			 * listAccount.get(i).getDepartment().getDepartmentName());
			 */
		}
	}

	// Q11
	public void A2_111() {
		inValue();
		for (int i = 0; i < departmentList.size(); i++) {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("ID: " + departmentList.get(i).getDepartmentID());
			System.out.println("Name: " + departmentList.get(i).getDepartmentName());
		}
	}

	// Q12
	public void A2_112() {
		inValue();
		for (int i = 0; i < 2; i++) {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("ID: " + departmentList.get(i).getDepartmentID());
			System.out.println("Name: " + departmentList.get(i).getDepartmentName());
		}
	}

	// Q13
	public void A2_113() {
		inValue();
		for (int i = 0; i < listAccount.size(); i++) {
			if (listAccount.get(i).getAccountID() != 2) {
				System.out.println("Thong tin account thu " + (i + 1) + " la: ");
				System.out.println("Email: " + listAccount.get(i).geteMail());
				System.out.println("Full name: " + listAccount.get(i).getFullName());
				System.out.println("Phong ban: " + listAccount.get(i).getDepartment().getDepartmentName() + "\n");
			} else {
				continue;
			}
		}
	}

	// Q14
	public void A2_114() {
		inValue();
		for (int i = 0; i < listAccount.size(); i++) {
			if (listAccount.get(i).getAccountID() < 4) {
				System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
				System.out.println("ID: " + departmentList.get(i).getDepartmentID());
				System.out.println("Name: " + departmentList.get(i).getDepartmentName());
				
			} else {
				continue;
			}
		}
	}

	// Q15
	public void A2_115() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Q16
	public void A2_116() {
		// q12
		inValue();
		int i = 0;
		while (i < departmentList.size()) {
			if (i < 2) {
				System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
				System.out.println("ID: " + departmentList.get(i).getDepartmentID());
				System.out.println("Name: " + departmentList.get(i).getDepartmentName());
				
			} else {
				break;
			}
			i++;
		}
		System.out.println("\n");
	}

	// Q17
	public void A2_117() {
		// q10
		inValue();
		int i = 0;
		do {
			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + listAccount.get(i).geteMail());
			System.out.println("Full name: " + listAccount.get(i).getFullName());
			System.out.println("Phong ban: " + listAccount.get(i).getDepartment().getDepartmentName());
			i++;
		} while (i < listAccount.size());
	}

//Exercise 2
	// Q1
	public void A2_21() {
		int i = 5;
		System.out.println(i);
	}

	// Q2
	public void A2_22() {
		int i = 100000000;
		Locale locale = new Locale("US");
		System.out.printf(locale.US, "%,d %n", i);
	}

	// Q3
	public void A2_23() {
		double i = 5.567098;
		System.out.printf("%.4f\n", i);
	}

	// Q4
	public void A2_24() {
		String str = "Nguyen Van A";
		System.out.println("Ten toi la " + str + " va toi dang doc than.");
	}

	// Q5
	public void A2_25() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		String str = simpleDatetFormat.format(date);
		System.out.println(str);

	}

	// Q6
	public void A2_26() {
		inValue();
		System.out.println("Email\t\t\tFullname\t\tDepartment");
		for (Account i : listAccount) {

			System.out.printf(i.geteMail() + "\t");
			System.out.printf(i.getFullName() + "\t\t");
			System.out.println(i.getDepartment().getDepartmentName() + "\n");
		}
	}

//Exercise 3 LocalDate
	// Q1
	public void A2_31() {
		inValue();
		Locale locale = new Locale("vn", "VI");

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(e1.getCreateDate().atStartOfDay(defaultZoneId).toInstant());
		
		String str = dateFormat.format(date);
		System.out.println("ID : " + e1.getExamID());
		System.out.println("CreatorID : " + e1.getCreator().getAccountID());
		System.out.println("CreateDate : " + str );
	}

	// Q2 
	public void A2_32() {
		inValue();
		System.out.println("Exam 1:");
		String pattern = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(e1.getCreateDate().atStartOfDay(defaultZoneId).toInstant());
		String str = simpleDatetFormat.format(date);
		System.out.println("Create Date: " + str);

	}
	
	//Q3
	public void A2_33() {
		inValue();
		System.out.println("Question 2: ");
		String pattern = "yyyy";
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		ZoneId defaultZoneId =ZoneId.systemDefault();
		Date date = Date.from(q1.getCreateDate().atStartOfDay(defaultZoneId).toInstant());
		String str = simpleDatetFormat.format(date);
		System.out.println(" CreateYear : " + str);
	}
	
	//Q4
	public void A2_34() {
		inValue();
		System.out.println("Question 2: ");
		String pattern = "yyyy-MM";
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		ZoneId defaultZoneId =ZoneId.systemDefault();
		Date date = Date.from(q1.getCreateDate().atStartOfDay(defaultZoneId).toInstant());
		String str = simpleDatetFormat.format(date);
		System.out.println(" CreateYear : " + str);
	}
	
	//Q5
	public void A2_35() {
		inValue();
		System.out.println("Question 2: ");
		String pattern = "MM-dd";
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		ZoneId defaultZoneId =ZoneId.systemDefault();
		Date date = Date.from(q1.getCreateDate().atStartOfDay(defaultZoneId).toInstant());
		String str = simpleDatetFormat.format(date);
		System.out.println(" CreateYear : " + str);
	}
	// Exercise 4
	// Q1
	public void A2_41() {
		Random rd = new Random();
		System.out.println(rd.nextInt());
	}

	// Q2
	public void A2_42() {
		Random rd = new Random();
		System.out.println(rd.nextDouble());
	}

	// Q3
	public void A2_43() {
		String[] arr = { "Kien", "Viet Anh", "Thinh", "Viet", "Duc" };
		Random rd = new Random();
		int num = rd.nextInt(arr.length);
		System.out.println(arr[num]);
	}

	// Q4
	public void A2_44() {
		Random rd = new Random();
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomDay = minDay + rd.nextInt(maxDay - minDay);
		LocalDate radomDate = LocalDate.ofEpochDay(randomDay);
		System.out.println(radomDate);
	}

	// Q5
	public void A2_45() {
		Random rd = new Random();
		int day = (int) LocalDate.now().toEpochDay();
		long randomDay = day - 365 + rd.nextInt(365);
		LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
		System.out.println(randomDate);
	}

	// Q6
	public void A2_46() {
		Random rd = new Random();
		int day = (int) LocalDate.now().toEpochDay();
		long randomDay = rd.nextInt(day - 1);
		LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
		System.out.println(randomDate);
	}

	// Q7
	public void A2_47() {
		Random rd = new Random();
		int soCoBaChuSo = 100 + rd.nextInt(899);
		System.out.println(soCoBaChuSo);
	}

//Exercise 5

	// Q1
	public void A2_51() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhap so thu " + (i + 1) + " ");
			int num = sc.nextInt();
		}
	}

	// Q2
	public void A2_52() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so thu nhat : ");
		double num1 = sc.nextDouble();
		System.out.printf("Nhap so thu hai : ");
		double num2 = sc.nextDouble();
	}

	// Q3
	public void A2_53() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap ho ten: ");
		String name = sc.next();
	}

	// Q4
	public void A2_54() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap ngay thang: ");
		String date = sc.next();
	}

	// Q5
	public void A2_55() {
		inValue();
		Scanner sc = new Scanner(System.in);
		Account accountTemp = new Account();

		System.out.printf("Nhap accountID: ");
		accountTemp.setAccountID(sc.nextInt());
		System.out.printf("Nhap Email: ");
		accountTemp.seteMail(sc.next());
		System.out.printf("Nhap username: ");
		accountTemp.setUserName(sc.next());
		System.out.println("Nhap fullname: ");
		accountTemp.setFullName(sc.next());
		System.out.println("Chon position: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			accountTemp.setPosition(pos1);
			System.out.println("Nhan vien nay la " + accountTemp.getPosition().getPositionName());
			break;
		case 2:
			accountTemp.setPosition(pos2);
			System.out.println("Nhan vien nay la " + accountTemp.getPosition().getPositionName());
			break;
		case 3:
			accountTemp.setPosition(pos3);
			System.out.println("Nhan vien nay la " + accountTemp.getPosition().getPositionName());
			break;
		default:
			System.out.println("Khong phu hop");
			break;
		}

	}

	// Q6
	public void A2_56() {
		Scanner sc = new Scanner(System.in);
		Department depTemp = new Department();
		System.out.printf("Nhap departmentID moi: ");
		depTemp.setDepartmentID(sc.nextInt());
		System.out.printf("Nhap department name moi: ");
		depTemp.setDepartmentName(sc.next());
	}

	// Q7
	public void A2_57() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so chan: ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				break;
			} else {
				System.out.println("Nhap lai");
				continue;
			}
		}
	}

	// Q8
	public void A2_58() {
		while (true) {
			System.out.printf("Moi ban nhap vao chuc nang muon su dung <1-2>: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				A2_55();
				break;
			case 2:
				A2_56();
				break;
			default:
				System.out.println("Moi ban nhap lai");
				continue;
			}
		}
	}

	// Q9
	public void A2_59() {
		inValue();

		int numID = 0;
		for (Account account : listAccount) {
			System.out.println("username " + account.getAccountID() + " : " + account.getFullName());
		}
		System.out.printf("Nhap username muon tron: ");
		Scanner sc = new Scanner(System.in);
		String nameInput = sc.next();
		for (int i = 0; i < listAccount.size(); i++) {
			if (listAccount.get(i).getUserName().equalsIgnoreCase(nameInput) == true) {
				System.out.println("True");
				numID = i;

			} else {
				System.out.println("khong co username nay");
			}
		}

		List<Group> groupList = new ArrayList<>();
		groupList.add(gr1);
		groupList.add(gr2);
		groupList.add(gr3);
		System.out.println("Ten cac group: ");
		for (int i = 0; i < groupList.size(); i++) {
			System.out.printf(groupList.get(i).getGroupName() + "\t");
		}
		System.out.printf("\nNhap ten group muon tron: ");
		String groupInput = sc.next();

		for (int i = 0; i < groupList.size(); i++) {
			if (groupList.get(i).getGroupName().equalsIgnoreCase(groupInput) == true) {
				System.out.println("true");

				listAccount.get(numID).groups.add(groupList.get(i));

			} else {
				System.out.println("khong co ten group nay");
			}
		}

	}

	// Q10
	public void A2_510() {
		inValue();
		while (true) {
			System.out.printf("Moi ban nhap vao chuc nang muon su dung <1-2-3>: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				A2_55();
				break;
			case 2:
				A2_56();
				break;
			case 3:
				A2_59();
			default:
				System.out.println("Moi ban nhap lai");
				continue;
			}
		}
	}

	// Q11
	public void chucNangThemAccVaoRandomGroup() {
		inValue();
		int numID = 0;
		for (Account account : listAccount) {
			System.out.println("username " + account.getAccountID() + " : " + account.getFullName());
		}
		System.out.printf("Nhap username muon tron: ");
		Scanner sc = new Scanner(System.in);
		String nameInput = sc.next();
		for (int i = 0; i < listAccount.size(); i++) {
			if (listAccount.get(i).getUserName().equalsIgnoreCase(nameInput) == true) {
				System.out.println("True");
				numID = i;

			} else {
				System.out.println("khong co username nay");
			}
		}

		List<Group> groupList = new ArrayList<>();
		groupList.add(gr1);
		groupList.add(gr2);
		groupList.add(gr3);

		Random rd = new Random();
		int randomGroup = rd.nextInt(groupList.size() - 1);

		listAccount.get(numID).groups.add(groupList.get(randomGroup));

	}
	
	public void A2_511() {
		inValue();
		while (true) {
			System.out.printf("Moi ban nhap vao chuc nang muon su dung 1=>4: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				A2_55();
				break;
			case 2:
				A2_56();
				break;
			case 3:
				A2_59();
			case 4:
				chucNangThemAccVaoRandomGroup();
			default:
				System.out.println("Moi ban nhap lai");
				continue;
			}
		}
	}
	
//Exercise 6
	//Q1
	public void A2_61() {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
			
		}
	}
	
	//Q2
	public void A2_62() {
		inValue();
		for (Account account : listAccount) {
			System.out.println(account.toString());
			
		}
	}
	
	//Q3
	public void A2_63() {
		for (int i = 0; i < 10; i++) {
			System.out.printf(i + "  ");
		}
	}
}
