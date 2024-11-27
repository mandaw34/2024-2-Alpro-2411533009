package pekan6;

import java.util.Scanner;

public class Sentine1Loop {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		int sum = 0 ;
		int number=12; //dummy value. anything but 0
		
		while (number !=0) {
			System.out.println("Masukkan angka (0 untuk keluar): ");
			number= console.nextInt();
			sum = sum + number ;
		}
	System.out.println("totalnya adalah " + sum);

	}

}
