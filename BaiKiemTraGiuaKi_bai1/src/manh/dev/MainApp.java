package manh.dev;

import java.util.Scanner;

	public class MainApp {
	    public static void main(String[] args) {
	        Person[] persons = new Person[5];
	        nhapThongTin(persons);
	        inThongTin(persons);
	    }

	    // Phương thức nhập thông tin cho sinh viên và giáo viên
	    public static void nhapThongTin(Person[] persons) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Nhập thông tin sinh viên:");
	            System.out.print("Họ và tên: ");
	            String ten = scanner.nextLine();
	            System.out.print("Tuổi: ");
	            int tuoi = scanner.nextInt();
	            System.out.print("Điểm toán: ");
	            double toan = scanner.nextDouble();
	            System.out.print("Điểm vật lý: ");
	            double vatLy = scanner.nextDouble();
	            System.out.print("Điểm hóa học: ");
	            double hoa = scanner.nextDouble();
	            scanner.nextLine(); // Loại bỏ ký tự mới
	            persons[i] = new Student(ten, tuoi, toan, vatLy, hoa);
	        }

	        for (int i = 3; i < 5; i++) {
	            System.out.println("Nhập thông tin giáo viên:");
	            System.out.print("Họ và tên: ");
	            String ten = scanner.nextLine();
	            System.out.print("Tuổi: ");
	            int tuoi = scanner.nextInt();
	            System.out.print("Hệ số lương (HSL): ");
	            double hsl = scanner.nextDouble();
	            scanner.nextLine(); // Loại bỏ ký tự mới
	            persons[i] = new Teacher(ten, tuoi, hsl);
	        }

	        scanner.close();
	    }

	    // Phương thức in thông tin của các cá nhân
	    public static void inThongTin(Person[] persons) {
	        System.out.println("\nThông Tin Cá Nhân:");
	        for (Person person : persons) {
	            System.out.println("---------------------------");
	            System.out.println("Họ và tên: " + person.getTen());
	            System.out.println("Tuổi: " + person.getTuoi());
	            if (person instanceof Student) {
	                Student sinhVien = (Student) person;
	                System.out.println("Điểm toán: " + sinhVien.getToan());
	                System.out.println("Điểm vật lý: " + sinhVien.getLy());
	                System.out.println("Điểm hóa học: " + sinhVien.getHoa());
	                System.out.println("Điểm trung bình: " + sinhVien.tinhDiemTrungBinh());
	            } else if (person instanceof Teacher) {
	                Teacher giaoVien = (Teacher) person;
	                System.out.println("Hệ số lương (HSL): " + giaoVien.getHeSoLuong());
	                System.out.println("Lương: " + giaoVien.tinhLuong());
	            }
	        }
	    }
	}
