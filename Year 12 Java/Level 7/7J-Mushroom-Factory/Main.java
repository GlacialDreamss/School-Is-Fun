import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("7J_Mushrooms.csv");
		BufferedReader br = new BufferedReader(fr);

		LinkedList<String> mushrooms = new LinkedList<String>(); 
		LinkedList<Integer> weights = new LinkedList<Integer>(); 
		LinkedList<String> cooking = new LinkedList<String>(); 		

		String line = br.readLine();

		while (line != null){
			String data[] = line.split(",");

			mushrooms.add(data[0]);
			weights.add(Integer.parseInt(data[1]));
			cooking.add(data[2]);

			line = br.readLine();	
		}

		for (int i = 0; i != mushrooms.size(); i++){
			for (int j = 0; j != mushrooms.size(); j++){
				if (weights.get(i) < weights.get(j)){
					int tempWeight = weights.get(i);
					String tempMushroom = mushrooms.get(i); 
					String tempCooking = cooking.get(i); 

					weights.set(i, weights.get(j));
					weights.set(j, tempWeight);

					mushrooms.set(i, mushrooms.get(j));
					mushrooms.set(j, tempMushroom);

					cooking.set(i, cooking.get(j));
					cooking.set(j, tempCooking);					
				}
			}
		}

		for(int loop = 0; loop != mushrooms.size(); loop++){
			System.out.format("%32s%10d%16s",mushrooms.get(loop),weights.get(loop),cooking.get(loop)+"\n");
		}

		fr.close();
	}
}