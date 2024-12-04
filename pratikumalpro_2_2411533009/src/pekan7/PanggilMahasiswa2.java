package pekan7;

import java.util.Scanner;

public class PanggilMahasiswa2 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		String x=input.nextLine();
		System.out.println("NIM: ");
		String y= input.nextLine();
		Mahasiswa a= new Mahasiswa ();
		a.setNim2(x);
		a.setNama(y);
		System.out.println(a.getNim2());
		System.out.println(a.getNama());
		a.Cetak2();
		input.close();
	}
}
