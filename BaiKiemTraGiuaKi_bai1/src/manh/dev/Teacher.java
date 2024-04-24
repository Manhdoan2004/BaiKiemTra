package manh.dev;

public class Teacher extends Person {
	private double HeSoLuong;
	private static final double LuongCoBan = 1800000;

	public Teacher(String ten, int tuoi, double HeSoLuong) {
		super(ten, tuoi);
		this.HeSoLuong = HeSoLuong;
	}

	public double getHeSoLuong() {
		return HeSoLuong;
	}

	public void setHeSoLuong(double HeSoLuong) {
		this.HeSoLuong = HeSoLuong;
	}

	public double tinhLuong() {
		return LuongCoBan * HeSoLuong;
	}
}
