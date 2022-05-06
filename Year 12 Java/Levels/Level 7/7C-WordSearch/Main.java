import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileReader fr = new FileReader("7C_Wordsearch.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int wordTotal = 0; 

		System.out.println("Which word do you want to check for");
		String word = input.nextLine();
		for(int total = 0; total != 300; total++){ 

			if (line.equals(word.toLowerCase())){
				wordTotal++; //The total count is increased as the word is detected each iteration
			}
			
			line = br.readLine(); 			
		}		
		System.out.println("There are "+wordTotal+" "+word+"'s in the file" ); //The total is output
	}
}