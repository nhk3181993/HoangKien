package com.vti.entity.Inheritance.Question4;

import java.util.Scanner;

public class ThuVien {
	private static int counter = 1000;
	private int IDTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	
	public int getIDTaiLieu() {
		return IDTaiLieu;
	}
	
	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}
	
	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public ThuVien(int iDTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		this.IDTaiLieu = iDTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public ThuVien() {
		this.IDTaiLieu = counter++;
	}
	
	public void inputValue() {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("ID : " + this.IDTaiLieu);
		
		System.out.println("Nhap ten nha xuat ban : ");
		this.tenNhaXuatBan = sc.nextLine();
		System.out.println("So ban phat hanh : ");
		this.soBanPhatHanh = sc.nextInt();
		} catch(Exception e) {
			System.out.println(e);			
		}

	}

	@Override
	public String toString() {
		return "IDTaiLieu : " + IDTaiLieu + "\ntenNhaXuatBan : " + tenNhaXuatBan + "\nsoBanPhatHanh : "
				+ soBanPhatHanh;
	}
	
	
	
	

}
