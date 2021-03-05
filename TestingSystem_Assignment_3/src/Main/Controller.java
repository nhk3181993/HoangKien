package Main;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controller extends InputValue {

//Exercise 1
	// Q1
	public void Q1_1() {
		inValue();

		for (int i = 0; i < 2; i++) {
			float salary = listAccount.get(i).getSalary();
			int roundingSalary = (int) salary;
			System.out.println("luong lam tron cua " + listAccount.get(i).getFullName() + " la " + roundingSalary);
		}
	}

	// Q2
	public void Q1_2() {
		Random rd = new Random();
		int num = rd.nextInt(99999);
		System.out.printf("%05d\n", num);
	}

	// Q3
	public void Q1_3() {
		Random rd = new Random();
		int num = rd.nextInt(99999);
		String str = String.valueOf(num);
		System.out.printf("%05d\n", num);
		System.out.println(str.substring(3));
	}

	// Q4
	public void Q1_4() {
		System.out.println("nhap a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("nhap b: ");
		int b = sc.nextInt();
	}

//Exercise 2

	// Q1
	public void Q2_1() {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account();
			account.seteMail("Email " + (i + 1));
			account.setUserName("User name " + (i + 1));
			account.setFullName("Full name " + (i + 1));
			account.setCreateDate(LocalDate.now());
			accounts[i] = account;
		}

		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].geteMail() + "\n" + accounts[i].getUserName() + "\n"
					+ accounts[i].getFullName() + "\n" + accounts[i].getCreateDate());
		}
	}

//Exercise 3
	// Q1
	public void Q3_1() {
		Integer salary = 5000;
		float salaryF = salary.floatValue();
		System.out.printf("%.2f\n", salaryF);
	}

	// Q2
	public void Q3_2() {
		String str = "1234567";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	// Q3
	public void Q3_3() {
		Integer num1 = 1234567;
		int num2 = num1.intValue();
		System.out.println(num2);
	}

//Exercise 4
	// Q1
	public void Q4_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap : ");
		String str = sc.nextLine();

		System.out.println("So luong cac tu la: " + str.split("\\s+").length);
	}

	// Q2
	public void Q4_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap string 1: ");
		String str1 = sc.nextLine();

		System.out.println("Nhap string 2: ");
		String str2 = sc.nextLine();

		System.out.println("gop 2 string: " + str1.concat(str2));
	}

	// Q3
	public void Q4_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten : ");
		String name = sc.nextLine();
		String[] str = name.split("\\s+");
		for (int i = 0; i < str.length; i++) {
			System.out.printf(str[i].substring(0, 1).toUpperCase() + str[i].substring(1) + " ");
		}
		System.out.println("\n");
	}

	// Q4
	public void Q4_4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten : ");
		String name = sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ky tu thu " + (i + 1) + " la " + name.toUpperCase().charAt(i));
		}
	}

	// Q5
	public void Q4_5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho : ");
		String firstName = sc.nextLine();
		System.out.println("Nhap ten : ");
		String lastName = sc.nextLine();
		System.out.println("Ten day du : " + firstName.concat(" " + lastName));
	}

	// Q6
	public void Q4_6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten : ");
		String fullName = sc.nextLine();
		String[] str = fullName.split("\\s+");
		System.out.println("Ho la " + str[0]);
		System.out.println("Ten dem la ");
		for (int i = 1; i < str.length - 1; i++) {
			System.out.printf(str[i] + " ");
		}
		System.out.println("Ten la " + str[str.length - 1]);
	}

	// Q7
	public void Q4_7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten : ");
		String fullName = sc.nextLine();
		String[] str = fullName.split("\\s+");
		for (int i = 0; i < str.length - 1; i++) {
			System.out.print(str[i].substring(0, 1).toUpperCase() + str[i].substring(1) + " ");
		}
		System.out.println(str[str.length - 1].substring(0, 1).toUpperCase() + str[str.length - 1].substring(1));
	}

	// 8
	public void Q4_8() {
		Group[] groups = { gr1, gr2, gr3 };
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].getGroupName().contains("Java") == true) {
				System.out.println(groups[i].getGroupName());
			} else {
				System.out.println("khong co group Java");
			}
		}
	}

	// 9
	public void Q4_9() {
		Group[] groups = { gr1, gr2, gr3 };
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].getGroupName().contentEquals("Java") == true) {
				System.out.println(groups[i].getGroupName());
			} else {
				System.out.println("khong co group Java");
			}
		}
	}

	//Q10
	public void Q4_10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi 1 : ");
		String str1 = sc.nextLine();

		System.out.println("Nhap chuoi 2 : ");
		String str2 = sc.nextLine();

		int check = 0;

		if (str1.length() != str2.length()) {
			check = 1;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = str2.length() - 1; j >= 0; j--) {
					if (str1.charAt(i) == str2.charAt(j)) {
						check = 0;
					} else {
						check = 1;
						break;
					}
				}
			}
		}
		if (check == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	//Q11
	public void Q4_11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String str1 = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("so ki tu a la: " + count);
	}
	
	//Q12
	public void Q4_12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String str1 = sc.nextLine();
		System.out.println("Chuoi dao nguoc la: ");
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("\n");
	}
	
	//Q13
	public void Q4_13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String str1 = sc.nextLine();
		
		int check = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) < 48 || str1.charAt(i) > 57) {
				check = 0;
			} else {
				check = 1;
				break;
			}
		}
		
		if(check == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	//Q14
	public void Q4_14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String str1 = sc.nextLine();
		
		System.out.println("Ky tu moi :");
		char c1 = sc.next().charAt(0);
		System.out.println("Ky tu bi chuyen :");
		char c2 = sc.next().charAt(0);
		
		String str2 = str1.replace(c2, c1);
		System.out.println("Chuoi moi : " + str2);
	}
	
	//Q15
	public void Q4_15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String str = sc.nextLine();
		System.out.println("Nhap so n : ");
		int n = sc.nextInt();
		
		if(str.length() % n != 0) {
			System.out.println("KO");
		} else {
			int temp = str.length() / n;
			for (int i = 0; i < temp; i++) {
				System.out.println(str.substring(i * n, (i + 1) * n));
			}
		}
	}
	
