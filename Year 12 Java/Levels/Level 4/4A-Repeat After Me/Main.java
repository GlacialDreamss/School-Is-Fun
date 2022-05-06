import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System .out .println("Please enter a word:");
		String word = input .nextLine();

		for (int count = 0; count < 10; count++) { //FOR loop repeats indented print statement 10 times
			System .out .println(word);
		}
	}
}