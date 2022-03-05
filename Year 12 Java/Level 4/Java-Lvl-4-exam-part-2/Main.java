import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your string:");
		String word = input.nextLine();
		System .out .println("Please enter a character:");
		String letter = input.nextLine();
		int charNum = 0;
		
		for (int loop = 0; loop<word.length(); loop++)
		{
			if (letter == word.charAt(loop)){
				charNum++;
            }
		}

	}
}