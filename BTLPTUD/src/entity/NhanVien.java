package entity;

import java.sql.Date;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private int cccd;
	private int soDienThoai;
	private String email;
	private boolean gioiTinh;
	private Date ngaySinh;
	private String trangThai;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getCccd() {
		return cccd;
	}
	public void setCccd(int cccd) {
		this.cccd = cccd;
	}
	public int getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public NhanVien(String maNV, String hoTen, int cccd, int soDienThoai, String email, boolean gioiTinh, Date ngaySinh,
			String trangThai) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.cccd = cccd;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", cccd=" + cccd + ", soDienThoai=" + soDienThoai
				+ ", email=" + email + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", trangThai=" + trangThai
				+ "]";
	}
	
}
