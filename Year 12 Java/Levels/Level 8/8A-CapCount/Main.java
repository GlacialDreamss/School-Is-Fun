import java.util.*;
import java.io.*;

class Main {

	//Global varaibles can be seen by all methods
	static LinkedList<String> countries = new LinkedList <String>();
	static LinkedList<String> capitals = new LinkedList <String>();

	static int min = 0;
	static int max = 213;	

	public static void main(String[] args) throws IOException{
		fileRead();
		qAndA();
	}

	//File Read method
	public static void fileRead() throws IOException {
		FileReader fr = new FileReader("data.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while (line != null){
			String[] data= line.split(",");
			
			countries.add(data[0]);
			capitals.add(data[1]);

			line = br.readLine();

		}
		fr.close();
	}

	//Question and Answer Section
	public static void qAndA() throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.println("A - Capital\nB - Country\nX - Quit");
		String choice = input.nextLine().toUpperCase();
		int count = 0;
		boolean flag = true;

		while(flag) {
			
			if(count == 3) {
				count = 0;
				System.out.println("A - Capital\nB - Country\nX - Quit");
				choice = input.nextLine().toUpperCase();
			}

			int random = min + (int) (Math.random()*((max - min) + 1));
			String country = countries.get(random).toLowerCase();
			String capital = capitals.get(random).toLowerCase();

			if(choice.equals("A")){
				System.out.println("What is the capital of "+country);
				String capitalChoice = input.nextLine();
				if(capitalChoice.equals(capital)){
					System.out.println("Correct");
				}
				else {
					System.out.println("Incorrect");
				}
			}

			if(choice.equals("B")){
				System.out.println("Which country does the capital "+capital+" belong to?");
				String capitalChoice = input.nextLine();
				if(capitalChoice.equals(capital)){
					System.out.print("Correct");
				}
				else{
					System.out.println("Incorrect");
				}
			}  

			if(choice.equals("X")){
				flag = false;
			}
			
			count++;			
		}		
	}
}