package fis.java.topic2;

import java.util.*;

public class SinhVien {
	private String mssv;
	private String ten;

	private Set<Diem> monDaHoc = new HashSet<Diem>();

	public SinhVien(String mssv, String ten) {
		this.mssv = mssv;
		this.ten = ten;
	}

	public boolean themDiem(Diem diemMoi) {
		return this.monDaHoc.add(diemMoi);
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Set<Diem> getMonDaHoc() {
		return monDaHoc;
	}

	public void setMonDaHoc(Set<Diem> monDaHoc) {
		this.monDaHoc = monDaHoc;
	}

//Cau 1
	public double tinhDiemTrungBinh() {
		// Giong nhu cach tinh hien tai cua truong

		// ...
		OptionalDouble diem;
		diem = monDaHoc.stream().mapToDouble(t -> t.getDiem()).average();

		return diem.isPresent() ? diem.getAsDouble() : 0.0d;
	}

	// Cau 2
	public String bangDiem() {
		/*
		 * MSSV : 0203044 Ten : Nguyen Van A Danh Sach Diem STT Ten Mon Diem So Tin Chi
		 * 1 Cau Truc Du Lieu 1 8 3 2 Cau Truc Du Lieu 2 8 3 Diem Trung Binh 8.0
		 */
		// ...
		StringBuilder Builder = new StringBuilder();
		Builder.append("MaSV");
		Builder.append("Tên");
		Builder.append("Danh Sách ");
		Builder.append("STT");
		Builder.append("Tên Môn");
		Builder.append("Điểm");
		Builder.append("Số tín chỉ");
		System.out.println(Builder);
		String TenMon = null;
		String danhsachDiem = null;
		return String.format(TenMon, danhsachDiem);
	}

	// Cau 3
	public String xepLoai() {
		/*
		 * Quy tac xep loai nhu sau DiemTB < 5 -> YEU DiemTB >= 5 va DiemTB < 6 -> TB
		 * DiemTB >= 6 va DiemTB < 7 -> TB-KHA DiemTB >= 7 va DiemTB < 8 -> KHA DiemTB
		 * >= 8 -> GIOI
		 */
		double getdiem = 0;
		if (getdiem < 5) {
			System.out.println("học lực yếu");
		} else if (getdiem >= 5 && getdiem <= 6.5) {
			System.out.println("học lực trung bình");
		} else if (getdiem >= 6.5 && getdiem < 7.5) {
			System.out.println("học lực khá");
		} else if (getdiem >= 7.5 && getdiem < 9) {
			System.out.println("học lực giỏi");
		}
		if (getdiem > 9) {
			System.out.println("học lực xuất sắc");
		}

		// ...
		return null;
	}
}
