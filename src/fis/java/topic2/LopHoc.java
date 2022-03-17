package fis.java.topic2;

import java.util.*;

public class LopHoc {
	private String ten;
	private String giaoVien;
	private List<SinhVien> dsLop = new ArrayList<SinhVien>();

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGiaoVien() {
		return giaoVien;
	}

	public void setGiaoVien(String giaoVien) {
		this.giaoVien = giaoVien;
	}

	public List<SinhVien> getDsLop() {
		return dsLop;
	}

	public void setDsLop(List<SinhVien> dsLop) {
		this.dsLop = dsLop;
	}

	public LopHoc(String ten, String giaoVien) {
		this.ten = ten;
		this.giaoVien = giaoVien;
	}

	public boolean them(SinhVien svMoi) {
		return dsLop.add(svMoi);
	}

	// Cau 4
	public String inDiem() {
		/*
		 * Danh Sach Diem Lop : ten Giao Vien Chu Nhiem : giaoVien STT MSSV Ten Diem TB
		 * XepLoai 1 123456 Nguyen Van A 8.4 GIOI 2 678919 Nguyen Van B 6 TB-KHA 3
		 * 112456 Nguyen Van C 7 KHA
		 */
		// ...
		String str = "";
		str += "Danh Sach Diem Lop : " + getTen() + "\n";
		str += "Giáo Viên Chủ Nhiệm : " + getGiaoVien() + "\n";
		str += "MSSV : \n";
		for (SinhVien sinhVien : dsLop) {
			str += sinhVien.getMssv() + "\n";
		}
		str += "Ten : \n";
		for (SinhVien sinhVien : dsLop) {
			str += sinhVien.getTen() + "\n";
		}
		str += "DiemTB : \n";
		for (SinhVien sinhVien : dsLop) {
			str += sinhVien.tinhDiemTrungBinh() + "\n";
		}
		for (SinhVien sinhVien : dsLop) {
			str += sinhVien.xepLoai() + "\n";
		}
		return null;
	}

	// Cau 5
	public List<SinhVien> top10() {
		// Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
		// ...
		List<SinhVien> top10;
		dsLop.stream().limit(10).mapToDouble(t -> t.tinhDiemTrungBinh()).max();

		return dsLop;
	}

	// Cau 6
	public List<SinhVien> sinhVienYeu() {
		// Tra ve danh sach vien vien xep loai YEU
		// ...
		List<SinhVien> sv = new ArrayList<>();
		dsLop.forEach(t -> {
			if (t.tinhDiemTrungBinh() < 5) {
				System.out.println("Ten" + t.getTen() + "\n");
				sv.add(t);
			}
		});
		return sv;
	}
}
