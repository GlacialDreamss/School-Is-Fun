import java.util.*;

class Main {
	public static void main(String[] args) {
		int max = 999;
		int min = 100;
		int ranInt = min + (int) (Math.random() * (max - min + 1));
		int ranInt2 = min + (int) (Math.random() * (max - min + 1));
		int ranInt3 = min + (int) (Math.random() * (max - min + 1)); //Three random numbers to meet the number limit generated as a 9 digit number can't be generated and 3 is a factor of 9

		System.out.println("Your phone number is 07"+ranInt+ranInt2+ranInt3); //Randomised number printed
	}
}