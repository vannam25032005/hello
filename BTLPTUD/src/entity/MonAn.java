package entity;

public class MonAn {
	private String maMon;
	private String tenMon;
	private String loaiMon;
	private String giaMon;
	private String hinhAnh;
	public MonAn(String maMon, String tenMon, String loaiMon, String giaMon, String hinhAnh) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.giaMon = giaMon;
		this.hinhAnh = hinhAnh;
	}
	public String getMaMon() {
		return maMon;
	}
	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public String getLoaiMon() {
		return loaiMon;
	}
	public void setLoaiMon(String loaiMon) {
		this.loaiMon = loaiMon;
	}
	public String getGiaMon() {
		return giaMon;
	}
	public void setGiaMon(String giaMon) {
		this.giaMon = giaMon;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
}
