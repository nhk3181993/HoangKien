package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Inheritance.*;

public class QLCB {

	List<CanBo> canBoes = new ArrayList<>();

	public void insertCanBo() {
		System.out.println("Them can bo moi.");
		try {
			System.out.printf("So can bo can them la ");
			Scanner sc = new Scanner(System.in);
			int numCanbo = sc.nextInt();
			
			for (int i = 0; i < numCanbo; i++) {
				CanBo canbo = new CanBo();
				System.out.println("Chon loai cong viec :" + "\n1.Cong nhan" + "\n2.Ky su." + "\n3.Nhan vien.");

				int choice = sc.nextInt();

				switch (choice) {
				case 1: {
					canbo = new CongNhan();
					canbo.inValue();
					break;
				}
				case 2: {
					canbo = new KySu();
					canbo.inValue();
					break;
				}
				case 3: {
					canbo = new NhanVien();
					canbo.inValue();
					break;
				}

				default: {
					System.out.println("Nhap lai");					
					i--;
				}
				}
				canBoes.add(canbo);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void findCanbo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten can tim : ");
		String name = sc.nextLine();
		int check = 0;
		for (int i = 0; i < canBoes.size(); i++) {
			if(canBoes.get(i).getHoten().contentEquals(name)) {
				System.out.println(canBoes.get(i).thongTin());
				check = 0;
			} else {
				check = 1;
			}
		}
		if(check == 1) {
			System.out.println("Khong co can bo co ten la " + name);
		}
	}
	
	public void showProfile() {
		for (int i = 0; i < canBoes.size(); i++) {
			System.out.println(canBoes.get(i).thongTin() + "\n");
		}
	}
	
	public void deleteCanbo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten can xoa : ");
		String name = sc.nextLine();
		int check = 0;
		for (int i = 0; i < canBoes.size(); i++) {
			if(canBoes.get(i).getHoten().contentEquals(name)) {
				canBoes.remove(i);
				System.out.println("Da xoa");
				check = 0;
			} else {
				check = 1;
			}
		}
		if(check == 1) {
			System.out.println("Khong co can bo co ten la " + name);
		}
	}
	
	//control
	public void control() {
		try {
		

			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Menu");
				System.out.println("1. Them can bo");
				System.out.println("2. Tim can bo theo ten");
				System.out.println("3. Thong tin can bo");
				System.out.println("4. Xoa can bo");
				System.out.println("5. Thoat");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					insertCanBo();
					break;
				case 2:
					findCanbo();
					break;
				case 3:
					showProfile();
					break;
				case 4:
					deleteCanbo();
					break;
				case 5:
					System.out.println("Da thoat.");
					System.exit(0);

				default:
					System.out.println("Nhap lai");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
