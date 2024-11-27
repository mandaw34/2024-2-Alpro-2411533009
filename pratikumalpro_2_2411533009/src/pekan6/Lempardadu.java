package pekan6;

import java.util.Random;

public class Lempardadu {
	public static void main(String[] args) {
        Random rand = new Random();
        int tries = 0;
        int sum = 0;

        // Loop until the sum of two dice is 7
        while (sum != 7) {
            // Roll the dice once
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            sum = dadu1 + dadu2;

            System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
            tries++;
        }

        // Output result after loop ends
        System.out.println("You won after " + tries + " tries!");
    }
}
	