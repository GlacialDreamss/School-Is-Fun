import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System .out .println("Enter the operation (ADD, SUB, MUL)");
		String operator = input .nextLine();
		String operatorUpper = operator .toUpperCase(); //Input of the user converted to upper case to remove case sensitivity

    		System .out .println("Enter the first number: ");
    		int number1 = Integer .parseInt(input .nextLine());
    		System .out .println("Enter the second number: ");
    		int number2 = Integer .parseInt(input .nextLine()); //Numbers converted to integers for calculations

		switch (operatorUpper) {
			case "ADD": System .out .println(number1+" + "+number2+" = "+(number1 + number2));
			break;	//Switch-Case statement used to check for different values to determine output
			case "SUB": System .out .println(number1+" - "+number2+" = "+(number1 - number2));
			break;
			case "MUL": System .out .println(number1+" * "+number2+" = "+(number1 * number2));
			break;
			default: System.out.println("Invalid operator");
			break;	//Default used for invalid operator error
		}
  }
}