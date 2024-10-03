package pekan3;

import java.util.Scanner;

public class OperatorRelational {

	public static void main(String[] args) {
		int A1;
		int A2;
		boolean hasil;
		Scanner keyboard= new Scanner (System.in);
		System.out.println("Input angka -1:");
		A1 = keyboard.nextInt();
		System.out.println("Input angka -2:");
		A2 = keyboard.nextInt ();
		keyboard.close();
		hasil = A1 > A2;//apakah A1 lebih besar A2?
		System.out.println("A1 < A2 =" + hasil);
		hasil = A1 >= A2; //apakah A1 lebih besar sama dendan A2?
		System.out.println("A1 >= A2= " + hasil);
		hasil = A1 <= A2; // apakah A1 lebih kecil sama dengann A2?
		System.out.println("A1 <= A2= " + hasil);
		hasil = A1 == A2; // apakah A1 samadengan A2?
		System.out.println("A1 == A2 = " + hasil);
		hasil = A1 != A2;// apakah A1 tidak samadengan A2?
		System.out.println("A1!= A2 =" + hasil);
				
		

	}

}
