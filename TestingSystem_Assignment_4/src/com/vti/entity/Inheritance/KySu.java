package com.vti.entity.Inheritance;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void inValue() {
		super.inValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh dao tao: ");
		this.nganhDaoTao = sc.nextLine();
	}
	
	public String thongTin() {
		return super.thongTin() + "\nNganh dao tao: " + this.nganhDaoTao;
	}
}
