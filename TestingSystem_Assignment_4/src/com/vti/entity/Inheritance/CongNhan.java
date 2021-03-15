package com.vti.entity.Inheritance;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public void inValue() {
		super.inValue();
		Scanner sc = new Scanner(System.in);
		System.out.printf("Bac<1 -> 10>:");
		
		this.bac = sc.nextInt();
	}


	public String thongTin() {
		return super.thongTin() + "\nBac : " + this.bac;
	}

	
	
	
	
}
