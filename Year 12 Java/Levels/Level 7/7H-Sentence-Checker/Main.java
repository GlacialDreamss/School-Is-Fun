import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("7H_SentenceList.txt"); 
		BufferedReader br = new BufferedReader(fr); 
		
		int sentenceCount = 0;
		int wordCount = 0;
		int letterCount = 0;

		String line = br.readLine();
		String lineArray[] = line.split(" "); //Array is split to determine the number of words

		while(line != null){
			lineArray = line.split(" ");

			sentenceCount ++; //A sentence = 1 iteration
			wordCount += lineArray.length; //A word = the length of the split array

			for(int loop = 0; loop != lineArray.length; loop++){
				letterCount += lineArray[loop].length(); //A letter = the length of each index in the array
			}

			letterCount--; //1 is taken away every iteration due to full stops being present
			line = br.readLine();
		}

		fr.close();
		
		System.out.println("Number of sentences: "+sentenceCount+"\nNumber of words: "+wordCount+"\nNumber of letters: "+letterCount);
	}
}