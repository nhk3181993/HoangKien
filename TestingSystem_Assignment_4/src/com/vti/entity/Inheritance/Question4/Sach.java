package com.vti.entity.Inheritance.Question4;

import java.util.Scanner;

public class Sach extends ThuVien {
	
	private String tenTacGia;
	private int soTrang;
	
	

	public Sach() {
		super();
	}

	public Sach(int iDTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tentacgia, int sotrang) {
		super(iDTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tentacgia;
		this.soTrang = sotrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	
	public void inputValue() {
		super.inputValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tac gia : ");
		this.tenTacGia = sc.nextLine();
		System.out.println("Nhap so trang sach : ");
		this.soTrang = sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() +"\nTen tac gia : " + tenTacGia + "\nSo trang : " + soTrang;
	}
	
	
}
