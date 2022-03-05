import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String name = input.nextLine();
		int nameLength = name.length();

		for (int loop = 0; loop < nameLength; loop++ ) {

			for (int nestedLoop = 0; nestedLoop < loop; nestedLoop++) {//Nested loop created to print out changing output
				System.out.print(name.charAt(nestedLoop));  //Each letter printed out using .charAt and the loop number	
			}
			System.out.print(name.charAt(loop)+"\n"); //Original loop index printed after as it is always one index more than the nested loop
		}
	}
}