import java.util.*;
import java.io.*;

class Main {
	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("Enter 1 for a triangle\nEnter 2 for a square\nEnter 3 for a rectangle\nEnter X to stop");
		String choice = input.nextLine();  
		if (choice.equals("1")){
			makeTriangle();
		}
		else if (choice.equals("2")){
			makeSquare();
		}
		else if (choice.equals("3")){
			makeRectangle();
		}
		else {
			System.out.println("Invalid");
		} 
	}
	public static void makeTriangle() {
		boolean cond = true;
		while (cond){
			System.out.print("Enter the base of the triangle, odd numbers: ");

			int base = Integer.parseInt(input.nextLine());
			if (base%2 == 0){
				cond = false;
			}		
		}

		for (int loop = 0; loop != ((base+1)/2); loop++){
			for(int loop2 = 0; loop2 != (base+1)/2; loop++){
				System.out.print(" ");
			}
			for(int loop3 = 0; loop3 != base; loop3++){
				System.out.print("*");
			}
		}
	}
	
	public static void makeSquare() {
		System.out.print("Enter the size of the square: ");
		int size = Integer.parseInt(input.nextLine());
		
		for (int loop = 0; loop != size; loop++) {
			System.out.println("");
			for (int loop2 = 0; loop2 != size; loop2++) {
				System.out.print("*");	
			}
		}
	}

	public static void makeRectangle() {
		System.out.print("Enter the length of the rectangle: ");	
		int length = Integer.parseInt(input.nextLine());
		System.out.print("Enter the height of the rectangle: ");
		int height = Integer.parseInt(input.nextLine());

		for (int loop = 0; loop != height; loop++){
			System.out.println("");
			for (int loop2 = 0; loop2 != length; loop2++){
				System.out.print("*");
			}
		}
	}	 
}