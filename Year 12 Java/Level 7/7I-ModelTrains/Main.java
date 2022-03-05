import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("7I_Trains.csv");
		BufferedReader br = new BufferedReader(fr);
		for(int loop = 0; loop != 4; loop++){
			String line[] = br.readLine().split(","); //Each iteration a line is read
			System.out.println("Train "+(loop+1)+"\nType: "+line[0]+"\nColour: "+line[1]+"\nValue: "+line[2]+"\nMaker: "+line[3]+"\nStatus: "+line[4]+"\n");//The text is formatted to be output
		}

	}
}