import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("7D_mail.txt");
		Scanner input = new Scanner(System.in);


		System.out.println("Enter the year:");
		String year = input.nextLine();
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Enter the last name:");
		String lastName = input.nextLine();

		String email = year.substring(0,2)+lastName+firstName.substring(0,1)+"@mymail.com";	
		
		System.out.println(email);
		fw.write(email);

		fw.close();
	}
}