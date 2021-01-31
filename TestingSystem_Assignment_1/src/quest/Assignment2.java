package quest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;	
import java.time.LocalDateTime;

public class Assignment2 extends Assignment1 {
//Exercise 1
	//Q1
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
	
	//Q2
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
	
	//Q4
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
	//Q5
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
	
	//Q6
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
	
	//Q7
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
	//Q8
	public void A2_18() {
		inValue();
		try {
			System.out.printf("Nhap AccountID: ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			for (int i = 0; i < listAccount.size(); i++) {
				if (id == listAccount.get(i).getAccountID()) {
					System.out.println("Email: " + listAccount.get(i).geteMail());
					System.out.println("FullName: " + listAccount.get(i).getFullName());
					System.out.println("Department name: " + listAccount.get(i).getDepartment().getDepartmentName());
				} else {
					System.out.println("accountID isn't exists");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Q9
	public void A2_19() {
		inValue();
		try {

			System.out.println("Nhap DepartmentID: ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			for (int i = 0; i < departments.size(); i++) {
				if (id == departments.get(i).getDepartmentID()) {
					System.out.println("ID: " + departments.get(i).getDepartmentID());
					System.out.println("Name: " + departments.get(i).getDepartmentName());
				} else {
					System.out.println("This DepartmentID isn't exists");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Q10
	public void A2_110() {
		inValue();
		for (int i = 0; i < listAccount.size(); i++) {
			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + listAccount.get(i).geteMail());
			System.out.println("Full name: " + listAccount.get(i).getFullName());
			System.out.println("Phong ban: " + listAccount.get(i).getDepartment().getDepartmentName());
		}
	}
	
	//Q11
	public void A2_111() {
		inValue();
		for (int i = 0; i < departments.size(); i++) {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("ID: " + departments.get(i).getDepartmentID());
			System.out.println("Name: " + departments.get(i).getDepartmentName());
		}
	}
	
	//Q12
	public void A2_112() {
		inValue();
		for (int i = 0; i < 2; i++) {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("ID: " + departments.get(i).getDepartmentID());
			System.out.println("Name: " + departments.get(i).getDepartmentName());
		}
	}
	
	//Q13
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
	
	//Q14
	public void A2_114() {
		inValue();
		for (int i = 0; i < 3; i++) {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("ID: " + departments.get(i).getDepartmentID());
			System.out.println("Name: " + departments.get(i).getDepartmentName());
		}
	}
	
	//Q15
	public void A2_115() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	//Q16
	public void A2_116() {
		// q12
		inValue();
		int i = 0;
		while (i < departments.size()) {
			if (i < 2) {
				System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
				System.out.println("ID: " + departments.get(i).getDepartmentID());
				System.out.println("Name: " + departments.get(i).getDepartmentName());
			} else {
				break;
			}
			i++;
		}
		System.out.println("\n");
	}
	
	//Q17
	public void A2_117() {
		//q10
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
	//Q1
	public void A2_21() {
		int i = 5;
		System.out.println(i);
	}
	
	//Q2
	public void A2_22() {
		int i = 100000000;
		Locale locale = new Locale("US");
		System.out.printf(locale.US,"%,d %n", i);
	}
	
	//Q3
	public void A2_23() {
		double i = 5.567098;
		System.out.printf("%.4f\n",i);
	}
	
	//Q4
	public void A2_24() {
		String str = "Nguyen Van A";
		System.out.println("Ten toi la " + str + " va toi dang doc than.");
	}
	
	//Q5
	public void A2_25() {
		Date date = new Date();
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDatetFormat = new SimpleDateFormat(pattern);
		String str = simpleDatetFormat.format(date);
		System.out.println(str);
		
	}
	
//Exercise 3
	//Q1<>
	public void A2_31() {
		inValue();
		Locale locale = new Locale("vn","VI");
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		System.out.println("ID" + e1.getExamID());
		System.out.println("CreatorID: " + e1.getCreator().getAccountID().shortValue());
		System.out.println("");
	}
}
