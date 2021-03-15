/**
 * 
 */

package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Inheritance.Question4.*;

public class QLTV {

	List<ThuVien> thuViens = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	//nhap tai lieu
	public void insertTaiLieu() {
		try {
			System.out.println("So tai lieu muon them : ");
			int numTaiLieu = sc.nextInt();
			//
			if (numTaiLieu == 0) {
				System.out.println("khong them tai lieu a");
			} else {
				//
				for (int i = 0; i < numTaiLieu; i++) {
					
					ThuVien taiLieu = new ThuVien();
					System.out.println("Chon loai tai lieu : ");
					System.out.println("1. Sach");
					System.out.println("2. Tap chi");
					System.out.println("3.Bao");
					int choice = sc.nextInt();
					
					switch (choice) {
					case 1:
						taiLieu = new Sach();
						taiLieu.inputValue();
						thuViens.add(taiLieu);
						break;
					case 2:
						taiLieu = new TapChi();
						taiLieu.inputValue();
						thuViens.add(taiLieu);
						break;
					case 3:
						taiLieu = new Bao();
						taiLieu.inputValue();
						thuViens.add(taiLieu);
						break;
					default:
						System.out.println("nhap lai");
						i--;
					}
					
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	// xoa tai lieu theo id
	public void deleteTaiLieu() {
		try {
			int check = 0;
			if (thuViens.size() == 0) {
				System.out.println("Chua co danh sach tai lieu");
			} 
			else {
				
				System.out.println("Nhap ID tai lieu muon xoa : ");
				int IDDel = sc.nextInt();
				
				for (int i = 0; i < thuViens.size(); i++) {
					if (IDDel == thuViens.get(i).getIDTaiLieu()) {
						System.out.println("ID tai lieu bi xoa : " + thuViens.get(i).getIDTaiLieu());
						thuViens.remove(i);

						check = 0;
						break;
					} else {
						check = 1;
					}
				}
			}
			if (check == 1) {
				System.out.println("khong co id nay");

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Hien thi thong tin ve tai lieu
	public void findProfile() {
		for (ThuVien thuVien : thuViens) {
			System.out.println(thuVien.toString());
		}
	}
	
	
	//tim tai lieu theo loai: sach, bao , tap chi.
	public void findWithType() {
		try {
			System.out.println("-- Type menu --");
			System.out.println("1. Sach\n" + "2. Bao\n" + "3. Tap chi\n");
			System.out.println("Nhap loai tai lieu muon tim kiem : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (ThuVien thuVien : thuViens) {
					if(thuVien instanceof Sach) {
						System.out.println(thuVien.toString());
					}
				}
				break;
			case 2:
				for (ThuVien thuVien : thuViens) {
					if(thuVien instanceof Bao) {
						System.out.println(thuVien.toString());
					}
				}
				break;
			case 3:
				for (ThuVien thuVien : thuViens) {
					if (thuVien instanceof TapChi) {
						System.out.println(thuVien.toString());
					}
				}
				break;
			default:
				System.out.println("Nhap sai.");
				break;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//control
	public void control() {
		try {
			
			do {
				System.out.println("Menu");
				System.out.println("1. Them tai lieu.");
				System.out.println("2. Xoa tai lieu.");
				System.out.println("3. Hien thi thong tin.");
				System.out.println("4. Tim kiem tai lieu.");
				System.out.println("5. Thoat.");
				System.out.println("--Nhap tuy chon : ");
				
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					insertTaiLieu();
					break;
				case 2:
					deleteTaiLieu();
					break;
				case 3:
					findProfile();
					break;
				case 4:
					findWithType();
					break;
				case 5:
					System.out.println("Done.");
					System.exit(0);
					
				default:
					break;
				}
				
			} while (true);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
