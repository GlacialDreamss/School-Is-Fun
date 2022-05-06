import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("7F_Translator");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please select French or Spanish");
		String choice = input.nextLine().toLowerCase();
		if(choice.equals("french")){	
			fw.write("1 - Un\n2 - Deux\n3 - Trois\n4 - Quatre\n5 - Cinq\n6 - Six\n7 - Sept\n8 - Huit\n9 - Neuf\n10 - Dix");
		}
		else if(choice.equals("spanish")){ 
			fw.write("1 - Uno\n2 - Dos\n3 - Tres\n4 - Cuatro\n5 - Cinco\n6 - Seis\n7 - Siete\n8 - Ocho\n9 - Nueve\n10 - Diez");
		}
		else{
			fw.write("Invalid input");
			System.out.print("Invalid input");
		}
		fw.close();
	}
}