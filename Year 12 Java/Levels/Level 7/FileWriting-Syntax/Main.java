//file writing
import java.io.*; 
class Main {
	public static void main(String[] args) throws IOException{
		FileWriter fw= new FileWriter("names.csv", true); //True makes it append instead of write
		fw.write("Stuff"); 
		fw.close();
	}
}