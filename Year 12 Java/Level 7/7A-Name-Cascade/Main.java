import java.io.*; //Input/Output imported for file reading
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException{ //Exceptions are caught 
		Scanner input = new Scanner(System.in);

		FileReader fr = new FileReader("name.txt"); //File is imported and read
		BufferedReader br = new BufferedReader(fr); //The file is read line by line
		String line = br.readLine(); //The line containing the name is read

		System.out.println("Forwards or Backwards (f/b)");
		String decision = input.nextLine().toLowerCase();
		if (decision.equals("f")){
			for(int loop = 0; loop != line.length(); loop++){ //The loop allows each letter to be printed by incrementing the index of the letter being printed
				System.out.println(line.charAt(loop));
			}
		}
		else if (decision.equals("b")){
			for(int loop = (line.length()-1); loop != -1; loop--){ //The loop allows each letter to be printed by decreasing the index of the letter being printed
				System.out.println(line.charAt(loop));
			}
		}	
	}
}