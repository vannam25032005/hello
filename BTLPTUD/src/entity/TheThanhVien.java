package entity;

public class TheThanhVien {
	private String maThe;
	private String loaiHang;
	private int diemTichLuy;
	public String getMaThe() {
		return maThe;
	}
	public void setMaThe(String maThe) {
		this.maThe = maThe;
	}
	public String getLoaiHang() {
		return loaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		this.loaiHang = loaiHang;
	}
	public int getDiemTichLuy() {
		return diemTichLuy;
	}
	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	public TheThanhVien(String maThe, String loaiHang, int diemTichLuy) {
		super();
		this.maThe = maThe;
		this.loaiHang = loaiHang;
		this.diemTichLuy = diemTichLuy;
	}
	
}
