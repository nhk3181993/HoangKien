package com.vti.entity.Inheritance.Question4;

import java.util.Scanner;

public class TapChi extends ThuVien {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi() {
		super();
	}

	public TapChi(int iDTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int sophathanh, int thangphathanh) {
		super(iDTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = sophathanh;
		this.thangPhatHanh = thangphathanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public void inputValue() {
		super.inputValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("So phat hanh : ");
		this.soPhatHanh = sc.nextInt();
		do {
			System.out.println("Thang phat hanh : ");
			this.thangPhatHanh = sc.nextInt();
			if(this.thangPhatHanh >= 1 && this.thangPhatHanh <= 12) {
				break;
			} else {
				System.out.println("Nhap lai thang");
				continue;
			}
		}while(true);
		
	}

	@Override
	public String toString() {
		return  super.toString() + "\nsoPhatHanh : " + soPhatHanh + "\nthangPhatHanh : " + thangPhatHanh;
	}

	
}
