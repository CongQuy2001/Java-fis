package fis.java.topic2;

public class Main {
	        public static void main(String[] args) {
	       MonHoc m = new MonHoc("Quy", 1, 1);
	       MonHoc h = new MonHoc("Quy", 9, 9);
	       LopHoc lopHoc = new LopHoc("ba", "mam non");
	       
	       LopHoc lH = new LopHoc("Thay", "Giao X");
	       Diem D = new Diem(m, 14);
	       Diem I = new Diem(h, 44);
	       Diem E = new Diem(m,1);
	       
	       SinhVien sVien = new SinhVien("ABC", "Quy");
	       sVien.themDiem(I);
	       sVien.themDiem(D);
	       sVien.themDiem(E);
	       lopHoc.them(sVien);
	       System.out.println(sVien.bangDiem());
	       System.out.println("Diem Trung Binh" + sVien.tinhDiemTrungBinh());
	       System.out.println(lopHoc.inDiem());
	       System.out.println(lopHoc.top10());
	        }
	        }