//Exercise 5
	
	//Q1
	public void Q5_1() {
		inValue();
		System.out.println(dep1.toString());
	}
	
	//Q2
	public void Q5_2() {
		inValue();
		for(int i = 0; i < departments.size(); i++) {
			System.out.println(departments.get(i).toString() + "\n");
		}
	}
	
	//Q3
	public void Q5_3() {
		//khong co dia chi trong giu lieu ban dau
	}
	
	//Q4
	public void Q5_4() {
		inValue();
		boolean temp = dep1.getDepartmentName().contentEquals("Phong A");
		System.out.println("Ket qua : " + temp);
	}
	
	//Q5
	public void Q5_5() {
		inValue();
		boolean temp = dep1.getDepartmentName().equals(dep2.getDepartmentName());
		if(temp == true) {
			System.out.println("2 phong ban nay bang nhau");
		} else {
			System.out.println("2 phong ban nay khac nhau");
		}
	}
	
	//Q6
	public void Q5_6() {
		String[] strings = { "Sale", "Boss of director", "Marketing", "Accounting", "Waiting room"};
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if(strings[i].charAt(0) > strings[j].charAt(0)) {
					String str = strings[i];
					strings[i] = strings[j];
					strings[j] = str;
				}
			}
		}
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	//Q7 chua hoan thanh
	public void Q5_7() {
		String[] strings = {"Marketing", "Boss of director", "waiting room", "Accounting", "Sale"};
		String[] str1 = strings[0].split("\\s+");
		String[] str2 = strings[1].split("\\s+");
		String[] str3 = strings[2].split("\\s+");
		String[] str4 = strings[3].split("\\s+");
		String[] str5 = strings[4].split("\\s+");
		
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if(strings[i].charAt(0) > strings[j].charAt(0)) {
					
				}
			}
		}				
	}
}
