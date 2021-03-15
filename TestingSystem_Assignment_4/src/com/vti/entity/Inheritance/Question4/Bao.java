package com.vti.entity.Inheritance.Question4;

public class Bao extends ThuVien{
	
	private int ngayPhatHanh;
	
	public Bao() {
		super();
	}

	public Bao(int iDTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayphathanh) {
		super(iDTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayphathanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNgayPhatHanh : " + ngayPhatHanh;
	}
	
	

}
