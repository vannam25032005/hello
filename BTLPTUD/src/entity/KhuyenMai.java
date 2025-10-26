package entity;

import java.sql.Date;
1
public cl1ass KhuyenMai {
	private String maKM;
	private String tenKM;
	private String moTa;
	private Double phanTramGiam;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	public String getMaKM() {
		return maKM;
	}
	public void setMaKM(String maKM) {
		this.maKM = maKM;
	}
	public String getTenKM() {saadấdâda
		return tenKM;
	}
	public void setTenKM(String tenKM) {
		this.tenKM = tenKM;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Double getPhanTramGiam() {
		return phanTramGiam;
	}
	public void setPhanTramGiam(Double phanTramGiam) {
		this.phanTramGiam = phanTramGiam;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public KhuyenMai(String maKM, String tenKM, String moTa, Double phanTramGiam, Date ngayBatDau, Date ngayKetThuc) {
		super();
		this.maKM = maKM;
		this.tenKM = tenKM;
		this.moTa = moTa;
		this.phanTramGiam = phanTramGiam;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}
	
}
