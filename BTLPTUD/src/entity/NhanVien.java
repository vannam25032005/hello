package entity;

import java.util.Objects;

public class NhanVien {
	private String maNV;
	private String tenNv;
	private String sdt;
	private String diaChi;
	private String chucVu;

	public NhanVien(String maNV, String tenNv, String sdt, String diaChi, String chucVu) {
		super();
		this.maNV = maNV;
		this.tenNv = tenNv;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
	}
	

	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}
	
	public NhanVien(String maNV, String sdt) {
			super();
			this.maNV = maNV;
			this.sdt = sdt;
	}


//
//	public NhanVien(NhanVien nhanVien) {
//		super();
//		this.NhanVien= nhanVien;
//	}


	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNv() {
		return tenNv;
	}

	public void setTenNv(String tenNv) {
		this.tenNv = tenNv;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNv=" + tenNv + ", sdt=" + sdt + ", diaChi=" + diaChi + ", chucVu="
				+ chucVu + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNV, other.maNV);
	}
	
}
