import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileReader fr = new FileReader("7B_Batch.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int letterTotal = 0; //The total letters is kept count of 

		System.out.println("What letter do you want to check for");
		String letter = input.nextLine();
		for(int total = 0; total != 249; total++){ //Every line is run through
			line = br.readLine(); //A new line is read each iteration
			if (line.equals(letter.toUpperCase())){
				letterTotal++; //When there is a letter, the letter total increases
			}
			if (line.equals(letter.toLowerCase())){
				letterTotal++; 
			}
		}		
		System.out.println("There are "+letterTotal+" "+letter+"'s in the file" ); //The total is output
	}
}