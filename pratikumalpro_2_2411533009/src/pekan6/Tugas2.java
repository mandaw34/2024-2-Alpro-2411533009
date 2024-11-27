package pekan6;

import java.util.*;

public class Tugas2 {

	private static final int Scanner = 0;

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		 Random rand = new Random();
	        int tries = 0;
	        int wrong = 0;
	       
	     	
	        do {
	        	tries++;
	            int result = play(console, rand);
	            if (result == 1) {
	            	 System.out.println("Tebakan Anda Benar!");
		             System.out.println("Anda Menang setelah " + tries + " percobaan.");
		             break;
	            }else {
	            	wrong++;
	            }
	            System.out.println("Apakah mau lempar dadu lagi (ya/tidak)?");
	            console.nextLine();
	            String response = console.nextLine().trim().toLowerCase();

	           if (response.equals("tidak")) {
	        	   System.out.println("Jumlah Tebakan salah: " + wrong );
	                break;
	                
	            } 

	        } while (true);

	        console.close();
	    
	     
}

	private static int play(java.util.Scanner console, Random rand) {

		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.print(sum);
		for (int i = 2; i <= operands; i++) {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
			}
		System.out.print(" = ");
		
		int guess = console.nextInt();
		if (guess == sum) {
			return 1;
		} else {
			System.out.println("Tebakan Anda Salah");
			
			return 0;
		}
	}
}
