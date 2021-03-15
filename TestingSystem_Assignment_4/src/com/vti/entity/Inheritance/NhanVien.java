package com.vti.entity.Inheritance;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public void inValue() {
		super.inValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cong viec: ");
		this.congViec = sc.nextLine();
	}
	
	public String thongTin() {
		return super.thongTin() + "Cong viec: " + this.congViec;
	}
}
