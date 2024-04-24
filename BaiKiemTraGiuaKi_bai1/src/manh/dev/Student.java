package manh.dev;

public class Student extends Person {
	private double Toan;
	private double Ly;
	private double Hoa;
	public Student(String name,int age,double Toan, double Ly, double Hoa) {
		super(name,age);
		this.Toan = Toan;
		this.Ly = Ly;
		this.Hoa = Hoa;
	}
	public double getToan(){
		return Toan;
	}
	public void setToan(double Toan) {
		this.Toan = Toan;
	}
	public double getLy() {
		return Ly;
	}
	public void setLy(double Ly) {
		this.Ly = Ly;
	}
	public double getHoa() {
		return Hoa;
	}
	public void setHoa(double Hoa) {
		this.Hoa = Hoa;
	}
    public double tinhDiemTrungBinh() {
        return (Toan + Ly + Hoa) / 3.0;
    }

}
