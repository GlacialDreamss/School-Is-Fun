import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("costs.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int fixedCosts = 0;
		double variableCosts = 0;
		
		for (int loop = 0; loop != 4; loop++) { //The first loop runs 4 times to extract the fixed costs
			String line[] = br.readLine().split(","); //A new line of the file is split into an array
			int fixedPrice = Integer.parseInt(line[2]); 
			fixedCosts += fixedPrice; //The price is added to the total

		}
		
		for (int loop2 = 0; loop2 != 3; loop2++) { //The second loop runs 3 times to extract the variable costs
			String line[] = br.readLine().split(",");
			double variablePrice = Double.parseDouble(line[2]); //Variable price is made a double due to decimals
			variableCosts += variablePrice;

		}	

		double breakEven = fixedCosts / (16 - variableCosts); 		
		double totalCosts = fixedCosts + (variableCosts*breakEven);
		double revenue = 16*breakEven;//All the values are calculated as doubles due to decimals

		System.out.println("The fixed costs: "+fixedCosts+"\nThe variable costs: "+variableCosts+"\nThe total costs: "+totalCosts+"\nThe total revenue: "+revenue+"\nThe break even point: "+breakEven); //The data is output
		
		fr.close();
	}
}