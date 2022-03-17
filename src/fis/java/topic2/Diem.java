package fis.java.topic2;

public class Diem {
	private MonHoc mon;
	private int diem;



	public Diem(MonHoc mon, int diem) {
		super();
		this.mon = mon;
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Diem [mon=" + mon + ", diem=" + diem + "]";
	}

	public Diem() {
		super();
	}

	public Diem(String monHoc, double diem2) {
		// TODO Auto-generated constructor stub
	}

	public MonHoc getMon() {
		return mon;
	}

	public void setMon(MonHoc mon) {
		this.mon = mon;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public boolean equals(Object that) {
		// Hai diem duoc goi la bang nhau neu cua cung mot mon
		if (that instanceof Diem) {
			return this.mon.equals(((Diem) that).mon);
		}
		return false;
	}

	public void Menu() {
		// TODO Auto-generated method stub
		
	}
}
