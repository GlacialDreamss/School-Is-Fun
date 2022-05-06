import java.util.*; //Scanner class is imported from the utilities package
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); //Keyboard is set to user input
    System.out.println("Please input a number:"); //Question provided to user
    String input = kb.nextLine(); //User input entered on next line
    double num = Double.parseDouble(input); 
    int numInt = Integer.parseInt(input); //Input saved as Double and Integer to provide accurate results with odd number division    
    int numDouble = numInt*2, numSquared = numInt*numInt;
    double numHalf = num/2, numOneHalf = num*1.5; //Number calculations are assigned to either Integers or Doubles as strings are unsuitable 
    System.out.println("Number "+num+"\nDouble "+numDouble+"\nHalf "+numHalf+"\nSquare "+numSquared+"\n1.5x "+numOneHalf); //Data is output to the user
  }
}