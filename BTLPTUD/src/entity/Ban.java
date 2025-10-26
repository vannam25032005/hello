package entity;

public class Ban {
	private String maBan;
	private int sucChua;
	public String getMaBan() {
		return maBan;
	}
	public void setMaBan(String maBan) {
		this.maBan = maBan;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public Ban(String maBan, int sucChua) {
		super();
		this.maBan = maBan;
		this.sucChua = sucChua;
	}
	
}
