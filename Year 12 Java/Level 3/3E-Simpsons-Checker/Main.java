import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);

		System .out .println("How old is your character?");
		String age = input .nextLine();
		System .out .println("What is your character's gender?\n(m/f)");
		String gender = input .nextLine(); //Information for character collected from user input
		String genderLower = gender .toLowerCase(); //Letter converted to lower case to remove case sensitivity

		if (age .equals("34") && genderLower .equals("f")) {
			System .out .println("Your character is Marge Simpson"); //&& Used as multiple conditions need to be joined
		}
		else if (age .equals("39") && genderLower .equals("m")) {
			System .out .println("Your character is Homer Simpson"); //Else if used for other options
		}
		else if (age .equals("8") && genderLower .equals("f")) {
			System .out .println("Your character is Lisa Simpson");
		}
		else if (age .equals("10") && genderLower .equals("m")) {
			System .out .println("Your character is Bart Simpson");
		}
		else if (age .equals("1") && genderLower .equals("f")) {
			System .out .println("Your character is Maggie Simpson");
		}
		else {
			System .out .println("Invalid character"); //Else used for invalid input
		}
  }
}