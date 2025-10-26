package entity;

public class MonAn {
    private String maMon;
    private String tenMon;
    private String loaiMon;
    private double giaMon;
    private String hinhAnh;
    private String maQL;
	public MonAn(String maMon, String tenMon, String loaiMon, double giaMon, String hinhAnh, String maQL) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.giaMon = giaMon;
		this.hinhAnh = hinhAnh;
		this.maQL = maQL;
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
	public double getGiaMon() {
		return giaMon;
	}
	public void setGiaMon(double giaMon) {
		this.giaMon = giaMon;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getMaQL() {
		return maQL;
	}
	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}
    
}