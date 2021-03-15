package com.vti.entity.Inheritance;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private Gender gioiTinh;
	private String diaChi;
	
	public String getHoten() {
		return hoTen;
	}
	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diaChi;
	}
	public void setDiachi(String diachi) {
		this.diaChi = diachi;
	}
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		if(gioiTinh == 0) {
			this.gioiTinh = Gender.NU;
		} else if(gioiTinh == 1) {
			this.gioiTinh = Gender.NAM;
		} else {
			this.gioiTinh = Gender.KHAC;
		}
	}
	
	public void inValue() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.printf("Nhap tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.printf("Nhap gioi tinh <0-1-2>:");
		setGioiTinh(sc.nextInt());
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
		sc.next();
	}
	
	public String thongTin() {
		return "CanBo\nHoTen : " + hoTen + "\nTuoi : " + tuoi + "\nGioiTinh : " + gioiTinh + "\nDiaChi : " + diaChi;
	}
	
	
	
	
}
