import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("7E_Wage.txt");

		System.out.println("Enter your name:");
		String name = input.nextLine();
		System.out.println("Enter your hours worked:");
		double hours = Integer.parseInt(input.nextLine());
		double wage = hours*9.5; //Total wage is calculated

		fw.write("Name: "+name+"\nWage: £"+wage); //Data is written to file
		fw.close(); //File is closed
	}
}