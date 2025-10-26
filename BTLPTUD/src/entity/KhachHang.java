package entity;

public class KhachHang extends TheThanhVien {
	private String maKH;
	private String hoTenKH;
	private int soDienThoai;
	private String email;
	private boolean gioiTinh;
	private TheThanhVien theThanhVien;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
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
	public TheThanhVien getTheThanhVien() {
		return theThanhVien;
	}
	public void setTheThanhVien(TheThanhVien theThanhVien) {
		this.theThanhVien = theThanhVien;
	}
	public KhachHang(String maThe, String loaiHang, int diemTichLuy, String maKH, String hoTenKH, int soDienThoai,
			String email, boolean gioiTinh, TheThanhVien theThanhVien) {
		super(maThe, loaiHang, diemTichLuy);
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.theThanhVien = theThanhVien;
	}
	
}
