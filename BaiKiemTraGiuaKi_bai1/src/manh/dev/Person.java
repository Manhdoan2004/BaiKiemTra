package manh.dev;

public class Person {
	// Thuộc tính Name và Age
	private String Ten;
	private int Tuoi;

	// Phương thức khởi tạo
	public Person(String Ten, int Tuoi) {
		this.Ten = Ten;
		this.Tuoi = Tuoi;
	}

	// Getter và Setter cho thuộc tính Name
	public String getTen() {
		return Ten;
	}

	public void setName(String Ten) {
		this.Ten = Ten;
	}

	// Getter và Setter cho thuộc tính Age
	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int Tuoi) {
		this.Tuoi = Tuoi;
	}
}
